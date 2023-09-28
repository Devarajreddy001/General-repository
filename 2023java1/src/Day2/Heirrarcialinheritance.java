package Day2;

class parent {
	
	int a;
	void display () 
	{
		System.out.println(a);
	}
}

class child extends parent {
	
	int b;
	void show () {
		System.out.println(b);
	}
}

class child2 extends parent{
	
	int y;
	void print() {
		System.out.println(y);
	}
}

public class Heirrarcialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1= new child();
		c1.a=100;
		c1.b=300;
		c1.display();
		c1.show();
		
		child2 c2= new child2 ();
		c2.a=150;
		c2.y=580;
		c2.display();
		c2.print();

	}

}
