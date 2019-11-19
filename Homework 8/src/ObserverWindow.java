
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObserverWindow {

protected JLabel label;

	// CONSTRUCTOR
	ObserverWindow() {
		JFrame frame = new JFrame("Observer Window");
		label = new JLabel("   I AM OBSERVING THE SUBJECT WINDOW.");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLocation(200, 200);
		frame.setVisible(true);
	}


}