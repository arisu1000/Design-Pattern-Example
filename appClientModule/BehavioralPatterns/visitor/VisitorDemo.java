package BehavioralPatterns.visitor;

public class VisitorDemo {
    static public void main(String[] args) {
        CarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}