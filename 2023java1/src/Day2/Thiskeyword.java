package Day2;

public class Thiskeyword {

	int x,y;
	void getvalues (int x, int y)
	{
		this.x=x;
		this.y=y;
		
	}
	void printvalues()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thiskeyword k1= new Thiskeyword();
		k1.getvalues(10,20);
		k1.printvalues();
		
	}

}
