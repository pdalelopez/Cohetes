
import java.util.ArrayList;
import java.util.List;

public class Rocket
{
	private String code;
	private int propellerQuantity;
	private List<Propeller> propellers;
	
	public Rocket() 
	{
	}
	
	public Rocket(String code,int propellerQuantity) 
	{	
		this.setCode(code);
		this.setPropellerQuantity(propellerQuantity);
		this.setPropellers(new ArrayList<Propeller>(propellerQuantity));
		
	}
	public Rocket(String code,int propellerQuantity, List<Propeller> propellers) 
	{	
		setCode(code);
		setPropellerQuantity(propellerQuantity);
		setPropellers(propellers);
	}

	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public int getPropellerQuantity()
	{
		return propellerQuantity;
	}
 void setPropellerQuantity(int propellerQuantity)
	{
		this.propellerQuantity = propellerQuantity;
	}
	public List<Propeller> getPropellers()
	{
		return propellers;
	}
	public void setPropellers(List<Propeller> propellers)
	{
		this.propellers = propellers;
	}
//--------------------------------------------------------------------

	public void accelerate(int propellerNumber) 
{
	Propeller propellerSelection;
	propellerSelection = getPropellers().get(propellerNumber-1);
	
	System.out.println("Propeller "+propellerNumber+": "+propellerSelection);
	System.out.println("Potencia objetivo: "+ propellerSelection.getMaxPower());
	System.out.println("Acelerating");
	
	
	for (int i = propellerSelection.getCurrentPower(); i < propellerSelection.getMaxPower(); i+=10)
	{
		propellerSelection.setCurrentPower(propellerSelection.getCurrentPower()+10);
		System.out.println(propellerSelection.getCurrentPower());
		
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}

public void decelerate(int propellerNumber) 
{
	Propeller propellerSelection;
	propellerSelection = getPropellers().get(propellerNumber-1);
	
	System.out.println("Propeller "+propellerNumber+": "+propellerSelection);
	System.out.println("Potencia objetivo: 0");
	System.out.println("Decelerating");
	
	for (int i = propellerSelection.getCurrentPower(); i > 0; i-=10)
	{
		propellerSelection.setCurrentPower(propellerSelection.getCurrentPower()-10);
		System.out.println(propellerSelection.getCurrentPower());
		
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
	
}


