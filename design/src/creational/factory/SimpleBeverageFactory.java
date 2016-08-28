package creational.factory;

public class SimpleBeverageFactory {
	public BeverageProvide CreateBeverage(String beverageType) {
		BeverageProvide beverage;
		if (beverageType == "Coffee"){
			return beverage = new Coffee();
		}
		if (beverageType == "Tea"){
			return beverage = new Tea();
		}
		else{
			return null;
		}

	}
}
