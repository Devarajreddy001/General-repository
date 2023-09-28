
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		
		
		int a =10;
		int b= 20;
		
		//Arithmetic operators
		
		System.out.println("sum of a and b is : "+ (a+b) );
		
		System.out.println("sum of a and b is : "+ (b-a) );
		System.out.println("sum of a and b is : "+ (a*b) );
		System.out.println("sum of a and b is : "+ (a/b) );
		System.out.println("sum of a and b is : "+ (a%b) );
		
		//Relational operators or comparison operators
		//Always return boolean value
	System.out.println("relational operators") ;
		System.out.println(a==b); //false
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		//logical operators
		//works between two boolean values
		
	 boolean x= true;
	 boolean y= false;
	 
	 System.out.println("logical operators");
	 
	 System.out.println(x && y);
	 System.out.println(x || y);
	 System.out.println(!x );
	 System.out.println(!y );
	 
	 //Increment operators /decrement operators
	 //a++ //a=a+1
	 
	 a= 10;
	 a++;
	 
	 System.out.println(a);
	 
	 b= 20;
	 b--; //b-b-1;
	 System.out.println(b);
	
		
		
		
		
	}

}
