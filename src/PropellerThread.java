
public class PropellerThread implements Runnable
{
	private Propeller propellerSelection;
	private int targetPower, propellerNumber; 
	
	public PropellerThread(Propeller propellerSelection, int targetPower, int propellerNumber)
	{
		this.propellerSelection = propellerSelection;
		this.targetPower = targetPower;
		this.propellerNumber = propellerNumber;
	}	
	
	public void run()
	{
		
		if (targetPower<=propellerSelection.getMaxPower())
		{	
			for (int i = propellerSelection.getCurrentPower(); i < targetPower; i+=1)
			{
				propellerSelection.setCurrentPower(propellerSelection.getCurrentPower()+1);
				System.out.println("Propeller "+propellerNumber+ "Potencia objetivo: "+targetPower+"Potencia actual: "+propellerSelection.getCurrentPower());

				try
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}else 
		{
			for (int i = propellerSelection.getCurrentPower(); i < propellerSelection.getMaxPower(); i+=1)
			{
				propellerSelection.setCurrentPower(propellerSelection.getCurrentPower()+1);
				System.out.println("Propeller "+propellerNumber+ " || Potencia objetivo: "+propellerSelection.getMaxPower()+" || Potencia actual: "+propellerSelection.getCurrentPower());

				try
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		}
	}

}
