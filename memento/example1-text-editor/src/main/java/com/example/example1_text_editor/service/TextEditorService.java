package com.example.example1_text_editor.service;


import com.example.example1_text_editor.model.TextEditor;
import com.example.example1_text_editor.model.TextEditorMemento;
import org.springframework.stereotype.Service;

import java.util.ArrayDeque;
import java.util.Deque;

@Service
public class TextEditorService {
    private final Deque<TextEditorMemento> undoStack = new ArrayDeque<>();
    private final Deque<TextEditorMemento> redoStack = new ArrayDeque<>();

    public void saveState(TextEditor editor) {
        undoStack.push(editor.save());
        redoStack.clear(); // Clear redo stack after a new action
    }

    public void undo(TextEditor editor) {
        if (!undoStack.isEmpty()) {
            redoStack.push(editor.save());
            editor.restore(undoStack.pop());
        }
    }

    public void redo(TextEditor editor) {
        if (!redoStack.isEmpty()) {
            undoStack.push(editor.save());
            editor.restore(redoStack.pop());
        }
    }
}
