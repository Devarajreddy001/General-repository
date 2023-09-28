package Day2;

public class Twodimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     int a [][]= {{100,200}, {100,800}, {850,899}};
	     
	 
	 
	 /*for (int j=0;j<a.length; j++)
	 {
		 for (int i=0;i<a[0].length;i++) 
		 {
			 
			 System.out.println(a[j][i]);
		 }
	     
	     
	 }*/
	     
	     for (int m[]:a) 
	     {
	    	 for(int k:m)
	    	 {
	    		 System.out.println(k);
	    	 }
	     }
	     
	     
	}

}
