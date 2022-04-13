package adventuregame.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import adventuregame.model.GameScreen;
import adventuregame.view.GamePanel;


public class GameController implements KeyListener, ActionListener {
	private GameControllable model;
	GamePanel gamePanel;
	private Timer timer;
	
	public GameController(GameControllable model, GamePanel gamePanel) {
		this.model = model;
		this.gamePanel = gamePanel;
		this.gamePanel.addKeyListener(this);
		this.timer = new Timer(model.timeBetweenUpdate(), this);
		timer.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (model.getGameScreen() == GameScreen.ACTIVE_GAME) {
//			model.clockTick();
//			this.GamePanel.repaint();
//			this.setDelay();
		}
		
	}

}
