package dailyclass;

public class OptionalArguments {
	

	
		/**
		 * OptionalArguments or Variable Parameter .
		 * OptionalArguments can accept zero or n-number of arguments .
		 * OptionalArguments should be the last parameter in a method or OptionalArguments can only 
		 * be one parameter.
		 */
		public void orderFood(int seatNo,String... foods) {
			System.out.println("Food is ordered for seatNo : "+seatNo);
			if(foods.length > 0) {
				for(int i = 0;i < foods.length;i++) {
					System.out.println("Food List : "+foods[i]);
				}
			}else {
				System.out.println("Order has been cancelled.");
			}
		}
		
		public String[] cancelFood(String... foods) {
			if(foods.length > 0) {
				for(int i = 0;i < foods.length;i++) {
					System.out.println("Food List is cancelled : "+foods[i]);
				}
			}else {
				System.out.println("No Order has been cancelled.");
			}
			return foods;
		}
		
		public void donateFood(String[] foods) {
			System.out.println("All the cancelled foods are donated." );
		}

		public static void main(String[] args) {
			OptionalArguments obj = new OptionalArguments();
			obj.orderFood(12);
			obj.orderFood(18,"Chapathi","Idli");
			obj.orderFood(22,"Parota","Idli","Dosa","Grill Chicken");
			obj.cancelFood();
			obj.cancelFood("Idli","Dosa","Grill Chicken");
			String[] cancellation = {"Biriyani","Chicken","Curd Rice","Sambar Rice"}; 
			obj.cancelFood(cancellation);
			obj.donateFood(obj.cancelFood(cancellation));
		}

	}



