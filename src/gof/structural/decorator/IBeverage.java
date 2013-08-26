package gof.structural.decorator;

// defines the interface for objects that can have responsibilities added to them dynamically.
// those interface is using for decorator
public interface IBeverage {
	public double cost();
	public void ingredient();
}

/**
 * this is concrete class
 * in UML is Concrete Component : is a concrete class that need to be decorate
 */

class Coffee implements IBeverage {

	@Override
	public double cost() {
		return 10;	// cost of a normal coffee
	}

	@Override
	public void ingredient() {
		System.out.println("Add Coffee");
	}
}

class Tea implements IBeverage {

	@Override
	public double cost() {
		return 5;	// cost of normal tea
	}

	@Override
	public void ingredient() {
		System.out.println("Add Sugar");
		System.out.println("Add Tea Leaf");
	}
}



