package ru.tsar.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramTest {
	Anagram anagram;
	
	@BeforeEach
	void init (){
		 anagram = new Anagram();
		 
	}
	@Test
	@DisplayName("Testing letters reverse") 
	void testLetters() {
		String expected = "dcba ";
		String reality = anagram.reverseText("abcd");
		assertEquals(expected,reality,"reverseText method should reverse input text");
	}

	@Test
	@DisplayName("Testing non-letters staying") 
	void testNonLetters() {		
		String expected = "12!34$ ";
		String reality = anagram.reverseText("12!34$");
		assertEquals(expected,reality,"Non-letters symbols should stay on the same places");
	}
	
	
	@Test
	@DisplayName("Testing letters and non-letters") 
	void allSymbols() {
		String expected = "ab1234C;D ";
		String reality = anagram.reverseText("DC1234b;a");
		assertEquals(expected,reality,"letter symbols should be reversed and another "
				+ "should stay on the same places");		
	}
	
	@Test
	@DisplayName("Testing several worlds") 
	void testWords() {
		String expected = "dcba dc11ba d#$7cba ";
		String reality = anagram.reverseText("abcd ab11cd a#$7bcd");
		assertEquals(expected,reality,"all words should be reverved separately, "
				+ "Non-letters symbols should stay on the same places");
	}

	
}