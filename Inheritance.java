import java.util.*;

abstract class TrunkCalls
{

	double duration;
	double rate;

	abstract void charges(double duration);
}

class OrdinaryTrunkCalls extends TrunkCalls
{
	void charges(double duration)
	{
	rate = 3.0;
	this.duration = duration;
	double charges = rate*duration;
	System.out.println(charges);
	}
}

class LightningTrunkCalls extends TrunkCalls
{
	void charges(double duration)
	{
	rate = 3.5;
	this.duration = duration;
	double charges = rate*duration;
	System.out.println(charges);
	}
}

class UrgentTrunkCalls extends TrunkCalls
{
	void charges(double duration)
	{
	rate = 5.0;
	this.duration = duration;
	double charges = rate*duration;
	System.out.println(charges);
	}
}


public class Bill
{
	public static void main(String args[])
	{
	OrdinaryTrunkCalls call1 = new OrdinaryTrunkCalls();
	call1.charges(39.10);
	LightningTrunkCalls call2 = new LightningTrunkCalls();
	call2.charges(10.40);
	UrgentTrunkCalls call3 = new UrgentTrunkCalls();
	call3.charges(10.40);
	}
}





------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Another problem


import java.util.*;

class Employee
{
	String name;
	int empid;
	double salary;

Employee()
{
name = " ";
empid = 0;
salary = 0.0;
}

Employee(String name, int empid, double salary)
{
this.name = name;
this.empid =empid;
this.salary =salary;
}

String EmployeeName()
{
	return name;
}

double EmployeeSalary()
{
return salary;
}

void IncreaseSalary(double percentage)
{
double IncreaseInSalary = (percentage/100) * salary;
salary = salary + IncreaseInSalary;
System.out.println("New salary is: " + salary);
}
}


class Manager extends Employee
{
String department;
Manager(String name, int empid, double salary, String department)
{
super(name, empid, salary);
this.department = department;
System.out.println("Name is: " + name + "and id is: " + empid + "and salary is: " + salary);
System.out.print("and department is: " + department);
}
}
