package methodchaining;

public class FlpkartAddToCart {
	public FlipkartPaymentPage clickOnPayment() {
		System.out.println("Student clicked on Proceed to Payment button");
		return new FlipkartPaymentPage();
	}

}
