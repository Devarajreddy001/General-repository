package Day3;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Progress is started");
		System.out.println("Program is in progress");
		
		int a=100;
		
		/*try {
			System.out.println(a/2);
		}
	
		catch(ArithmeticException k) 
		{
			System.out.println("Enter into catch block");
		}
		//System.out.println(a/0);//ArthmeticException*/
		
		
		String b= "welcome";
		
		try 
		{
		
		System.out.println(b.length());
		}
		catch(Exception m) 
		{
			System.out.println("enter to catch block");
		}
		
		String c= "abc";
		
		//int i= Integer.parseInt(c);
		//System.out.println(c);
		
		//int arr []= new int [5];
		//arr[10]=100;
		System.out.println("program is completed");
		System.out.println("program is excited");
		
	}

}
