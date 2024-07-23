package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel label2;
    JButton b1;
    String pin;

    BalanceEnquiry(String pin){
        this.pin = pin;

        JLabel label1 = new JLabel("Your Current Balance is Rs. ");
        label1.setForeground(Color.WHITE);
        label1.setBounds(600, 100, 700, 35);
        label1.setFont(new Font("System", Font.BOLD, 22));
        add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setBounds(650, 130, 400, 35);
        label2.setFont(new Font("System", Font.BOLD, 20));
        add(label2);

        b1 = new JButton("Back");
        b1.setBounds(1010, 260, 150, 35);
        b1.setBackground(new Color(0, 0, 0));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 800);
        add(image);

        int balance = 0;
        try {
            Connections c = new Connections();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));

                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }


            label2.setText("" + balance);


            setLayout(null);
            setSize(1550, 1080);
            setLocation(0, 0);
            setUndecorated(true);
            setVisible(true);

        }

    @Override
    public void actionPerformed (ActionEvent e) {
            setVisible(false);
            new main_Class(pin);
        }



    public static void main(String[] args) {
        new BalanceEnquiry("");


    }
}
