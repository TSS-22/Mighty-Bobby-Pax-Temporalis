package tss22.mb_pt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import dagger.hilt.android.AndroidEntryPoint
import tss22.mb_pt.data.states.AppState
import tss22.mb_pt.ui.theme.MightyBobbyPaxTemporalisTheme
import tss22.mb_pt.domain.AdventureViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: AdventureViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MightyBobbyPaxTemporalisTheme {
                val state: AppState by viewModel.state.collectAsState()
                AdventureScreen(
                    state = state,
                    onEvent = viewModel::onEvent
                )
            }
        }
    }
}
