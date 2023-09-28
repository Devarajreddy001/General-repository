package stringprograms;

public class Stringdifferentwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s= "java, selenium, testng, maven";
       
       String [] s2= s.split(",");
       
       for (String s3:s2) {
    	   System.out.print(s3);
       }
	
	}

}
