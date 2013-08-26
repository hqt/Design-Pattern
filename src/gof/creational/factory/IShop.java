package gof.creational.factory;

/**
 * interface for creator (factory)
 */
public interface IShop {
	Beverage getInstance(String type);
}

// those is concrete creator

class TrungNguyenShop implements IShop {
	@Override
	public Beverage getInstance(String type) {
		if (type.equals("milk")) return new TrungNguyenMilk();
		else if (type.equals("coffee")) return new TrungNguyenCoffee();
		else return null;
	}
}

class StarbuckShop implements IShop {
	@Override
	public Beverage getInstance(String type) {
		if (type.equals("milk")) return new StarbuckMilk();
		else if (type.equals("coffee")) return new StarbuckCoffee();
		else return null;
	}
}


