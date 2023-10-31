import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridBagDemo2 extends JFrame { 
   private GridBagLayout gbLayout;
   private GridBagConstraints gbConstraints;
   private Container container;
    
   public GridBagDemo2()
   {
      super( "GridBagLayout" );
      container = getContentPane();
      gbLayout = new GridBagLayout();
      container.setLayout( gbLayout );   
      gbConstraints = new GridBagConstraints();
      String metals[] = { "Copper", "Aluminum", "Silver" };
      JComboBox comboBox = new JComboBox( metals );
      JTextField textField = new JTextField( "TextField" );
      String fonts[] = { "Serif", "Monospaced" };
      JList list = new JList( fonts );
      String names[] =
         { "zero", "one", "two", "three", "four" };
      JButton buttons[] = new JButton[ names.length ];
      for ( int i = 0; i < buttons.length; i++ )
         buttons[ i ] = new JButton( names[ i ] );
      gbConstraints.weightx = 1;
      gbConstraints.weighty = 1;  
      gbConstraints.fill = GridBagConstraints.BOTH;
      gbConstraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent( textField );
      gbConstraints.gridwidth = 1;
      addComponent( buttons[ 0 ] );
      gbConstraints.gridwidth = GridBagConstraints.RELATIVE;
      addComponent( buttons[ 1 ] );
      gbConstraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent( buttons[ 2 ] );
      gbConstraints.weighty = 0;
      gbConstraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent( comboBox );
      gbConstraints.weighty = 1;
      gbConstraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent( buttons[ 3 ] ); 
      gbConstraints.gridwidth = GridBagConstraints.RELATIVE;
      addComponent( buttons[ 4 ] );
      gbConstraints.gridwidth = GridBagConstraints.REMAINDER;
      addComponent( list );
      setSize( 300, 200 );
      show();
   }
   private void addComponent( Component c ) 
   {
      gbLayout.setConstraints( c, gbConstraints );
      container.add( c );      
   }   
   public static void main( String args[] )
   {
      GridBagDemo2 app = new GridBagDemo2();
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
