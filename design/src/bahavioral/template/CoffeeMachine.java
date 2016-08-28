package bahavioral.template;

public class CoffeeMachine extends DrinkMachine{

	@Override
	void doPutIngredient() {
		System.out.println("steep coffee in boiling water");
	}

	@Override
	void doPourInCup() {
		System.out.println("pour coffee in cup");
	}

	@Override
	void doAddFlavoring() {
		System.out.println("add suger and milk" );
	}
	
}
