package tss22.mb_pt.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import tss22.mb_pt.data.database.AppDatabase
import tss22.mb_pt.data.database.mb_pt.MbPtDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "mightyBobby_pt_db")
            .createFromAsset("database/db_MB_PT")
            .build()
    }

    @Provides
    @Singleton
    fun provideAppDao(db: AppDatabase): MbPtDao{
        return db.getDao()
    }
}