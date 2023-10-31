import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridBagDemo extends JFrame { 
   private Container container;
   private GridBagLayout gbLayout;
   private GridBagConstraints gbConstraints; 
   
   public GridBagDemo()
   {
      super( "GridBagLayout" );
      container = getContentPane();
      gbLayout = new GridBagLayout();
      container.setLayout( gbLayout );   
      gbConstraints = new GridBagConstraints();
      JTextArea ta = new JTextArea( "TextArea1", 5, 10 );
      JTextArea tx = new JTextArea( "TextArea2", 2, 2 );
      String names[] = { "Iron", "Steel", "Brass" };
      JComboBox cb = new JComboBox( names );
      JTextField tf = new JTextField( "TextField" );
      JButton b1 = new JButton( "Button 1" );
      JButton b2 = new JButton( "Button 2" );
      JButton b3 = new JButton( "Button 3" );
      gbConstraints.fill = GridBagConstraints.BOTH;
      addComponent( ta, 0, 0, 1, 3 );    
      gbConstraints.fill = GridBagConstraints.HORIZONTAL;
      addComponent( b1, 0, 1, 2, 1 );
      addComponent( cb, 2, 1, 2, 1 );             
      gbConstraints.weightx = 1000;  // can grow wider
      gbConstraints.weighty = 1;     // can grow taller
      gbConstraints.fill = GridBagConstraints.BOTH;
      addComponent( b2, 1, 1, 1, 1 );
      gbConstraints.weightx = 0;
      gbConstraints.weighty = 0;    
      addComponent( b3, 1, 2, 1, 1 );
      addComponent( tf, 3, 0, 2, 1 );
      addComponent( tx, 3, 2, 1, 1 );
      setSize( 300, 150 );
      show();
   }
   private void addComponent( Component c,
      int row, int column, int width, int height )
   {
      gbConstraints.gridx = column;
      gbConstraints.gridy = row;
      gbConstraints.gridwidth = width;   
      gbConstraints.gridheight = height;
      gbLayout.setConstraints( c, gbConstraints );  
      container.add( c );    
   }
   public static void main( String args[] )
   {
      GridBagDemo app = new GridBagDemo();
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
