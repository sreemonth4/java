package corejavap;

import java.util.Scanner;

public class Multilplyiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		//int result;
		for(int i=0;i<10;i++) {
			//result=a*i;
			System.out.println(a + " x " + (i + 1) + " = " + (a * (i + 1)));
		}
		
	}

}
