package BehavioralPatterns.command;

/* ����Ʈ�� ���� ���(Ŀ�ǵ�) - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
   private Light theLight;
 
   public FlipDownCommand(Light light) {
      this.theLight = light;
   }
 
   public void execute() {
      theLight.turnOff();
   }
}