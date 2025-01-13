package edu.examples.java_classes.controller;

public class Controller {
	private final char paramDelimeter = '\n';
	
	private final CommandProvider provider = new CommandProvider();
	
	public String doAction(String request) {

		String commandName = request.substring(0, request.indexOf(paramDelimeter));
		Command executionCommand = provider.getCommand(commandName.toUpperCase());  //ADD
		String response = executionCommand.execute(request);
		
		return response;
	}
}