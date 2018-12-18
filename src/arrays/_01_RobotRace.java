package arrays;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class _01_RobotRace {
	public static void main(String[] args) {
		
	
		Robot[] bot = new Robot[30];
		for (int i = 0; i < bot.length; i++) {
			bot[i] = new Robot();
			bot[i].miniaturize();
		}
		for (int i = 0; i < bot.length; i++) {
			bot[i].setY(10+i*20);
			bot[i].setX(0);
			bot[i].setAngle(90);
		}
	
		Random rand = new Random();
		int x = 1;

			while ( x > 0) {
				
				
			
		
		for (int o = 0; o < bot.length; o++) {
			bot[o].setSpeed(100);
			bot[o].move(rand.nextInt(51));
			if (bot[o].getX() > 800 ) {
				x-=1;
				JOptionPane.showMessageDialog(null, "#" + o + " Won! Congrates!");
				System.exit(0);
			}
			}
		
		
		
		}

	

	




	}
}
