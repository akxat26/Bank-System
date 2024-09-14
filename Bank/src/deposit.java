
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class deposit extends JFrame implements ActionListener {
    JTextField amount;
    JButton deposit,back;
    String pinnumber;

    deposit(String pinnumber)
    {
        this.pinnumber = pinnumber;
    setLayout(null);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(800,750,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0,0,800,650);
    add(image);
    JLabel text = new JLabel("Enter the Amount you want to Deposit");
    text.setForeground(Color.white);
    text.setFont(new Font("System",Font.BOLD,15));
    text.setBounds(152, 175, 300, 20);
    image.add(text);
    amount = new JTextField();
    amount.setFont(new Font("System",Font.BOLD,16));
    amount.setBounds(152, 230, 280, 25);
    image.add(amount);

    deposit= new JButton("Deposit");
    deposit.setFont(new Font("System",Font.BOLD,16));
     deposit.setBounds(325, 346, 130, 30);
     deposit.addActionListener(this);
     image.add(deposit);

       back = new JButton("Back");
       back.setFont(new Font("System",Font.BOLD,16));
       back.setBounds(325, 380, 130, 30);
       back.addActionListener(this);
       image.add(back);
     
    setSize(800,750);
    setLocation(220,0);
   // setUndecorated(true);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== deposit){
           String number = amount.getText();
           Date date = new Date();
           if(number.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter amount you want to Deposit");
           } 
           else{
            try{
            conn c = new conn();
            String query = "insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Rs " +number+ " Successfully Deposited");
            setVisible(false);
            new transactions(pinnumber).setVisible(true);
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"check your details");
              System.out.println(e);
            }
           }

        }else if(ae.getSource()==back){
            setVisible(false);
           new transactions(pinnumber).setVisible(true);
        }
        
    }

    public static void main(String[] args) {
        new deposit("");
    }
}
