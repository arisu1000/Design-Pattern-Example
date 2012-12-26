package CreationalPatterns.builder;

public class BuilderExample {

	/**
	 * A customer ordering a pizza
	 */
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
 
        //이 부분에서 hawaiianPizzaBuilder, spicyPizzaBuilder를 번갈아서 입력하면서 출력되는 내용을 확인해 보면 됨.
        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.constructPizza();
 
        Pizza pizza = waiter.getPizza();
        
        System.out.println(pizza.getDough());
        System.out.println(pizza.getSauce());
        System.out.println(pizza.getTopping());
	}

}
