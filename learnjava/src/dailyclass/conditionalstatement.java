package dailyclass;

 public class conditionalstatement{
	 public static void main(String[] args) {
			/**
			
			 * If,If-Else,If-If Else-Else,Switch Case
		     * What should be a expected input for a conditional statement ?  true , false -- boolean
		 
			 **/
		 conditionalstatement oCondition = new conditionalstatement();
		 //classname referencename =new(keyword) constructorcall
		 oCondition.ifCondition();
			System.out.println("****************");
        oCondition.ifElseCondition();
		System.out.println("**********");
		oCondition.ifElseIfElseCondition();
		System.out.println("******");
		oCondition.switchCase();
		System.out.println("*********");
 }
 
 public void ifCondition() {
		boolean hungry = false;
		if(hungry) {
			System.out.println("Go and have your BF");
		}
		System.out.println("Rest of my code");
 
}
  public void ifElseCondition() {
		int money = 10;
		if(money > 100) {
			System.out.println("Go and have basic Biriyani");
		}else {
			System.out.println("Go and have a basic meals");
		}
		System.out.println("Rest of my code");
	}
 public void ifElseIfElseCondition() {
		int money = 49;
		if(money > 100) {
			System.out.println("Go and have basic Biriyani");
		}else if(money >=70 && money <=100) {
			System.out.println("Go and have a basic meals");
		}else if(money >=50 && money < 70 ) {
			System.out.println("Go and have a mini meals");
		}else if(money >=30 && money < 50 ) {
			System.out.println("Go and have a juice");
		}else if(money >=10 && money < 30 ) {
			System.out.println("Go and have a tea and snacks");
		}else {
			System.out.println("You can noot buy any");
		}
	}
 public void switchCase() {
		String day = "Sunday";
		switch (day) {
		case "Monday":
			System.out.println("Worst day...");
			break;
		case "Tuesday":
			System.out.println("Boring day...");
			break;
		case "Wednesday":
			System.out.println("More Working day...");
			break;
		case "Thursday":
			System.out.println("Working day...");
			break;
		case "Friday":
			System.out.println("Enjoy day...");
			break;

		default:
			System.out.println("Enjoy your weekend");
			break;
		}
	}
	}
	
