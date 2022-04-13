package adventuregame.model;

import java.awt.image.BufferedImage;

public class Tile {
	
	public final BufferedImage image;
	private boolean collision = true;
	
	public Tile(BufferedImage image, boolean collision) {
		this.image = image;
		this.collision = collision;
	}
	
	
	public boolean getCollision() {
		return collision;
	}
	
	public void setCollision(boolean collision) {
		this.collision = collision;
	}

}
