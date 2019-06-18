package edu.handong.csee;

public class NotEnoughArgumentException extends Exception{
	public NotEnoughArgumentException() {
		super("Not enough Arugument Exception occured!!");
	}
	
	public NotEnoughArgumentException(String message) {
		super(message);		
	}
} 
//-i C:\git\JavaFinalProject\data -o C:\git\JavaFinalProject\output