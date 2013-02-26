package BehavioralPatterns.mediator;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import BehavioralPatterns.command.Command;

//A concrete colleague
public class BtnBook extends JButton implements Command {


    IMediator med;
 
    BtnBook(ActionListener al, IMediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }
 
    public void execute() {
        med.book();
    }

}
