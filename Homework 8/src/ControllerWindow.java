import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControllerWindow extends ObserverWindow {
	private int nTaps;
	private JButton tapButton;
	private JFrame subjectFrame;
	private PropertyWindow prop;
	

	
	ControllerWindow(ObserverWindow prep) {
		//Initialize the action that will be observed.
		nTaps = 0;
		prop = new PropertyWindow();
		prop.addPropertyChangeListener(e -> label.setText((String) e.getNewValue()));
		

		// Build the window frame for the observed subject.
		buildWindowFrame();

		// Register the action that will be observed.
		registerTapObservedAction();
	}

	private void buildWindowFrame() {
		subjectFrame = new JFrame("Subject being Observed");
		tapButton = new JButton("Tap me");
		subjectFrame.add(tapButton);
		subjectFrame.setSize(250, 150);
		subjectFrame.setLocation(600, 200);
		subjectFrame.setVisible(true);
	}

	private void registerTapObservedAction() {
		tapButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "   Subject was tapped: " + ++nTaps;
				prop.setMessage(data);
			}
		});
	}
}
