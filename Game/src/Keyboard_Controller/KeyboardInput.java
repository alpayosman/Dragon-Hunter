package Keyboard_Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import Players.Player2;

public class KeyboardInput extends KeyAdapter{

	Player2 p2;

	public KeyboardInput(Player2 p2) {
		this.p2 = p2;
	}
	public void keyPressed(KeyEvent e) {
		p2.keyPressed(e);	
	}
	public void keyReleased(KeyEvent e) {
		p2.keyReleased(e);
	}
}
