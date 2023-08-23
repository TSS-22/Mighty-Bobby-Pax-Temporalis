package tss22.mb_pt.data.database.mb_pt

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [
    ForeignKey(entity = Pages::class, parentColumns = ["id"], childColumns = ["page_id"]),
    ForeignKey(entity = Pages::class, parentColumns = ["id"], childColumns = ["direction"])
])
data class Buttons (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @NonNull @ColumnInfo(name = "page_id") val pageId: Int,
    @NonNull @ColumnInfo(name = "text") val text: String,
    @ColumnInfo(name = "action") val action: String,
    @NonNull @ColumnInfo(name = "direction") val direction: Int = 1,
)