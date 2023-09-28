b package stringprograms;

public class Encapsulation {
	
	private String name;
	private int age;
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation e1= new Encapsulation();
		e1.setage(20);
		e1.setname("Devraj");
		System.out.println(e1.getage());
		System.out.println(e1.getname());
	}

}
