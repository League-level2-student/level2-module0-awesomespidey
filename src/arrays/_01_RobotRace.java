package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] robots = new Robot[10];
	for (int i = 0; i < robots.length; i++) {
	robots[i]=new Robot();	
	}

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
	int x= 50 ;
	//4. make each robot start at the bottom of the screen, side by side, facing up
	for (int i = 0; i < robots.length; i++) {
		robots [i].moveTo(x,550);
		robots [i].penDown();
		robots [i].setPenColor(0,0,100);
		robots [i].setPenWidth(100);
		x+=120;
	
	}
	
	Random randy = new Random();
	boolean finished = false;
	while(!finished) {
	for (int i = 0; i < robots.length; i++) {
		robots [i].setSpeed(randy.nextInt(9));
			robots[i].move(30);
			
		
		if(robots[i].getY()<=0) {
			finished = true ;
			robots[i].sparkle();
			
		}
	}
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}