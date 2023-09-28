package Day2;



 class animal{
	 
	 String colour= "blue";
	 
	 void eating () {
		 System.out.println("eat");
	 }
	 
	 animal()
	 {
		 System.out.println("Animal");
	 }
 }
 
 class dog extends animal
 {
	 String colour="black";
	 void eating() {
		
		super.eating();
	}
	 
	 dog ()
	 {
		 super();
		 //System.out.println("dog");
	 }
 }
 

 
 public class Superkeyword {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d1= new dog();
		

	}

}
