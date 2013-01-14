package CreationalPatterns.factoryMethod;

//Factory client code
public class Factory {

	public static void main(String[] args) {

		//아래 부분에서 주석 변경하면서 출력되는 코드 테스트
		String country = "India";
//		String country = "Singapore";
//		String country = "US";
		
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
	}

}
