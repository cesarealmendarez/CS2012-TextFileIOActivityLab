// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
		Ask the user to enter the dimensions of a 2D Arrays.
           Requires 2 integers for rows and columns. Minimum should be 5, maximum should be 10.
                NOTE: Dimensions cannot be negative and you must enforce this and size using proper error checking with loops.
           Generate a 2D array and populate it with random integers from 100 to 999 inclusive.
           Once the array has been created display to the console the following results:
                 Display the array in table format. (Print the 2D array).
                 Make sure to print it with all the rows and columns neatly aligned.
           Write that same array to a file named randomTable.txt
                 The text file should look exactly like what is displayed in the console. 
*/

public class Exercise4 {
	
    public static void main(String[] args){
    	
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        
        try {        
        	BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/randomTable.txt"));
        
	        System.out.println("Enter the number of rows 5-10");
	        int numRows = scanner.nextInt();
	
	        while(numRows < 5 || numRows > 10){
	            System.out.print("Enter the number of rows 5-10");
	            numRows = scanner.nextInt();
	        }
	
	        System.out.println("Enter the number of columns 5-10");
	        int numColumns = scanner.nextInt();
	
	        while(numColumns < 5 || numColumns > 10){
	            System.out.print("Enter the number of columns 5-10");
	            numColumns = scanner.nextInt();
	        }
	
	        System.out.println("Set: Rows - " + numRows + " Columns - " + numColumns);
	
	        System.out.println("HERE IS YOUR PERFECTLY FORMATTED TABLE:");
	
	        for (int j = 0; j < numColumns; j++) {
	            System.out.print("------");
	            writer.write("----");
	        }
	        
	        System.out.println();
	        writer.newLine();
	        
	        for (int i = 0; i < numRows; i++){
	            for (int j = 0; j < numColumns; j++) {
	                int randomToWrite = randomGenerator.nextInt(999 - 100 + 1) + 100;
	                System.out.print(randomToWrite + " | ");
	                writer.write(randomToWrite + "|");
	            }
	            
	            System.out.println();
	            writer.newLine();
	            
	            for (int j = 0; j < numColumns; j++) {
	                System.out.print("------");
	                writer.write("----");
	            }
	            
	            System.out.println();
	            writer.newLine();
	        }
	        
	        System.out.println("ALSO SAVED TABLE INTO RANDOMTABLE.TXT");
	        
		    scanner.close();
		    writer.close();
		} catch (IOException e) {
			System.out.println("There was an issue writing table into randomTable.txt");
			e.printStackTrace();
		}	     
        
    }
}