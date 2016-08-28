package creational.factory;

/**
 * https://dotblogs.com.tw/joysdw12/archive/2013/06/23/design-pattern-simple-factory-pattern.aspx
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("=== SimpleBeverageFactory ===");
		BeverageStores store = new BeverageStores(new SimpleBeverageFactory());
		System.out.println("Order a Coffee....");
		store.BeverageOrders("Coffee");
		System.out.println();
		System.out.println("Order a Tea....");
		store.BeverageOrders("Tea");

		System.out.println("=== BeverageFactory ===");
		BeverageStores coffeeStore = new BeverageStores(new CoffeeFactory());
		System.out.println("Order a Coffee....");
		coffeeStore.BeverageOrders();
		System.out.println();
		BeverageStores teaStore = new BeverageStores(new TeaFactory());
		System.out.println("Order a Tea....");
		teaStore.BeverageOrders();
	}
}
