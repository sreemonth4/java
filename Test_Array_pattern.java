package corejavap;

public class Test_Array_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[10][10];
		//String[] arr1= {"-"};
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%2d",+a[i][j]);
			}
			System.out.println("");
		}
	}

}
