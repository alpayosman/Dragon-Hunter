package Game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GameOS {
	
	public static void main(String[] args) {
		new GameOS();
		
        
    }
	public GameOS() {
		JFrame frame = new JFrame("GAMEOS");
		frame.pack();
		frame.setSize(810, 550);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Map map = new Map();
       
        frame.add(map);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
	}
	public class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
		}
		
	}
}

