package Day2;

public class Constructor1 {
	int x;
	int y;
	int z;
	
	Constructor1(int a,int b, int c)
	{
		x=a;y=b;z=c;
	}
	
	class subclass extends Constructor1 {
			// TODO Auto-generated constructor stub
	}

	void sum () 
	{
		System.out.println(x+y+z);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 n1= new Constructor1(500,600,800);
		n1.sum();
		

	}

}
