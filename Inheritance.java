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
