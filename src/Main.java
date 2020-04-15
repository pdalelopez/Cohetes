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
		propellersRocket1.add(new Propeller (10));
		propellersRocket1.add(new Propeller (30));
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
		
		
		System.out.println("---------------------------");
		System.out.println("Rocket: "+rocket1.getCode());
		rocket1.accelerate(3);
		System.out.println("---------------------------");
		System.out.println("Rocket: "+rocket1.getCode());
		rocket1.decelerate(3);
		
	}

}
