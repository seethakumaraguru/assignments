package dailyclass;

public class MethodEx {
	
		/**
		 * Method - It is a name which is given to a sequeance of a steps .
		 * Purpose - Method will increase the reusability and reduce the complexity .
		 * Types :
		 * 		- System Defined Method
		 * 		- User Defined Method
		 * 
		 * Way of implementation
		 * =====================
		 * 		1. Method without parameter.
		 * 		2. Method with parameter. --> Input to the method
		 * 		3. Method without Return Type. --> A method with void keyword will not return any value .
		 * 		4. Method with Return Type. --> Returning the output of method.
		 * @param args
		 * 
		 * Method Syntax :
		 * =============
		 * modifier returntype methodname();
		 */

		public static void main(String[] args) {
			MethodEx obj = new MethodEx();
			obj.loginGmail();
			obj.trainTicketReservation("Sekar",4);
			obj.trainTicketReservation("Saranya", 23);
			int ticket = obj.bookTrainTicket("Jaffer", 26);
			obj.cancelTicket(ticket);
			obj.orderFood(ticket);
		}
		
		public void loginGmail() {
			// Hard coding
			String userName = "mathan@gmail.com";
			String password = "testing123";
			System.out.println("Login Successfully with username : "+userName+" and password : "+password);
		}
		
		public void trainTicketReservation(String name,int age) {
			System.out.println("Ticket booking confirmed for : "+name);
			if(age < 6) {
				System.out.println("No berth provided...");
			}else {
				System.out.println("Berth will be offered...");
			}
		}
		
		public int bookTrainTicket(String name,int age) {
			int ticketNo = 5050;
			System.out.println("Ticket booking confirmed for : "+name+", Ticket number is : "+ticketNo);
			if(age < 6) {
				System.out.println("No berth provided...");
			}else {
				System.out.println("Berth will be offered...");
			}
			return ticketNo;
		}
		
		public void cancelTicket(int ticket) {
			System.out.println("Ticket number : "+ticket+" is cancelled successfully.");
		}
		
		public void orderFood(int ticket) {
			System.out.println("Food is order for the ticket : "+ticket+" and it will delivered in 2 hrs.");
		}

	}


