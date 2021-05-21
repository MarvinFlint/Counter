import javax.swing.*;
import java.awt.*;

public class CounterApp extends JFrame {

    // Counter object
    Counter counter;

    // Button
    JButton myButton;
    // Text label
    JLabel textLabel;
    // Label for the counter
    JLabel counterLabel;

    public CounterApp() {
        // creates a new Counter-object
        // by default, has just an unset int "counter"
        counter = new Counter();

        // GUI stuff
        setTitle("Button Click Counter");
        setSize(400,100);
        setLayout(new FlowLayout());

        // create the button
        myButton = new JButton("Click me!");
        // add button to layout
        add(myButton);

        // set the text-label
        textLabel = new JLabel("Number of clicks: ");
        // set initial state of the counter-label, which is 0
        counterLabel = new JLabel("0");
        // add both labels to the layout
        add(textLabel);
        add(counterLabel);

        //Controller
        // creates a new object of the type "LabelController", parameters are a JLabel and a Counter object
        LabelController controller = new LabelController(counterLabel,counter);
        // the myButton-element receives an event-listener. Upon registering an event, the object in the parameter-field
        // (in this case, controller, which is a LabelController object)
        // will make a call on its "actionPerformed()"-method [LabelController.java, line 18]
        myButton.addActionListener(controller);
    }

}
