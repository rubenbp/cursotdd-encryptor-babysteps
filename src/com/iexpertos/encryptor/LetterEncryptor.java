package com.iexpertos.encryptor;

public class LetterEncryptor {

	public String crypt(int charValue) {
		return String.valueOf((char)( charValue + 2));
	}
}