package javaadvance;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testscore=78;
		char grade;
		
		if(testscore>=90){
			grade='A';
			
		}
		else if(testscore>=80) {
			grade='B';
			
		}
		
		else if(testscore>=70) {
			grade='C';
			
		}
		
		else if(testscore>=60) {
			grade='D';
			
		}
		else{
			grade='F';
			}
		System.out.println("student grade is:"+grade);
	}

}
