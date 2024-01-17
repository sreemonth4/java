package corejavap;

public class Test_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for-each loop is mainly used to print the elements by line to line in arrays and collection
		//syntax = for(int x1 : x) { sopen(x1);		} for one dimensional array
		//syntax for 2 dimensional array = for(int[] x1 : x){	for(int x2 : x1) {	sopen(x2);	}	}
		//syntax for 3 dimensional array=  for(int[][] x1 : x){	for(int[] x2 : x1) { for(int x3 : x2) { sopen(x2); }}}
		int a[]= {0};
		for(int x1:a) {
			System.out.println("hello");
		}
	}

}
//iterator has 3 methods 1)hasNext() 2)next() 3)remove() used to retrive elements in collections
//iterable has one method only iterator() used only for target elements
