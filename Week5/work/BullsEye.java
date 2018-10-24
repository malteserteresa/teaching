package work;

import java.applet.Applet;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

class BullsEye extends JPanel { 
   //-----------------------------------------------------------------
   //  Paints a bullseye target.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)   {
      super.paintComponent(page);
     
      //DONT WORRY ABOUT THESE, THEY MIGHT BE USEFUL:
      final int MAX_WIDTH = 300, NUM_RINGS = 5, RING_WIDTH = 25;
      
      int x = 0, y = 0, diameter;
      diameter = MAX_WIDTH;


      setBackground (Color.cyan);
      page.setColor (Color.white);

      page.setColor (Color.black);
      page.fillOval (x, y, diameter, diameter);

//      diameter -= (2 * RING_WIDTH);
         
   }
   
}
     