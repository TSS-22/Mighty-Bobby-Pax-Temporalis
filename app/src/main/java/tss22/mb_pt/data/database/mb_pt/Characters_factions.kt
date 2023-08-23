package tss22.mb_pt.data.database.mb_pt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [
    ForeignKey(entity = Factions::class, parentColumns = ["id"], childColumns = ["faction_id"]),
    ForeignKey(entity = Characters::class, parentColumns = ["id"], childColumns = ["character_id"])
])
data class Characters_factions (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "faction_id") val factionId: Int,
    @ColumnInfo(name = "character_id") val characterId: Int,
)