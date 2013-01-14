package CreationalPatterns.factoryMethod;

//Concrete Rupee Class code
class Rupee implements Currency {

	@Override
	public String getSymbol() {
		return "Rs";
	}

}
