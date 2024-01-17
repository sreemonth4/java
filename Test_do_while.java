package corejavap;

public class Test_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do-while is mainly used to execute the loop body at least once we use do-while loop 
		//syntax -- do{  body  } while(b);
	//in the while loop semicolon is mandatory in java
		//in do-while sometimes is unreachable state due to statement condition is true
		//in while or do-while loops final statement is not been works mostly due to its fixed value
		
		do
			while(true) {
				System.out.println("hello");
				break;
			}
		while(false);
	}

}
