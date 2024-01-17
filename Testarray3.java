package corejavap;

public class Testarray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array declaration creation intilization in single line
		//int[] x= {10,20,30};
		//System.out.println(x[0]);
		//similar to char and string
		int[][] y= {{10,20},{10,40}};
		System.out.println(y[0][1]);
		System.out.println(y[1][1]);
		
		//3d array
		int[][][] x= {{{10,20,30},{20,40,67}},{{10,57,85},{24,565,75}}};
		System.out.println(x[0][1][2]);
		
		//divide the array intilization creates a complie time error
		//int[] e;
		//e= {10,20,30};
		//System.out.println(e[0]);
		
		//length vs length()
		int[] z=new int[6];
		System.out.println(z.length); //length() is not used in array.we cannot invoke the method
		
		String s="sree";
		System.out.println(s.length()); //length is not used in string,it is consider as variable we use only length() to know the size
		
		String[] d= {"s","sree","fkjnf"};
		System.out.println(d.length); //d.length() is not used
		System.out.println(d[1].length()); //d[0].length is not used
		
		int[][] t=new int[4][5];
		System.out.println(t.length);
		System.out.println(t[0].length);
		
		//anomonous arrays is just for 1 time usage
		//new int[] {10,29}; correct we should not specify size and multi dimensional is also possible
		//to change anomonous to array we should declare a varaible to it. int[] x=new int[]{10,29}; 
		
		//array elements assignments
		int[] h=new int[3];
		h[0]=10;
		h[1]='s';
		h[2]='d';
		
		Object[] a=new Object[2];
		a[0]=new Object();
		a[1]=new String("hjhj");
		System.out.println(a[1]);
		
			
	}

}
