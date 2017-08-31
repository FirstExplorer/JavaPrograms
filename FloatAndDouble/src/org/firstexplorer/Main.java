package org.firstexplorer;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 5;
	float myFloatValue = 5f;
	double myDoubleValue = 5.d;
	// Width of int = 32 (4 bytes)
	System.out.println("MyIntValue = " + myIntValue);
        // Width of float = 32 (4 bytes)
        System.out.println("MyFloatValue = " + myFloatValue);
        // Width of double = 64 (8 bytes)
        System.out.println("MyIntValue = " + myDoubleValue);

      /*
        Convert a given number of pounds to kilograms
        1. Create a variable to storethe number of pounds
        2. Calculate the number of Kilograms for the number above and store in a variable
        3. Print out the result.
        NOTES: 1 pound is equal to 0.45359237 kilograms
        */
      double numPound = 200d ;
      double kg = numPound * 0.45359237;

      System.out.println("Kilograms = " + kg);
      double pi = 3.14159276;
    }
}
