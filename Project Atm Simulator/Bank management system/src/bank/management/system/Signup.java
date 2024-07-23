package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup  extends JFrame implements ActionListener {
    JRadioButton r1, r2, m3, m4, m5;

    JButton next;


    JTextField textName, textFname, textmail, textADD,  textCity, textPin, textState ;


    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 =(ran.nextLong()% 9000L) + 1000L;

    String first = " " + Math.abs(first4);

    Signup(){
        super ("APPLICATION FORM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Application Form No:" + first);
        label1.setBounds(290, 30, 600, 40);
        label1.setFont(new Font("Raleway",Font.BOLD , 32));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD , 24 ));
        label2.setBounds(420,80, 600, 40);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.ITALIC , 22 ));
        label3.setBounds(40,140, 600, 30);
        add(label3);


        JLabel lableName = new JLabel("Name :");
        lableName.setFont(new Font("Raleway",Font.BOLD , 20 ));
        lableName.setBounds(60,200, 600, 30);
        add(lableName);

        textName = new JTextField();
        textName.setBounds(250,200, 300, 30);
        textName.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        add(textName);


        JLabel lableFName = new JLabel("Father's Name :");
        lableFName.setFont(new Font("Raleway",Font.BOLD , 20 ));
        lableFName.setBounds(60,250, 600, 30);
        add(lableFName);

        textFname = new JTextField();
        textFname.setBounds(250,250, 300, 30);
        textFname.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        add(textFname);


        JLabel DOB = new JLabel("D.O.B :");
        DOB.setFont(new Font("Raleway",Font.BOLD , 20 ));
        DOB.setBounds(60,300, 600, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(250, 300, 300, 30);
        add(dateChooser);

        JLabel labelGen = new JLabel("Gender :");
        labelGen.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelGen.setBounds(60,350, 600, 30);
        add(labelGen);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(222, 255, 228));
        r1.setFont(new Font("Raleway",Font.BOLD , 20 ));
        r1.setBounds(250,350, 100, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway",Font.BOLD , 20 ));
        r2.setBounds(380,350, 100, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel labelmail = new JLabel("Email :");
        labelmail.setBounds(60,400, 600, 30);
        labelmail.setFont(new Font("Raleway",Font.BOLD , 20 ));
        add(labelmail);

        textmail = new JTextField();
        textmail.setBounds(250,400, 300, 30);
        textmail.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        add(textmail);

        JLabel labelmr = new JLabel("Marital Status :");
        labelmr.setBounds(60,450, 600, 30);
        labelmr.setFont(new Font("Raleway",Font.BOLD , 20 ));
        add(labelmr);

        m3 = new JRadioButton("Married");
        m3.setBackground(new Color(222, 255, 228));
        m3.setFont(new Font("Raleway",Font.BOLD , 20 ));
        m3.setBounds(250,450, 130, 30);
        add(m3);

        m4 = new JRadioButton("Unmarried");
        m4.setBackground(new Color(222, 255, 228));
        m4.setFont(new Font("Raleway",Font.BOLD , 20));
        m4.setBounds(380,450, 150, 30);
        add(m4);

        m5 = new JRadioButton("Other");
        m5.setBackground(new Color(222, 255, 228));
        m5.setFont(new Font("Raleway",Font.BOLD , 20 ));
        m5.setBounds(540,450, 150, 30);
        add(m5);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m3);
        buttonGroup1.add(m4);
        buttonGroup1.add(m5);



        JLabel labelADD = new JLabel("Address :");
        labelADD.setBounds(60,500, 600, 30);
        labelADD.setFont(new Font("Raleway",Font.BOLD , 20 ));
        add(labelADD);

        textADD = new JTextField();
        textADD.setBounds(250,500, 300, 30);
        textADD.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        add(textADD);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(60,550, 600, 30);
        labelCity.setFont(new Font("Raleway",Font.BOLD , 20 ));
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(250,550, 300, 30);
        textCity.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        add(textCity);

        JLabel labelpin = new JLabel("Pin Code :");
        labelpin.setBounds(60,600, 600, 30);
        labelpin.setFont(new Font("Raleway",Font.BOLD , 20 ));
        add(labelpin);

        textPin = new JTextField();
        textPin.setBounds(250,600, 300, 30);
        textPin.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        add(textPin);


        JLabel labelState = new JLabel("State :");
        labelState.setBounds(60,650, 600, 30);
        labelState.setFont(new Font("Raleway",Font.BOLD , 20 ));
        add(labelState);

        textState = new JTextField();
        textState.setBounds(250,650, 300, 30);
        textState.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        add(textState);


        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD , 26 ));
        next.setBounds(700, 700, 120,40);
        next.setForeground(Color.white);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);





        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(900,800);
        setLocation(360, 40);
        next.addActionListener(this);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String Email = textmail.getText();
        String marital = null;
        if(m3.isSelected()){
            marital = "Married";
        } else if (m4.isSelected()) {
            marital = "Unmarried";
        } else if (m5.isSelected()) {
            marital = "Other";

        }
        String address = textADD.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();


        try{
            if (textName.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill all details");

            }else{
                Connections con1 = new Connections();
                String q =  "insert into signup values('"+formno+"', '"+name+"', '"+fname+"','"+dob+"', '"+gender+"', '"+Email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"'  )";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }


    public static void main(String [] args){
        new Signup();


    }
}
