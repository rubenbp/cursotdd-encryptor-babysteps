package com.iexpertos.encryptor;

public class LetterEncryptor implements CharEncryptionStratergy {

	public String crypt(int charValue) {
		return String.valueOf((char)( charValue + 2));
	}
}
