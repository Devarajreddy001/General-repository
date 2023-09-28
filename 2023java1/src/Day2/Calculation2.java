package Day2;

public class Calculation2 {
	
	int sum (int x,int y)
	{
		return x+y;
	}
	
	int sum (int x, int y, int z)
	{
		return x + y + z;
	}
	
	double sum (double x, double y)
	{
		return x + y;
		
	}
     
	double sum (double x, double y,double z)
	{
		return x + y + z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation2 A= new Calculation2();
		int B1= A.sum(100, 300);
		int B2= A.sum(10, 20, 300);
		double B3= A.sum(50, 60);
		double B4= A.sum(850, 789, 359);
		
		System.out.println(B1);
		System.out.println(B2);
		System.out.println(B3);
		System.out.println(B4);

	}

}
