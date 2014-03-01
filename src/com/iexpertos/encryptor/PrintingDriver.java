package com.iexpertos.encryptor;

public class PrintingDriver {
	
	public void sendToPrinter(String sentence) {
		SystemPrinter printer = new SystemPrinter();
		
		String[] words = sentence.split(" ");
		for (String word : words)
		{
			printer.print("<" + word + ">");
		}
	}
}
