// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;

import java.io.*;
import java.util.Scanner;

/*
	program that reads all the numbers from the file named numberRow.txt you just made
    write those numbers out to a new file numbersColumn.txt
    the new file will have all the numbers listed one per line 
*/

public class Exercise2 {
    public static void main(String[] args) {
    	System.out.println("Reading numberRow.txt...");
    	
        try {
            File numberRowFile = new File("./src/main/numberRow.txt");
            Scanner fileScanner = new Scanner(numberRowFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/numbersColumn.txt"));

            String[] numbersArray = new String[100];
            
            while (fileScanner.hasNextLine()) {
                String numberRow = fileScanner.nextLine();
                numbersArray = numberRow.split(" ");
            }

            for (int i = 0; i < 100; i++) {
                writer.write(numbersArray[i]);
                if(i < 99) {
                	writer.newLine();	
                }
                
            }
            
            System.out.println("Success! numberRow.txt data was translated into a single column in numbersColumn.txt");
            
            writer.close();
            fileScanner.close();
        } catch (FileNotFoundException e) {
        	System.out.println("There was an issue reading numberRow.txt");        	
            e.printStackTrace();
            
        } catch (IOException e) {
        	System.out.println("There was an issue writing to numbersColumn.txt");        	
            e.printStackTrace();
            
        }
    }
}