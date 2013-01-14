package CreationalPatterns.protype;

public class PrototypeTest {
	public static void main(String args[]) throws CloneNotSupportedException{
		PrototypeImpl prototype = new PrototypeImpl(1000);
		 
        for (int y = 1; y < 10; y++) {
            // ������Ÿ���� ��ü prototype�� �̿��ؼ� tempotype ��ü�� ������.
            Prototype tempotype = prototype.clone();
 
            // Derive a new value from the prototype's "x" value
            tempotype.setX(tempotype.getX() * y);
            tempotype.printX();
        }

	}
}
