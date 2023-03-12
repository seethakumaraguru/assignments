package dailyclass;

public class MethodOverLoading {
	

	
		
		/**
		 * MethodOverLoading 
		 * 		- Method OverLoading can only be achived with in a same class .
		 * 		- When we have a same method name with difference in number of parameter or types of parameter .
		 * 		
		 */
		
		public void sum(int a,int b) {
			int c = a + b;
			System.out.println("Sum is a : "+c);
		}
		
		public void sum() {
			int a=10,b=20,c;
			c = a + b;
			System.out.println("Sum is b : "+c);
		}
		
		public void sum(double a,double b) {
			double c = a + b;
			System.out.println("Sum is c: "+c);
		}
		
		public void sum(int a,double b) {
			double c = a + b;
			System.out.println("Sum is d: "+c);
		}

		public static void main(String[] args) {
			MethodOverLoading oSum = new MethodOverLoading();
			//oSum.sum(100,10.9);
			oSum.sum(10.5,10);
			//oSum.sum();
		}

	}


