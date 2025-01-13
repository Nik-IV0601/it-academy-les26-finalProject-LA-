package edu.examples.java_classes.logic;

import java.util.Date;
import java.util.List;

import edu.examples.java_classes.entity.Note;

public interface NotebookLogic { // интрефейс с методами работы с записями

	public void add(Note n);

	public void add(String title, String content);

	public List<Note> find(String text);

	public List<Note> find(Date date);

	public List<Note> allNotes();
}
