package BehavioralPatterns.chainOfResponsibility;

public class ChainOfResponsibilityExample {
	private static Logger createChain() {
        // chain of responsibility ����
 
        Logger logger = new StdoutLogger(Logger.DEBUG);
 
        Logger logger1 = new EmailLogger(Logger.NOTICE);
        logger.setNext(logger1);
 
        Logger logger2 = new StderrLogger(Logger.ERR);        
        logger1.setNext(logger2);
 
        return logger;
    }
 
    public static void main(String[] args) {
 
        Logger chain = createChain();
 
        // StdoutLogger (level = 7) ���� ó����
        chain.message("Entering function y.", Logger.DEBUG);
 
        // StdoutLogger �� EmailLogger (level = 5)  ���� ó����
        chain.message("Step1 completed.", Logger.NOTICE);
 
        // 3���� logger ��ο��� ó����. (level = 3)
        chain.message("An error has occurred.", Logger.ERR);
    }
}
