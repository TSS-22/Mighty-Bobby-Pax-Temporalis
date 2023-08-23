package tss22.mb_pt.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import tss22.mb_pt.data.database.mb_pt.Buttons
import tss22.mb_pt.data.database.mb_pt.Characters
import tss22.mb_pt.data.database.mb_pt.Characters_factions
import tss22.mb_pt.data.database.mb_pt.Characters_on_page
import tss22.mb_pt.data.database.mb_pt.Characters_relationship
import tss22.mb_pt.data.database.mb_pt.Characters_titles
import tss22.mb_pt.data.database.mb_pt.Factions
import tss22.mb_pt.data.database.mb_pt.Factions_relationship
import tss22.mb_pt.data.database.mb_pt.MbPtDao
import tss22.mb_pt.data.database.mb_pt.Pages
import tss22.mb_pt.data.database.mb_pt.Titles

/**
 * Defines a database and specifies data tables that will be used.
 * Version is incremented as new tables/columns are added/removed/changed.
 * You can optionally use this class for one-time setup, such as pre-populating a database.
 */
@Database(
    entities = [
        Buttons::class,
        Characters::class,
        Characters_factions::class,
        Characters_on_page::class,
        Characters_relationship::class,
        Characters_titles::class,
        Factions::class,
        Factions_relationship::class,
        Pages::class,
        Titles::class
    ],
    version = 1,
    exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getDao(): MbPtDao

}