/*
 * Description: Is-a Matrix that has a name
 * Student Name: Akpoguma Oghenerukevwe
 * StudentID: 041075624
 * Due Date: February 19, 2023
 * Program: CET-CS CST8132
 * Lab Professor: James Mwangi PhD.
 */
package lab3.matrices;

public class NamedMatrix extends Matrix{ // subclass of Matrix
	protected String name; 
	
	//constructor for the named 2d array
	public NamedMatrix(String name, double array [][]){
		super(array); // references Matrix(array) constructor in the superclass
		this.name = name;
	}
	
	//accessor for the instance variable, name
	public String getName() { 
		return name;
	}


}
