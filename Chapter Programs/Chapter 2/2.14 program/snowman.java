
/**
 * Demonstaights basic drawing methods
 * 
 * @author Alex Probst
 * @version -0.0.1
 */

import java.applet.Applet;
import java.awt.*;

public class snowman extends Applet
{
    public void paint (Graphics page)
    {
        final int MID = 150;
        final int TOP = 50;
        
        setBackground (Color.cyan);
        
        page.setColor (Color.blue);
        page.fillRect (0, 175, 300, 50); //ground
        
        page.setColor (Color.yellow);
        page.fillOval (250, -40, 80, 80); //sun
        
        page.setColor (Color.white);
        page.fillOval (MID+0, TOP, 40, 40); //head
        page.fillOval (MID-15, TOP+35, 70, 50); //upper torso
        page.fillOval (MID-30, TOP+80, 100, 60); //lower torso
        
        page.setColor (Color.red);
        page.fillOval (MID+17, TOP+45, 5, 5); //top button
        page.fillOval (MID+17, TOP+65, 5, 5); //bottom button
        
        page.setColor (Color.black);
        page.fillOval (MID+10, TOP+10, 5, 5); //left eye
        page.fillOval (MID+25, TOP+10, 5, 5); //left right
        
        page.drawArc (MID+10, TOP+20, 20, 10, -190, -160); //simle
        
        page.drawLine (MID-5, TOP+60, MID-50, TOP+40); //left arm
        page.drawLine (MID+45, TOP+60, MID+70, TOP+60); //right arm
        
        page.drawLine (MID-0, TOP+5, MID+40, TOP+5); //brim of hat
        page.fillRect (MID+5, TOP-20, 30, 25); //top of hat
        
        page.drawString ("Chris", 5, 15); //my name
    }
}
