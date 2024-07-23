package bank.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl  extends JFrame implements ActionListener {
    String pin;
    JTextField textField;

    JButton b1, b2;

    Withdrawl(String pin) {
        this.pin = pin;

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setForeground(Color.WHITE);
        label1.setBounds(600, 100, 700, 35);
        label1.setFont(new Font("System", Font.BOLD, 18));
        add(label1);

        JLabel label2 = new JLabel("Please Enter Your Amount ");
        label2.setForeground(Color.WHITE);
        label2.setBounds(650, 130, 400, 35);
        label2.setFont(new Font("System", Font.BOLD, 18));
        add(label2);

        textField = new JTextField();
        textField.setBackground(new Color(192, 200, 197));
        textField.setForeground(Color.WHITE);
        textField.setBounds(600, 180, 335 , 30);
        textField.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 22));
        add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(1010, 260, 150, 35);
        b1.setBackground(new Color(0, 0, 0));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(1010, 305, 150, 35);
        b2.setBackground(new Color(0, 0, 0));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 800);
        add(image);


        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw.");

                } else {
                    Connections c = new Connections();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'   ");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));

                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + "   Debited successfully");
                    setVisible(false);
                    new main_Class(pin);

                }

            } catch (Exception E) {
                E.printStackTrace();

            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new main_Class(pin);

        }

    }

    public static void main(String[] args) {
        new Withdrawl("");

        }

    }

