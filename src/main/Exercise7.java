// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
	program that reads the file named randomPeople.txt 
    sort all the names alphabetically by last name
    write all the unique names to a file named namesList.txt , there should be no repeats 
*/

public class Exercise7 {
	public static void main(String[] args) {
		try {
			File randomPeopleFile = new File("./src/main/randomPeople.txt");
			String[] randomNamesArray = new String[1000];
			
			Scanner fileScanner = new Scanner(randomPeopleFile);
			
			int randomNamePushIndex = 0;
			
			while(fileScanner.hasNext()) {
				randomNamesArray[randomNamePushIndex] = fileScanner.nextLine();
				randomNamePushIndex = randomNamePushIndex + 1;
				
			}
			
	        String currentLastName;
	        for (int i = 0; i < randomNamesArray.length; i++) {
	            for (int j = i + 1; j < randomNamesArray.length; j++) {
	                if (randomNamesArray[i].split(" ")[1].compareTo(randomNamesArray[j].split(" ")[1]) > 0) {
	                	currentLastName = randomNamesArray[i];
	                    randomNamesArray[i] = randomNamesArray[j];
	                    randomNamesArray[j] = currentLastName;
	                }
	            }
	        }
	        
	        System.out.println("The names in alphabetical order are: ");
	        for (int i = 0; i < randomNamesArray.length; i++) {
	        	System.out.println(randomNamesArray[i]);
	        }
	           
	        fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("There was an issue reading randomPeople.txt");
			e.printStackTrace();
		}
	}
}
