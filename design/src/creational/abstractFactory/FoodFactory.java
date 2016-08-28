package creational.abstractFactory;

import creational.factory.*;

abstract public class FoodFactory {
	abstract BeverageProvide CreateBeverage();
	abstract StapleProvide CreateStaple();
}
