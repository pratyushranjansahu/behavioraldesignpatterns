package behavioralpatterns.strategy;

import behavioralpatterns.strategy.controller.CreditCardAlgorithm;
import behavioralpatterns.strategy.controller.PaypalAlgorithm;
import behavioralpatterns.strategy.controller.ShoppingCart;
import behavioralpatterns.strategy.model.Product;

public class StrategyMain {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);


        cart.addProduct(pants);
        cart.addProduct(shirt);


        //payment decisions
        cart.pay(new PaypalAlgorithm("pal@gmail.com", "india"));


        cart.pay(new CreditCardAlgorithm("Pal", "238756464"));

	}

}
