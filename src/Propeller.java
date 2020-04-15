
public class Propeller
{
private int maxPower, currentPower;

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
@Override
public String toString()
{
	return "[maxPower=" + maxPower + ", currentPower=" + currentPower + "]";
}

}


