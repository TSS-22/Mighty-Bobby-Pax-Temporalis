package tss22.mb_pt.data.database.mb_pt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [
    ForeignKey(entity = Pages::class, parentColumns = ["id"], childColumns = ["page_id"]),
    ForeignKey(entity = Characters::class, parentColumns = ["id"], childColumns = ["character_id"])
])
data class Characters_on_page (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "page_id") val pageId: Int,
    @ColumnInfo(name = "character_id") val characterId: Int,

)