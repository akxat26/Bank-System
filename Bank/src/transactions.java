import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class transactions extends JFrame implements ActionListener{
    JButton deposit,fcash,pinchange,exit,withdrawl,ministatement,balanceenq;
    String pinnumber;

    transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,650);
        add(image);
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(183,86,250,200);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(150, 276, 130, 30);
        deposit.addActionListener(this);
       // deposit.setForeground(Color.BLACK);
       // deposit.SetFont(new Font("System",Font.BOLD,12));
        image.add(deposit);
        
         withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(320, 276, 130, 30);
        withdrawl.addActionListener(this);
       // deposit.setForeground(Color.BLACK);
       // deposit.SetFont(new Font("System",Font.BOLD,12));
        image.add(withdrawl);


         fcash = new JButton("Fast Cash");
        fcash.setBounds(150, 310, 130, 30);
        fcash.addActionListener(this);
       // deposit.setForeground(Color.BLACK);
       // deposit.SetFont(new Font("System",Font.BOLD,12));
        image.add(fcash);
         ministatement = new JButton("Mini Statement");
        ministatement.setBounds(320, 310, 130, 30);
        ministatement.addActionListener(this);
       // deposit.setForeground(Color.BLACK);
       // deposit.SetFont(new Font("System",Font.BOLD,12));
        image.add(ministatement);
     
         pinchange = new JButton("Pin Change");
        pinchange.setBounds(150, 344, 130, 30);
        pinchange.addActionListener(this);
       // deposit.setForeground(Color.BLACK);
       // deposit.SetFont(new Font("System",Font.BOLD,12));
        image.add(pinchange);

         balanceenq = new JButton("Balance Enquiry");
        balanceenq.setBounds(320, 344, 130, 30);
        balanceenq.addActionListener(this);
       // deposit.setForeground(Color.BLACK);
       // deposit.SetFont(new Font("System",Font.BOLD,12));
        image.add(balanceenq);

         exit = new JButton("Exit");
        exit.setBounds(320, 378, 130, 30);
        exit.addActionListener(this);
       // deposit.setForeground(Color.BLACK);
       // deposit.SetFont(new Font("System",Font.BOLD,12));
        image.add(exit);


        setSize(800,750);
        setLocation(220,0);
       setUndecorated(true);
        setVisible(true);
        }       
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()== exit){
                System.exit(0);
            }else if(ae.getSource()==deposit){
               setVisible(false);
               new deposit(pinnumber).setVisible(true);
            }else if(ae.getSource()==withdrawl){
                setVisible(false);
                new withdrawl(pinnumber).setVisible(true);
            }
            else if(ae.getSource()== fcash){
                setVisible(false);
                new fastCash(pinnumber).setVisible(true);
            }
            else if(ae.getSource()==pinchange){
                setVisible(false);
                new pinChange(pinnumber).setVisible(true);
            }
           else if(ae.getSource()==balanceenq){
                setVisible(false);
                new BalanceEnquiry(pinnumber).setVisible(true);
            }
           else if(ae.getSource()==ministatement){
                new MiniStatement(pinnumber).setVisible(true);
            }
 }                                                              
    public static void main(String[] args) {
        new transactions("");
    }
}
