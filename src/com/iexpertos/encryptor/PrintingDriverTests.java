package com.iexpertos.encryptor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class PrintingDriverTests {

	@Test
	public void imprime_palabras_al_stdout() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	    
		PrintingDriver printingDriver = new PrintingDriver();
		printingDriver.sendToPrinter("hello world");
	    
	    assertThat(outContent.toString(), is("<hello><world>"));
	    
	    System.setOut(null);
	}

}
