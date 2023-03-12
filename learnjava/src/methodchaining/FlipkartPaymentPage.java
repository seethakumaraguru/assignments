package methodchaining;

public class FlipkartPaymentPage {
	public MethodChaining completeThePayment() {
		System.out.println("Complete the payment in prefered link.");
		return new MethodChaining();
	}
}
