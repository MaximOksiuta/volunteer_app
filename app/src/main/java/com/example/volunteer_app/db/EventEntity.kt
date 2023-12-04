package com.example.volunteer_app.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EventEntity (
        @PrimaryKey(autoGenerate = true)
        val id: Int = 0,
        val name: String,
        val date: Long,
        val price: Int,
        val description: String,
        val imageId: Int,
        )