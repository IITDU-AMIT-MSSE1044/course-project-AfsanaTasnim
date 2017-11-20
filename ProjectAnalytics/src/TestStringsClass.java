


import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestStringsClass {
	 ArrayList<String> afsana = new ArrayList<String>();
	 ArrayList<String> tasnim = new ArrayList<String>();
	 ArrayList<String> mimi = new ArrayList<String>();
	 
	public void testTwo(){
		
	
			
	
		String s1[] = {"a", "b", "c"};
		String s2[] = {"a", "b", "d"};
		int temp = 0;
		int pri = 0;
		double result;
		int a = 0;
		int b = 0;
		int c = 0;
		
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
	
	public void  fileReader() {
		  String fileName = "C:/Users/Afsana/git/Initialization/ProjectAnalytics/Patterns.txt";
	        String line = null;
	       
	        List<String> strList = new ArrayList<String>(); 
	        
	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            
	            while((line = bufferedReader.readLine()) != null) {
	            	afsana.add(line);
	               // System.out.println(line);
	            }  
	            
	           // System.out.println(afsana.get(5));
	            //System.out.println(afsana.get(1));
	            //String a1[] = {"a", "b", "c"};
	            
	           /* String w2[] = {afsana.get(1)};
	            for(int z=0; z<w2.length; z++){
	            	System.out.println(w2[z]);
	            }*/
	            
            
//	            System.out.println();
	            
	            FileWriter f0 = new FileWriter("output.txt");
	            String newLine = System.getProperty("line.separator");
	            
	            FileWriter f1 = new FileWriter("cluster1.txt");
	            String newLineOfCluster = System.getProperty("line.separator");
	            
	            FileWriter f2 = new FileWriter("cluster2.txt");
	            String newLineOfCluster2 = System.getProperty("line.separator");
	            
	            FileWriter f3 = new FileWriter("cluster3.txt");
	            String newLineOfCluster3 = System.getProperty("line.separator");
	            
	            FileWriter f4 = new FileWriter("cluster4.txt");
	            String newLineOfCluster4 = System.getProperty("line.separator");
	            
	            FileWriter b1 = new FileWriter("bide1.txt");
	            String newLineOfBide1 = System.getProperty("line.separator");
	            
	            FileWriter b2 = new FileWriter("bide2.txt");
	            String newLineOfBide2 = System.getProperty("line.separator");
	            
	            FileWriter b3 = new FileWriter("bide3.txt");
	            String newLineOfBide3 = System.getProperty("line.separator");
	            
	            FileWriter b4 = new FileWriter("bide4.txt");
	            String newLineOfBide4 = System.getProperty("line.separator");
	            
	            for(int i=0; i<1000; i++){
	            	for(int j=i+1; j<1000; j++){
	            		
	            		int size1 = afsana.get(i).toString().toCharArray().length;
	            		
	            		char temp1[] = new char[size1];
	            		temp1 = afsana.get(i).toString().toCharArray();
	            		
	            		int size2 = afsana.get(i).toString().toCharArray().length;
	            		
	            		char temp2[] = new char[size2];
	            		temp2 = afsana.get(j).toString().toCharArray();
	            		
	            		System.out.println(temp1[0]);
	            		System.out.println(temp1[1]);
	            		System.out.println(temp1[2]);
	            		
	            		
//	            		String temp1[] = {afsana.get(i)};
//	            		String w2[] = {afsana.get(j)};
	            		
	            		int temp = 0;
	            		int pri = 0;
	            		double result;
	            		
	            		
	            		
	            		String inter = ""+temp1[0]+""+temp1[1]+"";
	            		String intertwo = ""+temp2[0]+""+temp2[1]+"";
	            		String comp1 = ""+temp1[0]+""+temp1[1]+""+temp1[2]+"";
	            		String comp2 = ""+temp2[0]+""+temp2[1]+""+temp2[2]+"";
	            		
	            		String first[] = {""+temp1[0]+"", ""+temp1[1]+"", ""+temp1[2]+"", inter, temp1[1]+""+temp1[2], inter+temp1[2]+""};
	            		for(int k=0; k<first.length; k++)
	            		{
	            			System.out.print(first[k] + " ");
	            		}
	            		System.out.println();
	            		
	            		String second[] = {""+temp2[0]+"", ""+temp2[1]+"", ""+temp2[2]+"", ""+temp2[0]+""+temp2[1]+"", ""+temp2[1]+""+temp2[2]+"", intertwo+""+temp2[2]+""};
	            		for(int l=0; l<second.length; l++)
	            		{
	            			System.out.print(second[l] + " ");
	            		}
	            		System.out.println();
	            		
	            		//Intersection
	            		for(int q=0; q<first.length; q++){
	            			for(int p=0; p<first.length; p++){
	            				if((first[q].equals(second[p]))){
	            					System.out.print(first[q] + " ");
	            					System.out.println("Weight of it is: " + first[q].length());
	            					temp = temp + first[q].length();
	            				
	            				}
	            				
	            				
	            			}
	            			
	            			
	            		}
	            		
	            		
	            		
	            		
	            		
	            		System.out.println("The sum of weight of intersection is: " + temp);
	            		
	            		System.out.println();
	            		
	            		Set union = new HashSet<Integer>();
	            		for(int m=0; m<first.length; m++) union.add(first[m]);
	            		for(int n=0; n<second.length; n++) union.add(second[n]);
	            		Object[] ans = union.toArray();
	            		for(int t=0; t<ans.length; t++){
	            		    System.out.print(ans[t]+" ");
	            		    pri = pri + ((String) ans[t]).length();
	            		}
	            		
	            		System.out.println("Weight of union is: " + pri);
	            		
	            		result = (double)temp/pri;
	            		
	            		System.out.println("Therefore, the similarity is: " + result);
	            		
	            		f0.write("Result " + comp1 + " " + comp2 + " " + result + newLine);
	            		
	            		if(result == 0.0){
	            			f1.write(comp1 + " " + comp2 + " " + result + newLineOfCluster);
	            			//Intersection
		            		for(int q=0; q<3; q++){
		            			for(int p=0; p<3; p++){
		            				if((temp1[q] == (temp2[p]))){
		            					System.out.print(temp1[q] + " ");
		            					b1.write(temp1[q]);
		            				}
		            				
		            				
		            			}
		            			
		            			
		            		}
		            		b1.write(newLineOfBide1);
		            		
		            		
		            
		            		
		            		System.out.println();
	            		}
	            		else if(result == 0.1111111111111111){
	            			f2.write(comp1 + " " + comp2 + " " + result + newLineOfCluster2);
	            			//Intersection
		            		for(int q=0; q<3; q++){
		            			for(int p=0; p<3; p++){
		            				if((temp1[q] == (temp2[p]))){
		            					System.out.print(temp1[q] + " ");
		            					b2.write(temp1[q]);
		            				}
		            				
		            				
		            			}
		            			
		            			
		            		}
		            		b2.write(newLineOfBide2);
		            		
		            		
		            
		            		
		            		System.out.println();
	            		}
	            		else if(result == 0.05263157894736842){
	            			f3.write(comp1 + " " + comp2 + " " + result + newLineOfCluster3);
	            			//Intersection
		            		for(int q=0; q<3; q++){
		            			for(int p=0; p<3; p++){
		            				if((temp1[q] == (temp2[p]))){
		            					System.out.print(temp1[q] + " ");
		            					b3.write(temp1[q]);
		            				}
		            				
		            				
		            			}
		            			
		            			
		            		}
		            		b3.write(newLineOfBide3);
		            		
	            		}
	            		else if(result == 0.25){
	            			f4.write(comp1 + " " + comp2 + " " + result + newLineOfCluster4);
	            			//Intersection
		            		for(int q=0; q<3; q++){
		            			for(int p=0; p<3; p++){
		            				if((temp1[q] == (temp2[p]))){
		            					System.out.print(temp1[q] + " ");
		            					b4.write(temp1[q]);
		            				}
		            				
		            				
		            			}
		            			
		            			
		            		}
		            		b4.write(newLineOfBide4);
		            		
		            		
		            
		            		
		            		System.out.println();
	            		}
	            		
	            	}
	            }
	            
	            f0.close();
	            f1.close();
	            f2.close();
	            f3.close();
	            f4.close();

	            // Always close files.
	            bufferedReader.close();         
	        }catch(Exception e){
	        	e.printStackTrace();
	        	
	        	System.out.println("Errors");
	        }
	}
	
	
	public void  fileReaderTwo() {
		  String fileName = "C:/Users/Afsana/git/Initialization/ProjectAnalytics/bide2.txt";
	        String line = null;
	       
	        List<String> strList = new ArrayList<String>(); 
	        
	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            
	            while((line = bufferedReader.readLine()) != null) {
	            	tasnim.add(line);
	               // System.out.println(line);
	            }  
	            
	            FileWriter g0 = new FileWriter("Watch.txt");
	            String newLineWatch = System.getProperty("line.separator");
	            
	            FileWriter g2 = new FileWriter("FinalCluster2.txt");
	            String newLineOfFinalCluster2 = System.getProperty("line.separator");
	            
	            FileWriter g4 = new FileWriter("FinalCluster4.txt");
	            String newLineOfFinalCluster4 = System.getProperty("line.separator");
	            
	            
	            for(int i=0; i<1000; i++){
	            	for(int j=i+1; j<1000; j++){
	            		
	            		int size1 = tasnim.get(i).toString().toCharArray().length;
	            		
	            		char temp1[] = new char[size1];
	            		temp1 = tasnim.get(i).toString().toCharArray();
	            		
	            		int size2 = tasnim.get(i).toString().toCharArray().length;
	            		
	            		char temp2[] = new char[size2];
	            		temp2 = tasnim.get(j).toString().toCharArray();
	            		
	            		System.out.println(temp1[0]);
	            		System.out.println(temp1[1]);

	            		
	            		

	            		
	            		int temp = 0;
	            		int pri = 0;
	            		double result;
	            		
	            		
	            		
	            		
	            		String comp1 = ""+temp1[0]+""+temp1[1]+"";
	            		String comp2 = ""+temp2[0]+""+temp2[1]+"";
	            		
	            		String first[] = {""+temp1[0]+"", ""+temp1[1]+"", ""+temp1[0]+""+temp1[1]+""};
	            		for(int k=0; k<first.length; k++)
	            		{
	            			System.out.print(first[k] + " ");
	            		}
	            		System.out.println();
	            		
	            		String second[] = {""+temp2[0]+"", ""+temp2[1]+"", ""+temp2[0]+""+temp2[1]+""};
	            		for(int l=0; l<second.length; l++)
	            		{
	            			System.out.print(second[l] + " ");
	            		}
	            		System.out.println();
	            		
	            		//Intersection
	            		for(int q=0; q<first.length; q++){
	            			for(int p=0; p<first.length; p++){
	            				if((first[q].equals(second[p]))){
	            					System.out.print(first[q] + " ");
	            					System.out.println("Weight of it is: " + first[q].length());
	            					temp = temp + first[q].length();
	            				
	            				}
	            				
	            				
	            			}
	            			
	            			
	            		}
	            		
	            		
	            		
	            		
	            		
	            		System.out.println("The sum of weight of intersection is: " + temp);
	            		
	            		System.out.println();
	            		
	            		Set union = new HashSet<Integer>();
	            		for(int m=0; m<first.length; m++) union.add(first[m]);
	            		for(int n=0; n<second.length; n++) union.add(second[n]);
	            		Object[] ans = union.toArray();
	            		for(int t=0; t<ans.length; t++){
	            		    System.out.print(ans[t]+" ");
	            		    pri = pri + ((String) ans[t]).length();
	            		}
	            		
	            		System.out.println("Weight of union is: " + pri);
	            		
	            		result = (double)temp/pri;
	            		
	            		System.out.println("Therefore, the similarity is: " + result);
	            		
	            		g0.write("Result " + comp1 + " " + comp2 + " " + result + newLineWatch);
	            		
	            		
	            		
	            		if(result == 0.14285714285714285){
	            			g2.write(comp1 + " " + comp2 + " " + result + newLineOfFinalCluster2);
	            			
	            		}
	            	
	            		else if(result == 0.3333333333333333){
	            			g4.write(comp1 + " " + comp2 + " " + result + newLineOfFinalCluster4);
	            		}
	            		
	            	}
	            }
	            
	           
	            g2.close();
	            g4.close();

	            // Always close files.
	            bufferedReader.close();         
	        }catch(Exception e){
	        	e.printStackTrace();
	        	
	        	System.out.println("Errors");
	        }
	}
	
	public void  fileReaderFour() {
		  String fileName = "C:/Users/Afsana/git/Initialization/ProjectAnalytics/bide4.txt";
	        String line = null;
	       
	        List<String> strList = new ArrayList<String>(); 
	        
	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            
	            while((line = bufferedReader.readLine()) != null) {
	            	mimi.add(line);
	               // System.out.println(line);
	            }  
	            
	            FileWriter h0 = new FileWriter("View.txt");
	            String newLineView = System.getProperty("line.separator");
	            
	            FileWriter h2 = new FileWriter("FinalCluster2a.txt");
	            String newLineOfFinalCluster2a = System.getProperty("line.separator");
	            
	            FileWriter h4 = new FileWriter("FinalCluster4a.txt");
	            String newLineOfFinalCluster4a = System.getProperty("line.separator");
	            
	            
	            for(int i=0; i<1000; i++){
	            	for(int j=i+1; j<1000; j++){
	            		
	            		int size1 = mimi.get(i).toString().toCharArray().length;
	            		
	            		char temp1[] = new char[size1];
	            		temp1 = mimi.get(i).toString().toCharArray();
	            		
	            		int size2 = mimi.get(i).toString().toCharArray().length;
	            		
	            		char temp2[] = new char[size2];
	            		temp2 = mimi.get(j).toString().toCharArray();
	            		
	            		System.out.println(temp1[0]);
	            		System.out.println(temp1[1]);

	            		
	            		

	            		
	            		int temp = 0;
	            		int pri = 0;
	            		double result;
	            		
	            		
	            		
	            		
	            		String comp1 = ""+temp1[0]+""+temp1[1]+"";
	            		String comp2 = ""+temp2[0]+""+temp2[1]+"";
	            		
	            		String first[] = {""+temp1[0]+"", ""+temp1[1]+"", ""+temp1[0]+""+temp1[1]+""};
	            		for(int k=0; k<first.length; k++)
	            		{
	            			System.out.print(first[k] + " ");
	            		}
	            		System.out.println();
	            		
	            		String second[] = {""+temp2[0]+"", ""+temp2[1]+"", ""+temp2[0]+""+temp2[1]+""};
	            		for(int l=0; l<second.length; l++)
	            		{
	            			System.out.print(second[l] + " ");
	            		}
	            		System.out.println();
	            		
	            		//Intersection
	            		for(int q=0; q<first.length; q++){
	            			for(int p=0; p<first.length; p++){
	            				if((first[q].equals(second[p]))){
	            					System.out.print(first[q] + " ");
	            					System.out.println("Weight of it is: " + first[q].length());
	            					temp = temp + first[q].length();
	            				
	            				}
	            				
	            				
	            			}
	            			
	            			
	            		}
	            		
	            		
	            		
	            		
	            		
	            		System.out.println("The sum of weight of intersection is: " + temp);
	            		
	            		System.out.println();
	            		
	            		Set union = new HashSet<Integer>();
	            		for(int m=0; m<first.length; m++) union.add(first[m]);
	            		for(int n=0; n<second.length; n++) union.add(second[n]);
	            		Object[] ans = union.toArray();
	            		for(int t=0; t<ans.length; t++){
	            		    System.out.print(ans[t]+" ");
	            		    pri = pri + ((String) ans[t]).length();
	            		}
	            		
	            		System.out.println("Weight of union is: " + pri);
	            		
	            		result = (double)temp/pri;
	            		
	            		System.out.println("Therefore, the similarity is: " + result);
	            		
	            		h0.write("Result " + comp1 + " " + comp2 + " " + result + newLineView);
	            		
	            		
	            		
	            		if(result == 0.14285714285714285){
	            			h2.write(comp1 + " " + comp2 + " " + result + newLineOfFinalCluster2a);
	            			
	            		}
	            	
	            		else if(result == 1.0){
	            			h4.write(comp1 + " " + comp2 + " " + result + newLineOfFinalCluster4a);
	            		}
	            		
	            	}
	            }
	            
	           
	            h2.close();
	            h4.close();

	            // Always close files.
	            bufferedReader.close();         
	        }catch(Exception e){
	        	e.printStackTrace();
	        	
	        	System.out.println("Errors");
	        }
	}
	
	
	 public static void main(String[] args) {
		TestStringsClass tSC = new TestStringsClass();
		tSC.fileReader();
		tSC.fileReaderTwo();
		tSC.fileReaderFour();
	}

}