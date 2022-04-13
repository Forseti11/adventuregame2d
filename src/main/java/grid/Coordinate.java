package grid;

public class Coordinate {
	public final int row;
	public final int col;
	
	/**
	 * Constructor that creates a new coordinate on the grid
	 * 
	 * @param row The row-index
	 * @param col The column-index
	 */
	public Coordinate(int row, int col) {
		this.row = row;
		this.col = col;
	}

// TODO: why do I get an error here?
//	@Override
//	public int hashCode() {
//		return Objects.hash(col, row);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		return col == other.col && row == other.row;
	}
	
	

}
