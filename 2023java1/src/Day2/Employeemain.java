package Day2;

public class Employeemain {

	
public static void main (String Args []) {
		
		Employee E1 = new Employee();//
		
	    E1.eid=1;
	    E1.ename="suresh";
	    E1.sal=25000;
	    E1.deptno=10;
	    E1.job="manager";
	    
	    E1.display();
	    
	    
	Employee E2 = new Employee();//
		
	    E2.eid=10;
	    E2.ename="suresh konda";
	    E2.sal=250000;
	    E2.deptno=100;
	    E2.job="assistant manager";
	    
	    E2.display();
	    
}
}