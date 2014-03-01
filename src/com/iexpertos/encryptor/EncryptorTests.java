package com.iexpertos.encryptor;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EncryptorTests {
	
	Encryptor letterEncryptor;
	Encryptor numberEncryptor;
	
	@Before
	public void setUp() {
		letterEncryptor = EncryptorFactory.createLetterEncryptor();
		numberEncryptor = EncryptorFactory.createNumberEncryptor();
	}

	@Test
	public void encripta_palabras() {
		String encryptedWord = letterEncryptor.cryptWord("hello");
		assertThat(encryptedWord, is("jgnnq"));
	}
	
	@Test(expected = InvalidParameterException.class)
	public void no_permite_encriptar_palabras_con_espacios() {
		letterEncryptor.cryptWord("hello world");
	} 
	
	@Test
	public void encripta_palabras_a_numeros() {
		String encryptedWord = numberEncryptor.cryptWord("hello");
		assertThat(encryptedWord, is("106103110110113"));
	}
	
	@Test(expected = InvalidParameterException.class)
	public void no_permite_encriptar_palabras_a_numeros_con_espacios() {
		numberEncryptor.cryptWord("hello world");
	}
	
	@Test
	public void encripta_ciertas_letras_de_palabras() {
		String encryptedWord = letterEncryptor.cryptWord("hello", "ho");
		assertThat(encryptedWord, is("jellq"));
	}
	
	@Test(expected = InvalidParameterException.class)
	public void no_permite_encriptar_ciertas_letras_de_palabras_con_espacios() {
		letterEncryptor.cryptWord("hello world", "ho");
	}
	
	@Test
	public void encripta_frases() {
		String encryptedSentence = letterEncryptor.cryptSentence("hello world");
		assertThat(encryptedSentence, is("jgnnq\"yqtnf"));
	}
}
