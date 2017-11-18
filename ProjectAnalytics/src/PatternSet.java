

public class PatternSet {

	private int patternNo;
	private String patternStructure;
	
	public PatternSet()
	{
		this("");
	}

	public PatternSet(String struc)
	{
		setPatternStructure(struc);
	}
	
	
	public void setPatternStructure(String struc)
	{
		patternStructure = struc;
	}
	
	public String getPatternStructure()
	{
		return patternStructure;
	}
	
}
