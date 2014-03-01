package com.iexpertos.encryptor;

public class SystemPrinter implements Printer {
	
	@Override
	public void print(String text) {
		System.out.print(text);
	}
}
