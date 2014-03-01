package com.iexpertos.encryptor;

public class Encryptor {
	
	public CharEncryptionStratergy charEncryptor;
	public WordEncryptionValidation wordValidator;
	
	public Encryptor(CharEncryptionStratergy charEncryptor,
					 WordEncryptionValidation wordValidator) {
		this.charEncryptor = charEncryptor;
		this.wordValidator = wordValidator;
	}
	
	public String cryptWord(String word)
	{
		validateWord(word);
		return cryptSentence(word);
	}

	public String cryptWord(String word, String charsToReplace)
	{
		validateWord(word);
		
		char[] wordArray = word.toCharArray();
		char[] replacement = charsToReplace.toCharArray();
		char[] result = wordArray.clone();
		for (int i = 0; i < wordArray.length; i++)
		{
			for (int j = 0; j < replacement.length; j++)
			{
				if (replacement[j] == wordArray[i])
				{
					int charValue = wordArray[i];
					result[i] = charEncryptor.crypt(charValue).charAt(0);		
				}
			}
		}
		return String.valueOf(result);
	}
	
	private void validateWord(String word) {
		wordValidator.validate(word);
	}

	public String cryptSentence(String sentence)
	{
		char[] sentenceArray = sentence.toCharArray();
		String newWord = "";
		for (int i = 0; i < sentence.length(); i++)
		{
			int charValue = sentenceArray[i];
			newWord += charEncryptor.crypt(charValue);
		}
		
		return newWord;
	}	
}