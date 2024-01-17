package corejavap;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array is a indexed collection of fixed noof homogeneous elements.
		//array declaration
		// 1d array 
		// int[] x;
		//array declartion with size is not possible at the time of declartion
		// not possible int[4] x;
		
		//2d array
		// int[][] x,y; x=2,y=2 dimensions
		//int[] a[],b; a=2,b=1 dimensions
		//int[] []a,[]b; is not possible invalid declartion
		
		//3d array
		//int[][][] a;  int [][][]a;  int a[][][]; int[] [][]a;
		
		//array creation..   every array is object only
		int [][] a=new int[3][0];
		System.out.println(a.getClass().getName()); 
		// output depends on datatype for int [[I 
		//similarly for all expect boolean it prints [[Z
		//int [] x=new int[-2];
		//System.out.print(x); //it returns negative array size exception
		int[] y=new int['a'];
		System.out.println(y);// int array max size [2147483647]
	}

}
