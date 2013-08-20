package gof.structural.decorator;

/**
 * this is concrete class
 * in UML is Concrete Component : is a concrete class that need to be decorate
 * @author Huynh Quang Thao
 */

public class Coffee implements IBeverage {

	@Override
	public double cost() {
		return 10;	// cost of a normal coffee
	}

	@Override
	public void ingredient() {
		System.out.println("Add Coffee");
	}

}
