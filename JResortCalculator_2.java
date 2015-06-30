import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JResortCalculator extends JFrame {

   private JLabel jlPrice, jlBasePrice, jlOptions, jlTotal;
    
   private JCheckBox jcbWeekend, jcbBreakfast, jcbGolf;
   
   private JTextField jtfTotal;
   
   private JPanel jpTop, jpBottom, jpTotalPanel;
   
   public JResortCalculator(){
      
      jlPrice = new JLabel("Resort Price Calculator");
      jlPrice.setHorizontalAlignment(SwingConstants.CENTER);
      
      jlBasePrice = new JLabel("Base price for a room is $200.");
      jlBasePrice.setHorizontalAlignment(SwingConstants.CENTER);

      jlOptions = new JLabel("Check the options you want.");
      jlOptions.setHorizontalAlignment(SwingConstants.CENTER);

      
      jlTotal = new JLabel("The price for your stay is ");
      
      jcbWeekend = new JCheckBox("Weekend premium $100");
      jcbBreakfast = new JCheckBox("Breakfast $20");
      jcbGolf = new JCheckBox("Golf $75");
      
      jtfTotal = new JTextField(5);
      
      jpTop = new JPanel();
      jpTop.setLayout(new BorderLayout());
      
      jpBottom = new JPanel();
      jpBottom.setLayout(new GridLayout(2,2));
      
      jpTotalPanel = new JPanel();
      jpTotalPanel.setLayout(new FlowLayout());
      
      
      // adds Labels to panel      
      jpTop.add(jlPrice, BorderLayout.NORTH);
      jpTop.add(jlBasePrice, BorderLayout.CENTER);
      jpTop.add(jlOptions, BorderLayout.SOUTH);
      
      jpTotalPanel.add(jlTotal);
      jpTotalPanel.add(jtfTotal);
      
      jpBottom.add(jcbWeekend);
      jpBottom.add(jcbBreakfast);
      jpBottom.add(jcbGolf);
      jpBottom.add(jpTotalPanel);    
      
      // adds panel to the frame
      add(jpTop, BorderLayout.NORTH);   
      add(jpBottom, BorderLayout.SOUTH);
      
      
      
      // Frame parameters
      setTitle("Resort Price Estimator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //setSize(500,400);
      setLocation(500,300);
      setVisible(true);
      setResizable(false);
      pack();
      
   }
   
   public static void main(String [] args){
      new JResortCalculator();
   }
   
}// closes class