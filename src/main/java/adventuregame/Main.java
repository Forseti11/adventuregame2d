package adventuregame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import adventuregame.view.MainPanel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Adventure Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel gamePanel = new MainPanel();
		frame.setContentPane(gamePanel);
		
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
