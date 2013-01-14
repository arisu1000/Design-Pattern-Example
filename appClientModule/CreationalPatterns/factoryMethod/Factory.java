package CreationalPatterns.factoryMethod;

//Factory client code
public class Factory {

	public static void main(String[] args) {

		//�Ʒ� �κп��� �ּ� �����ϸ鼭 ��µǴ� �ڵ� �׽�Ʈ
		String country = "India";
//		String country = "Singapore";
//		String country = "US";
		
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
	}

}
