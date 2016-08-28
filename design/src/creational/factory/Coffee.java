package creational.factory;

public class Coffee implements BeverageProvide {

	public void doPutIngredient() {
		System.out.println("steep coffee in boiling water");
	}

	public void doPourInCup() {
		System.out.println("pour coffee in cup");
	}

	public void doAddFlavoring() {
		System.out.println("add suger and milk" );
	}

}
