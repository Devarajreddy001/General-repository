package Day2;

public class Staticexample {
	
	
	static int a=10;//static variable
	
	int b=20;
	
	int x=10;
	int z=20;
	
	
	static void m1() {
		
		System.out.println("This is m1= Static method");
	}
	
	int m2(int h,int n) 
	{
		x=h;
		x=n;
		//System.out.println("This is m2= Non-static method");
		return h+n;
	}
	
	void m3 ()
	{
		System.out.println(a);
		System.out.println(b);
		m1();

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static methods can access only static stuff
		//direct access without creating any object
		
		System.out.println(a);
		m1();
		
		Staticexample S2= new Staticexample();
		//S2.m2();
		System.out.println(S2.b);
        S2.m3();
        
	}

}
