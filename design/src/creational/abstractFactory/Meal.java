package creational.abstractFactory;

import creational.factory.BeverageProvide;
import creational.factory.BeverageStores;
import creational.factory.SimpleBeverageFactory;

public class Meal extends FoodFactory {

	@Override
	BeverageProvide CreateBeverage() {
		return new BeverageStores(new SimpleBeverageFactory()).BeverageOrders("Coffee");
	}

	@Override
	StapleProvide CreateStaple() {
		return null;
	}

}
