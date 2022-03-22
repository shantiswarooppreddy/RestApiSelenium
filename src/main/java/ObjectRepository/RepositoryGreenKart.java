package ObjectRepository;

public interface RepositoryGreenKart {
	
	String topDeals = "//*[text() = 'Top Deals']";
	String pricePrefix = "//tr[child::td[text() = ";
    String priceSuffix = "]]/td[2]";
	String discountPricePrefix = "//tr[child::td[text() = ";
	String discountPriceSuffix = "]]/td[3]";
	String nextButton = "//a[@aria-label = 'Next']";
    String itemPrefix = "//div[descendant :: *[contains(text(),'";
    String itemSuffix = "')] and @class = 'product']";
    String addToCartButton = "//button";
    String inputItemNo = "//input";
    String incrementItemNo = "//*[@class = 'increment']";
    String decrementItemNo = "//*[@class = 'decrement']";
    String price = "//p";
}
