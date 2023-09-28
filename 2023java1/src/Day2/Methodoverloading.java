package Day2;

public class Methodoverloading {
	
	void sum (int a , int b){
		System.out.println(a+b);
	}
	
	void sum (int a , double b){
		System.out.println(a+b);
	}
	
	void sum (double a , double b){
		System.out.println(a+b);
		
	}
	void sum (int a , int b, int c){
		System.out.println(a+b+c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Methodoverloading A1= new Methodoverloading();
  A1.sum(20, 40);
	}

}
