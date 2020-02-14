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

	


	
	
