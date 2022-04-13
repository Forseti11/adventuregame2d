package adventuregame.view;

import adventuregame.model.GameScreen;
import adventuregame.model.Tile;
import grid.CoordinateItem;

public interface GameViewable {
	
    int getRows();

    int getCols();

    GameScreen getGameScreen();

    Iterable<CoordinateItem<Tile>> tilesOnBoard();

}
