package Day2;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		String s1="to java";
		String s2="  trim  ";
		String s3= "welcome to java";
		
		System.out.println(s.length());//length of the string
		System.out.println(s.concat(s1));//joining of strings
		System.out.println(s2.trim());//trim
		System.out.println(s.charAt(6));//char at starts with 0
		System.out.println(s.contains("Welcome"));//contains
		System.out.println(s.equals("welcome"));//equals
		System.out.println(s.equalsIgnoreCase("welcome"));//equalsignorecase
		System.out.println(s.replace('e', 'm'));//replace strings with single quotes
		System.out.println(s3.replace("java", "selenium"));
		System.out.println(s.substring(3, 6));//substring starting point and end point
		System.out.println(s.toUpperCase());//uppercase
		System.out.println(s.toLowerCase());//lowercase
	}

}
