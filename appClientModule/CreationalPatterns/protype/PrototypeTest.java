package CreationalPatterns.protype;

public class PrototypeTest {
	public static void main(String args[]) throws CloneNotSupportedException{
		PrototypeImpl prototype = new PrototypeImpl(1000);
		 
        for (int y = 1; y < 10; y++) {
            // 프로토타입형 객체 prototype를 이용해서 tempotype 객체를 생성함.
            Prototype tempotype = prototype.clone();
 
            // Derive a new value from the prototype's "x" value
            tempotype.setX(tempotype.getX() * y);
            tempotype.printX();
        }

	}
}
