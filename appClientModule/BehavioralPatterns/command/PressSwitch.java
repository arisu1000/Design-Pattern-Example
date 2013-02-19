package BehavioralPatterns.command;


/* �׽�Ʈ Ŭ����  */
public class PressSwitch {
   public static void main(String[] args){
      Light lamp = new Light();
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);
 
      Switch s = new Switch();
 
      //�� �κ� �ּ� �ڵ� �����ϸ鼭 �۵�Ȯ��.
      String CommandStr = "ON";
//      String CommandStr = "OFF";
      
      try {
         if (CommandStr.equalsIgnoreCase("ON")) {
            s.storeAndExecute(switchUp);
         }
         else if (CommandStr.equalsIgnoreCase("OFF")) {
            s.storeAndExecute(switchDown);
         }
         else {
            System.out.println("Argument \"ON\" or \"OFF\" is required.");
         }
      } catch (Exception e) {
         System.out.println("Arguments required.");
      }
   }
}