import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
//import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
//import javax.swing.JTextField;

public class pinChange extends JFrame implements ActionListener{
    JPasswordField pinField,reenterField;
    JButton confirm,back;
    String pinnumber;
    
    pinChange(String pinnumber)
    {
        this.pinnumber = pinnumber;

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2     = i1.getImage().getScaledInstance(800, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0, 0, 800, 650);
        add(image);
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(220,170,400,30);
        image.add(text);

         JLabel pinText = new JLabel("Enter New PIN: ");
        pinText.setForeground(Color.white);
        pinText.setFont(new Font("System",Font.BOLD,16));
        pinText.setBounds(140,205,150,22);
        image.add(pinText);
        pinField = new JPasswordField();
        pinField.setFont(new Font("Raleway",Font.BOLD,14));
        pinField.setBounds(310, 208, 150, 20);
        image.add(pinField);        

        JLabel reenter = new JLabel("Re-Enter New PIN: ");
        reenter.setForeground(Color.white);
        reenter.setFont(new Font("System",Font.BOLD,16));
        reenter.setBounds(140,240,150,22);
        image.add(reenter);
        reenterField = new JPasswordField();
        reenterField.setFont(new Font("Raleway",Font.BOLD,14));
        reenterField.setBounds(310, 242, 150, 20);
        image.add(reenterField); 

         confirm= new JButton("Change");
    confirm.setFont(new Font("System",Font.BOLD,16));
     confirm.setBounds(325, 346, 130, 30);
     confirm.addActionListener(this);
     image.add(confirm);

       back = new JButton("Back");
       back.setFont(new Font("System",Font.BOLD,16));
       back.setBounds(325, 380, 130, 30);
       back.addActionListener(this);
       image.add(back);


        setSize(800,750);
        setLocation(220,0);
        setVisible(true);

    }
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==confirm){
        try{
          String npin = pinField.getText();
          String rpin = reenterField.getText();
          if(!npin.equals(rpin))
          {
            JOptionPane.showMessageDialog(null, "Entered Pin does not Matched");
            return;
          }
          if(npin.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter New Pin");
            return;
          }
          if(rpin.equals("")){
            JOptionPane.showMessageDialog(null, "Please Re-Enter New Pin");
            return;
          }
          conn c = new conn();
          String query1 = "update bank set pinnumber='"+rpin+"' where pinnumber = '"+pinnumber+"'";
          String query2 = "update login set pinnumber ='"+rpin+"' where pinnumber = '"+pinnumber+"'";
          String query3 = "update signup3 set pinnumber ='"+rpin+"' where pinnumber = '"+pinnumber+"'";

          c.s.executeUpdate(query1);
           c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
             setVisible(false);
             new transactions(rpin).setVisible(true);
        }
        catch(Exception e)
          {
            JOptionPane.showMessageDialog(null,"check your details");
            System.out.println(e);
          }
        }
        else{
            setVisible(false);
            new transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new pinChange("").setVisible(true);
    }
}


//create table bank( pinnumber varchar(10) , date varchar(40) , type varchar(20) , amount varchar());