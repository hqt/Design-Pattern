package gof.creational.factory;

public abstract class Beverage {
	public abstract String getDescription();
}

// concrete class that extends from Beverage
// those class will be initialize by concrete creator 
// such as TrungNguyenShop or StarbuckShop

class StarbuckMilk extends Beverage {
	@Override
	public String getDescription() {
		return "Starbuck Milk";
	}
}

class StarbuckCoffee extends Beverage {
	@Override
	public String getDescription() {
		return "Starbuck Coffee";
	}
}

class TrungNguyenMilk extends Beverage {
	@Override
	public String getDescription() {
		return "Trung Nguyen Milk";
	}
}

class TrungNguyenCoffee extends Beverage {
	@Override
	public String getDescription() {
		return "Trung Nguyen Coffee";
	}
}
