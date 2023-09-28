package Day3;
import java.util.ArrayList;
public class Arraylistdemo {
	
	Object s= 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to declare array list
		ArrayList list= new ArrayList();//we can store any type of data elements
		
		//ArrayList <String> list = new ArrayList <String> ();//specific type of elements
		
		///how to add values to array list

		list.add("john");
		list.add("johncena");
		list.add("johnsmith");
		list.add(100);
		list.add("johnhen");
		list.add(50);
		
		System.out.println(list.size());//4
		//remove element
		System.out.println(list);
		list.remove(2);
		System.out.println(list.size());
		System.out.println(list);
	// inserting a new element
		list.add(1,"kinu");
		System.out.println(list);
		
		//read values from array list
		
		for ( Object s:list) {
			System.out.println(s);
		}
	}

}
