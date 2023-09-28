package Day3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String A= "This is aa java language";
	      String [] B= A.split(" ");
	      String D="";
	      
	      for (int m=0; m<=B.length-1; m++)
	      {
	        // D=D+B[m];
	        
	
       //System.out.println (B[m].charAt(0));
	     
     int k = B[m].length()-1;
	       System.out.println(B[m].charAt(k));
	   
	      } 
	      
	}
}
