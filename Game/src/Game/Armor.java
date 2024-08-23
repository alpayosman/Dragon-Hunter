package Game;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Armor extends Position{
	private String armorImage ="/images/Armor_.png";
	public int armor=35;
	
	public int getArmor() {
		return armor;
	}

	public Armor(int x, int y) {
		super(x,y);
	}
	
    public void shut() {
    	x=1000;
    	y=1000;
    }
    
    public void draw(Graphics2D g2d) {
		g2d.drawImage(getArmorImage(), x, y, null);
	}
    public Image getArmorImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(armorImage));
		return i.getImage();
	}
}
