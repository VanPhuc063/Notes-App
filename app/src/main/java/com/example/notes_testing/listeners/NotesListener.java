package com.example.notes_testing.listeners;

import com.example.notes_testing.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
