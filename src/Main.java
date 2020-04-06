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
		System.out.println("the rocket with code: "+rocket1.getCode()+" has: "+rocket1.getPropellerQuantity()+" propeller.");
		System.out.println("the rocket with code: "+rocket2.getCode()+" has: "+rocket2.getPropellerQuantity()+" propeller.");
		
		//Fase 2
		
		List<Integer> powersRocket1, powersRocket2;
		
		powersRocket1 = new ArrayList<Integer>(rocket1.getPropellerQuantity());
		powersRocket1.add(10);
		powersRocket1.add(30);
		powersRocket1.add(80);
		rocket1.setPowers(powersRocket1);
		
		powersRocket2 = new ArrayList<Integer>(rocket2.getPropellerQuantity());
		powersRocket2.add(30);
		powersRocket2.add(40);
		powersRocket2.add(50);
		powersRocket2.add(50);
		powersRocket2.add(30);
		powersRocket2.add(10);
		rocket2.setPowers(powersRocket2);
		
		System.out.println("the rocket : "+rocket1.getCode()+" has: "+rocket1.getPropellerQuantity()+" propeller with these powers: "+rocket1.getPowers());
		System.out.println("the rocket : "+rocket2.getCode()+" has: "+rocket2.getPropellerQuantity()+" propeller with these powers: "+rocket2.getPowers());
	}

}
