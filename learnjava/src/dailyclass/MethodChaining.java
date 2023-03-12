package dailyclass;

public class MethodChaining {

	
		

			
			public MethodChaining returnToSameClass() {
				System.out.println("This method will return to the same class.");
				return new MethodChaining();
			}
			
			public AmazonHomepage clickOnAmazonReferalCode() {
				System.out.println("Student clicked on the Amazon Referral code .");
				return new AmazonHomepage();
			}
			
			public void referralCodeUsed() {
				System.out.println("You have successfully used your referal code.");
			}

			public static void main(String[] args) {
				MethodChaining oCredo = new MethodChaining();
				oCredo.returnToSameClass().clickOnAmazonReferalCode()
				.searchProduct().selectingTheProduct().clickOnAddToCart().clickOnPayment().completeThePayment()
				.referralCodeUsed();
			}

		

	}


