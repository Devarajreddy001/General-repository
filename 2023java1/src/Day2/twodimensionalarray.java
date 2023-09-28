package Day2;

public class twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[][]= new int [3][2];
		
		a[0][0]=200;
		a[0][1]=300;
		
		a[1][0]=500;
		a[1][1]=400;
		
		a[2][0]=800;
		a[2][1]=900;
		
		int b [][]= {{100,200} , {800,200}, {900 ,755} };
		
		System.out.println(b[1].length);*/
		
		/*int b [][]= {{100,200} , {800,200}, {900 ,755} };
		
		for (int i=0;i<b.length; i++)//outerloop 0 1 2 3
		{
			for (int j=0; j<b[0].length; j++)//innerloop 0 1 2
			{
				System.out.println(b[i][j]); //100, 200, 300
			}*/
		int b [][]= {{100,200} , {800,200}, {900 ,755} };
		
		for (int r[]:b)
		{
			for (int i:r)
			{
				System.out.println(i);
			}
		}
		{
			
			
			
			
		}
	}
	

}
