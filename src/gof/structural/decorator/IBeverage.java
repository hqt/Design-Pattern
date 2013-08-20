package gof.structural.decorator;

// defines the interface for objects that can have responsibilities added to them dynamically.
// those interface is using for decorator
public interface IBeverage {
	public double cost();
	public void ingredient();
}
