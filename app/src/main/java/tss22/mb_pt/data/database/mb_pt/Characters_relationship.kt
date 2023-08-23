package tss22.mb_pt.data.database.mb_pt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [
    ForeignKey(entity = Characters::class, parentColumns = ["id"], childColumns = ["character1_id"]),
    ForeignKey(entity = Characters::class, parentColumns = ["id"], childColumns = ["character2_id"])
])
data class Characters_relationship (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "character1_id") val character1Id: Int,
    @ColumnInfo(name = "character2_id") val character2Id: Int,
    @ColumnInfo(name = "value") val value: Float = 0.0f,
)