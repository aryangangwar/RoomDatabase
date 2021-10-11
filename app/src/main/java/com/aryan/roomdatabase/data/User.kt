package com.aryan.roomdatabase.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User_Data")
data class User(

    @PrimaryKey(autoGenerate = true)     // To let it generate by itself by room database
    val id: Int,

    val firstName: String,
    val lastName: String,
    val age : Int
)