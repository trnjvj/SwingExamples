import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

public class Shapes extends JFrame {
   public Shapes() 
   {
      super( "Drawing 2D shapes" );
      setSize( 425, 160 );
      show();
   }
   public void paint( Graphics g )
   {
      Graphics2D g2d = ( Graphics2D ) g;
      g2d.setPaint(
         new GradientPaint( 5, 30,         // x1, y1
                            Color.blue,    // initial Color
                            35, 100,       // x2, y2
                            Color.yellow,  // end Color
                            true ) );      // cyclic
      g2d.fill( new Ellipse2D.Double( 5, 30, 65, 100 ) );
      g2d.setPaint( Color.red );                  
      g2d.setStroke( new BasicStroke( 10.0f ) ); 
      g2d.draw(
         new Rectangle2D.Double( 80, 30, 65, 100 ) );
      BufferedImage buffImage =
         new BufferedImage(
            10, 10, BufferedImage.TYPE_INT_RGB );
      Graphics2D gg = buffImage.createGraphics();   
      gg.setColor( Color.yellow ); 
      gg.fillRect( 0, 0, 10, 10 ); 
      gg.setColor( Color.black );  
      gg.drawRect( 1, 1, 6, 6 ); 
      gg.setColor( Color.blue );
      gg.fillRect( 1, 1, 3, 3 );
      gg.setColor( Color.red );
      gg.fillRect( 4, 4, 3, 3 );
      g2d.setPaint(
         new TexturePaint(
            buffImage, new Rectangle( 10, 10 ) ) );
      g2d.fill(
         new RoundRectangle2D.Double(
            155, 30, 75, 100, 50, 50 ) );
      g2d.setPaint( Color.white );
      g2d.setStroke( new BasicStroke( 6.0f ) ); 
      g2d.draw(
         new Arc2D.Double(
            240, 30, 75, 100, 0, 270, Arc2D.PIE ) );
      g2d.setPaint( Color.green );
      g2d.draw( new Line2D.Double( 395, 30, 320, 150 ) );
      float dashes[] = { 10 };
      g2d.setPaint( Color.yellow );    
      g2d.setStroke(
         new BasicStroke( 4,                      
                          BasicStroke.CAP_ROUND,  
                          BasicStroke.JOIN_ROUND, 
                          10, dashes, 0 ) );      
      g2d.draw( new Line2D.Double( 320, 30, 395, 150 ) );
   }
   public static void main( String args[] )
   {
      Shapes app = new Shapes();
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
