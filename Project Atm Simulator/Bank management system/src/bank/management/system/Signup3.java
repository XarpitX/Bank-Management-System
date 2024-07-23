package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup3 extends JFrame implements ActionListener {
    JRadioButton B1, B2, B3, B4;

    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton submit, cancel;

    String formno;


    Signup3(String formno){
        this.formno = formno;


      //  super ("page3");



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label2 = new JLabel("Page 3");
        label2.setFont(new Font("Raleway",Font.BOLD , 24 ));
        label2.setBounds(420,35, 600, 40);
        add(label2);

        JLabel label3 = new JLabel("Account Details");
        label3.setFont(new Font("Raleway",Font.ITALIC , 22 ));
        label3.setBounds(380,70, 600, 30);
        add(label3);

        JLabel labelAcc = new JLabel("Account type :");
        labelAcc.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelAcc.setBounds(80, 180, 600, 30);
        add(labelAcc);

        B1 = new JRadioButton("Saving Account");
        B1.setBackground(new Color(243, 215, 227));
        B1.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        B1.setBounds(100, 230, 200, 30);
        add(B1);

        B2 = new JRadioButton("Fixed Deposit Account");
        B2.setBackground(new Color(243, 215, 227));
        B2.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        B2.setBounds(300, 230, 600, 30);
        add(B2);

        B3 = new JRadioButton("Current Account");
        B3.setBackground(new Color(243, 215, 227));
        B3.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        B3.setBounds(100, 270, 200, 30);
        add(B3);

        B4 = new JRadioButton("Recurring Deposit Account");
        B4.setBackground(new Color(243, 215, 227));
        B4.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        B4.setBounds(300, 270, 600, 30);
        add(B4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(B1);
        buttonGroup.add(B2);
        buttonGroup.add(B3);
        buttonGroup.add(B4);


        JLabel labelcard = new JLabel("Card No :");
        labelcard.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelcard.setBounds(80, 330, 300, 30);
        add(labelcard);

        JLabel labelC = new JLabel("(Your 16-digit card number)");
        labelC.setFont(new Font("Ariel",Font.ITALIC , 12 ));
        labelC.setBounds(80, 355, 600, 20);
        add(labelC);

        JLabel labelcardno = new JLabel("XXXX-XXXX-XXXX-6969");
        labelcardno.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelcardno.setBounds(300, 330, 600, 30);
        add(labelcardno);

        JLabel labelC1 = new JLabel("(It would appear on ATM card/cheque book and statement)");
        labelC1.setFont(new Font("Ariel",Font.ITALIC , 12 ));
        labelC1.setBounds(300, 355, 600, 20);
        add(labelC1);

        JLabel labelp = new JLabel("PIN :");
        labelp.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelp.setBounds(80, 390, 300, 30);
        add(labelp);

        JLabel labelp1 = new JLabel("(4-digit password)");
        labelp1.setFont(new Font("Ariel",Font.ITALIC , 12 ));
        labelp1.setBounds(80, 415, 600, 20);
        add(labelp1);

        JLabel labelp2 = new JLabel("XXXX");
        labelp2.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labelp2.setBounds(300, 390, 600, 30);
        add(labelp2);

        JLabel labels = new JLabel("Service Required :");
        labels.setFont(new Font("Raleway",Font.BOLD , 20 ));
        labels.setBounds(80, 450, 600, 30);
        add(labels);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(243, 215, 227));
        c1.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        c1.setBounds(100, 480, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(243, 215, 227));
        c2.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        c2.setBounds(300, 480, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(243, 215, 227));
        c3.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        c3.setBounds(100, 510, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email Alert");
        c4.setBackground(new Color(243, 215, 227));
        c4.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        c4.setBounds(300, 510, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(243, 215, 227));
        c5.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        c5.setBounds(100, 540, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(243, 215, 227));
        c6.setFont(new Font("Ariel",Font.ROMAN_BASELINE , 18 ));
        c6.setBounds(300, 540, 200, 30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setBackground(new Color(243, 215, 227));
        c7.setFont(new Font("Ariel",Font.ITALIC , 14 ));
        c7.setBounds(60, 620, 800, 30);
        add(c7);

        JLabel l1 = new JLabel("Form No:");
        l1.setFont(new Font("Raleway",Font.BOLD , 18));
        l1.setBounds(650, 60, 150,35);
        add(l1);

        JLabel l2 = new JLabel(formno);
        l2.setFont(new Font("Raleway",Font.BOLD , 18));
        l2.setBounds(730, 60, 150,35);
        add(l2);


        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD , 26 ));
        submit.setBounds(265, 680, 150,40);
        submit.setForeground(Color.white);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD , 26 ));
        cancel.setBounds(465, 680, 150,40);
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.BLACK);
        cancel.addActionListener(this);
        add(cancel);



        setLayout(null);
        setSize(900,800);
        getContentPane().setBackground(new Color(243, 215, 227));
        setLocation(360, 40);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String type = null;
        if(B1.isSelected()){
            type = "Saving Account";
        }else if (B2.isSelected()){
            type ="Fixed Deposit Account";

        } else if (B3.isSelected()) {
            type = "Current Account";
        } else if (B4.isSelected()) {
            type = "Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextInt() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String ser = null;
        if (c1.isSelected()){
            ser += "ATM Card";
        } else if (c2.isSelected()) {
            ser += "Internet Banking";
        } else if (c3.isSelected()) {
            ser += "Mobile Banking";
        } else if (c4.isSelected()) {
            ser += "Email Alert";
        } else if (c5.isSelected()) {
            ser += "Cheque Book";
        } else if (c6.isSelected()) {
            ser += "E-Statement";

        }

        try {
            if(e.getSource()== submit){
                if(type.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Fill all details.");
                }else{
                    Connections C1 = new Connections();
                    String q1 = "Insert into Signup3 values('"+formno+"', '"+type+"', '"+cardno+"', '"+pin+"', '"+ser+"')";
                    String q2 = "Insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')";
                    C1.statement.executeUpdate(q1);
                    C1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card no :" +cardno +" \n Pin :" +pin);
                    new Deposit(pin);
                    setVisible(false);

                }
            } else if (e.getSource()==cancel) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {

        new Signup3(" ");
    }
}
