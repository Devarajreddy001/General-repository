package Day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Exception;


public class Checkedexcep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("program is started");
		System.out.println("porgram is in middle");
		
		FileReader fr= null;
		fr= new FileReader("");
		
		BufferedReader bfr=new BufferedReader(fr);
			System.out.println(bfr.readLine());
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}*/
		
	
		System.out.println("program is completed");
		System.out.println("program is excited");

	}

}
