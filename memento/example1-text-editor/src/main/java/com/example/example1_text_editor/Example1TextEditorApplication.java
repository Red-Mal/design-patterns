package com.example.example1_text_editor;

import com.example.example1_text_editor.model.Document;
import com.example.example1_text_editor.model.History;
import com.example.example1_text_editor.service.TextEditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Example1TextEditorApplication implements CommandLineRunner {

	@Autowired
	private TextEditorService textEditorService;

	public static void main(String[] args) {
		SpringApplication.run(Example1TextEditorApplication.class, args);
		Document document = new Document("Initial content\n");
		History history = new History();

		// Write some content
		document.write("Additional content\n");
		history.addMemento(document.createMemento());

		// Write more content
		document.write("More content\n");
		history.addMemento(document.createMemento());

		// Restore to previous state
		document.restoreFromMemento(history.getMemento(1));

		// Print document content
		System.out.println(document.getContent());
	}

	@Override
	public void run(String... args) {
		/*TextEditor editor = new TextEditor();

		System.out.println("Initial Content: " + editor.getContent());
		editor.appendText("Hello, ");
		textEditorService.saveState(editor);

		editor.appendText("world!");
		textEditorService.saveState(editor);

		System.out.println("Current Content: " + editor.getContent());

		textEditorService.undo(editor);
		System.out.println("After Undo: " + editor.getContent());

		textEditorService.redo(editor);
		System.out.println("After Redo: " + editor.getContent());*/
	}
}
