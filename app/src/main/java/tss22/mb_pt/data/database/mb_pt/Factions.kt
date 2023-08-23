package tss22.mb_pt.data.database.mb_pt

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Factions (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @NonNull @ColumnInfo(name = "faction") val faction: String,
)