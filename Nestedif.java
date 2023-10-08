package javaadvance;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		
		if(a==50) {
			System.out.println("a is equal to 50");
			if(a>55) {
				System.out.println("a is greater than to 50");
				if(a<40) {
					System.out.println("a is smaller to 50");
				}
			}
		}		
	}
}