
import java.util.ArrayList;
import java.util.List;

public class Rocket
{
	private String code;
	private int propellerQuantity;
	private List<Integer> powers;
	
	public Rocket() 
	{
	}
	
	public Rocket(String code,int propellerQuantity) 
	{	
		this.setCode(code);
		this.setPropellerQuantity(propellerQuantity);
		this.setPowers(new ArrayList<Integer>());
		
	}
	public Rocket(String code,int propellerQuantity, List<Integer> powers) 
	{	
		setCode(code);
		setPropellerQuantity(propellerQuantity);
		setPowers(powers);
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
	public List<Integer> getPowers()
	{
		return powers;
	}
	public void setPowers(List<Integer> powers)
	{
		this.powers = powers;
	}
}


