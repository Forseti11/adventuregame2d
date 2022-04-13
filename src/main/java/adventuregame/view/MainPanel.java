package adventuregame.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 8790546409976391689L;
	
	JPanel topPanel = new TopPanel();
	JPanel gamePanel = new GamePanel();
	Dimension border = new Dimension(0, 3);

	public MainPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.YELLOW);
		this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.add(topPanel);
		this.add(Box.createRigidArea(border));
		this.add(gamePanel);
	}

}