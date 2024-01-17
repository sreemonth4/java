package corejavap;

import java.util.Scanner;

public class Operations_on_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("2nd number");
		int b=sc.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"x"+b+"="+a*b);
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"/"+b+"="+a/b);
		System.out.println(a+"%"+b+"="+a%b);
	}

}
