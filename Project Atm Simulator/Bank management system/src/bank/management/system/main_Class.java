package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    main_Class(String pin){


        this.pin =pin;



        JLabel label1 = new JLabel("Please Enter Your Transactions ");
        label1.setForeground(Color.WHITE);;
        label1.setBounds(640, 100, 400, 35);
        label1.setFont(new Font("System", Font.BOLD, 20));
        add(label1);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(0, 0, 0));
        b1.setBounds(415,160,150,35);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(0, 0, 0));
        b2.setBounds(1005,160,150,35);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(0, 0, 0));
        b3.setBounds(415,210,150,35);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(0, 0, 0));
        b4.setBounds(1005,210,150,35);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(0, 0, 0));
        b5.setBounds(415,260,150,35);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(0, 0, 0));
        b6.setBounds(1005,260,150,35);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(0, 0, 0));
        b7.setBounds(1005,310,150,35);
        b7.addActionListener(this);
        add(b7);




        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 1550,800);
        add(image);




        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);






    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_Class("");




    }
}
