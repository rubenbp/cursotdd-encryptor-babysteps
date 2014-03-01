package com.iexpertos.encryptor;

import java.security.InvalidParameterException;

public class Encryptor {
	
	public enum EncryptedFormat {
		CHARS,
		NUMBERS
	}
	
	public String cryptWord(String word)
	{
		validateWord(word);
		return cryptSentence(word, EncryptedFormat.CHARS);
	}
	
	public String cryptWordToNumbers(String word)
	{
		validateWord(word);
		return cryptSentence(word, EncryptedFormat.NUMBERS);
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
					result[i] = (char)( charValue + 2);		
				}
			}
		}
		return String.valueOf(result);
	}
	
	private void validateWord(String word) {
		if (word.contains(" "))
			throw new InvalidParameterException();
	}

	public String cryptSentence(String sentence, EncryptedFormat encryptedFormat)
	{
		char[] sentenceArray = sentence.toCharArray();
		String newWord = "";
		for (int i = 0; i < sentence.length(); i++)
		{
			int charValue = sentenceArray[i];
			switch(encryptedFormat) {
				case NUMBERS:
					newWord += String.valueOf(charValue + 2);
					break;
				case CHARS:
					newWord += String.valueOf((char)( charValue + 2));
					break;
				default:
					throw new InvalidParameterException();
			}
		}
		
		return newWord;
	}
	
	public String[] getWords(String sentence)
	{
		return sentence.split(" ");
	}
	
	public void printWords(String sentence)
	{
		String[] words = sentence.split(" ");
		for (String word : words)
		{
			System.out.print("<" + word + ">");
		}
	}
	
}