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
