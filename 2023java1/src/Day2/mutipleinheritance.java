package Day2;



interface ABC{
	
	int x=100;
	void m1();
}

interface xyz 
{
	int y=200;
	void m2 ();
	
	
}

public class mutipleinheritance implements ABC, xyz 
{
	
	 public void m1()
	 {
		System.out.println(x);

	}
	 
	 public void m2()
	 {
		 System.out.println(y);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mutipleinheritance test = new mutipleinheritance();
		
	test.m1();
	test.m2();
				
	}

}
