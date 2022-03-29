// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;

import java.io.File;

/*
	write a program that checks if all the Activity Lab files exist
    writes to the console "all complete" or lists the missing file names. 
*/

public class Exercise8 {
	public static void main(String[] args) {
		String[] filesToCheck = {"./src/main/Exercise1.java", "./src/main/Exercise2.java", "./src/main/Exercise3.java", "./src/main/Exercise4.java", "./src/main/Exercise5.java", "./src/main/Exercise6.java", "./src/main/Exercise7.java", "./src/main/Exercise8.java", "./src/main/firstNames.txt", "./src/main/jabberwocky.txt", "./src/main/lastNames.txt", "./src/main/mindkiller.txt", "./src/main/numberGrid.txt", "./src/main/numberRow.txt", "./src/main/numbersColumn.txt", "./src/main/randomPeople.txt", "./src/main/randomTable.txt", "./src/main/TextbookExercise12Point13.java"};
		
		int filesThatExist = 0;
		
		
		for(int i = 0; i < filesToCheck.length; i++) {
			File file = new File(filesToCheck[i]);
			
			if(file.exists()) {
				filesThatExist = filesThatExist + 1;
			}else {
				System.out.println(filesToCheck[i] + " DOESNT EXIST");
			}
		}
		
		if(filesThatExist == filesToCheck.length) {
			System.out.println("ALL COMPLETE");
		}
	}
}
