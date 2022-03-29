// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
	program that reads all the numbers from the file named numberGrid.txt you just made
    make a new file named gridStats.txt that contains statistics about that list of numbers
    grand total
    totals by row 
    totals by column
    average values of all numbers 
    the count of how many times the number 17 is in the list  
*/

public class Exercise5 {

	public static void main(String[] args) {
		
        int[][] numberGridArray = new int[10][10];
        int total = 0;
        int row = 0;
        int seventeenCount = 0;
        
       
        	File a = new File("./src/main/numberGrid.txt");
        	Scanner scanner;
			try {
				scanner = new Scanner(a);
	        	for(int i = 0; i < numberGridArray.length; i++) {
	        		for(int j = 0; j < numberGridArray.length; j++) {
	            		int num = scanner.nextInt();
	            		numberGridArray[i][j] = num;
	            		total += num;            	
	            	}
	        	}
	        	
	        	for(int i = 0; i < numberGridArray.length; i++) {
	        		for(int j = 0; j < numberGridArray.length; j++) {
	            		row += numberGridArray[i][j];
	            		
	            		if(numberGridArray[i][j] == 17) {
	            			seventeenCount += 1;
	            		}	      
	            	}
	        		
	        		System.out.println("Row " + (i + 1) + " Total: " + row);
	        		row = 0;
	        	}
	        	
	        	System.out.println("Grand Total: " + total);
	        	System.out.println("Average Value: " + (total/20));
	        	System.out.println("17 count: " + seventeenCount);
	        	
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}        		         
	}

}
