package Day3;

public class construct {
	
	class Superclass {
	    int x;

	    Superclass(int x) {
	        this.x = x;
	    }
	}

	class Subclass extends Superclass {
	    int y;

	    Subclass(int x, int y) {
	        super(x); // Call the constructor of the superclass
	        this.y = y;
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
