package Game;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;


public class Bomb extends Position{
	private String bombImage ="/images/bomb_.png";
	public int damage;

	public Bomb(int x, int y, int damage) {
		super(x,y);
		this.damage=damage;
	}
	
    public int getDamage() {
		return damage;
	}
    public void shut() {
    	x=1000;
    	y=1000;
    }
	
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getBombImage(), x, y, null);
	}
	
	public Image getBombImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(bombImage));
		return i.getImage();
	}
}
