package edu.examples.java_classes.controller.impl;

import java.util.List;

//import java.util.Date;

import edu.examples.java_classes.controller.Command;
import edu.examples.java_classes.entity.Note;
//import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.logic.LogicProvider;
import edu.examples.java_classes.logic.NotebookLogic;

public class ShowAllNotesCommand implements Command {

	private final LogicProvider logicProvider = LogicProvider.getInstance();
	private final NotebookLogic logic = logicProvider.getNotebookLogic();

	@Override
	public String execute(String request) {
		String response = null;

			logic.allNotes();
		response = "Все сохранённые записи успешно показаны";

		return response;
	}

	public List<Note> ShowAllNotes() {
		return logic.allNotes();
	}

}