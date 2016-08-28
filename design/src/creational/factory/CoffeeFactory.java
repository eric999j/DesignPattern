package creational.factory;

public class CoffeeFactory implements BeverageFactory{

	@Override
	public BeverageProvide CreateBeverage() {
		return new Coffee();
	}

}
