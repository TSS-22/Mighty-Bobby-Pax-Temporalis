package tss22.mb_pt.domain

sealed class AppEvent {
    data class ClickButton(val route: Int): AppEvent()
}