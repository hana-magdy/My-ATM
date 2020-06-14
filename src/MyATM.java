import javax.swing.*; 
import java.awt.event.*; 


public class MyATM implements ATM {
   static  JFrame f = new JFrame(); 
   static  JLabel l = new JLabel(); 
   static  JButton b = new JButton();
   static  JTextField t = new JTextField(); 

    private static void createAndShowGUI() {
    	 f = new JFrame("ATM"); 
         l = new JLabel("Enter you card number"); 
         b = new JButton("ok"); 
         t = new JTextField(7); 
        JPanel p = new JPanel();
        p.add(l);
        p.add(t); 
        p.add(b); 
        f.add(p); 
        f.setSize(300, 300); 
        f.show(); 
    } 
    	
    public void actionOfValidation(ActionEvent e) {
    	String s = e.getActionCommand(); 
        if (s.equals("ok")) { 
          
            l.setText(t.getText()); 
            t.setText("  "); 
            validate();
    }
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}