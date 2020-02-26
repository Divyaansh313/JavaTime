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
