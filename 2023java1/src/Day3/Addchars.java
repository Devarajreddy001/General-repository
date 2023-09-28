package Day3;

public class Addchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "Thetest";
		String two = "testing" ;
		int index= 7;
		StringBuffer three;
		 
		 StringBuffer rev= new StringBuffer(a);
		 
		 three= rev.insert(3, two);
		  
		  System.out.println(three);

	}

}
