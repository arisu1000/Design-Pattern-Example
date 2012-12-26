package CreationalPatterns.builder;

public class BuilderExample {

	/**
	 * A customer ordering a pizza
	 */
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
 
        //�� �κп��� hawaiianPizzaBuilder, spicyPizzaBuilder�� �����Ƽ� �Է��ϸ鼭 ��µǴ� ������ Ȯ���� ���� ��.
        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.constructPizza();
 
        Pizza pizza = waiter.getPizza();
        
        System.out.println(pizza.getDough());
        System.out.println(pizza.getSauce());
        System.out.println(pizza.getTopping());
	}

}
