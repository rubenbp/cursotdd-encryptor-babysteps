package com.iexpertos.encryptor;

public class PrintingDriver {
	
	Printer printer;
	
	public PrintingDriver(Printer printer) {
		this.printer = printer;
	}
	
	public void sendToPrinter(String sentence) {		
		String[] words = sentence.split(" ");
		for (String word : words)
		{
			printer.print("<" + word + ">");
		}
	}
}
