package com.iexpertos.encryptor;

public class EncryptorFactory {
	public static Encryptor createLetterEncryptor() {
		return new Encryptor(new LetterCharEncryptor(), new WordValidator());
	}
	
	public static Encryptor createNumberEncryptor() {
		return new Encryptor(new NumberCharEncryptor(), new WordValidator());
	}
}
