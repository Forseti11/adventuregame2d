package adventuregame.controller;

import adventuregame.model.GameScreen;

public interface GameControllable {
	
	GameScreen getGameScreen();
	
	public int timeBetweenUpdate();
	
	//TODO: need this one?
//	void clockTick();

}
