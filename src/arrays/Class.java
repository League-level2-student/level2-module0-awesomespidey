package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Class {
public static void main(String[] args) {
	Robot r1 = new Robot();
			Robot r2 = new Robot();
			Robot r3 = new Robot();
			r1.setX(50);
			Random randy = new Random();

			Thread t1 = new Thread(()->{
			    
				for(int i=0; i<200; i++){
			        r1.setSpeed(randy.nextInt(11));
			        r1.move(5);

			        if(r1.getY() <= 0){
			            JOptionPane.showMessageDialog(null, "Robot 1 won the race!");
			        }
			    }
			});

			Thread t2 = new Thread(()->{
			   r2.setX(100);
				for(int i=0; i<200; i++){
			        r2.setSpeed(randy.nextInt(11));
			        r2.move(5);
			   
			       if(r2.getY() <= 0){
			            JOptionPane.showMessageDialog(null, "Robot 2 won the race!");
			        }
			    }
			    
			});

			Thread t3 = new Thread(()->{
			    for(int i=0; i<200; i++){
			        r3.setSpeed(randy.nextInt(11));
			        r3.move(5);
			    }
			    if(r3.getY() <= 0){
			            JOptionPane.showMessageDialog(null, "Robot 3 won the race!");
			        }
			});

			t1.start();
			t2.start();
			t3.start();

}
}
