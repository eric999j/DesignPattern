package creational.factory;

public class TeaFactory implements BeverageFactory{

	@Override
	public BeverageProvide CreateBeverage() {
		return new Tea();
	}

}
