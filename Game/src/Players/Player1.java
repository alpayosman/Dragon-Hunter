package Players;
import java.awt.Graphics2D;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import Game.Dragon;
import Game.Position;

public class Player1 extends Position{
	Dragon dragon;
	private String playerImage = "/images/Player.png";
	int keyX = 0;
	int keyY = 0;
	int keyZ = 0;
	public int health;
	private int attack=30;
	private int armor=0;
	
	public Player1 (int x, int y, int health) {
		super(x,y);
		this.health=health;	
	}
	public int getHealth() {
		return health;
	}
	public void getDamage(int i ) {
		if(armor>0) {
			armor-=i;	
	     }else{
		  health-=i;
	     }
	}
	public void plusHealth(int i) {
		int total=health+i;
		if(total>100) {
			health=100;
		}else {
			health=total;
		}
		
	}
	public int getArmor() {
		return armor;
	}
	
	public void updateArmor(int i) {
		armor+=i;
	}
	
	public void update() {
		if(x<-152) {
			x=-152;
		}else if(x>178) {
			x=178;
		}if(y<-127) {
			y=-127;
		}else if(y>203) {
			y=203;
		}
		
	}
	public void wall() {
		x-=30;
	}
	public void wall1() {
		x+=30;
	}
	public void wall2() {
		y+=30;
	}
	
	public void shut() {
		x=178;
		y=203;
	}
	public void getSword(int i) {
		attack+=i;
	}
	public void getBombDamage(int i) {
		health-=i;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public void moveLeftUp() {
		keyZ=-30;
		x+=keyZ;
		y+=keyZ;
		
	}
	public void moveRightDown() {
		keyZ=+30;
		x+=keyZ;
		y+=keyZ;
	}
	
	public void moveRight() {
		keyX=+30;
		x+=keyX;
	}
	public void moveLeft() {
		keyX=-30;
		x+=keyX;	
	}
	public void moveUp() {
		keyY=-30;
		y+=keyY;
	}
	public void moveDown() {
		keyY=+30;
		y+=keyY;
	}
	public void keyPressed(KeyEvent e) {
	if(health>0) {	
		int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_E) { 
			System.out.println("Key Pressed "+ e.getKeyChar()+" to move right-down");
			moveRightDown();
		}
		if(key==KeyEvent.VK_Q) { 
			System.out.println("Key Pressed "+ e.getKeyChar()+" to move left-up");
			moveLeftUp();
		}
		if(key==KeyEvent.VK_D) { 
			System.out.println("Key Pressed "+ e.getKeyChar()+" to move right");
			moveRight();
		}
		if(key==KeyEvent.VK_A) {
			System.out.println("Key Pressed "+ e.getKeyChar()+" to move left");
			moveLeft();
		}
		if(key==KeyEvent.VK_W) {
			System.out.println("Key Pressed "+ e.getKeyChar()+" to up");
			moveUp();
		}
		if(key==KeyEvent.VK_S) {
			System.out.println("Key Pressed "+ e.getKeyChar()+" to down");
			moveDown();
		}
	}else {
		
	}
		
	}

	public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
		
        if(key==KeyEvent.VK_E) {
			
		}if(key==KeyEvent.VK_Q) {
			
		}if(key==KeyEvent.VK_D) {
			
		}if(key==KeyEvent.VK_A) {
			
		}if(key==KeyEvent.VK_W) {
			
		}if(key==KeyEvent.VK_S) {
			
		}
		
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), x, y, null);
		
       
	}
	public Image getPlayerImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(playerImage));
		return i.getImage();
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
}
	

