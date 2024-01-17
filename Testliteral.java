package corejavap;

public class Testliteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char ch='a'; //asci 97
		//char c='ab'; //char support upto 0-65535
		char c=97;
		char e=0XFace;
		char r=1970; 
		char t='\u0061'; //char 61 is a 62 is b......format-'\uxxxx'   unicode representation
		//char ch='\m' is a mute character it is invalid 
		// /r-carriage return  /f-form feed \'-single quote 
		System.out.println(c+"  "+e+" "+r+" "+t);
	}

}
