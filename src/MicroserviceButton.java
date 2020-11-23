import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MicroserviceButton extends JButton {
	private MicroserviceButton() {
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
	}
	
	public MicroserviceButton(String name, final Runnable action) {
		this();
		this.setText(name);
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				action.run();
			}
		});
	}

}
