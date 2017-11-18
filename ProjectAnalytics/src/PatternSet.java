

public class PatternSet {

	private int patternNo;
	private String patternStructure;
	private String patternType;
	
	public PatternSet()
	{
		this(0, "", "");
	}

	public PatternSet(int no, String struc, String type)
	{
		setPatternNo(no);
		setPatternStructure(struc);
		setPatternType(type);
	}
	
	public void setPatternNo(int no)
	{
		patternNo = no;
	}
	
	public int getPatternNo()
	{
		return patternNo;
	}
	
	public void setPatternStructure(String struc)
	{
		patternStructure = struc;
	}
	
	public String getPatternStructure()
	{
		return patternStructure;
	}
	
	public void setPatternType(String type)
	{
		patternType = type;
	}
	
	public String getPatternType()
	{
		return patternType;
	}
}
