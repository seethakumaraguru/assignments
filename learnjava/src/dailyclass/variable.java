package dailyclass;

public class variable {

	
	int rollNo = 9080;
	static int iRollNo = 9898;
	
	public static void main(String[] args) {
		/**
		 * Variable : It is a name which is given to a memory location.
		 * Types : 
		 * 		Local Variable.
		 * 		Global or Instance Variable.
		 * 		Static or Class variable.
		 * Variable Name Std : Camel Case
		 * Example : userName,andharNumber,mobileNumber,iAge,sName
		 */
		
		int regNo = 1020;
		System.out.println("RegNo is : "+regNo);
		variable osum = new variable();
	}
	
	public void sum() {
		int a=10,b=20,c;
		c = a + b;
		System.out.println("Sum is : "+c);
		System.out.println("Global Variable : "+rollNo);
		System.out.println("Static Varaible is : "+iRollNo);
	}

}
