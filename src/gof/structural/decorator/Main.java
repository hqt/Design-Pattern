package gof.structural.decorator;

public class Main {

	public static void main(String[] args) {
		IBeverage coffee = new Coffee();
		System.out.println("Cost of Coffee: " + coffee.cost());
		
		// using decorator
		IBeverage coffee_ice = new  IceCondiment(new Coffee());
		System.out.println("Cost of Coffee ICe: " + coffee_ice.cost());
		
		// using decorator in decorator
		IBeverage coffee_ice_milk = new IceCondiment(new MilkCondiment(new Coffee()));
		System.out.println("Cost of Cofffee Ice Milk: " + coffee_ice_milk.cost());
		System.out.println("Ingredient of Ice milk coffee:");
		coffee_ice_milk.ingredient();
		
		// using double decorator
		IBeverage coffee_many_milk = new MilkCondiment(new MilkCondiment(new Coffee()));
		System.out.println("Cost of COffeee with many milk: " + coffee_many_milk.cost());
		
		// using same decorator for different type class
		IBeverage tea_milk = new MilkCondiment(new Tea());
		System.out.println("Ingredient of Tea Milk is: ");
		tea_milk.ingredient();
	}
}
