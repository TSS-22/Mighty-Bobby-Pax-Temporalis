package tss22.mb_pt.data.database.mb_pt

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Characters (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @NonNull @ColumnInfo(name = "name") val name: String,
    @NonNull @ColumnInfo(name = "strength_phys") val strengthPhys: Float,
    @NonNull @ColumnInfo(name = "strength_psyc") val strengthPsyc: Float,
    @NonNull @ColumnInfo(name = "faith") val faith: Float,
    @NonNull @ColumnInfo(name = "vitality") val vitality: Float,
    @NonNull @ColumnInfo(name = "wisdom") val wisdom: Float,
    @NonNull @ColumnInfo(name = "intelligence") val intelligence: Float,
    @NonNull @ColumnInfo(name = "mojo") val mojo: Float,
)