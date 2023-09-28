package Day3;
import java.util.HashMap;
import java.util.Map;
public class Newhashmap {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		HashMap <Integer, String> hr= new HashMap<Integer, String>();
		
		hr.put(101,"kiran");
		hr.put(102,"raj");
		hr.put(103,"dinai");
		hr.put(104,"kiraaraj");
		hr.put(105,"kirab");
		
		System.out.println(hr);
		hr.remove(103);// remove a pair fro hashmap
		System.out.println(hr);
		
		// reading pair from hashmap
		
		for (Map.Entry m: hr.entrySet()) {
			System.out.println(m.getKey() +"" + m.getValue());
			
		}
	}

}
