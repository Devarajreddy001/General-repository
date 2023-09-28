package Day3;

import java.lang.Exception;
public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		
		try {
			System.out.println(a/0);
		}
		
		catch(Exception l) 
		{
			System.out.println("best");
		}
		finally
		{
			System.out.println("into the final block");
		}
		System.out.println("excited");
	}

}
