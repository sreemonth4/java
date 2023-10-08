package javaadvance;

public class Twodimensionalarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,4,5},{2,6,4},{4,6,8}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
