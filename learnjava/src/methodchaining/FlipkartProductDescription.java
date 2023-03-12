package methodchaining;

public class FlipkartProductDescription {
	public FlpkartAddToCart clickOnAddToCart() {
		System.out.println("Product description looks good, click on add to cart .");
		return new FlpkartAddToCart();
	}

}
