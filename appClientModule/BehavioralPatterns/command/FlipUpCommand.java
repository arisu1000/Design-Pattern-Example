package BehavioralPatterns.command;

/* 라이트를 켜는 명령(커맨드) - ConcreteCommand #1 */
public class FlipUpCommand implements Command {
   private Light theLight;
 
   public FlipUpCommand(Light light) {
      this.theLight = light;
   }
 
   public void execute(){
      theLight.turnOn();
   }
}