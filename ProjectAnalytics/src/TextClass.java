import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class TextClass {

	private Formatter output;
	
	public void openFile()
	{
		try
		{
			output = new Formatter("Patterns");
		}
		catch(SecurityException securityException)
		{
			System.err.println("This file can not be accessed.");
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.err.println("There is something wrong with this file");
			System.exit(1);
		}
	}
	
	public void listPatterns()
	{
		PatternSet p = new PatternSet();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is a list of all the dataset needed to perform the intended operation");
		System.out.println("The pattern no and the pattern structure and pattern type: ");
		
		while(input.hasNext())
		{
			try
			{
				p.setPatternNo(input.nextInt());
				p.setPatternStructure(input.next());
				p.setPatternType(input.next());
				
				if(p.getPatternNo() > 0)
				{
					output.format(p.getPatternNo() + " " + p.getPatternStructure() + " " + p.getPatternType() + "\n", null);
				}
				else
				{
					System.out.println("Pattern number must be greater than 0.");
				}
				
			}
			catch(FormatterClosedException formatterClosedException)
			{
				System.err.println("This cant be written to the file.");
				return;
			}
			catch(NoSuchElementException elementException)
			{
				System.err.println("The input format is wrong");
				input.nextLine();
			}
			
			System.out.println("The pattern no and the pattern structure: ");
		}
	}
	
	public void CloseFile()
	{
		if(output!=null)
			output.close();
	}
	
}
