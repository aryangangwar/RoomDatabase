package com.aryan.roomdatabase.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class],version = 1,exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao() : UserDao

    companion object {
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            val temp = INSTANCE
            if (temp != null) {
                return temp;
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,UserDatabase::class.java,"user_database").build()
                INSTANCE = instance
                return instance
            }
        }
    }





}