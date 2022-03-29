// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
	Write a program that will count the number of characters, words, and lines in a file. 
	Words are separated by whitespace characters.
*/

public class TextbookExercise12Point13 {
	public static void main(String[] args) {
		try {
			
			File mindKillerFile = new File("./src/main/mindKiller.txt");
			File jabberwockyFile = new File("./src/main/jabberwocky.txt");
			
			System.out.println("Getting num characters, words, and lines from mindKiller.txt");
			
			Scanner fileScanner = new Scanner(mindKillerFile);
			
			int numLines = 0;
			int numCharacters = 0;
			int numWords = 0;
			
			while(fileScanner.hasNext()) {
				String fileLine = fileScanner.nextLine();
				
				numCharacters = numCharacters + fileLine.length();
				
				numWords = numWords + fileLine.split(" ").length;
				
				numLines = numLines + 1;
			}
			
			System.out.println("mindKiller.txt has:");
			System.out.println(numCharacters + " Characters");
			System.out.println(numWords + " Words");
			System.out.println(numLines + " Lines");
			
			
			System.out.println("-----------------------------");
			
			System.out.println("Getting num characters, words, and lines from jabberwocky.txt");
			
			fileScanner = new Scanner(jabberwockyFile);
			
			numLines = 0;
			numCharacters = 0;
			numWords = 0;
			
			while(fileScanner.hasNext()) {
				String fileLine = fileScanner.nextLine();
				
				numCharacters = numCharacters + fileLine.length();
				
				numWords = numWords + fileLine.split(" ").length;
				
				numLines = numLines + 1;
			}
			
			System.out.println("jabberwocky.txt has:");
			System.out.println(numCharacters + " Characters");
			System.out.println(numWords + " Words");
			System.out.println(numLines + " Lines");			
			
			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("There was an issue reading this file");
			e.printStackTrace();
		}
	}
}
