package tss22.mb_pt.data.database.mb_pt

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import tss22.mb_pt.data.properties.ButtonProperties
import tss22.mb_pt.data.properties.CharacterProperties
@Dao
interface MbPtDao {

    @Query("SELECT text FROM Pages WHERE id = :pageId;")
    fun getPageText(pageId: Int): Flow<String>

    @Query("SELECT text, action, direction FROM Buttons WHERE page_id = :pageId;")
    fun getButtonsProperties(pageId: Int): Flow<List<ButtonProperties>>

    @Query("SELECT name, strength_phys, strength_psyc, faith, vitality, wisdom, intelligence, mojo FROM Characters WHERE id = 1;")
    fun getBobby(): Flow<CharacterProperties>

}