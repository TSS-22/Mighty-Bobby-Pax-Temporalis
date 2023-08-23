package tss22.mb_pt.data.states

import tss22.mb_pt.data.properties.ButtonProperties
import tss22.mb_pt.data.properties.CharacterProperties

data class AppState(
    val pageText: String = "",
    val buttonList: List<ButtonProperties> = emptyList<ButtonProperties>(),
    val bobby: CharacterProperties = CharacterProperties(),
)
