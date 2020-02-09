public class Main
{
	public static void main(String[] args) {
		
		int x = 1;
		    
		while (x <= 5){
		    
		    System.out.println(2 * x);
		    
		    x++;
		}
		
		for (int y=1; y<=5; y++){
		    
		    System.out.println(2 * y);
		}
	
		
		for (int y=5; y > 0; y--){
		    
		    System.out.println(2 * y); //Loop for printing even numbers from 1 to 10 in reverse fashion
		}
		for (int y=1; y<=10; y++){
		    
		    System.out.println((y * (y+1)) / 2); //This loop is for printing first 10 triangular numbers which simply means the number of objects that can be arranged in an equilateral triangle
		}

			String[] Family = {"Anil", "Deepti", "Aman", "Naina"};

		for(String name : Family) {          //The colon":" here is for fetching the variable from the stringarray family

		    System.out.println(name);
		}
	}
}


//Problem : Given an integer N,(2<=N<=20), print its first 10 multiples. Each multiple N x i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

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

        if (N>1 && N<=20)
        {
            for (int i=1; i<=10; i++)
            {
                int mul = N*i;
                System.out.println(N + " x " + i + " = " + mul);
            }
        }

        scanner.close();
    }
}


//Problem: Making a series

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x = 0;
            int s =0;
            for(int j=0; j<n; j++)
            {
            int square = (int)Math.pow(2,j);

            s = s + square*b;
            x = a + s;
            System.out.print(x + " ");
            }

            System.out.println("");

        }
        in.close();
    }
}


