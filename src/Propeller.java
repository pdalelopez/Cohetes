
public class Propeller extends Thread
{
private int propellerNumber, maxPower, currentPower, targetPower;

public Propeller(int maxPower,int propellerNumber)
{
	setCurrentPower(0);
	setMaxPower(maxPower);
	setPropellerNumber(propellerNumber);
}
public Propeller(Propeller propeller)
{
	setCurrentPower(propeller.getCurrentPower());
	setMaxPower(propeller.getMaxPower());
	setPropellerNumber(propeller.getPropellerNumber());
}
public void setPropellerNumber(int propellerNumber)
{
	this.propellerNumber = propellerNumber;
	
}
public int getPropellerNumber()
{
	return propellerNumber;
}
public int getMaxPower()
{
	return maxPower;
}
public void setMaxPower(int maxPower)
{
	this.maxPower = maxPower;
}

public int getCurrentPower()
{
	return currentPower;
}

public void setCurrentPower(int currentPower)
{
	this.currentPower = currentPower;
}
public int getTargetPower()
{
	return targetPower;
}

public void setTargetPower(int targetPower)
{
	this.targetPower = targetPower;
}
@Override
public String toString()
{
	return "[maxPower=" + maxPower + ", currentPower=" + currentPower + "]";
}

public void run() 
{
}
}



