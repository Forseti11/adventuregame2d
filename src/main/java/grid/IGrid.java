package grid;

public interface IGrid<E> extends Iterable<CoordinateItem<E>> {
	
	int getColumns();
	
	int getRows();
	
	void set(Coordinate coordinate, E value);
	
	E get(Coordinate coordinate);
	
	boolean coordinateIsOnGrid(Coordinate coordinate);

}
