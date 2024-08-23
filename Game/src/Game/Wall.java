package Game;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Wall extends Position{

	private String wallImage ="/images/Wall.png";
	
	public Wall(int x, int y) {
		super(x,y);
		
	}
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getWallImage(), x, y, null);
	}
	
	public Image getWallImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(wallImage));
		return i.getImage();
	}
}
