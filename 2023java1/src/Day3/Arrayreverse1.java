package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayreverse1 {
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		/*String name= "The billiards den in hyderabad den";
				String b= " ";

				for ( int a= name.length()-1; a>=0; a--)
				{
				 b= b+name.charAt(a);
				}
System.out.println(b);*/
		
		
		
		
		
		int [] a=  {50,10,20,30,30,40,40,50};
		
		Arrays.sort(a);
		
		int b= a[0];

		System.out.println(b);
		
		
		 for (int i = 1; i < a.length; i++) {
	            if (a[i] != b) {
	                System.out.println(a[i]);
	                b = a[i];
	            }
		
		
		
		
		/*for (int b=0; b<a.length; b++) 
		{
			for (int c=b+1;c<a.length;c++) {
				
				if(a[b]==a[c]) {
					System.out.println(a[c]);*/
					
	
			
		}
		
		
	}
	
	
	   
	

}

