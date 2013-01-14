package CreationalPatterns.factoryMethod;

//Concrete US Dollar code
public class USDollar implements Currency {

	@Override
	public String getSymbol() {
		return "USD";
	}

}
