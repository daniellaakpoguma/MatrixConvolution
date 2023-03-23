/*
 * Description: Classes that models an array object and its attributes and behvaiours
 * Student Name: Akpoguma Oghenerukevwe
 * StudentID: 041075624
 * Due Date: February 19, 2023
 * Program: CET-CS CST8132
 * Lab Professor: James Mwangi PhD.
 */
package lab3.matrices;

/*
 * A brief description of the role of this class: Classes that models an array object and its attributes and behvaiourss
 * Student Name: Akpoguma Oghenerukevwe
 * Student Number:041075624
 * Course: CST8132 Object Oriented Programming
 * Program: CET-CS-Level 2
 * Professor:  James Mwangi PhD.
 *
 */

import java.util.Arrays;

//This class models a matrix
public class Matrix {
	protected double array [][];
	protected int rows;
	protected int columns;

	// method to create zero matrix with given number of rows and columns
	public Matrix (int rows,int columns) {
		this.rows = rows;
		this.columns = columns;
		array = new double[rows][columns];
		toString();
	}
	
	//creates matrix from 2d array
	public Matrix(double[][] array) {
		this.rows = array.length;
		this.columns = array[0].length;
		this.array = array;
		array = new double [rows][columns];
		toString();
	}
	

	//addition of two matrixes
	public Matrix add(Matrix matrix) {
		Matrix addMatrix = new Matrix(rows,columns);// new matrix object
		 for (int i = 0; i < rows; i++) {	// double for loops for iterating through the array
	            for (int j = 0; j < columns; j++) {
	            	addMatrix.array[i][j] = matrix.array[i][j]+ array[i][j];
	            }
		 }
			return addMatrix;
	}
	//subtraction of two matrixes
	public Matrix sub(Matrix matrix) {
		Matrix subMatrix = new Matrix(rows,columns);// new matrix object
		 for (int i = 0; i < rows; i++) {	// double for loops for iterating through the array
	            for (int j = 0; j < columns; j++) {
	            	subMatrix.array[i][j] = matrix.array[i][j]- array[i][j];
	            }
		 }
			return subMatrix;
	}
	
	//multiplication of two matrixes
	public Matrix mult(Matrix matrix) {
		Matrix multMatrix = new Matrix(rows,columns);// new matrix object
		 for (int i = 0; i < rows; i++) {	// double for loops for iterating through the array
	            for (int j = 0; j < columns; j++) {
	            	multMatrix.array[i][j] = matrix.array[i][j]+ array[i][j];
	            }
		 }
			return multMatrix;
	}
	
	//summation of all elements in a matrix
	public double sum() {
		double sumMatrix = 0;
		for (int i = 0; i < rows; i++) {	// double for loops for iterating through the array
            for (int j = 0; j < columns; j++) {
                 sumMatrix = sumMatrix + array[i][j];
            }
		}
		return sumMatrix;
	}
	
	
	public Matrix subMatrix(int rowStart, int columnStart, int rowLength, int columnWidth) {
		Matrix subMatrix = new Matrix(rowLength,columnWidth); // new matrix object
		for (int i = rowStart;i <= rowLength; i++) { // double for loops for iterating through the array
			for (int j = columnStart; j <= columnWidth; j++) {
				subMatrix.array[i-1][j-1]= array [i][j];
			}
		}
		return subMatrix;
	}
	
	
	public String toString(){
		StringBuffer result = new StringBuffer();
	     for(double[] row : array) {
	          result.append(Arrays.toString(row));
	          result.append('\n');
	     }
	     return result.toString();
	}
	
	
}

	
	




