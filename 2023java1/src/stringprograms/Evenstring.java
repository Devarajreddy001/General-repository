package stringprograms;

public class Evenstring {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
        
		String a= "This is a java language";
		
		String [] b= a.split(" ");
		
		for (String c:b) 
		{
			if (c.length() %2 ==0) {
				System.out.println(c);
			}
		}
	}

}
