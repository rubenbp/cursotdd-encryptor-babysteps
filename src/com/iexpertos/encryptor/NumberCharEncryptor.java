package com.iexpertos.encryptor;

public class NumberCharEncryptor implements CharEncryptionStratergy {
	
	@Override
	public String crypt(int charValue) {
		return String.valueOf(charValue + 2);
	}
}
