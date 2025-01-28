package bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends  JFrame implements ActionListener {
    JRadioButton r1,r2,r3,m1,m2,m3,m4;
    JButton Next;

    JTextField textName, textFName,textEmail,textAdd, textCity, textPin,textState;
    JDateChooser dateChooser;
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 = new JLabel("APPLICATION FORM NO. "+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);


        JLabel labelName=new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);


        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        JLabel labelFName=new JLabel("Father's Name:");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);


        textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB =new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);


        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        JLabel labelG =new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG );


        r1=new JRadioButton("Male");
        r1.setFont( new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont( new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,100,30);
        add(r2);

        r3=new JRadioButton("Trans");
        r3.setFont( new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(600,290,100, 30);
        add(r3);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);



        JLabel labelEmail =new JLabel("Email ID: ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail );


        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390, 400,30);
        add(textEmail);


        JLabel labelMS =new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1=new JRadioButton("Married");
        m1.setFont( new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont( new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(400,440,100,30);
        add(m2); m1=new JRadioButton("Married");

        m3=new JRadioButton("Divorse");
        m3.setFont( new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(520,440,100,30);
        add(m3);

        m4=new JRadioButton("Widow");
        m4.setFont( new Font("Raleway",Font.BOLD,14));
        m4.setBackground(new Color(222,255,228));
        m4.setBounds(650,440,100,30);
        add(m4);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);
        buttonGroup1.add(m4);




        JLabel labelAdd =new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,400,30);
        add( labelAdd);


        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity =new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,400,30);
        add( labelCity);


        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add( textCity);


        JLabel labelPin =new JLabel("PIN Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,400,30);
        add( labelPin);


        textPin=new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(  textPin);


        JLabel labelState=new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,400,30);
        add( labelState);


        textState=new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);


        Next=new JButton("Next");
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.setBounds(620,672,80,25);
        Next.addActionListener(this);
        add(Next);







        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String formno=first;
         String name=textName.getText();
         String fname= textFName.getText();
         String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         String gender=null;
         if(r1.isSelected()){
             gender="Male";
         }else if(r2.isSelected()){
             gender="Female";
         }else if(r3.isSelected()){
             gender="Trns";
         }
         String email=textEmail.getText();
         String marital=null;
         if(m1.isSelected()){
             marital="Married";
         }else if (m2.isSelected()){
             marital="Unmarried";
         }else if (m3.isSelected()){
             marital="Divorse";
         }else if (m4.isSelected()){
             marital="widow";
         }

         String address=textAdd.getText();
         String city=textCity.getText();
         String pincode=textPin.getText();
         String state=textState.getText();

         try{
             if(textName.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the fields");
             }else{
                 Con con1=new Con();
                 String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                 con1.statement.executeUpdate(q);
                 new Signup2(formno);
                 setVisible(false);
             }
         }catch(Exception E){
             E.printStackTrace();
         }
    }

    public static void main(String[] args){
        new Signup();
    }
}
