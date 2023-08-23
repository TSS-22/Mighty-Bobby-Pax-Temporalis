package tss22.mb_pt.data.properties

data class ButtonProperties(
    val text: String = "",
    val action: ActionTypes = ActionTypes.none,
    val direction: Int = 1,
)
