package Day2;

public class Contructordemo {

	
	int x=10;
	int y=20;
	
	Contructordemo()
	{
		x=10;
		y=10;
	}
	
	Contructordemo(int a, int b)
	{
		x=a; y=b;
	}
	
	void display() {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contructordemo c1= new Contructordemo(100, 500);
		c1.display();
	}

}
