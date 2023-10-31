import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DrawArcs extends JFrame {
   public DrawArcs()
   {
      super( "Drawing Arcs" );
      setSize( 300, 170 );
      show();
   }
   public void paint( Graphics g )
   {
      g.setColor( Color.yellow );
      g.drawRect( 15, 35, 80, 80 );
      g.setColor( Color.black );
      g.drawArc( 15, 35, 80, 80, 0, 360 );
      g.setColor( Color.yellow );
      g.drawRect( 100, 35, 80, 80 );
      g.setColor( Color.black );
      g.drawArc( 100, 35, 80, 80, 0, 110 );
      g.setColor( Color.yellow );
      g.drawRect( 185, 35, 80, 80 );
      g.setColor( Color.black );
      g.drawArc( 185, 35, 80, 80, 0, -270 );
      g.fillArc( 15, 120, 80, 40, 0, 360 );
      g.fillArc( 100, 120, 80, 40, 270, -90 );
      g.fillArc( 185, 120, 80, 40, 0, -270 );
   }

   public static void main( String args[] )
   {
      DrawArcs app = new DrawArcs();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );
   }
}
