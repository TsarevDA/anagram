package ru.tsar.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramTest {
	
private	Anagram anagram;
	
	@BeforeEach
	void init (){
		 anagram = new Anagram(); 
	}
	
	@Test
	void givenNull_whenReverseText_thenNullPointerException() {
		assertThrows(NullPointerException.class,()->anagram.reverseText(null));	
	}
	
	@Test
	void givenEmptyString_whenReverseText_thenSpace() {
		String expected = "";
		String actual = anagram.reverseText(" ");
		assertEquals(expected,actual);
	}
		
	@Test
	void givenLettersWord_whenReverseText_thenReversedWord() {
		String expected = "dcba ";
		String actual = anagram.reverseText("abcd");
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Testing letters and non-letters") 
	void givenLettersAndNonLettersWord_whenReverseText_thenReversedWordNonLettersStayOnPlaces() {
		String expected = "ab1234C;D ";
		String actual = anagram.reverseText("DC1234b;a");
		assertEquals(expected,actual);		
	}
	
	@Test
	void givenNonLettersWord_whenReverseText_thenSameWord() {		
		String expected = "12!34$ ";
		String actual = anagram.reverseText("12!34$");
		assertEquals(expected,actual);
	}
	
	@Test	
	void givenLettersText_whenReverseText_thenReversedWords() {
			String expected = "dcba hgfe klj ";
			String actual = anagram.reverseText("abcd efgh jlk");
			assertEquals(expected,actual);
	}
	
	@Test	
	void givenLettersAndNonLettersText_whenReverseText_thenReversedWordsNonLettersStayOnPlaces() {
			String expected = "dcba dc11ba d#$7cba ";
			String actual = anagram.reverseText("abcd ab11cd a#$7bcd");
			assertEquals(expected,actual);
	}

	@Test	
	void givenNonLettersText_whenReverseText_thenSameText() {
			String expected = "123 4627 0213890 :2^7*2! ";
			String actual = anagram.reverseText("123 4627 0213890 :2^7*2!");
			assertEquals(expected,actual);
	}	
}