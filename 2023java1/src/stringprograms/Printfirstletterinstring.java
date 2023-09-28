package stringprograms;

import java.util.Scanner;

public class Printfirstletterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		
		 String str =input.nextLine();
		 char c[] = str.toCharArray();
		 
		
		 
		 for(int a=0; a<str.length();a++) {
			 
			 if (str.charAt(a)!=' ')
			 {
				  
			 }
				 
			 if (a==0)
				 System.out.print(str.charAt(a));
			 
			 //if(a==str.length()-1)
				// System.out.println(str.charAt(a));
			 
			 if(str.charAt(a)==' ')
				 System.out.print(str.charAt(a+1) );//+ ""+ str.charAt(a+1)
			 
		 }
		 
		 

	}

}
