package tss22.mb_pt.data.states

import tss22.mb_pt.data.properties.ButtonProperties

data class ButtonsState (
    val listButton: List<ButtonProperties> = listOf<ButtonProperties>()
)