
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
//import com.toedter.calender.JDateChooser;

public class signup1 extends JFrame implements ActionListener
{

    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emaField,addressField,cityField,stateField,pincodeField;
    JButton next;
    JRadioButton male,female,others,married,single;
    JDateChooser datechooser;

      signup1(){
        setLayout(null);
        Random ran = new Random();
        random = Math.abs(ran.nextLong()%9000L +1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO. " +random);
         formno.setFont(new Font("Railway", Font.BOLD, 38));
         formno.setBounds(120, 30, 700, 35);
         add(formno);

         JLabel personaldetails = new JLabel("Page 1 : Personal Details");
         personaldetails.setFont(new Font("Railway", Font.BOLD, 22));
         personaldetails.setBounds(250, 70, 400, 30);
         add(personaldetails);
          
         JLabel name = new JLabel("Name : ");
         name.setFont(new Font("Railway", Font.BOLD, 20));
         name.setBounds(50, 120, 200, 30);
         add(name);

         nameTextField = new JTextField();
          nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
          nameTextField.setBounds(280, 122, 300, 23);
          add(nameTextField);


         JLabel fathername = new JLabel("Father's Name : ");
         fathername.setFont(new Font("Railway", Font.BOLD, 20));
         fathername.setBounds(50, 160, 200, 30);
         add(fathername);

        fnameTextField = new JTextField();
          fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
          fnameTextField.setBounds(280, 163, 300, 23);
          add(fnameTextField);

         JLabel dob = new JLabel("Date of Birth : ");
         dob.setFont(new Font("Railway", Font.BOLD, 20));
         dob.setBounds(50, 200, 200, 30);
         add(dob);

          datechooser = new JDateChooser();
          datechooser.setBounds(280,200,300,26);
          datechooser.setForeground(Color.BLACK);
          datechooser.setMaxSelectableDate(new Date());
          add(datechooser);
         
         /*  JTextField dobField = new JTextField();
          dobField.setFont(new Font("Raleway", Font.BOLD, 14));
          dobField.setBounds(280, 204, 300, 23);
          add(dobField);*/  
     
          JLabel gender = new JLabel("Gender : ");
         gender.setFont(new Font("Railway", Font.BOLD, 20));
         gender.setBounds(50, 240, 200, 30);
         add(gender);

         male = new JRadioButton("Male");
         male.setBounds(280, 240, 100, 30);
         male.setBackground(Color.cyan);
         add(male);
         female = new JRadioButton("Female");
         female.setBounds(400, 240, 100, 30);
         female.setBackground(Color.CYAN);
         add(female);

         //JRadioButton transgender = new JRadioButton("Others");
         //transgender.setBounds(500, 240, 100, 30);
         //transgender.setBackground(Color.CYAN);
         //add(transgender);
         ButtonGroup genderButton = new ButtonGroup();
         genderButton.add(male);
         genderButton.add(female);
         //genderButton.add(otherss);

         /*  JTextField genderField = new JTextField();
          genderField.setFont(new Font("Raleway", Font.BOLD, 14));
          genderField.setBounds(280, 243, 300, 23);
          add(genderField);*/

          JLabel email = new JLabel("Email : ");
         email.setFont(new Font("Railway", Font.BOLD, 20));
         email.setBounds(50, 280, 200, 30);
         add(email);
          emaField = new JTextField();
          emaField.setFont(new Font("Raleway", Font.BOLD, 14));
          emaField.setBounds(280, 283, 300, 23);
          add(emaField);
 
          JLabel marital = new JLabel("Marital Status : ");
         marital.setFont(new Font("Railway", Font.BOLD, 20));
         marital.setBounds(50, 320, 200, 30);
         add(marital);
         single = new JRadioButton("Unmarried");
         single.setBounds(280, 320,100, 30);
         single.setBackground(Color.cyan);
         add(single);
        married = new JRadioButton("Married");
         married.setBounds(400, 320,100, 30);
         married.setBackground(Color.cyan);
         add(married);
        others = new JRadioButton("others");
         others.setBounds(500, 320,100, 30);
         others.setBackground(Color.cyan);
         add(others);
         ButtonGroup mariButtonGroup = new ButtonGroup();
         mariButtonGroup.add(others);
         mariButtonGroup.add(single);
         mariButtonGroup.add(married);

         /*  JTextField mariField= new JTextField();
          mariField.setFont(new Font("Raleway", Font.BOLD, 14));
          mariField.setBounds(280, 323, 300, 23);
          add(mariField);*/

         JLabel address = new JLabel("Address : ");
         address.setFont(new Font("Railway", Font.BOLD, 20));
         address.setBounds(50, 360, 200, 30);
         add(address);
        addressField = new JTextField();
          addressField.setFont(new Font("Raleway", Font.BOLD, 14));
          addressField.setBounds(280, 363, 300, 23);
          add(addressField);

         JLabel city = new JLabel("City : ");
         city.setFont(new Font("Railway", Font.BOLD, 20));
         city.setBounds(50, 400, 200, 30);
         add(city);
        cityField = new JTextField();
          cityField.setFont(new Font("Raleway", Font.BOLD, 14));
          cityField.setBounds(280, 403, 300, 23);
          add(cityField);

        JLabel state = new JLabel("State : ");
         state.setFont(new Font("Railway", Font.BOLD, 20));
         state.setBounds(50, 440, 200, 30);
         add(state);
        stateField = new JTextField();
          stateField.setFont(new Font("Raleway", Font.BOLD, 14));
          stateField.setBounds(280, 443, 300, 23);
          add(stateField);

         JLabel pincode = new JLabel("Pin Code : ");
         pincode.setFont(new Font("Railway", Font.BOLD, 20));
         pincode.setBounds(50, 480, 200, 30);
         add(pincode);
         
        pincodeField = new JTextField();
          pincodeField.setFont(new Font("Raleway", Font.BOLD, 14));
          pincodeField.setBounds(280, 483, 300, 23);
          add(pincodeField);
            
         next = new JButton("Next");
           next.setBackground(Color.BLACK);
           next.setForeground(Color.CYAN);
           next.setFont(new Font("Raleway", Font.BOLD, 15));
           next.setBounds(480, 520, 100, 30);
           next.addActionListener(this);
           add(next);
    

 
        getContentPane().setBackground(Color.cyan);
        setSize(800, 700);
        setVisible(true);
        setLocation(280, 10);
    }
    public void actionPerformed(ActionEvent ae)
    {
      String formno = "" + random;
      String name = nameTextField.getText();
      String fathername = fnameTextField.getText();  
      String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
      String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        String email = emaField.getText();
        String marital = null;
        if(single.isSelected()){
            marital = "Unmarried";
        }
        else if(married.isSelected()){
            marital = "Married";
        }
        else if(others.isSelected()){
            marital = "others";
        }
        String address = addressField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String pincode = pincodeField.getText();


        try{
          if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is Required");
          }
          else if(pincode.equals("")){
             JOptionPane.showMessageDialog(null, "Pincode is Required");
          }
          else if(address.equals("")){
             JOptionPane.showMessageDialog(null, "Address is Required");
          }
          else if(email.equals("")){
             JOptionPane.showMessageDialog(null, "Email is Required");
          }
          else if(dob.equals("")){
             JOptionPane.showMessageDialog(null, "DOB is Required");
          }
          else if(state.equals("")){
             JOptionPane.showMessageDialog(null, "State is Required");
          }
          else{
            conn c = new conn();
            
            String query = "insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
              c.s.executeUpdate(query );
              


              setVisible(false);
              new signup2(formno).setVisible(true);
            }
          
           }catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"check your details");
            System.out.println(e);
            }

     }
               public static void main(String[] args) {
                new signup1();
             }
}
