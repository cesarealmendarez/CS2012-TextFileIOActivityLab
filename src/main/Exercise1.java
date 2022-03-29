// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package main;
import java.io.*;
import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("Writing 100 random numbers between 0 and 1000 to numberRow.txt...");
		
        try {
            Random randomGenerator = new Random();
            BufferedWriter writer = new BufferedWriter(new FileWriter("./src/main/numberRow.txt"));

            for(int i = 0; i < 100; i++){
                int randomToWrite = randomGenerator.nextInt(1000 - 0) + 0;
                writer.write(String.valueOf(randomToWrite) + " ");
            }
            
            System.out.println("Success!");
            
            writer.close();
        }catch (IOException e){
        	System.out.println("There was an issue writing the numberRow.txt file");        	
        	e.printStackTrace();
        }		
	}

}
