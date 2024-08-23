package Keyboard_Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import Players.Player1;


public class KeyInput extends KeyAdapter{

	Player1 p1;

	public KeyInput(Player1 p1) {
		this.p1= p1;
	}
	public void keyPressed(KeyEvent e) {
		p1.keyPressed(e);	
	}
	public void keyReleased(KeyEvent e) {
		p1.keyReleased(e);
	}
	
}
