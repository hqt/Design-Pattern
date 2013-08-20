package gof.structural.decorator;

public class MilkCondiment extends Condiment {

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
