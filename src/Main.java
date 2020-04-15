import java.util.ArrayList;
import java.util.List;

public class Main
{

	public static void main(String[] args)
	{
		//Fase 1
		
		Rocket rocket1,rocket2;
		rocket1 = new Rocket("32WESSDS",3);
		rocket2 = new Rocket("LDSFJA32",6);
		
		//Fase 2
		
		List<Propeller> propellersRocket1, propellersRocket2;
		
		propellersRocket1 = new ArrayList<Propeller>(rocket1.getPropellerQuantity());
		propellersRocket1.add(new Propeller (20));
		propellersRocket1.add(new Propeller (50));
		propellersRocket1.add(new Propeller (80));
		
		rocket1.setPropellers(propellersRocket1);
		
		propellersRocket2 = new ArrayList<Propeller>(rocket2.getPropellerQuantity());
		propellersRocket2.add(new Propeller(30));
		propellersRocket2.add(new Propeller(40));
		propellersRocket2.add(new Propeller(50));
		propellersRocket2.add(new Propeller(50));
		propellersRocket2.add(new Propeller(30));
		propellersRocket2.add(new Propeller(10));
		rocket2.setPropellers(propellersRocket2);
		
		System.out.println("the rocket : "+rocket1.getCode()+" has: "+rocket1.getPropellerQuantity()+" propeller with these powers: "+rocket1.getPropellers());
		System.out.println("the rocket : "+rocket2.getCode()+" has: "+rocket2.getPropellerQuantity()+" propeller with these powers: "+rocket2.getPropellers());
	
		//Orders-------------------------------------------
		AccelerationsThread ta1 = new AccelerationsThread(rocket1,1);
		AccelerationsThread ta2 = new AccelerationsThread(rocket1,2);
		AccelerationsThread ta3 = new AccelerationsThread(rocket1,3);
		
		rocket1.accelerate(100);
		
		ta1.start();
		ta2.start();
		ta3.start();
		
		DecelerationsThread ta4 = new DecelerationsThread(rocket1,1);
		DecelerationsThread ta5 = new DecelerationsThread(rocket1,2);
		DecelerationsThread ta6 = new DecelerationsThread(rocket1,3);
		
		rocket1.decelerate(20);
		
		while(!ta1.isAlive()) 
		{
			ta4.start();	
		}
		ta4.start();
		ta5.start();
		ta6.start();
		

 
		
	}

}

//Threads-----------------------------------------


class AccelerationsThread extends Thread
{
	private Rocket rocket;
	private int propellerNumber;
	
	public AccelerationsThread (Rocket rocket, int propellerNumber) 
	{
		this.rocket = rocket;
		this.propellerNumber = propellerNumber;
		
	}		
	 public void run() 
	 {
		 Propeller propellerSelection;
			propellerSelection = rocket.getPropellers().get(propellerNumber-1);
			
			if (propellerSelection.getTargetPower()>propellerSelection.getMaxPower()) 
			{
			
				for (int i = propellerSelection.getCurrentPower(); i < propellerSelection.getMaxPower(); i+=10)
				{
					propellerSelection.setCurrentPower(propellerSelection.getCurrentPower()+10);
					System.out.println(getName()+"||"+"Propulsor "+propellerNumber+": "+"Potencia objetivo: "+ propellerSelection.getTargetPower()+" Potencia actual: "+propellerSelection.getCurrentPower());
					
					try
					{
						Thread.sleep(500);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}else 
			{
				for (int i = propellerSelection.getCurrentPower(); i < propellerSelection.getMaxPower(); i+=10)
				{
					propellerSelection.setCurrentPower(propellerSelection.getCurrentPower()+10);
					System.out.println(getName()+"||"+"Propulsor "+propellerNumber+": "+"Potencia objetivo: "+ propellerSelection.getMaxPower()+" Potencia actual: "+propellerSelection.getCurrentPower());
					
					try
					{
						Thread.sleep(500);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
		 //rocket.accelerate(propellerNumber); 
	 }
}
}

class DecelerationsThread extends Thread
{
	private Rocket rocket;
	private int propellerNumber;
	
	public DecelerationsThread (Rocket rocket, int propellerNumber) 
	{
		this.rocket = rocket;
		this.propellerNumber = propellerNumber;
		
	}		
	public void run() 
	 {
		Propeller propellerSelection;
		propellerSelection = rocket.getPropellers().get(propellerNumber-1);
			
			if (propellerSelection.getCurrentPower()>propellerSelection.getTargetPower()) 
			{
				for (int i = propellerSelection.getCurrentPower(); i > propellerSelection.getTargetPower(); i-=10)
				{
					propellerSelection.setCurrentPower(propellerSelection.getCurrentPower()-10);
					System.out.println(getName()+"||"+"Propulsor "+propellerNumber+": "+"Potencia objetivo: "+propellerSelection.getTargetPower()+" Potencia actual: "+propellerSelection.getCurrentPower());
					
					try
					{
						Thread.sleep(500);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}else 
			{
				System.out.println("La Potencia es menor o igual a la solicitada");
			}
		 //rocket.decelerate(propellerNumber); 
	 }
}
