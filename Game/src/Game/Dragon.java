package Game;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Dragon extends Position{
	private String dragonImage ="/images/Red_Dragon.png";
	public int health;
	private int damage;
	private String name;
	
	public Dragon(int x, int y, int damage,int health) {
		super(x,y);
		this.damage=damage;
		this.health=health;
		
	}
	public void updateHealth(int i) {
		
		health-=i;
	}

	public void update() {
		if(health<=0) {
			x=1000;
			y=1000;
		}
		
	}
	
	
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getDragonImage(), x, y, null);
	}

	public Image getDragonImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(dragonImage));
		return i.getImage();
	}
	public int getHealth() {
		return health;
	}
	public int getDamage() {
		return damage;
	}
	public String getName() {
		return name;
	}
	
	

}
