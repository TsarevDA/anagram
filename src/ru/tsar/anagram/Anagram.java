package ru.tsar.anagram;

public class Anagram {

	public String reverseText(String text) {
		if (!(text instanceof String)) {
			return "Error.Input text must contain the symbols.";
		}

		String[] words = text.split("\\s+");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			result.append(reverseWord(word));
			result.append(" ");
		}
		return (result.delete(result.length() - 1, result.length())).toString();
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