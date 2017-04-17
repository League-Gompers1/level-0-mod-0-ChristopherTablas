

import org.jointheleague.graphical.robot.Robot;


public class RobotName {
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
    	Robot name = new Robot();   

      name.penDown();
      
      name.setSpeed(10);
      
      name.turn(-90);
      
      name.move(200);
      
      name.turn(90);
      
      name.move(200);
      
      name.turn(90);
      
      name.move(200);
      
      name.penUp();
      
      name.move(50);
      
      name.penDown();
      
      name.move(200);
      
      name.move(-100);
      
      name.turn(90);
      
      name.move(200);      
      
      name.penUp();
      
      name.turn(90);
      
      name.move(800);
      
      for (int i = 0; i < 4; i++) {
    	 
    	  name.move(200);
    	  
    	  name.turn(90);
    	  
    	  
        }
      }
      
    	}
     }
