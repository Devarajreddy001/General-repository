package Day2;

public class Specificstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a []= {"This", "is", "the", "java", "program"};
		
		String b="th";
		
		String k="";
		
		for (String c:a)
		{
			k=c;
			
			if (b==k)
			{
				System.out.println("The string is available");break;
			}
			
		}

		if (b!=k)
		{
			System.out.println("The string is not available");
		}

	}

}
