package tss22.mb_pt.domain

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import tss22.mb_pt.data.database.AppDatabase
import tss22.mb_pt.data.database.mb_pt.MbPtDao
import tss22.mb_pt.data.properties.ButtonProperties
import tss22.mb_pt.data.properties.CharacterProperties
import tss22.mb_pt.data.states.AppState
import tss22.mb_pt.data.states.ButtonsState
import tss22.mb_pt.data.states.PageState
import javax.inject.Inject

@HiltViewModel
class AdventureViewModel @Inject constructor(
    private val dao: MbPtDao
): ViewModel() {

    private val _statePage = MutableStateFlow(
        ""
    )

    private val _stateButtons = MutableStateFlow(
        listOf<ButtonProperties>()
    )

    private val _stateBobby = MutableStateFlow(
        CharacterProperties()
    )

    private val _state = MutableStateFlow(
        AppState(
            pageText = _statePage.value,
            buttonList = _stateButtons.value,
            bobby = _stateBobby.value,
        )
    )

    val state = combine(
            _state,
            _statePage,
            _stateButtons,
            _stateBobby
        ) { state, statePage, stateButtons, stateBobby ->
            state.copy(
                pageText = statePage,
                buttonList = stateButtons,
                bobby = stateBobby,
            )
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), AppState())

    private val _uiEvent = Channel<AppEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()
    init {
        fetchPageData(1)
    }
    fun onEvent(event: AppEvent){
        when(event) {
            is AppEvent.ClickButton -> {
                viewModelScope.launch {
                    fetchPageData(event.route)
                }
            }
        }
    }

    private fun fetchPageData(idPage: Int) {
        viewModelScope.launch {
            dao.getPageText(idPage).collect{
                Log.d("VALUE", it)
                _statePage.value = it
            }
        }
        viewModelScope.launch {
            dao.getButtonsProperties(idPage).collect{
                _stateButtons.value = it
                for(button in it){
                    Log.d("BUTTONS", button.text)
                }
            }
        }
        viewModelScope.launch {
            dao.getBobby().collect{
                _stateBobby.value = it
            }
        }
    }
}