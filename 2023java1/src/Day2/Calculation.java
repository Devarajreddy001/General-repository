package Day2;

public class Calculation {

	int x=10;
	int y=10;
	
	/*void sum () //case1- not taking parameters and also not returned any value
	{
		System.out.println(x+y);
	}*/
	
	/*int sum () //case1- not taking parameters and also not returned any value// we should mention the return data type// the returned value should be stored in some variable
	{
		return (x+y);
	}*/
	
	/*void sum (int a, int b) {
		System.out.println(a+b);
	}*/
	
	int sum(int a , int b)
	{
		return (a+b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Calculation cal= new Calculation();
int a= cal.sum(100, 800);
System.out.println(a);
	
	
	
	}

}
