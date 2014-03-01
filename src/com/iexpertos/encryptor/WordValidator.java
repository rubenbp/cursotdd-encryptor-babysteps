package com.iexpertos.encryptor;

import java.security.InvalidParameterException;

public class WordValidator implements WordEncryptionValidation {

	public void validate(String word) {
		if (word.contains(" "))
			throw new InvalidParameterException();
	}
}
