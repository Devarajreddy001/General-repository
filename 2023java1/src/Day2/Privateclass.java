package Day2;

public class A {
	
	protected int data=10;
	
	  protected void m1 () {}
}


public class Privateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj= new A();
		obj.data=20; //comple time error
		obj.m1();
		

	}

}
