/*
Name: BubbleSortTrace
Purpose: Implements the Bubble Sort algorithm and prints the array to the 
  standard error stream at each step.
Author: Tanner Kennedy
Date: 11/20/19
*/

import java.io.*;

public class BubbleSortTrace
{
    public static void main (String[] args) throws IOException
    {
	// Declare and initialize the array
	int [] array = {5, 1, 4, 2, 8};
	
	// Print starting array
	System.err.print("Starting Array: ");
	printArray(array, System.err);
	System.err.println();
	System.err.println();
	
	// This variable is a "flag" that is set to true if a change is made during a pass
	boolean arrayChanged = true;
	
	// This outer loop controls how many passes 
	int passNumber = 1;
	while (arrayChanged)
	{
	    // Set the arrayChanged flag to false to start the pass
	    arrayChanged = false;
	    
	    // Print the pass number
	    System.err.println("PASS " + passNumber + ":");
	    
	    // This inner loop runs each pass.
	    // rightIndex is the index of the second element in the pair being compared.
	    for (int rightIndex = 1; rightIndex < array.length; rightIndex++)
	    {
		// Print the array before any swap
		printArray(array, System.err);
		
		// If the two elements are out of order, swap them.
		// TODO: You need to implement this part of the program.
		
		if (array[rightIndex] < array [rightIndex - 1])
		{
		    int temp = array[rightIndex];
		    array[rightIndex] = array[rightIndex-1];
		    array[rightIndex - 1] = temp;
		    arrayChanged = true;
		    
		}
		
		
		// Print the array after any changes
		System.err.print(" -> ");
		printArray(array, System.err);
		System.err.println();
	    }
	    
	    // Print a blank line
	    System.err.println();
	    
	    // Increment the pass number
	    passNumber++;
	}
	
	// Print out the sorted array
	System.out.print("Sorted Array: ");
	printArray(array, System.out);
	System.out.println();
    }
    
    /**
     * This method takes in an integer array and a stream (e.g., System.out or 
     * System.err) and prints the array to the stream.
     */
    public static void printArray (int [] array, PrintStream stream)
    {
	for (int index = 0; index < array.length; index++)
	{
	    if (index > 0) {
		stream.print(" ");
	    }
	    stream.print(array[index]);
	}
    }
}
