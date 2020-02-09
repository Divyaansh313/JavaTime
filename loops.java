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
