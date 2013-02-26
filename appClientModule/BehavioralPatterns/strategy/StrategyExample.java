package BehavioralPatterns.strategy;


/** Tests the pattern */
class StrategyExample {
   public static void main(String[] args) {
       Context context;

       // Three contexts following different strategies
       context = new Context(new Add());
       int resultA = context.executeStrategy(3,4);

       context = new Context(new Subtract());
       int resultB = context.executeStrategy(3,4);

       context = new Context(new Multiply());
       int resultC = context.executeStrategy(3,4);

       System.out.println("Result A : " + resultA );
       System.out.println("Result B : " + resultB );
       System.out.println("Result C : " + resultC );
   }
}