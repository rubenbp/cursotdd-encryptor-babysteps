package com.iexpertos.encryptor;

public class PrintingDriver {
	
	public void sendToPrinter(String sentence) {
		String[] words = sentence.split(" ");
		for (String word : words)
		{
			System.out.print("<" + word + ">");
		}
	}
}
