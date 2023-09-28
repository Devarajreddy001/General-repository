package Day2;

public class Student1 {

	
		// TODO Auto-generated method stub
		
		int sid;
		String Sname;
		char grade;
		
		
		void getvalues(int id, String name, char g)
		{
			
			sid=id; Sname=name;grade=g;
			
		}
		void display () {
			System.out.println(sid+ " " +Sname+"       "+ grade);
		}

	

}
