

//import java.awt.Button;
import java.awt.*;
////import /.awt.Font;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

//import com.mysql.cj.protocol.Resultset;

public class login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    login(){
        setLayout(null);

        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("OSWARD", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

         JLabel cardno = new JLabel("Card Number:");
        cardno.setFont(new Font("RALEWAY", Font.BOLD, 28));
        cardno.setBounds(70, 120, 220, 40);
        add(cardno);
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 130, 320, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,16));
        add(cardTextField);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 320, 30);
        add(pinTextField);

         JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("RALEWAY", Font.BOLD, 28));
        pin.setBounds(70, 210, 400, 40);
        pinTextField.setFont(new Font("Arial",Font.BOLD,16 ));
        add(pin);

        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 120, 40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(500, 300, 120, 40);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGNUP");
        signup.setBounds(300, 370, 320, 40);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.cyan);
        setSize(750, 550);
        setVisible(true);
        setLocation(300, 30);
    }
    public void actionPerformed(ActionEvent ae){
       if (ae.getSource()==clear){
         cardTextField.setText("");
         pinTextField.setText("");
       }
       else if (ae.getSource()==login){
         conn c = new conn();
         String cardnumber = cardTextField.getText();
         @SuppressWarnings("deprecation")
         String pinnumber  = pinTextField.getText();
         String query = "select * from login where cardNumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
         try{
             ResultSet rs = c.s.executeQuery(query);
             if(rs.next()){
              setVisible(false);
              new transactions(pinnumber).setVisible(true);

             }
             else{
              JOptionPane.showMessageDialog(null, "Incorrect Card Number Or Pin");
             }
         }catch(Exception e){
          System.out.println(e);
          JOptionPane.showMessageDialog(null,"check your details");
         }
       }
        if(ae.getSource()==signup){
          setVisible(false);
          new signup1().setVisible(true);
       }
    }
    public static void main(String[] args) {
     new login();   
    }
  }
