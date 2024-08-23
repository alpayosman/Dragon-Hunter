package Game;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Sword extends Position{
	
	private String swordImage = "/images/Sword_.png";
	private int attack=20;
	
	public Sword(int x, int y) {
		super(x,y);
		
	}
	 public int getAttack() {
		return attack;
	}
	public void shut() {
			x=1000;
			y=1000;
	 }
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getSwordImage(), x, y, null);
	}
	public Image getSwordImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(swordImage));
		return i.getImage();
	}

}
