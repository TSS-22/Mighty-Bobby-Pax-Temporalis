package tss22.mb_pt


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import tss22.mb_pt.data.states.AppState
import tss22.mb_pt.domain.AppEvent
import tss22.mb_pt.ui.composable.ActionButton

// TODO
// - add parameters
//      - add list of buttons
//      - add text
// - add persistent data
// - Make the spacing like sir Lackner

@Composable
fun AdventureScreen(
    state: AppState,
    onEvent: (AppEvent) -> Unit,
    modifier: Modifier = Modifier
) {
    Column {
        Text(text = state.pageText)
        Spacer(modifier = modifier.padding(16.dp))
        LazyColumn{
            items(state.buttonList){ it->
                ActionButton(text = it.text,
                    action = it.action,
                    direction = it.direction,
                    onClick = onEvent)
            }
        }



    }


}