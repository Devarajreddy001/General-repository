package Day3;


interface A 
{
	 final int a = 0;
	 
	 void  m ();
	
}

interface B 
{
	final int b =10;
	 void m2();
} 



public class Interface implements A, B {
	
	public void m () 
	{
		System.out.println("a");
	}
	
	 public void m2 ()
	{
		System.out.println("b");
	}
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	Interface k2 = new Interface();
	    	
	    	k2.m();
	    	k2.m2();

	}

}
