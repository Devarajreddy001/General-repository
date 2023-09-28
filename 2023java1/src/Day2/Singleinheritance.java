package Day2;

class a //parent
{
	int a ;
	
	void display() {
		System.out.println(a);
	}
}

class b extends a //sub-class
{
	int b;
	
	void println  ()
	{
		System.out.println(b);
	}
}

class c extends b
{
	int c;
	void show () {
		System.out.println(c);
	}
}




public class Singleinheritance {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a obj1= new a ();
		
		obj1.a=100;
		obj1.display();
		
		b obj2= new b();
		
		obj2.a=10;
		obj2.b=150;
		obj2.display();
		obj2.println();
		
		c obj3=new c();
		obj3.c=30;
		obj3.a=6;
		obj3.b=25;
		
		obj3.display();
		obj3.println();
		obj3.show();

	}

}
