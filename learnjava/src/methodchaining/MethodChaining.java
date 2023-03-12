package methodchaining;

public class MethodChaining {

	public MethodChaining ReturnsameClass() {
		System.out.println("returning to same class");
		return new MethodChaining();
	}
	 public FlipkartHomepage ClickonLink() {
		 System.out.println("user clicked the given link to access page");
		 return new FlipkartHomepage();
	 }
	 public void success() {
		 System.out.println("Successfully ordered");
	 }
	 
	public static void main(String[] args) {
		MethodChaining oflip = new MethodChaining();
		oflip.ReturnsameClass().ClickonLink().searchProduct().selectingTheProduct().clickOnAddToCart().clickOnPayment().completeThePayment()
		.success();
	}

}
