package adventuregame.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TopPanel extends JPanel {

	private static final long serialVersionUID = -2131464831888223600L;

	public TopPanel() {
		setBackground(Color.RED);
	}

	 @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public Dimension preferredSize() {
        return new Dimension(768, 144);
    }
	
}
