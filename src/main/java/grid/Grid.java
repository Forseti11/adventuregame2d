package grid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grid<E> implements IGrid<E> {
	int rows;
	int columns;
	List<List<E>> map;
	
	public Grid(int row, int col) {
		this(row, col, null);
	}
	
	public Grid(int row, int col, E defaultValue) {
		this.rows = row;
		this.columns = col;
		this.map = new ArrayList<>(row);
		for (int i = 0; i < row; i++) {
			List<E> rows = new ArrayList<>(col);
			for (int j = 0; j < col; j++) {
				rows.add(defaultValue);
			}
			this.map.add(rows);
		}
	}

	@Override
	public Iterator<CoordinateItem<E>> iterator() {
		ArrayList<CoordinateItem<E>> itemIterator = new ArrayList<>();
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				itemIterator.add(new CoordinateItem<>(new Coordinate(i, j), map.get(i).get(j)));
			}
		}
		return itemIterator.iterator();
	}
	
	@Override
	public int getColumns() {
		return this.columns;
	}
	@Override
	public int getRows() {
		return this.rows;
	}
	@Override
	public void set(Coordinate coordinate, E value) {
		if (!coordinateIsOnGrid(coordinate)) {
			throw new IndexOutOfBoundsException("Coordinates out of bounds");
		}
		map.get(coordinate.row).set(coordinate.col, value);
	}
	
	@Override
	public E get(Coordinate coordinate) {
		if (!coordinateIsOnGrid(coordinate)) {
			throw new IndexOutOfBoundsException("Coordinates out of bounds");
		}
		return map.get(coordinate.row).get(coordinate.col);
	}
	
	@Override
	public boolean coordinateIsOnGrid(Coordinate coordinate) {
		if (coordinate.row >= 0 && coordinate.row < this.rows) {
			return coordinate.col >= 0 && coordinate.col < this.columns;
		}
		return false;
	}

}
