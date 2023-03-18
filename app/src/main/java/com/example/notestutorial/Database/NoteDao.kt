package com.example.notestutorial.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.notestutorial.Models.Note

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)// ajouter une note
    suspend fun insert(note: Note)

    @Delete
    suspend fun delete(note: Note) // supprimer une note


    @Query("Select * from notes_table order by id ASC")// requette pour afficher
    fun getAllNotes() : LiveData<List<Note>> // lister une note

    @Query("UPDATE notes_table Set title = :title, note = :note WHERE id = :id") //modifier une note
    suspend fun update (id: Int?, title :String?, note :String?)
}