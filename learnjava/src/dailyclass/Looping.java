package dailyclass;

public class Looping {
	

		public static void main(String[] args) {
			/**
			 * Looping : If we have to repeate the static statement for multiple times then we can prefer Lopping.
			 * For Loop , For Each
			 * While Loop
			 * Do-While
			 * break
			 * continue
			 */
			
			/**
			 * For Loop
			 * Declaration and Initialization , Conditional , Increament or Decreament
			 * Declaration and Initialization --> It will execute only once inside the for loop
			 * Conditional --> Once Condition is satisfied then it will execute the statement
			 * Increament or Decreament --> Will be happen after execution of all the statement
			 */
			for(int i=0;i < 10;i++) {
				if(i==5) {
					System.out.println("I value is 5 ");
					break;
				}
				System.out.println("Welcome to Credo System");
				
			}
			System.out.println("********************");
			for(int i=0;i < 10;i++) {
				if(i==5) {
					System.out.println("I value is 5 ");
					continue;
				}
				System.out.println("Welcome to Credo World "+i);
				
			}
			
			/**
			 * While Loop
			 */
			System.out.println("********************");
			int i=0;
			while(i<10) {
				System.out.println("Welcome to Credo World "+i);
				i++;
			}
			
			/**
			 * Do While Loop
			 */
			System.out.println("********************");
			int age = 10;
			do {
			System.out.println("We can allow kid to play area");	
			} while (age < 10);
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}


