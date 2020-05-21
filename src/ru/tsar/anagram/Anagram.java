package ru.tsar.anagram;

public class Anagram {

	public String reverseText(String text) {
		if (text == null) {
			throw new IllegalArgumentException("Text can't be null");
		}

		String[] words = text.split("\\s+");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (!result.toString().equals("")) {
				result.append(" ");
			}
			result.append(reverseWord(word));
		}
		return result.toString();
	}

	private String reverseWord(String word) {
		char[] chars = word.toCharArray();
		int leftIndex = 0;
		int rightIndex = word.length() - 1;

		while (rightIndex > leftIndex) {
			if (Character.isLetter(chars[leftIndex]) && Character.isLetter(chars[rightIndex])) {
				swap(leftIndex, rightIndex, chars);
				leftIndex++;
				rightIndex--;
			} else if (!Character.isLetter(chars[leftIndex])) {
				leftIndex++;
			} else if (!Character.isLetter(chars[rightIndex])) {
				rightIndex--;
			}
		}
		return (new String(chars));
	}

	private void swap(int leftIndex, int rightIndex, char[] chars) {
		char leftSymbol = chars[leftIndex];
		chars[leftIndex] = chars[rightIndex];
		chars[rightIndex] = leftSymbol;
	}
}