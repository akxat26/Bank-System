
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signup2 extends JFrame implements ActionListener{
    
    
    JTextField panField,adhaarTextField;
    JButton next;
    JRadioButton syes, sno ,eyes,eno;
    JComboBox<String> religionbox,categorybox,incomebox,educationbox,occupationbox;
    String formno;
         
        signup2(String formno)
        {
        this.formno = formno;
        setLayout(null);
     
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
         JLabel additionalDetaiLabel = new JLabel("Page 1 : Additional Details");
         additionalDetaiLabel.setFont(new Font("Railway", Font.BOLD, 22));
         additionalDetaiLabel.setBounds(250, 70, 400, 30);
         add(additionalDetaiLabel);
          
         JLabel name = new JLabel("Religion : ");
         name.setFont(new Font("Railway", Font.BOLD, 20));
         name.setBounds(50, 120, 200, 30);
         add(name);

         String valreligion[] = {"Hindu", "Muslim","Sikh","Christian","Others"};
         religionbox = new JComboBox<String>(valreligion);
         religionbox.setBounds(280, 122, 300, 30);
         religionbox.setBackground(Color.white);
          add(religionbox);


         JLabel categoryLabel = new JLabel("Category : ");
         categoryLabel.setFont(new Font("Railway", Font.BOLD, 20));
         categoryLabel.setBounds(50, 165, 200, 30);
         add(categoryLabel);

          String valcategory[] = {"GENERAL", "OBC","SC","ST","OTHERS"};
          categorybox = new JComboBox<String>(valcategory);
          categorybox.setBounds(280, 163, 300, 30);
          categorybox.setBackground(Color.white);
          add(categorybox);

         JLabel incomeLabel = new JLabel("Income : ");
         incomeLabel.setFont(new Font("Railway", Font.BOLD, 20));
         incomeLabel.setBounds(50, 207, 200, 30);
         add(incomeLabel);

       /*  datechooser = new JDateChooser();
         datechooser.setBounds(280,200,300,26);
         datechooser.setForeground(Color.BLACK);
         add(datechooser);*/
          String valincome[] = {"  NILL  ", "< 1,50,000","< 2,50,000","< 5,00,000"," UPTO 10  "};
          incomebox = new JComboBox<String>(valincome);
          incomebox.setBounds(280, 210, 300, 30);
          incomebox.setBackground(Color.white);
          add(incomebox);

         
         /*  JTextField dobField = new JTextField();
          dobField.setFont(new Font("Raleway", Font.BOLD, 14));
          dobField.setBounds(280, 204, 300, 23);
          add(dobField);*/
     
          JLabel eduJLabel = new JLabel("Educatioal ");
         eduJLabel.setFont(new Font("Railway", Font.BOLD, 20));
         eduJLabel.setBounds(50, 240, 200, 30);
         add(eduJLabel);

          JLabel qualificationLabel = new JLabel("Qualification : ");
         qualificationLabel.setFont(new Font("Railway", Font.BOLD, 20));
         qualificationLabel.setBounds(50, 260, 200, 30);
         add(qualificationLabel);

         String educationval[] = {" Non Graduation  ", "Graduation","Post Graduation","Doctrate","Others"};
         educationbox = new JComboBox<String>(educationval);
          educationbox.setBounds(280, 255, 300, 30);
          educationbox.setBackground(Color.white);
          add(educationbox);

 
          JLabel occupationlabel = new JLabel("Occupation : ");
         occupationlabel.setFont(new Font("Railway", Font.BOLD, 20));
         occupationlabel.setBounds(50, 320, 200, 30);
         add(occupationlabel);
         
         String occupationval[] = {" Salaried  ", "Self Employed","Business","Student","Others"};
         occupationbox = new JComboBox<String>(occupationval);
         occupationbox.setBounds(280, 320, 300, 30);
          occupationbox.setBackground(Color.white);
          add(occupationbox);
       
         JLabel pancardLabel = new JLabel("Pan Number : ");
         pancardLabel.setFont(new Font("Railway", Font.BOLD, 20));
         pancardLabel.setBounds(50, 360, 200, 30);
         add(pancardLabel);
          panField = new JTextField();
          panField.setFont(new Font("Raleway", Font.BOLD, 14));
          panField.setBounds(280, 363, 300, 23);
          add(panField);

         JLabel adhaarLabel = new JLabel("Adhaar Number : ");
         adhaarLabel.setFont(new Font("Railway", Font.BOLD, 20));
         adhaarLabel.setBounds(50, 400, 200, 30);
         add(adhaarLabel);
          adhaarTextField = new JTextField();
          adhaarTextField.setFont(new Font("Raleway", Font.BOLD, 14));
          adhaarTextField.setBounds(280, 403, 300, 23);
          add(adhaarTextField);

        JLabel seniorcitizenLabel = new JLabel("Senior Citizen : ");
         seniorcitizenLabel.setFont(new Font("Railway", Font.BOLD, 20));
         seniorcitizenLabel.setBounds(50, 440, 200, 30);
         add(seniorcitizenLabel);
         syes = new JRadioButton("Yes");
         syes.setBounds(280, 443, 100, 27);
         syes.setBackground(Color.cyan);
         add(syes);
         sno = new JRadioButton("No");
         sno.setBounds(400, 443, 100, 27);
         sno.setBackground(Color.CYAN);
         add(sno);
         ButtonGroup senior = new ButtonGroup();
         senior.add(syes);
         senior.add(sno);



         JLabel exAccountLabel = new JLabel("Existing Account : ");
         exAccountLabel.setFont(new Font("Railway", Font.BOLD, 20));
         exAccountLabel.setBounds(50, 480, 200, 30);
         add(exAccountLabel);
          eyes = new JRadioButton("Yes");
         eyes.setBounds(280, 480, 100, 27);
         eyes.setBackground(Color.cyan);
         add(eyes);
         eno = new JRadioButton("No");
         eno.setBounds(400, 480, 100, 27);
         eno.setBackground(Color.CYAN);
         add(eno);
         ButtonGroup existButton = new ButtonGroup();
         existButton.add(eyes);
         existButton.add(eno);



         
       
         next = new JButton("Next");
           next.setBackground(Color.black);
           next.setForeground(Color.cyan);
           next.setFont(new Font("Raleway", Font.BOLD, 15));
           next.setBounds(480, 520, 100, 30);
           next.addActionListener(this);
           add(next);
    

 
          getContentPane().setBackground(Color.CYAN);
          setSize(800, 700);
          setVisible(true);
          setLocation(280, 10);
          }
    public void actionPerformed(ActionEvent ae){
     // String formno = "" + random;
      String sreligion   =(String)religionbox.getSelectedItem();
      String scategory   =(String)categorybox.getSelectedItem(); 
      String sincome     =(String)incomebox.getSelectedItem(); 
      String seducation  =(String)educationbox.getSelectedItem();
      String soccupation =(String)occupationbox.getSelectedItem();
      String senior = null;
        if(syes.isSelected()){
            senior = "Yes";
        }
        else if(sno.isSelected()){
            senior = "No";
        }
      
        String existButton = null;
        if(eyes.isSelected()){
            existButton = "Yes";
        }
        else if(eno.isSelected()){
            existButton = "No";
        }
        String sadhaar = adhaarTextField.getText();
        String span    = panField.getText();

        try{
            if(sadhaar.equals("")){
                JOptionPane.showMessageDialog(null, "Adhaar Number is Required");
             }
             else if(span.equals("")){
                JOptionPane.showMessageDialog(null, "Pan Number is Required");
             }
         else{
            conn c = new conn();
            
            String query = "insert into signup2 values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+sadhaar+"','"+span+"','"+senior+"','"+existButton+"')";
            c.s.executeUpdate(query);
            setVisible(false);
            new signup3(formno).setVisible(true);}

           
        }
          
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"check your details");
            System.out.println(e);
            }

     }
               public static void main(String[] args) {
                new signup2("");
             }}

// create table signup2(formno varchar(10),sreligion varchar(10),scategory varchar(10),sincome varchar(20),seducation varchar(20),soccupation varchar(20) sadhaar varchar(20),span varchar(10),senior varchar(10),existButton varchar(10));

