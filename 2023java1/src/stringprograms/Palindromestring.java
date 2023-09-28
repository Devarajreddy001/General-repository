package stringprograms;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String A = "greeks for greeks";
        String c="";
        String [] k = A.split(" ");
       String m = A.replaceAll("\\s","");
        
    for(int b=k.length-1; b>=0; b--)
    {
        c=c+k[b];
    }
    if(c.equals(m))
    {
     System.out.print("This is palindrome");
    
     }
     else{
     System.out.print("This is not palindrome");
}*/
		String A= "Welcome to hyderabad";
        String [] B= A.split(" ");
        String C= A.replaceAll("\\s","");
        String D="";
        
        for(int E=B.length-1; E>=0; E--)
        {
            D=D+B[E];
        }
        if (D.equals(C))
        {
            System.out.print("This is palindrome");
        }
        else
        {
            System.out.print("This is not palindrome");
        }

	}

}
