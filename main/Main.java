package edu.examples.java_classes.main;

import edu.examples.java_classes.controller.Controller;


public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		String request;
		String response;
		
		request = "ADD\ntitle=Первая запись\nсоntent=Это моя первая запись в блокноте";
		response = controller.doAction(request);
		System.out.println(response);
		
		request = "ADD\ntitle=Вторая запись\nсоntent=Это моя вторая запись в блокноте";
		response = controller.doAction(request);
		System.out.println(response);
		
		request = "ADD\ntitle=Третья запись\nсоntent=Это моя третья запись в блокноте";
		response = controller.doAction(request);
		System.out.println(response);
		
	}

}