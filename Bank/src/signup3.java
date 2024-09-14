import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.*;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class signup3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;

    signup3(String formno){
    this.formno = formno;
    setLayout(null);
    JLabel l1 = new JLabel("Page 3:Account Details ");
    l1.setFont(new Font("Raleway",Font.BOLD,22));
    l1.setBounds(313, 35 , 400, 40);
    add(l1);
  
     JLabel acType = new JLabel("Account Type");
    acType.setFont(new Font("Raleway",Font.BOLD,22));
    acType.setBounds(100, 100 , 200, 30);
    add(acType);

     r1 = new JRadioButton(" Saving Account");
     r1.setFont(new Font("Raleway",Font.BOLD,18));
     r1.setBackground(Color.cyan);
     r1.setBounds(100, 140, 200,22);
     add(r1);
      r2 = new JRadioButton(" Deposite Account");
     r2.setFont(new Font("Raleway",Font.BOLD,18));
     r2.setBackground(Color.cyan);
     r2.setBounds(350, 140, 200,22);
     add(r2);
      r3 = new JRadioButton(" Current Account");
     r3.setFont(new Font("Raleway",Font.BOLD,18));
     r3.setBackground(Color.cyan);
     r3.setBounds(100, 170, 200,22);
     add(r3);
      r4 = new JRadioButton(" Recurring Account");
     r4.setFont(new Font("Raleway",Font.BOLD,18));
     r4.setBackground(Color.cyan);
     r4.setBounds(350, 170, 250,22);
     add(r4);
     ButtonGroup buttonaccount = new ButtonGroup();
     buttonaccount.add(r1);
      buttonaccount.add(r2);
       buttonaccount.add(r3);
        buttonaccount.add(r4);
       JLabel card = new JLabel("Card Number");
    card.setFont(new Font("Raleway",Font.BOLD,22));
    card.setBounds(100, 220 , 200, 30);
    add(card);  
     JLabel cnumber = new JLabel("XXXX-XXXX-XXXX-4101");
    cnumber.setFont(new Font("Raleway",Font.BOLD,20));
    cnumber.setBounds(350, 221 , 250, 32);
    add(cnumber);
    JLabel carddetails = new JLabel("Your 16 Digits Card Number");
    carddetails.setFont(new Font("Raleway",Font.BOLD,13));
    carddetails.setBounds(101, 240 , 200, 30);
    add(carddetails); 


     JLabel pin= new JLabel("PIN  ");
    pin.setFont(new Font("Raleway",Font.BOLD,22));
    pin.setBounds(100, 300 , 200, 30);
    add(pin);  
    JLabel pindetails = new JLabel("Your 4 Digits Pin Number");
    pindetails.setFont(new Font("Raleway",Font.BOLD,13));
    pindetails.setBounds(101, 320 , 200, 30);
    add(pindetails);
     JLabel pnum = new JLabel("XXXX");
    pnum.setFont(new Font("Raleway",Font.BOLD,20));
    pnum.setBounds(350, 300 , 250, 32);
    add(pnum);
     JLabel service= new JLabel("Services Required  ");
    service.setFont(new Font("Raleway",Font.BOLD,22));
    service.setBounds(100, 390 , 253, 30);
    add(service);  
    
    c1 = new JCheckBox("ATM CARD");
    c1.setBackground(Color.CYAN);
    c1.setFont(new Font("Raleway",Font.BOLD,15));
    c1.setBounds(100, 440, 150, 30);
    add(c1);
    c2 = new JCheckBox("Internet Banking");
    c2.setBackground(Color.CYAN);
    c2.setFont(new Font("Raleway",Font.BOLD,16));
    c2.setBounds(300, 440, 200, 30);
    add(c2);
    c3 = new JCheckBox("Mobile Banking");
    c3.setBackground(Color.CYAN);
    c3.setFont(new Font("Raleway",Font.BOLD,16));
    c3.setBounds(100, 470, 200, 30);
    add(c3);

    c4 = new JCheckBox("Emails and  SMS Alert");
    c4.setBackground(Color.CYAN);
    c4.setFont(new Font("Raleway",Font.BOLD,16));
    c4.setBounds(300, 470, 200, 30);
    add(c4);
    c5 = new JCheckBox("Cheque Book");
    c5.setBackground(Color.CYAN);
    c5.setFont(new Font("Raleway",Font.BOLD,16));
    c5.setBounds(100, 500, 200, 30);
    add(c5);
    c6 = new JCheckBox("E-Statements");
    c6.setBackground(Color.CYAN);
    c6.setFont(new Font("Raleway",Font.BOLD,16));
    c6.setBounds(300, 500, 200, 30);
    add(c6);
    c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge ");
    c7.setBackground(Color.CYAN);
    c7.setFont(new Font("Raleway",Font.BOLD,14));
    c7.setBounds(100, 550, 700, 30);
    add(c7);

    cancel = new JButton("Cancel");
    cancel.setBackground(Color.BLACK);
    cancel.setForeground(Color.cyan);
    cancel.setFont(new Font("Raleway",Font.BOLD,22));
    cancel.setBounds(200, 580, 200, 35);
    cancel.addActionListener(this);
    add(cancel);
    submit = new JButton("Submit");
    submit.setBackground(Color.BLACK);
    submit.setForeground(Color.cyan);
    submit.setFont(new Font("Raleway",Font.BOLD,22));
    submit.setBounds(450, 580, 200, 35);
    submit.addActionListener(this);
    add(submit);
    

    setSize(850,820);
    getContentPane().setBackground(Color.CYAN);
    setLocation(250,0);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
          String accountType = null;
          if(r1.isSelected()){
            accountType = "Saving Account";
          }
          else if(r2.isSelected()){
            accountType = "Fixed Deposite Account";
          }
          else if(r3.isSelected()){
            accountType = "Current Account";
          }
          else if(r4.isSelected()){
            accountType = "Recurrence Deposite Account";
          }
          Random random = new Random();
          String cardnumber = ""+Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
          String pinnumber = ""+Math.abs((random.nextLong() % 9000L) + 1000L); 
          String facility  = "";
          if(c1.isSelected()){
            facility = facility +"ATM Card";
          }
            else if (c2.isSelected()){
                facility = facility+"Internet Banking";
          } 
          else if(c3.isSelected()){
            facility = facility +"Mobile Banking";
          }
          else if(c4.isSelected()){
            facility = facility +"Emails and SMS Alert";
          }
          else if(c5.isSelected()){
            facility = facility +"Cheque Book";
          }
          else if(c6.isSelected()){
            facility = facility+"E-Statements";
          }
          try{
            if(accountType.equals(""))
            {
              JOptionPane.showMessageDialog(null, "Account type is required");
            }
            else if(!c7.isSelected())
            {
             JOptionPane.showMessageDialog(null,"Please Accept the terms and conditions");
            }
            else{
                conn c = new conn();
                String query1 = "insert into signup3 values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Cardnumber: "+cardnumber +"\n Pin: "+pinnumber);
                setVisible(false);
                new login().setVisible(true);
                new transactions(pinnumber).setVisible(false);
                new deposit(pinnumber).setVisible(false);
            }

          }catch(Exception e)
          {
            JOptionPane.showMessageDialog(null,"Select the checkboxes");
            System.out.println(e);
          }
        }
        else if(ae.getSource()==cancel){
          setVisible(false);
          new login().setVisible(true);

        }
        // else if(ae.getSource()==submit)
        // {
        //   setVisible(false);
        //   new login().setVisible(true);
        // }
    }
    
    public static void main(String[] args) {
        new signup3("");
    }
}
