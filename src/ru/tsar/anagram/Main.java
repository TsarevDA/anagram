package ru.tsar.anagram;

import java.io.IOException;
import java.util.Scanner;

public class Main  {

	public static void main(String[] args) throws IOException  {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();
		System.out.println(new Anagram().reverseText(text));
	}
}