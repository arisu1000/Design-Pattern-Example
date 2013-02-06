package BehavioralPatterns.chainOfResponsibility;

public abstract class Logger {
	public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;
 
    //chain of responsibility의 다음 요소
    protected Logger next;
 
    public void setNext(Logger log) {
        next = log;
    }
 
    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }
 
    abstract protected void writeMessage(String msg);
}
