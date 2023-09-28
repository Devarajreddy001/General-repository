package stringprograms;

public class Stringtoanotherstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String a= "Welcome  hyderbad";
	 
	 String b= "to";
	 
	 int index= 7;
	 
	 StringBuffer rev= new StringBuffer(a);
	 
	  rev.insert(7+1, b);
	  
	  System.out.println(rev.toString());
	}

}
