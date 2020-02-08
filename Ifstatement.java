public class HelloWorld {
  public static void main(String[] args) {
   
   	int[] Array = {5,5};
   	
   	if(Array[1] > Array[0]) {
   			
   		System.out.println("2nd number is greater than 1st");
   		
   		} else if(Array[0] > Array[1]) {
   		
   		System.out.println("1st number is greater than 2nd");
   		
   		} else {
   		
   		System.out.println("The number is same");
   		 
   		 }
 
  }
}



//Alternate code for better understanding
/*Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N>=2 && N<=5 && N%2 == 0)
        {
            System.out.println("Not Weird");
        }
        else if (N>=6 && N<=20 && N%2 == 0)
        {
            System.out.println("Weird");
        }
        else if (N>20 && N<=100 && N%2 == 0)
        {
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Weird");
        }
        scanner.close();
    }
}

