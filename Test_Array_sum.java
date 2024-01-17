package corejavap;

public class Test_Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int[] arr2= {20,45,67};
		int sum=0;
		for(int i=1;i<=arr1.length;i++) {
			sum+=i;
		}
		System.out.println("sum is:"+sum);
	}

}
