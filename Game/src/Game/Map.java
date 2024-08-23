package Game;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import Keyboard_Controller.KeyInput;
import Keyboard_Controller.KeyboardInput;
import Players.Player1;
import Players.Player2;

public class Map extends JPanel implements ActionListener{

	
	Player1 p1;
	Player2 p2;
	Dragon red_d;
	Bomb bomb,bomb1,bomb2,bomb3,bomb4,bomb5;
	Armor armor1,armor2,armor3;
	Sword sword1,sword2,sword3;
	Apple apple1,apple2,apple3;
	Wall wall1,wall2,wall3,wall4,wall5,wall6,wall7;
	Timer maplooper;
	String S ="Welcome to GameOS!";
	String S1 ="Red Controllers: W-A-S-D-Q-E";
	String S2 ="[W to up]"+" [A to rigth]"+" [D to left]"+" [S to down]";
	String S3 ="[Q to left-up]"+"-[E to rigth-down]";
	String S4 ="Blue Controllers: UP-LEFT-DOWN-RIGTH-SPACE-ENTER buttons";
	String S5 ="[UP to up]"+" [RIGTH to rigth]"+" [LEFT to left]"+" [DOWN to down]";
	String S6 ="[ENTER to left-up]"+" [SPACE to rigth-down]";
	String S7 ="If you would defeat Dragons you will win game!";
	int a=-152,a1=-105,a2=-90;
	int b=-152,b1=30,b2=15,b3=178,b4=30,b5=15,b6=-122,b7=-90,b8=-105;
	int c=178,c1=-127,c2=-2,c3=75,c4=46,c5=-152,c6=-60,c7=-75;
	int d=28,d1=90,d2=75,d3=28,d4=-90,d5=-105,d6=-152,d7=-127;
	int f=178,f1=-105,f2=-90,f3=148,f4=-105,f5=-90,f6=148,f7=-127,f8=-92,f9=-14,f10=0,f11=-122,f12=-60,f13=-75,f14=28,f15=-127;
	
	public Map() {
		setFocusable(true);
		maplooper = new Timer(10,this);
		maplooper.start();
		p1 = new Player1(178,203,100);
		p2 = new Player2(-152,203,100);
		red_d = new Dragon(-155,-115,35,300);
	    bomb = new Bomb(-130,-100,20); bomb1 = new Bomb(-100,-40,20);
	    bomb2 = new Bomb(140,-128,20); bomb3 = new Bomb(173,-128,20); bomb4 = new Bomb(141,-157,20);bomb5 = new Bomb(23,-158,20);
	    apple1 = new Apple(-5,25); apple2 = new Apple(176,-157); apple3 = new Apple(-153,-95);
	    sword1 = new Sword(-157,-155); sword2 = new Sword(27,55); sword3 = new Sword(27,-123);
	    armor1 = new Armor(170,-8); armor2 = new Armor(-130,-130); armor3 = new Armor(-160,-8);
	    wall1 = new Wall(-125,-155); wall2 = new Wall(55,-155); wall3 = new Wall(-5,-125); wall4 = new Wall(55,-125);
	    wall5= new Wall(-5,-95); wall6= new Wall(25,-95); wall7 = new Wall(55,-95);
		addKeyListener(new KeyInput(p1));
		addKeyListener(new KeyboardInput(p2));
		
	}
	@Override
	public void paint(Graphics g) {
	        super.paint(g);
	        Graphics2D g2d = (Graphics2D) g.create();
	        for (int x = 30; x <= 300; x += 30 )
	           	 for (int y = 30; y <= 300; y += 30) 
	           	 g.drawRect(x, y, 90, 90);
	       
	        g.drawRect(420 ,30 , 370,150);
	        g.drawString(S, 430,20); g.drawString(S1,425 ,45);
	        g.drawString(S2,425 ,60); g.drawString(S3,425 ,75);
	        g.drawLine(420, 80, 785, 80); g.drawLine(420, 130, 785, 130);
	        g.drawString(S4,425 ,95); g.drawString(S5,425 ,110);
	        g.drawString(S6,425 ,125); g.drawString(S7.toUpperCase(), 425, 145);
	        p1.draw(g2d);p2.draw(g2d);
	       	red_d.draw(g2d);
	       	bomb.draw(g2d); bomb1.draw(g2d); bomb2.draw(g2d); bomb3.draw(g2d); bomb4.draw(g2d);bomb5.draw(g2d);
	       	sword1.draw(g2d); sword2.draw(g2d); sword3.draw(g2d);
	       	armor1.draw(g2d); armor2.draw(g2d); armor3.draw(g2d);
	       	apple1.draw(g2d); apple2.draw(g2d); apple3.draw(g2d);
	       	wall1.draw(g2d);wall3.draw(g2d);wall2.draw(g2d);wall4.draw(g2d);
	       	wall5.draw(g2d);wall6.draw(g2d);wall7.draw(g2d);
	       	Action();Action2();
	       	
	       	if(p1.getHealth()>=0 && p2.getHealth()>=0) {
	       	g.drawString("Red Health: "+p1.getHealth(), 425, 220);
	       	g.drawString("Red Armor: "+p1.getArmor(), 425, 240);
	       	g.drawString("Red Attack Damage: "+p1.getAttack(), 425, 260);
	    	g.drawString("Blue Health: "+p2.getHealth(), 425, 300);
	       	g.drawString("Blue Armor: "+p2.getArmor(), 425, 320);
	       	g.drawString("Blue Attack Damage: "+p2.getAttack(), 425, 340);
	       	g.drawString("Dragon Health: "+red_d.getHealth(),625,220);
	       	
	       	}else if(p1.getHealth()>=0 && p2.getHealth()<=0) {
	       		g.drawString("Red Health: "+p1.getHealth(), 425, 220);
		       	g.drawString("Red Armor: "+p1.getArmor(), 425, 240);
		       	g.drawString("Red Attack Damage: "+p1.getAttack(), 425, 260);
		       	g.drawString("Dragon Health: "+red_d.getHealth(),625,220);
		       	
	       	}else if(p1.getHealth()<=0 && p2.getHealth()<=0){
	       		g.drawString("GAME OVER", 425, 280);
	       		
	       	}if(red_d.getHealth()<=0) {
	       		g.drawString("YOU WIN!",425,280);
	       	}     	
    }
	public void actionPerformed(ActionEvent e) {
		p1.update();
		p2.update();
		red_d.update();
		repaint();
	}
	public void Action() {
	//Dragon and Player1 Attack
		if ((a==p1.x)&&(p1.y<a2 && p1.y>a1)) {
			p1.getDamage(red_d.getDamage());
			red_d.updateHealth(p1.getAttack());
			p1.shut();
			System.out.println("Red Armor: "+p1.getArmor());
		}
	//Get Armor
		if ((b==p1.x)&&(p1.y<b1 && p1.y>b2)) {
			p1.updateArmor(armor3.getArmor());
			armor3.shut();
			b=1000;b1=1000;b2=1000;
			System.out.println("Red Armor: "+p1.getArmor());
		}	
		if ((b3==p1.x)&&(p1.y<b4 && p1.y>b5)) {
			p1.updateArmor(armor1.getArmor());
			armor1.shut();
			b5=1000;b4=1000;b3=1000;
			System.out.println("Red Armor: "+p1.getArmor());
		}
		if ((b6==p1.x)&&(p1.y<b7 && p1.y>b8)) {
			p1.updateArmor(armor2.getArmor());
			armor2.shut();
			b6=1000;b7=1000;b8=1000;
			System.out.println("Red Armor: "+p1.getArmor());
		} 
	//Get Health	
		if ((c==p1.x)&&(p1.y==c1)) {
			if(p1.getHealth()!=100) {
			p1.plusHealth(apple2.getHealth());
			apple2.shut();
			c1=1000;c=1000;
			System.out.println("Red Health: "+p1.getHealth());
			}
		}
		if ((c2==p1.x)&&(p1.y<c3 && p1.y>c4)) {
			if(p1.getHealth()!=100) {
			p1.plusHealth(apple1.getHealth());
			apple1.shut();
			c2=1000;c3=1000;c4=1000;
			System.out.println("Red Health: "+p1.getHealth());
			}
		}
		if ((c5==p1.x)&&(p1.y<c6 && p1.y>c7)) {
			if(p1.getHealth()!=100) {
			p1.plusHealth(apple3.getHealth());
			apple3.shut();
			c5=1000;c6=1000;c7=1000;
			System.out.println("Red Health: "+p1.getHealth());
			}
		}
	//Get Sword	
		if((d==p1.x)&&(p1.y<d1 && p1.y>d2)) {
			p1.getSword(sword2.getAttack());
			sword2.shut();
			d=1000;d1=1000;d2=1000;
			System.out.println("Red Attack Damage: "+p1.getAttack());
		}
		if((d3==p1.x)&&(p1.y<d4 && p1.y>d5)) {
			p1.getSword(sword3.getAttack());
			sword3.shut();
			d3=1000;d4=1000;d5=1000;
			System.out.println("Red Attack Damage: "+p1.getAttack());
		}
		if((d6==p1.x)&&(p1.y==d7)) {
			p1.getSword(sword1.getAttack());
			sword1.shut();
			d6=1000;d7=1000;
			System.out.println("Red Attack Damage: "+p1.getAttack());
		}
    //Bomb Damage
		if((f==p1.x)&&(p1.y>f1 && p1.y<f2)){
		     p1.getBombDamage(bomb3.getDamage());
		     bomb3.shut();
		     f=1000;f1=1000;f2=1000;
		     System.out.println("Red Health: "+p1.getHealth());
		}
		if((f3==p1.x)&&(p1.y>f4 && p1.y<f5)){
		     p1.getBombDamage(bomb2.getDamage());
		     bomb2.shut();
		     f3=1000;f4=1000;f5=1000;
		     System.out.println("Red Health: "+p1.getHealth());
		}
		if((f6==p1.x)&&(p1.y==f7)){
		     p1.getBombDamage(bomb4.getDamage());
		     bomb4.shut();
		     f6=1000;f7=1000;
		     System.out.println("Red Health: "+p1.getHealth());
		}
		if((f8==p1.x)&&(p1.y>f9 && p1.y<f10)){
		     p1.getBombDamage(bomb1.getDamage());
		     bomb1.shut();
		     f8=1000;f9=1000;f10=1000;
		     System.out.println("Red Health: "+p1.getHealth());
		}
		if((f11==p1.x)&&(p1.y<f12 && p1.y>f13)){
		     p1.getBombDamage(bomb.getDamage());
		     bomb.shut();
		     f11=1000;f12=1000;f13=1000;
		     System.out.println("Red Health: "+p1.getHealth());
		}
		if((f14==p1.x)&&(p1.y==f15)){
		     p1.getBombDamage(bomb5.getDamage());
		     bomb5.shut();
		     f14=1000;f15=1000;
		     System.out.println("Red Health: "+p1.getHealth());
		}
	//Wall
		if((p1.x==58)&&(p1.y>=-127 && p1.y<-60)) {
			System.out.println("Wall");
			p1.wall1();
		}
		if((p1.x==-2)&&(p1.y>-104 && p1.y<-60)) {
			System.out.println("Wall");
			p1.wall();
		}
		if((p1.x==-122)&&(p1.y==-127)) {
			System.out.println("Wall");
			p1.wall1();
		}
		if((p1.x==28)&&(p1.y>-74 && p1.y<-60)) {
			System.out.println("Wall");
			p1.wall2();
		}
		
		
		
   }
	public void Action2() {
		//Dragon and Player2 Attack
				if ((a==p2.x)&&(p2.y<a2 && p2.y>a1)) {
					p2.getDamage(red_d.getDamage());
					red_d.updateHealth(p2.getAttack());
					p2.shut();
					System.out.println("Blue Armor:"+p2.getArmor());
				}
		//Get Armor
				if ((b==p2.x)&&(p2.y<b1 && p2.y>b2)) {
					p2.updateArmor(armor3.getArmor());
					armor3.shut();
					b=1000;b1=1000;b2=1000;
					System.out.println("Blue Armor:"+p2.getArmor());
				}	
				if ((b3==p2.x)&&(p2.y<b4 && p2.y>b5)) {
					p2.updateArmor(armor1.getArmor());
					armor1.shut();
					b5=1000;b4=1000;b3=1000;
					System.out.println("Blue Armor:"+p2.getArmor());
				}
				if ((b6==p2.x)&&(p2.y<b7 && p2.y>b8)) {
					p2.updateArmor(armor2.getArmor());
					armor2.shut();
					b6=1000;b7=1000;b8=1000;
					System.out.println("Blue Armor:"+p2.getArmor());
				} 
		//Get Health	
				if ((c==p2.x)&&(p2.y==c1)) {
					if(p2.getHealth()!=100) {
					p2.plusHealth(apple2.getHealth());
					apple2.shut();
					c1=1000;c=1000;
					System.out.println("Blue Health: "+p2.getHealth());
					}
				}
				if ((c2==p2.x)&&(p2.y<c3 && p2.y>c4)) {
					if(p2.getHealth()!=100) {
					p2.plusHealth(apple1.getHealth());
					apple1.shut();
					c2=1000;c3=1000;c4=1000;
					System.out.println("Blue Health: "+p2.getHealth());
					}
				}
				if ((c5==p2.x)&&(p2.y<c6 && p2.y>c7)) {
					if(p2.getHealth()!=100) {
					p2.plusHealth(apple3.getHealth());
					apple3.shut();
					c5=1000;c6=1000;c7=1000;
					System.out.println("Blue Health: "+p2.getHealth());
					}
				}
		//Get Sword	
				if((d==p2.x)&&(p2.y<d1 && p2.y>d2)) {
					p2.getSword(sword2.getAttack());
					sword2.shut();
					d=1000;d1=1000;d2=1000;
					System.out.println("Blue Attack Damage: "+p2.getAttack());
				}
				if((d3==p2.x)&&(p2.y<d4 && p2.y>d5)) {
					p2.getSword(sword3.getAttack());
					sword3.shut();
					d3=1000;d4=1000;d5=1000;
					System.out.println("Blue Attack Damage: "+p2.getAttack());
				}
				if((d6==p2.x)&&(p2.y==d7)) {
					p2.getSword(sword1.getAttack());
					sword1.shut();
					d6=1000;d7=1000;
					System.out.println("Blue Attack Damage: "+p2.getAttack());
				}
		 //Bomb Damage
				if((f==p2.x)&&(p2.y>f1 && p2.y<f2)){
				     p2.getBombDamage(bomb3.getDamage());
				     bomb3.shut();
				     f=1000;f1=1000;f2=1000;
				     System.out.println("Blue Health: "+p2.getHealth());
				}
				if((f3==p2.x)&&(p2.y>f4 && p2.y<f5)){
				     p2.getBombDamage(bomb2.getDamage());
				     bomb2.shut();
				     f3=1000;f4=1000;f5=1000;
				     System.out.println("Blue Health: "+p2.getHealth());
				}
				if((f6==p2.x)&&(p2.y==f7)){
				     p2.getBombDamage(bomb4.getDamage());
				     bomb4.shut();
				     f6=1000;f7=1000;
				     System.out.println("Blue Health: "+p2.getHealth());
				}
				if((f8==p2.x)&&(p2.y>f9 && p2.y<f10)){
				     p2.getBombDamage(bomb1.getDamage());
				     bomb1.shut();
				     f8=1000;f9=1000;f10=1000;
				     System.out.println("Blue Health: "+p2.getHealth());
				}
				if((f11==p2.x)&&(p2.y<f12 && p2.y>f13)){
				     p2.getBombDamage(bomb.getDamage());
				     bomb.shut();
				     f11=1000;f12=1000;f13=1000;
				     System.out.println("Blue Health: "+p2.getHealth());
				}
				if((f14==p2.x)&&(p2.y==f15)){
				     p2.getBombDamage(bomb5.getDamage());
				     bomb5.shut();
				     f14=1000;f15=1000;
				     System.out.println("Red Health: "+p2.getHealth());
				}
		  //Wall
				if((p2.x==58)&&(p2.y>=-127 && p2.y<-60)) {
					System.out.println("Wall");
					p2.wall1();
				}
				if((p2.x==-2)&&(p2.y>-104 && p2.y<-60)) {
					System.out.println("Wall");
					p2.wall();
				}
				if((p2.x==-122)&&(p2.y==-127)) {
					System.out.println("Wall");
					p2.wall1();
				}
				if((p2.x==28)&&(p2.y>-74 && p2.y<-60)) {
					System.out.println("Wall");
					p2.wall2();
				}
	}
}



