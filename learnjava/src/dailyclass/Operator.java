package dailyclass;

public class Operator {
	

		public static void main(String[] args) {
			/**
			 * Arithmetic Operators : +,-,*,/,%
			 */
			System.out.println("Modular is : "+(20%2));
			/**
			 * Unary Operator : x++,++x,x--,--x
			 * x++ --> x = x + 1
			 */
			int x = 12;
			//x = x + 1;
			//x++;
			//x = 1+x;
			System.out.println("PreIncrement is : "+(++x));
			/**
			 * Logical Operator : &&(AND),||(OR),!(NOT)
			 * &&(AND) --> 
			 */
			int mark = 69;
			System.out.println("Grade is A "+((mark > 85) && (mark <=100)));
			System.out.println("Grade is A "+((mark > 85) || (mark <=100)));
			System.out.println("AND Operator is : "+(true && true));
			System.out.println("AND Operator is : "+(false && true));
			
			System.out.println("OR Operator is : "+(false || true));
			System.out.println("OR Operator is : "+(false || false));
			
			System.out.println("NOT Operator is : "+!(false || false));
			
			
			
			
			
		}

	}


