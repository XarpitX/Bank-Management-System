package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    String formno;
    JComboBox box1, box2, box3, box4, box5;

    JTextField text1, text2;
    JButton next;


    Signup2(String formno){
        super("Page 2");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        this.formno = formno;

        JLabel label2 = new JLabel("Page 2");
        label2.setFont(new Font("Raleway",Font.BOLD , 24 ));
        label2.setBounds(420,60, 600, 40);
        add(label2);

        JLabel label3 = new JLabel("Additional Details");
        label3.setFont(new Font("Raleway",Font.ITALIC , 22 ));
        label3.setBounds(40,140, 600, 30);
        add(label3);

        JLabel labelReliogion = new JLabel("Religion :");
        labelReliogion.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelReliogion.setBounds(60, 200, 600, 30);
        add(labelReliogion);

        String religion[] = {"HIndu", "Muslim", "Sikh", "Christian", "other"};
        box1 = new JComboBox(religion);
        box1.setFont(new Font("Raleway",Font.BOLD , 14 ));
        box1.setBackground(new Color(185, 200, 203));
        box1.setBounds(250, 200, 300, 30);
        add(box1);



        JLabel labelCat = new JLabel("Category :");
        labelCat.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelCat.setBounds(60, 250, 600, 30);;
        add(labelCat);

        String category[] = {"General", "OBC", "ST", "SC", "Other"};
        box2 = new JComboBox<>(category);
        box2.setFont(new Font("Raleway",Font.BOLD , 14 ));
        box2.setBackground(new Color(185, 200, 203));
        box2.setBounds(250,250,300,30);
        add(box2);


        JLabel labelIncome = new JLabel("Income :");
        labelIncome.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelIncome.setBounds(60, 300, 600,30);
        add(labelIncome);

        String income[] = {"null", "< 1lakh", "< 2.5lakhs", "< 8lakhs", "upto 10lakhs", "12lakhs or above"};
        box3 = new JComboBox<>(income);
        box3.setFont(new Font("Raleway",Font.BOLD , 14 ));
        box3.setBounds(250, 300, 300, 30);
        box3.setBackground(new Color(185, 200,203));
        add(box3);




        JLabel labelEdu = new JLabel("Education :");
        labelEdu.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelEdu.setBounds(60, 350, 300, 30);
        add(labelEdu);

        String ed[] = {"Non-Graduate", "Graduate", "Post Graduate", "Doctrate", "other"};
        box4 = new JComboBox<>(ed);
        box4.setFont(new Font("Raleway",Font.BOLD , 20 ));
        box4.setBackground(new Color(185, 200, 203));
        box4.setBounds(250, 350, 300, 30);
        add(box4);



        JLabel labelOcc = new JLabel("Occupation :");
        labelOcc.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelOcc.setBounds(60, 400, 600, 30);
        add(labelOcc);

        String Occupation[] = {"Student", "Salaried", "Self-Employed", "Business", "Retired", "Other"};
        box5 = new JComboBox<>(Occupation);
        box5.setFont(new Font("Raleway",Font.BOLD , 20 ));
        box5.setBackground(new Color(185, 200, 203));
        box5.setBounds(250, 400, 300, 30);
        add(box5);



        JLabel labelPan = new JLabel("PAN Number");
        labelPan.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelPan.setBounds(60, 450, 600, 30);
        add(labelPan);

        text1 = new JTextField();
        text1.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        text1.setBounds(250, 450, 300, 30);
        add(text1);


        JLabel labelAdhar = new JLabel("Aadhar Number :");
        labelAdhar.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelAdhar.setBounds(60, 500, 300, 30);
        add(labelAdhar);

        text2 = new JTextField();
        text2.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 16));
        text2.setBounds(250, 500, 300, 30);
        add(text2);



        JLabel labelCiti = new JLabel("Senior Citizen");
        labelCiti.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelCiti.setBounds(60, 550, 600, 30);
        add(labelCiti);

        r1 = new JRadioButton("Yes");
        r1.setBackground(new Color(185, 200, 203));
        r1.setFont(new Font("Raleway",Font.BOLD , 20 ));
        r1.setBounds(250, 550, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(185, 200, 203));
        r2.setFont(new Font("Raleway",Font.BOLD , 20 ));
        r2.setBounds(380, 550, 100, 30);
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);


        JLabel labelAcc = new JLabel("Existing Account :");
        labelAcc.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelAcc.setBounds(60, 600, 600, 30);
        add(labelAcc);

        r3 = new JRadioButton("yes");
        r3.setBackground(new Color(185, 200, 203));
        r3.setFont(new Font("Raleway",Font.BOLD , 20 ));
        r3.setBounds(250, 600, 100, 30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setBackground(new Color(185, 200, 203));
        r4.setFont(new Font("Raleway",Font.BOLD , 20 ));
        r4.setBounds(380, 600, 100, 30);
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);


        JLabel l1 = new JLabel("Form No:");
        l1.setFont(new Font("Raleway",Font.BOLD , 18));
        l1.setBounds(650, 60, 150,35);
        add(l1);

        JLabel l2 = new JLabel(formno);
        l2.setFont(new Font("Raleway",Font.BOLD , 18));
        l2.setBounds(730, 60, 150,35);
        add(l2);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD , 26 ));
        next.setBounds(700, 700, 120,40);
        next.setForeground(Color.white);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);









        setLayout(null);
        setSize(900,800);
        getContentPane().setBackground(new Color(185, 200, 203));
        setLocation(360, 40);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String religion = (String) box1.getSelectedItem();
        String cat = (String) box2.getSelectedItem();
        String income = (String) box3.getSelectedItem();
        String edu = (String) box4.getSelectedItem();
        String occu = (String) box5.getSelectedItem();
        String pan = text1.getText();
        String aadhar = text2.getText();
        String senior_citizen = null;
        if(r1.isSelected()){
            senior_citizen = "Yes";
        }else if(r2.isSelected()){
            senior_citizen = "No";

        }
        String acc = null;
        if(r1.isSelected()){
            acc = "Yes";
        }else if(r2.isSelected()) {
            acc = "No";
        }

        try {
            if(text1.getText().isEmpty() || text2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all required details");
            }else{
                Connections c1 = new Connections();
                String q = "insert into signup2 values('"+formno+"', '"+religion+"', '"+cat+"', '"+income+"', '"+edu+"', '"+occu+"', '"+pan+"', '"+aadhar+"', '"+senior_citizen+"', '"+acc+"' )";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);



            }

        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Signup();
    }

}
