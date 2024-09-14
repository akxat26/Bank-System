import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class fastCash extends JFrame implements ActionListener{
    JButton twoHun,fiveHun,thous,back,twothous,fivethous,tenthous;
    String pinnumber;

    fastCash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,650);
        add(image);
        JLabel text = new JLabel("Please Select Withdrawl Amount");
        text.setBounds(183,86,250,200);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        twoHun = new JButton("Rs 200");
        twoHun.setBounds(150, 276, 130, 30);
        twoHun.addActionListener(this);
       // deposite.setForeground(Color.BLACK);
       // deposite.SetFont(new Font("System",Font.BOLD,12));
        image.add(twoHun);
        
         fiveHun = new JButton("Rs 500");
        fiveHun.setBounds(320, 276, 130, 30);
        fiveHun.addActionListener(this);
       // deposite.setForeground(Color.BLACK);
       // deposite.SetFont(new Font("System",Font.BOLD,12));
        image.add(fiveHun);


         thous = new JButton("Rs 1000");
        thous.setBounds(150, 310, 130, 30);
        thous.addActionListener(this);
       // deposite.setForeground(Color.BLACK);
       // deposite.SetFont(new Font("System",Font.BOLD,12));
        image.add(thous);
         twothous = new JButton("Rs 2000");
        twothous.setBounds(320, 310, 130, 30);
        twothous.addActionListener(this);
       // deposite.setForeground(Color.BLACK);
       // deposite.SetFont(new Font("System",Font.BOLD,12));
        image.add(twothous);
     
         fivethous = new JButton("Rs 5000");
         fivethous.setBounds(150, 344, 130, 30);
         fivethous.addActionListener(this);
       // deposite.setForeground(Color.BLACK);
       // deposite.SetFont(new Font("System",Font.BOLD,12));
        image.add(fivethous);

         tenthous = new JButton("Rs 10000");
         tenthous.setBounds(320, 344, 130, 30);
         tenthous.addActionListener(this);
       // deposite.setForeground(Color.BLACK);
       // deposite.SetFont(new Font("System",Font.BOLD,12));
        image.add(tenthous);

         back = new JButton("Back");
         back.setBounds(320, 378, 130, 30);
         back.addActionListener(this);
       // deposite.setForeground(Color.BLACK);
       // deposite.SetFont(new Font("System",Font.BOLD,12));
        image.add(back);


        setSize(800,750);
        setLocation(220,0);
       // setUndecorated(true);
        setVisible(true);
        }       
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()== back){
                setVisible(false);
                new transactions(pinnumber).setVisible(true);
            }
            else{
                String amount = ((JButton)ae.getSource()).getText().substring(3);
                conn c = new conn();
                try{
                ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
                int balance = 0;
                while (rs.next()) {
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                     balance -= Integer.parseInt(rs.getString("amount"));
                    }
                    }
                    if(ae.getSource() != back && balance < Integer.parseInt(amount)) {
                     JOptionPane.showMessageDialog(null, " Insufficient Balance ");
                     return; 
                    }
                    else{
                        Date date = new Date();
                        String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Rs " +amount+ " Debited Successfully ");
                        setVisible(false);
                        new transactions(pinnumber).setVisible(true);
                    }
                    
                }
                
                    catch(Exception e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null,"check your details");
                         }
            }
 }                                                              
    public static void main(String[] args) {
        new fastCash("");
    }
}
