// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
	program that reads the name data from the files named firstNames.txt and lastNames.txt
    and produces a list of 1000 random names  randomPeople.txt
    one complete name (firstname lastname) per line 
*/

public class Exercise6 {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		System.out.println("Generating 1000 random names...");
		
		try {
			File firstNamesDataFile = new File("./src/main/firstNames.txt");
			File lastNamesDataFile = new File("./src/main/lastNames.txt");	    
			BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/randomPeople.txt"));
			Random randomGenerator = new Random();
			
			Scanner fileScanner = new Scanner(firstNamesDataFile);
				
			String[] firstNamesArray = new String[100];
			String[] lastNamesArray = new String[100];
			
			int elementPushIndex = 0;
			
			
			while(fileScanner.hasNext()) {
				firstNamesArray[elementPushIndex] = fileScanner.nextLine();
				elementPushIndex = elementPushIndex + 1;
			}
			
			fileScanner = new Scanner(lastNamesDataFile);
			
			elementPushIndex = 0;
			
			while(fileScanner.hasNext()) {
				lastNamesArray[elementPushIndex] = fileScanner.nextLine();
				elementPushIndex = elementPushIndex + 1;
			}			
			
			
			for(int i = 0; i < 1000; i++) {
				int randomFirstNameIndex = randomGenerator.nextInt(100);
				int randomLastNameIndex = randomGenerator.nextInt(100);
				
                writer.write(firstNamesArray[randomFirstNameIndex] + " " + lastNamesArray[randomLastNameIndex]);
                if(i < 999) {
                	writer.newLine();	
                }
			}
			
			System.out.println("1000 random names generated to randomPeople.txt!");
			
			writer.close();
			fileScanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
