package adventuregame.model;

public class GameModel  {

	private static final long serialVersionUID = 1424656247929902011L;

	private static final int originalTileSize = 32;
	private static final int scale = 2;
	private static final int tileSize = originalTileSize * scale;
	
	private static final int maxScreenRow = 16;
	private static final int maxScreenCol = 12;
	private static final int screenHeight = tileSize * maxScreenRow;
	private static final int screenWidth = tileSize * maxScreenCol;
	
	//FPS
	private static final int FPS = 60;
	private static final int MS_BETWEEN_UPDATES = 1000/FPS;
	
	private WorldMap worldMap;
	
	public GameModel(WorldMap worldMap) {
		 this.worldMap = worldMap;
		
	}
}
