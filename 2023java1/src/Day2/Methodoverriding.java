package Day2;

 class bank {
	static void rateofinterest() 
	{
	
	};


 class axis extends bank
{
	static void rateofinterest() 
	{

				System.out.println("test");
	};
}

static class sbi extends bank{
	
	static double rateofinterest() {
		return 9.7;
	}
	
}

public class main{


	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      axis A1=new axis();
      System.out.println(A1.rateofinterest());
      sbi A2=new sbi();
      System.out.println(A2.rateofinterest());
      
	}

}
 }
