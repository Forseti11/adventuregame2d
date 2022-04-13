package grid;

import java.util.Arrays;
import java.util.List;

public enum Direction {
	NORTH,
	EAST,
	SOUTH,
	WEST;
	
	
	public static final List<Direction> FOUR_DIRECTIONS = Arrays.asList(
			NORTH,
			EAST,
			SOUTH,
			WEST);
	
}
