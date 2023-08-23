package tss22.mb_pt.data.database.mb_pt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [
    ForeignKey(entity = Factions::class, parentColumns = ["id"], childColumns = ["faction1_id"]),
    ForeignKey(entity = Factions::class, parentColumns = ["id"], childColumns = ["faction2_id"])
])
data class Factions_relationship (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "faction1_id") val faction1Id: Int,
    @ColumnInfo(name = "faction2_id") val faction2Id: Int,
    @ColumnInfo(name = "value") val value: Float =  0.0f,
)