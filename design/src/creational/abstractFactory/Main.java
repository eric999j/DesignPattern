package creational.abstractFactory;

public class Main {

	public static void main(String[] args) {
		FoodFactory meal = new Meal();
		meal.CreateBeverage();
	}

}
