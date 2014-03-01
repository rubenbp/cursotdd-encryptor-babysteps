package com.iexpertos.encryptor;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EncryptorTests {
	
	Encryptor encryptor;
	
	@Before
	public void setUp() {
		encryptor = new Encryptor();
	}

	@Test
	public void encripta_palabras() {
		String encryptedWord = encryptor.cryptWord("hello");
		assertThat(encryptedWord, is("jgnnq"));
	}
	
	@Test(expected = InvalidParameterException.class)
	public void no_permite_encriptar_palabras_con_espacios() {
		encryptor.cryptWord("hello world");
	} 
	
	@Test
	public void encripta_palabras_a_numeros() {
		String encryptedWord = encryptor.cryptWordToNumbers("hello");
		assertThat(encryptedWord, is("106103110110113"));
	}
	
	@Test(expected = InvalidParameterException.class)
	public void no_permite_encriptar_palabras_a_numeros_con_espacios() {
		encryptor.cryptWordToNumbers("hello world");
	}
}
