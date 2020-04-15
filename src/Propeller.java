
public class Propeller
{
private int maxPower, currentPower, targetPower;

public Propeller(int maxPower)
{
	setCurrentPower(0);
	setMaxPower(maxPower);
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

}


