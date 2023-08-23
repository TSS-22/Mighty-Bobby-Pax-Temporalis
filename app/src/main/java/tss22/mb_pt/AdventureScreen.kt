package tss22.mb_pt


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dagger.hilt.android.lifecycle.HiltViewModel
import tss22.mb_pt.data.states.AppState
import tss22.mb_pt.domain.AppEvent

// TODO
// - add parameters
//      - add list of buttons
//      - add text
// - add persistent data
// - Make the spacing like sir Lackner

@Composable
fun AdventureScreen(
    state: AppState,
    onEvent: (AppEvent) -> Unit
) {
    Column {
        Text(text = state.pageText)
    }
    Button(onClick = { onEvent(AppEvent.ClickButton(2))}) {
        Text(text = "Click me")
    }

}