import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BoxLayoutDemo extends JFrame {
   public BoxLayoutDemo()
   {
      super( "Demostrating BoxLayout" );
      final int SIZE = 3;
      Container c = getContentPane();
      c.setLayout( new BorderLayout( 30, 30 ) );
      Box boxes[] = new Box[ 4 ];
      boxes[ 0 ] = Box.createHorizontalBox();
      boxes[ 1 ] = Box.createVerticalBox();
      boxes[ 2 ] = Box.createHorizontalBox();
      boxes[ 3 ] = Box.createVerticalBox();
      for ( int i = 0; i < SIZE; i++ )
         boxes[ 0 ].add( new JButton( "boxes[0]: " + i ) );
      for ( int i = 0; i < SIZE; i++ ) {
         boxes[ 1 ].add( Box.createVerticalStrut( 25 ) );
         boxes[ 1 ].add( new JButton( "boxes[1]: " + i ) );
      }
      for ( int i = 0; i < SIZE; i++ ) {
         boxes[ 2 ].add( Box.createHorizontalGlue() );
         boxes[ 2 ].add( new JButton( "boxes[2]: " + i ) );
      }
      for ( int i = 0; i < SIZE; i++ ) {
         boxes[ 3 ].add(
            Box.createRigidArea( new Dimension( 12, 8 ) ) );
         boxes[ 3 ].add( new JButton( "boxes[3]: " + i ) );
      }
      JPanel panel = new JPanel();
      panel.setLayout(
         new BoxLayout( panel, BoxLayout.Y_AXIS ) );
      for ( int i = 0; i < SIZE; i++ ) {
         panel.add( Box.createGlue() );
         panel.add( new JButton( "panel: " + i ) );
      }
      c.add( boxes[ 0 ], BorderLayout.NORTH );
      c.add( boxes[ 1 ], BorderLayout.EAST );
      c.add( boxes[ 2 ], BorderLayout.SOUTH );
      c.add( boxes[ 3 ], BorderLayout.WEST );
      c.add( panel, BorderLayout.CENTER );
      setSize( 350, 300 );
      show();
   }
   public static void main( String args[] )
   {
      BoxLayoutDemo app = new BoxLayoutDemo();
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
