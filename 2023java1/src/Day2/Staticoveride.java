package Day2;



class Superclass {
    static double staticMethod() {
        return 0;
    }
}

class Subclass extends Superclass {
    static double staticMethod() {
        return 1;
    }
}
public class Staticoveride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass obj1 = new Superclass();
        Superclass obj2 = new Subclass();
        System.out.println(Superclass.staticMethod()); // Calls Superclass's static method
        System.out.println(Subclass.staticMethod());    // Calls Subclass's static method
        System.out.println(obj1.staticMethod());         // Calls Superclass's static method
        System.out.println(obj2.staticMethod());         // Calls Superclass's static method (method hiding)
    }
	

}
