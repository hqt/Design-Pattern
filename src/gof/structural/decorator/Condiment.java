package gof.structural.decorator;

// this abstract class is Decorator in UML diagram
// have a reference to object that need to decorate. 
// this object often put in constructor to have reference

public abstract class Condiment implements IBeverage {
	IBeverage iBeverage;
	public Condiment(IBeverage iBeverage) {
		this.iBeverage = iBeverage;
	}
}

/**
* is ConcreteDecorator in UML Diagram
* is a concrete class, implement decorate function for reference object
* @author Huynh Quang Thao
*/

class IceCondiment extends Condiment {

	public IceCondiment(IBeverage iBeverage) {
		super(iBeverage);
	}

	@Override
	public double cost() {
		return iBeverage.cost() + 1;
	}

	@Override
	public void ingredient() {
		iBeverage.ingredient();
		System.out.println("Add Ice");
	}
}

class MilkCondiment extends Condiment {

	public MilkCondiment(IBeverage iBeverage) {
		super(iBeverage);
	}

	@Override
	public double cost() {
		return iBeverage.cost() + 3;
	}

	@Override
	public void ingredient() {
		iBeverage.ingredient();
		System.out.println("Add Milk");
	}

}

