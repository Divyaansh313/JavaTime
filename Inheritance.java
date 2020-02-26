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
