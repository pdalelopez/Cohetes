import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

	
	
	public static void main(String[] args)
	{
		
		//Fase 1
		
		Scanner input = new Scanner (System.in);
		
		
		Rocket rocket1,rocket2;
		rocket1 = new Rocket("32WESSDS",3);
		rocket2 = new Rocket("LDSFJA32",6);
		
		//Fase 2
		
		List<Propeller> propellersRocket1, propellersRocket2;
		
		
		
		propellersRocket1 = new ArrayList<Propeller>(rocket1.getPropellerQuantity());
		propellersRocket1.add(new Propeller(10,1));
		propellersRocket1.add(new Propeller (50,2));
		propellersRocket1.add(new Propeller (80,3));
		rocket1.setPropellers(propellersRocket1);
		
		
		
		propellersRocket2 = new ArrayList<Propeller>(rocket2.getPropellerQuantity());
		propellersRocket2.add(new Propeller(30,1));
		propellersRocket2.add(new Propeller(40,2));
		propellersRocket2.add(new Propeller(50,3));
		propellersRocket2.add(new Propeller(50,4));
		propellersRocket2.add(new Propeller(30,5));
		propellersRocket2.add(new Propeller(10,6));
		rocket2.setPropellers(propellersRocket2);
		
		System.out.println("the rocket : "+rocket1.getCode()+" has: "+rocket1.getPropellerQuantity()+" propeller with these powers: "+rocket1.getPropellers());
		System.out.println("the rocket : "+rocket2.getCode()+" has: "+rocket2.getPropellerQuantity()+" propeller with these powers: "+rocket2.getPropellers());
	
		//Orders-------------------------------------------
		
		rocket1.accelerate(90);
		
		System.out.println("press any letter and enter for star Rocket2 Deceleration Test");
		
		input.next();
		
		System.out.println(rocket1.getPropellers().get(2));
		
		rocket2.getPropellers().get(0).setCurrentPower(10);
		rocket2.getPropellers().get(1).setCurrentPower(10);
		rocket2.getPropellers().get(2).setCurrentPower(10);
		rocket2.getPropellers().get(3).setCurrentPower(10);
		rocket2.getPropellers().get(4).setCurrentPower(10);
		rocket2.getPropellers().get(5).setCurrentPower(10);
		
			rocket2.decelerate(5);
		
			input.close();
		
	}

}

//-----------------------------------------
class AcePropeller extends Propeller
{

	public AcePropeller(Propeller propeller)
	{
		super(propeller);
	}
	public void run() 
	{
		if (getTargetPower()>getMaxPower()) 
		{
		
			for (int i = getCurrentPower(); i < getMaxPower(); i+=5)
			{
				setCurrentPower(getCurrentPower()+5);
				System.out.println(getName()+"||"+"Propulsor "+getPropellerNumber()+" Potencia objetivo: "+ getTargetPower()+" Potencia actual: "+getCurrentPower());
				
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
			for (int i = getCurrentPower(); i < getMaxPower(); i+=5)
			{
				setCurrentPower(getCurrentPower()+5);
				System.out.println(getName()+"||"+"Propulsor "+getPropellerNumber()+" Potencia objetivo: "+ getMaxPower()+" Potencia actual: "+getCurrentPower());
				
				try
				{
					Thread.sleep(500);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

class DecePropeller extends Propeller
{
	
	public DecePropeller(Propeller propeller)
	{
		super(propeller);
	}	
	public void run() 
	 {
			
			if (getCurrentPower()>getTargetPower()) 
			{
				for (int i = getCurrentPower(); i > getTargetPower(); i-=1)
				{
					setCurrentPower(getCurrentPower()-1);
					System.out.println(getName()+"||"+"Propulsor "+getPropellerNumber()+": "+" Potencia objetivo: "+getTargetPower()+" Potencia actual: "+getCurrentPower());
					
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
	 }
}
