/*
 * Description: Is-a Matrix that can read and written from/to a text file
 * Student Name: Akpoguma Oghenerukevwe
 * StudentID: 041075624
 * Due Date: February 19, 2023
 * Program: CET-CS CST8132
 * Lab Professor: James Mwangi PhD.
 */
package lab3.matrices;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class FileMatrix extends Matrix { // subclass of Matrix 
	
	// Private constructor to make creating the FileMatrix from a File easier
	private FileMatrix (Scanner input){
		  super(input.nextInt(), input.nextInt()); //the first two numbers in the line for number of rows and columns
	        for(int i = 0; i < rows; i++) { // double for loops for iterating through the array
	            for(int j = 0; j < columns; j++){    
					this.array[i][j] = input.nextDouble(); //reads values from file and inputs them into the array
	            }
	        }
         }
	
	 //Create a FileMatrix from a file 
	public FileMatrix(File file) throws FileNotFoundException {
		  this(new Scanner(file)); //file chained to the FileMatrix (input) constructor
	}

	//Create a FileMatrix from an existing Matrix
	public FileMatrix (Matrix matrix) {
		super(matrix.array);
	}
	
	// Save a FileMatrix to a text file
	public boolean save(File file) {
		try {
            PrintWriter myWriter = new PrintWriter(file);
            double[][] matrix = array;
            for (int r = 0; r < rows; r++) { // double for loops for iterating through the array
                for (int c = 0; c < columns; c++) {
                    myWriter.print(matrix[r][c] + " ");
                }
                myWriter.println();
            }
            myWriter.close(); //closing of print writer
            return true;
        } catch (FileNotFoundException e) {
        	System.out.println("File Not Found");
            return false;
        }
		
	}
}
