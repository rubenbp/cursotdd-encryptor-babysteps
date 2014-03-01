package com.iexpertos.encryptor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class PrintingDriverTests {

	@Test
	public void imprime_palabras_al_printer() throws Exception {   
		PrinterMock printerMock = new PrinterMock();
		PrintingDriver printingDriver = new PrintingDriver(printerMock);
		
		printingDriver.sendToPrinter("hello world");
	    
	    printerMock.assertThatPrintWasCalled();
	}
	
	// Manual mock
	class PrinterMock implements Printer {
		boolean printCalled = false;
		
		@Override
		public void print(String text) {
			printCalled = true;
		}
		
		public void assertThatPrintWasCalled() throws Exception {
			if (!printCalled) {
				throw new Exception("print wasn't called");
			}
		}
	}

}
