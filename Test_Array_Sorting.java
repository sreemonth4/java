package corejavap;

import java.util.*;

public class Test_Array_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {19,23,56,64,32,13,45,23,13,45,78,00};
		System.out.println("original array:"+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("sorted array:"+Arrays.toString(arr1));
		System.out.println();
		String[] arr2= {"sree","raju","chandini","anand","hemanth","shyam sundar","chukka","baggam meghna","yamini","jayasai","manoj"};
		System.out.println("String array is:"+Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Sorted string array is:"+Arrays.toString(arr2));
	}

}
