package Day2;

public class Student {
	
	int SID;
	String Sname;
	int sub1;
	int sub2;
	int sub3;
	
	Student (int a1, int a2, int a3){
		
		sub1=a1;
		sub2=a2;
		sub3=a2;
		
	}
	
	void getSTUData(int id, String name) {
		SID=id;
		Sname =name;
		
	}
	
	void STUMarks (int a1, int a2, int a3) 
	{
		sub1=a1;
		sub2=a2;
		sub3=a2;
		
	}
	
	void totalmarks() {
		System.out.println( SID + Sname);
		System.out.println(sub1 + sub2 + sub3);
	}
	
	public static void main (String Args[]) {
		
	Student s1= new Student(10,20,30);
	s1.getSTUData(2, "holi");
	s1.totalmarks();
	
	

}
	}

