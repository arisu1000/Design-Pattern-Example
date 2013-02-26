package BehavioralPatterns.visitor;

public interface CarElement {
	void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}
