package creational.factory;

public class BeverageStores{
	
	//Sample Factory Method
    private SimpleBeverageFactory sampleFactory;
    public BeverageStores(SimpleBeverageFactory factory){
        this.sampleFactory = factory;
    }
    public BeverageProvide BeverageOrders(String beverageType)
    {
        BeverageProvide beverage;
        beverage = sampleFactory.CreateBeverage(beverageType);
        beverage.doPutIngredient();
        beverage.doAddFlavoring();
        beverage.doPourInCup();
        return beverage;
    }
    
    private BeverageFactory factory;
    public BeverageStores(BeverageFactory factory){
    	if("CoffeeFactory".equals(factory.getClass().getSimpleName())){
            this.factory = (CoffeeFactory) factory;
    	}
    	else if("TeaFactory".equals(factory.getClass().getSimpleName())){
            this.factory = (TeaFactory) factory;
    	}	
    }
    public BeverageProvide BeverageOrders()
    {
        BeverageProvide beverage;
        beverage = factory.CreateBeverage();
        beverage.doPutIngredient();
        beverage.doAddFlavoring();
        beverage.doPourInCup();
        return beverage;
    }
    
}
