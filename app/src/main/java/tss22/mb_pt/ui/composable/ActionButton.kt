package tss22.mb_pt.ui.composable

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import tss22.mb_pt.data.properties.ActionTypes
import tss22.mb_pt.domain.AppEvent

@Composable
fun ActionButton (
    text: String,
    action: ActionTypes,
    direction: Int,
    onClick: (AppEvent) -> Unit
) {
    Button(onClick = { onClick(AppEvent.ClickButton(direction)) }) {
        Text(text = text)
    }
}