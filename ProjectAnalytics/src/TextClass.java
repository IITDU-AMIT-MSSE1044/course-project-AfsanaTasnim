import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.lang.IllegalStateException;


public class TextClass {

	private Scanner input;
	
	public void openFile()
	{
		try
		{
			input = new Scanner(new File("Patterns.txt"));
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.err.println("This file cannot be opened.");
			System.exit(1);
		}
		
	}
	
	public void readRecords() 
	{
		PatternSet s = new PatternSet();
		
		System.out.println("Pattern Structure: ");
		
		
		try 
		{
			while(input.hasNext())
			{
				s.setPatternStructure(input.next());
				
				System.out.println(s.getPatternStructure());
			}
		}
		catch(NoSuchElementException elementException)
		{
			System.err.println("Improper formation of file.");
			input.close();
			System.exit(1);
		}
		catch(IllegalStateException stateException)
		{
			System.err.println("This file can not be read.");
			System.exit(1);
		}
	}
	

	
	public void CloseFile()
	{
		if(input!=null)
			input.close();
	}
	
}
