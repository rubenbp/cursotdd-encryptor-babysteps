package com.iexpertos.encryptor;

public class LetterCharEncryptor implements CharEncryptionStratergy {

	public String crypt(int charValue) {
		return String.valueOf((char)( charValue + 2));
	}
}
