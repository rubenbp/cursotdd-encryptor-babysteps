package com.iexpertos.encryptor;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EncryptorTests {

	@Test
	public void encripta_palabras() {
		Encryptor encryptor = new Encryptor();
		String result = encryptor.cryptWord("hello");
		assertThat(result, is("jgnnq"));
	}
}
