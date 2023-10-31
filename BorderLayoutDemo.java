import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame
                              implements ActionListener {
   private JButton b[];
   private String names[] =
      { "Hide North", "Hide South", "Hide East",
        "Hide West", "Hide Center" };
   private BorderLayout layout;
   public BorderLayoutDemo()
   {
      super( "BorderLayout Demo" );
      layout = new BorderLayout( 5, 5 );
      Container c = getContentPane();
      c.setLayout( layout );
      b = new JButton[ names.length ];
      for ( int i = 0; i < names.length; i++ ) {
         b[ i ] = new JButton( names[ i ] );
         b[ i ].addActionListener( this );
      }
      c.add( b[ 0 ], BorderLayout.NORTH ); 
      c.add( b[ 1 ], BorderLayout.SOUTH ); 
      c.add( b[ 2 ], BorderLayout.EAST ); 
      c.add( b[ 3 ], BorderLayout.WEST );  
      c.add( b[ 4 ], BorderLayout.CENTER ); 
      setSize( 300, 200 );
      show();
   }            
   public void actionPerformed( ActionEvent e )
   {
      for ( int i = 0; i < b.length; i++ ) 
         if ( e.getSource() == b[ i ] )
            b[ i ].setVisible( false );
         else
            b[ i ].setVisible( true );
      layout.layoutContainer( getContentPane() );
   }
   public static void main( String args[] )
   { 
      BorderLayoutDemo app = new BorderLayoutDemo();
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
