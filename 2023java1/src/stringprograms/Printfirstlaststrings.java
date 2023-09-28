package stringprograms;

public class Printfirstlaststrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String s= "Geeks for geeks testing tea";
	 
	 
	 for (int a=0; a<s.length(); a++) {
		 
		 if(a==0) 
			 System.out.print(s.charAt(a));
			 
		 
		 
		 if(a==s.length()-1) 
			 System.out.print(s.charAt(a));
		 
		 if (s.charAt(a)==' ') 
			 
			 System.out.print(s.charAt(a-1) + ""+s.charAt(a+1));
			 
		 
		 
	 }
	
	}

}
