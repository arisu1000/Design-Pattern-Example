package BehavioralPatterns.command;


/* 테스트 클래스  */
public class PressSwitch {
   public static void main(String[] args){
      Light lamp = new Light();
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);
 
      Switch s = new Switch();
 
      //이 부분 주석 코드 변경하면서 작동확인.
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