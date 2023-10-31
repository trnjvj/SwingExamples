import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.deitel.jhtp3.ch13.SelfContainedPanel;

public class SelfContainedPanelTest extends JFrame {
   private SelfContainedPanel myPanel;
   public SelfContainedPanelTest()
   {
      myPanel = new SelfContainedPanel();   
      myPanel.setBackground( Color.yellow );
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );
      c.add( myPanel );
      addMouseMotionListener(
         new MouseMotionListener() {
            public void mouseDragged( MouseEvent e )
            {
               setTitle( "Dragging: x=" + e.getX() +
                         "; y=" + e.getY() );
            }
            public void mouseMoved( MouseEvent e )
            {
               setTitle( "Moving: x=" + e.getX() +
                         "; y=" + e.getY() );
            }
         }
      );
      setSize( 300, 200 );
      show();
   }
   public static void main( String args[] )
   {
      SelfContainedPanelTest app =
         new SelfContainedPanelTest();
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
