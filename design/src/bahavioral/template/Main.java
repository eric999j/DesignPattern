package bahavioral.template;

/*
 * http://www.cnblogs.com/oomusou/archive/2007/03/31/695076.html
 */
public class Main {

	public static void main(String[] args) {
	
	System.out.println("Make Tea...");
	DrinkMachine teaMachine = new TeaMachine();
	teaMachine.makeDrink();

	
	System.out.println("Make Coffee...");
	DrinkMachine coffeeMachine = new CoffeeMachine();
	coffeeMachine.makeDrink();
	
	}
}
