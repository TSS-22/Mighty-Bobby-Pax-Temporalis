package tss22.mb_pt.data.database.mb_pt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [
    ForeignKey(entity = Characters::class, parentColumns = ["id"], childColumns = ["character_id"]),
    ForeignKey(entity = Titles::class, parentColumns = ["id"], childColumns = ["title_id"])
])
data class Characters_titles (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "character_id") val characterId: Int,
    @ColumnInfo(name = "title_id") val titleId: Int,
)