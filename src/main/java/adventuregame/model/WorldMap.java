package adventuregame.model;

import grid.Grid;

public class WorldMap extends Grid<Tile> {
	
	/**
	 * Constructs a world map with the given dimensions and default vaue = null.
	 * 
	 * @param rows Number of rows
	 * @param cols Number of columns
	 */
	public WorldMap(int rows, int cols) {
		super(rows, cols, null);
	}
	
	

}
