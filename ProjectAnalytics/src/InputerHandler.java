



import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputerHandler {
	private static Set<Node> readRelationssFromFile(String logsfilepath){
		Set<Node> nodes = new HashSet<Node>();
		File inputFile = new File ("src/input/bide.txt");
		Scanner inputScanner=null;
		try {
			inputScanner = new Scanner(inputFile);
			while (inputScanner.hasNext()) {
				String tokens[] = inputScanner.nextLine().split(",");
				Set<String> attrs= new HashSet<String>();
				for (int i = 0; i < tokens.length; i++) {
					attrs.add(tokens[i]);
				}
				nodes.add(new Node(attrs));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return new HashSet<Node>();
		}
		finally{
			inputScanner.close();
		}
		return nodes;
	}
	
	public static void main(String[] args) {
		Set<Node> nodes = readRelationssFromFile("src/input/bide.txt");
		for (Node node : readRelationssFromFile("src/input/bide.txt")) {
			System.out.println(node.toString());
		}
		Context context = new Context(nodes);
		
		
	}
}
