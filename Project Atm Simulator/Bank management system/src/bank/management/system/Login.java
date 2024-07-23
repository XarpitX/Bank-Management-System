package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3 ;

    JTextField textField2;

    JPasswordField passwordField3;

    JButton button1,button2, button3;




    Login(){
        super("Bank System");


        label1 = new JLabel("WELCOME TO THE ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvanteGarde", Font.BOLD, 35));
        label1.setBounds(220, 50, 450,40);
        add(label1);


        label2 = new JLabel("Card No:");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway", Font.ROMAN_BASELINE, 24));
        label2.setBounds(80,200,200,20);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(200, 200, 200, 20);
        textField2.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 18));
        add(textField2);



        label3 = new JLabel("PIN:");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway", Font.ROMAN_BASELINE, 24));
        label3.setBounds(80,250,200,20);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(200, 250, 200, 20);
        passwordField3.setFont(new Font("Ariel", Font.ROMAN_BASELINE, 18));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Ariel", Font.CENTER_BASELINE, 12));
        button1.setForeground(Color.white);
        button1.setBackground(Color.GRAY);
        button1.setBounds(200, 290, 90, 25);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Ariel", Font.CENTER_BASELINE, 12));
        button2.setForeground(Color.white);
        button2.setBackground(Color.GRAY);
        button2.setBounds(310, 290, 90, 25);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Ariel", Font.CENTER_BASELINE, 12));
        button3.setForeground(Color.white);
        button3.setBackground(Color.GRAY);
        button3.setBounds(250, 325, 100, 25);
        button3.addActionListener(this);
        add(button3);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i2 = i1.getImage().getScaledInstance(900,500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,500);
        add(image);



        setLayout(null);
        setSize(900, 500);
        setLocation(325,150);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){
                Connections c = new Connections();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_no = '"+cardno+"' and pin = '"+pin+"' ";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }


            }else if(e.getSource()==button2){
                textField2.setText("");
                passwordField3.setText("");


            } else if (e.getSource()==button3) {
                new Signup();
                setVisible(false);


            }
        }catch (Exception E){
            E.printStackTrace();

        }

    }

    public static void main(String[] args) {
        new Login();

    }

}
