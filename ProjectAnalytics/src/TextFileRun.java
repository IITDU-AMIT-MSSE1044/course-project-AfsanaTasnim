
public class TextFileRun {

	public static void main(String[] args) {

		TextClass a = new TextClass();
		TestStringsClass b = new TestStringsClass();
		
		a.openFile();
		a.readRecords();
		a.CloseFile();

		b.testTwo();
	}

}
