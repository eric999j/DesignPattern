package creational.factory;

public class Tea implements BeverageProvide {

	public void doPutIngredient() {
		System.out.println("steep tea in boiling water");
	}
	public void doPourInCup() {
		System.out.println("pour tea in cup");
	}

	public void doAddFlavoring() {
		System.out.println("add lemon" );
	}

}
