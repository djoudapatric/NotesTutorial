package com.example.notestutorial.Models

import androidx.room.ColumnInfo // column  de a table note
import androidx.room.Entity // Entity pour la base de donnee
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(
    @PrimaryKey(autoGenerate = true)val id: Int?,//genere automatiquement la cles primaraire
    @ColumnInfo(name = "title") val title : String?,
    @ColumnInfo(name = "note") val note :String?,
    @ColumnInfo(name = "data") val date : String?,

    ): java.io.Serializable
