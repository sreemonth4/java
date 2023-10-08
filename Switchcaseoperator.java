package javaadvance;

public class Switchcaseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=10;
		String monthstring;
		switch(month) {
		case 1:
			monthstring="january";
			break;
		case 2:
			monthstring="feb";
			break;
		case 3:
			monthstring="march";
			break;
		case 4:
			monthstring="Apirl";
			break;

		case 5:
			monthstring="may";
			break;

		case 6:
			monthstring="june";
			break;

		case 7:
			monthstring="july";
			break;

		case 8:
			monthstring="august";
			break;
		case 9:
			monthstring="september";
			break;
		case 10:
			monthstring="october";
			break;
		case 11:
			monthstring="november";
			break;
		case 12:
			monthstring="december";
			break;


		default:
			monthstring="invalid month";
			break;
			
		}
		System.out.println(monthstring);
	}

}
