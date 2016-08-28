package bahavioral.template;

abstract public class DrinkMachine{
	
	protected void boilWater(){
		System.out.println("Boil Water");
	}
	abstract void doPutIngredient();
	abstract void doPourInCup();
	abstract void doAddFlavoring();
	
	public void makeDrink(){
		this.boilWater();
		this.doPutIngredient();
		this.doPourInCup();
		this.doAddFlavoring();
	}

}
