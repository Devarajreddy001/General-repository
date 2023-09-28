package Day2;

class A1 {
	
	void m1() {
		
		System.out.println("This is method in first class");
	}
	
}

interface b1{
	
void m2();
	
}

interface b2{
	
void m3();
	
}



public class Hybridinheritance extends A1 implements b1, b2
{
	
	public void m2(){
		System.out.println("method2");
	}
	
	public void m3() {
		System.out.println("method3");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hybridinheritance k1= new Hybridinheritance();
		
	k1.m1();
	k1.m2();
	k1.m3();

	}

}
