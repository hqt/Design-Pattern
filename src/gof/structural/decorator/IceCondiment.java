package gof.structural.decorator;

/**
 * is ConcreteDecorator in UML Diagram
 * is a concrete class, implement decorate function for reference object
 * @author Huynh Quang Thao
 */
public class IceCondiment extends Condiment {

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
