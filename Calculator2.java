//Calculator2.java
//ITCS 
//Harish Viswa
//11.10.20

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Calculator2{
  
   public static void main(String[] args) {
    	// Dialogue box allows user input for the values to be calculated and parses them to doubles	
      double angleDegrees = Double.parseDouble(JOptionPane.showInputDialog("Please enter the angle in degrees"));
      double hypotenuse = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the hypotenuse"));
      int rise = Integer.parseInt(JOptionPane.showInputDialog("Please enter the rise of the line"));
      int run = Integer.parseInt(JOptionPane.showInputDialog("Please enter the run of the line"));
      
      System.out.println("X-Component: "+" = "+ getXComponent(angleDegrees,hypotenuse));
      System.out.println("Y-Component: "+" = "+getYComponent(angleDegrees,hypotenuse));
      
     plotLine(rise,run);
      
      }
      
      public static double getXComponent(double angleDegrees, double hypotenuse){
         double radian = Math.toRadians(angleDegrees);
         double cosine = Math.cos(radian);
         return cosine * hypotenuse;
         }
       
       public static double getYComponent(double angleDegrees, double hypotenuse){
         double radianY = Math.toRadians(angleDegrees);
         double sine = Math.sin(radianY);
         return sine * hypotenuse;
         }
      
      public static void plotLine(int rise, int run){
         Display.openWorld("");
         Display.setSize(20, 20);
         Display.setSpeed(5);
         Robot plot1 = new Robot(run, rise, Display.NORTH, 0);
         Robot plot2 = new Robot(2*run, 2*rise, Display.NORTH, 0);
         Robot plot3 = new Robot(3*run, 3*rise, Display.NORTH, 0);
         Robot plot4 = new Robot(4*run, 4*rise, Display.NORTH, 0);
         Robot plot5 = new Robot(5*run, 5*rise, Display.NORTH, 0);
         }
         
}
