package com.aryan.roomdatabase.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    suspend fun addUser(user : User)

    @Query("SELECT * FROM user_data ORDER BY id ASC")
    fun readAllData():LiveData<List<User>>

}