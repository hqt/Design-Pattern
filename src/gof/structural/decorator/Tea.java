package gof.structural.decorator;

//this is concrete class
//in UML is Concrete Component : is a concrete class that need to be decorate

public class Tea implements IBeverage {

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
