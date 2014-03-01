package com.iexpertos.encryptor;

public class EncryptorFactory {
	public static Encryptor createLetterEncryptor() {
		return new Encryptor(new LetterEncryptor(), new WordValidator());
	}
	
	public static Encryptor createNumberEncryptor() {
		return new Encryptor(new NumberEncryptor(), new WordValidator());
	}
}
