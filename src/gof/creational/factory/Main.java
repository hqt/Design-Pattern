package gof.creational.factory;

public class Main {

	public static void main(String[] args) {
		// if not use factory pattern
		Beverage beverage = null;
		String brand = "Starbuck";
		String type = "milk";

		// manual create object
		if (brand.equals("TrungNguyen")) {
			if (type.equals("coffee"))	beverage = new TrungNguyenCoffee();
			if (type.equals("milk"))	beverage = new TrungNguyenMilk();
		}
		else if (brand.equals("Starbuck")) {
			if (type.equals("coffee"))	beverage = new StarbuckCoffee();
			if (type.equals("milk"))    beverage = new StarbuckMilk();
		}
		System.out.println("Description of order is: " + beverage.getDescription());

		// using Factory Pattern
		// more simple because it delegate object initilization to subclass
		IShop hoa = new StarbuckShop();
	    System.out.println(hoa.getInstance("coffee").getDescription());
	    IShop thao = new TrungNguyenShop();
	    System.out.println(thao.getInstance("coffee").getDescription());

	}
}
