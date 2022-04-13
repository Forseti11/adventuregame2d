package adventuregame.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private static final long serialVersionUID = -5726517087241114112L;

	public GamePanel() {
		setBackground(Color.BLACK);
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public Dimension preferredSize() {
        return new Dimension(768, 576);
    }

}
