import java.util.*;

class Players
{
	String name;
	int age;
	int exp;
	double weight;
	
	Players()
	{
	name = "Divyaansh";
	age = 19;
	exp = 6;
	weight = 67.5;
	}
}

class Cricket_Player extends Players
{
	int runsInCareer;
	double avg;
	double strikeRate;

	Cricket_Player()
	{
	super();
	runsInCareer = 10000;
	avg = 58.6;
	strikeRate = 130.6;
	}
public void display()
{
System.out.println("Name: " + name +"\n"+"Age: "+age+"\n"+"Experience: "+exp+"\n"+"Weight: "+weight+"\n"+"Runs in Career: "+runsInCareer+"\n"+"Average: "+avg+"\n"+"Strike Rate: "+strikeRate+"\n");
}
}

class Football_Player extends Players
{
	int goals;
	int assists;

	Football_Player(int goals, int assists)
	{
	super();
	this.goals = goals;
	this.assists = assists;
	}

public void display()
{
System.out.println("Name: " + name +"\n"+"Age: "+age+"\n"+"Experience: "+exp+"\n"+"Weight: "+weight+"\n"+"Goals in Career: "+goals+"\n"+"Assits in Career: "+assists+"\n");
}
}

class Hockey_Player extends Players
{
	int goals;
	int penaltiesTaken;

	Hockey_Player(int goals, int penalties)
	{
	super();
	this.goals = goals;
	penalties = penaltiesTaken;
	}

public void display()
{
System.out.println("Name: " + name +"\n"+"Age: "+age+"\n"+"Experience: "+exp+"\n"+"Weight: "+weight+"\n"+"Goals in Career: "+goals+"\n"+"Penalties in Career: "+penaltiesTaken+"\n");
}
}

public class Solution 
{
	public static void main(String args[])
	{
	Cricket_Player myPlayer1 = new Cricket_Player();
	Football_Player myPlayer2 = new Football_Player(166,180);
	Hockey_Player myPlayer3 = new Hockey_Player(202, 167);
	
	myPlayer1.display();
	myPlayer2.display();
	myPlayer3.display();
	}
}

	


import java.util.*;

public class Vehicle
{
	//private int maxSpeed;
	int minSpeed;
	boolean isTheCarOn;

	public Vehicle()
	{
	//maxSpeed = 180;
	minSpeed = 0;
	isTheCarOn = false;
	}
}

class Car extends Vehicle 
{
	String modelType;
	String modelName;
	String colour;
public Car()
{
	super();
	modelType = "Hachback";
	modelName = "Baleno";
	colour = "Blue";
}

public void Display()
{

//Displaying every property

//System.out.println("Max Speed: " + maxSpeed); //Accessing private member of the super class
System.out.println("Min Speed: " + minSpeed);
System.out.println("Is the car on: " + isTheCarOn);
System.out.println("The Model type is: " + modelType);
System.out.println("The Model name is: " + modelName);
System.out.println("The colour is: " + colour);
}

public static void main(String args[])
{
	Car myCar = new Car();
	myCar.Display();
}

}




		
//Another problem


import java.util.*;

class Worker
{
	String name;
	double salary_rate;
	double weekPay;
	int hours;

	Worker(String name, double salary_rate)
	{
	this.name = name;
	this.salary_rate = salary_rate;
	}

	void ComPay(int hours)
	{
	this.hours = hours;
	weekPay = hours*salary_rate;
	System.out.println(weekPay);
	}
}

class DailyWorker extends Worker
{
	DailyWorker(String D_name,double rate)
	{
	super(D_name,rate);
	}

	void ComPay(int hours, int noOfDays)
	{
	this.hours = hours;
	weekPay = hours*noOfDays*salary_rate;
	System.out.println(weekPay);
	}
}
