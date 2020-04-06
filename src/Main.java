
public class Main
{

	public static void main(String[] args)
	{
		//Fase 1
		
		Rocket rocket1,rocket2;
		rocket1 = new Rocket("x",3);
		rocket2 = new Rocket("LDSFJA32",6);
		System.out.println("the rocket with code: "+rocket1.getCode()+" has: "+rocket1.getPropellerQuantity()+" propeller.");
		System.out.println("the rocket with code: "+rocket2.getCode()+" has: "+rocket2.getPropellerQuantity()+" propeller.");
	}

}
