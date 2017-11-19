
import java.awt.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestStringsClass {

	public void testTwo(){
		
	
			
	
		String s1[] = {"a", "b", "c"};
		String s2[] = {"a", "b", "d"};
		int temp = 0;
		int pri = 0;
		double result;
		
		String inter = s1[0].concat(s1[1]);
		String intertwo = s2[0].concat(s2[1]);
		
		String first[] = {s1[0], s1[1], s1[2], s1[0].concat(s1[1]), s1[1].concat(s1[2]), inter.concat(s1[2])};
		for(int i=0; i<first.length; i++)
		{
			System.out.print(first[i] + " ");
		}
		System.out.println();
		
		
		String second[] = {s2[0], s2[1], s2[2], s2[0].concat(s2[1]), s2[1].concat(s2[2]), intertwo.concat(s2[2])};
		for(int i=0; i<second.length; i++)
		{
			System.out.print(second[i] + " ");
		}
		System.out.println();
		
		
		
		//Intersection
		for(int j=0; j<first.length; j++){
			for(int i=0; i<first.length; i++){
				if((first[j].equals(second[i]))){
					System.out.print(first[j] + " ");
					System.out.println("Weight of it is: " + first[j].length());
					temp = temp + first[j].length();
				
				}
				
				
			}
			
			
		}
		
		
		System.out.println("The sum of weight of intersection is: " + temp);
		
		System.out.println();
		
		
		Set union = new HashSet<Integer>();
		for(int i=0; i<first.length; i++) union.add(first[i]);
		for(int i=0; i<second.length; i++) union.add(second[i]);
		Object[] ans = union.toArray();
		for(int i=0; i<ans.length; i++){
		    System.out.print(ans[i]+" ");
		    pri = pri + ((String) ans[i]).length();
		}
		
		System.out.println("Weight of union is: " + pri);
		
		result = (double)temp/pri;
		
		System.out.println("Therefore, the similarity is: " + result);
		
		
	
		

	}


}


