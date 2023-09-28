package Day2;

public class Arrayevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int b=0;
	
		for (int c=0; c<a.length; c++)
		{
			b=a[c];
			
			if (b%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
		}
		
		}
		
		
	
	}

}
