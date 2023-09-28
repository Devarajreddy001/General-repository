package Day2;

public class Searchspecificnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {10,20,25,85,78,45,750,740};
		int c=0;
	   int d=740;
		
		for (int b=0;b<a.length;b++ )	
			
		{
			c= a[b];
		
				if (c==d) 
				{
					
					System.out.println(" available");break;
				}
				
				
				
			}
				if(d!=c) 
				{
					System.out.println("not");
				}
	
		

	}

}