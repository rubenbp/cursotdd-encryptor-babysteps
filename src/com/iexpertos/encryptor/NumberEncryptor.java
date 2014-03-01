package com.iexpertos.encryptor;

public class NumberEncryptor implements CharEncryption {
	
	@Override
	public String crypt(int charValue) {
		return String.valueOf(charValue + 2);
	}
}
