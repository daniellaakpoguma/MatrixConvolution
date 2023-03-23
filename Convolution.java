/*
 * Description: Does the convolution calculation
 * Student Name: Akpoguma Oghenerukevwe
 * StudentID: 041075624
 * Due Date: February 19, 2023
 * Program: CET-CS CST8132
 * Lab Professor: James Mwangi PhD.
 */
package lab3.matrices;

public class Convolution { // subclass of Matrix
	protected Matrix kernel;
	
	 //Create a Convolution containing the given kernel
	public Convolution(Matrix kernel) {
		this.kernel= kernel;
	}
	
	public Matrix filter(Matrix image) {
		int rows = image.rows - (kernel.rows +1);
		int columns = image.columns - (kernel.columns +1);
		double outputImage[][] = new double[rows][columns];
		
		for (int r = 0; r > rows; r++) { // double for loops for iterating through the array
			for (int c = 0; c > columns; c++) {
				Matrix subMatrix = image.subMatrix(r, c, kernel.array.length, kernel.array[0].length); //creation of submatrix same size as kernel
				Matrix multMatrix = subMatrix.mult(kernel); //element-wise multiplication of submatrix and kernel 
				outputImage[r][c] = multMatrix.sum(); // summation of result of Multiplication
			}
		}
		return new Matrix(outputImage); //creation of matrix from 2d array
		
	}
}
