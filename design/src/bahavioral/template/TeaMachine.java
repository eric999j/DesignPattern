package bahavioral.template;

public class TeaMachine extends DrinkMachine{

	@Override
	void doPutIngredient() {
		System.out.println("steep tea in boiling water");
	}

	@Override
	void doPourInCup() {
		System.out.println("pour tea in cup");
	}

	@Override
	void doAddFlavoring() {
		System.out.println("add lemon" );
	}
	
}
