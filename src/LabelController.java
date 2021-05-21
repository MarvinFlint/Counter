import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// implements ActionListener means this class is responsible for registering / handling events, such as mouse-input
// a method called "addActionListener" can be assigned to interactive components (such as buttons) which receives
// an object of a class that implements ActionListener as parameter [look in CounterApp.java, line 30]
public class LabelController implements ActionListener {

    JLabel counterLabel;
    Counter counter;

    // constructor
    public LabelController(JLabel counterLabel, Counter counter) {
        this.counterLabel = counterLabel;
        this.counter = counter;
    }

    // overwrites the actionPerformed()-method
    @Override
    public void actionPerformed(ActionEvent e) {
        // calls on the increment()-method. counter here is the Counter-object from line 11 / 15
        // the method increases the variable "counter" of the Counter-object
        counter.increment();
        // pack the value of the variable counter into a string. Integer.toString() converts a number into text
        String newLabelText = Integer.toString(counter.getCounter());
        // overwrites what is currently in the counterLabel-Label, which is a JLabel
        counterLabel.setText(newLabelText);
    }

}
