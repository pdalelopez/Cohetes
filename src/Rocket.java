
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

	public void accelerate(int targetPower) 
{
	for (Propeller propeller : getPropellers())
	{
		propeller.setTargetPower(targetPower);
	}
	
}

public void decelerate(int targetPower) 
{
	for (Propeller propeller : getPropellers())
	{
		propeller.setTargetPower(targetPower);
	}
	
}
	
}


