package Game;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Apple extends Position{

	private String appleImage = "/images/Apple_.png";
	private int health = 15;
	
	public int getHealth() {
		return health;
	}
	public Apple(int x, int y) {
		
		super(x,y);
	}
	 public void update() {
			
	}
	 public void shut() {
		 x=1000;
		 y=1000;
	 }
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getAppleImage(), x, y, null);
	}
	public Image getAppleImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(appleImage));
		return i.getImage();
	}
}
