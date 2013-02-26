package BehavioralPatterns.mediator;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import BehavioralPatterns.command.Command;

//A concrete colleague
public class BtnView extends JButton implements Command {

	IMediator med;
	 
    BtnView(ActionListener al, IMediator m) {
        super("View");
        addActionListener(al);
        med = m;
        med.registerView(this);
    }
 
    public void execute() {
        med.view();
    }
 
}
