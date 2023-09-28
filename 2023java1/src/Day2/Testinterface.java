package Day2;

interface A
{
	int a=10; //by default variable in interface are static and final
	
	void m1();//abstract method, by default public
	
}





public class Testinterface implements A

{
	
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		A a= new Testinterface();
		
		a.m1();
}
}