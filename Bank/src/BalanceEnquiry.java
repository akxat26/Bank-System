import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BalanceEnquiry extends JFrame implements ActionListener{
    String pinnumber;
    JButton back;
    BalanceEnquiry(String pinnumber){
      this.pinnumber = pinnumber;
      setLayout(null);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,650);
        add(image);
       

        back = new JButton("Back");
        back.setFont(new Font("System",Font.BOLD,16));
       back.setBounds(325, 380, 130, 30);
       back.addActionListener(this);
       image.add(back);
        conn c = new conn();
        int balance = 0;
                try{
                ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
            
                while (rs.next()) {
                    if(rs.getString("TYPE").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                     balance -= Integer.parseInt(rs.getString("amount"));
                    }
                    }}catch(Exception e){
                        JOptionPane.showMessageDialog(null,"check your details");
                        //System.out.println(e);
                    }
                    JLabel text = new JLabel("Your Account Balance is Rs "+balance);
                    text.setForeground(Color.white);
                    text.setBounds(150, 220, 300, 18);
                    image.add(text);

       setSize(800,750);
        setLocation(220,0);
       setUndecorated(true);
        setVisible(true);
                }

        public void actionPerformed(ActionEvent ae){
          setVisible(false);
          new transactions(pinnumber).setVisible(true);
        }
    
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
