package BehavioralPatterns.mediator;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import BehavioralPatterns.command.Command;

//A concrete colleague
public class BtnSearch extends JButton implements Command {

	IMediator med;
	 
    BtnSearch(ActionListener al, IMediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }
 
    public void execute() {
        med.search();
    }

}
