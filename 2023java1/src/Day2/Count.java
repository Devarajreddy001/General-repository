package Day2;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=858588886;
		int count=0;
		
		//String b= Integer.toString(a);
		
		//System.out.println(b.length());
		
		while (a!=0) {
			
			a=a/10;
			count++;
			
			
		}
		System.out.println(count);

	}

}
