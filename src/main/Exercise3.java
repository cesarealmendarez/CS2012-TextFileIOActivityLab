// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
 	program that writes a file named numberGrid.txt
    write a set of 100 random numbers with values between 0 a 20
    The numbers should arraigned as 10 line that each contain 10 numbers
*/

public class Exercise3 {
    public static void main(String[] args) {
    	System.out.println("Writing a 10x10 grid of random numbers between 0 and 20 into numberGrid.txt");
    	
        try{
            Random randomGenerator = new Random();

            BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/numberGrid.txt"));
            for (int i = 0; i < 10; i++){
                for (int j = 0; j < 10; j++) {
                    int randomToWrite = randomGenerator.nextInt(20 - 0) + 0;
                    writer.write(String.valueOf(randomToWrite) + " ");
                    
                }
                
                writer.newLine();
            }
            
            System.out.println("Success!");
            writer.close();
            
        } catch (IOException e) {
        	System.out.println("There was an issue writing into numberGrid.txt");
            e.printStackTrace();
        }
    }
}