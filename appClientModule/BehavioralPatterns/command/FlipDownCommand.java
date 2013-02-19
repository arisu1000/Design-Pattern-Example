package BehavioralPatterns.command;

/* 라이트를 끄는 명령(커맨드) - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
   private Light theLight;
 
   public FlipDownCommand(Light light) {
      this.theLight = light;
   }
 
   public void execute() {
      theLight.turnOff();
   }
}