package bank.management.system;

import com.mysql.cj.util.DnsSrv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1, b2;


    Deposit(String pin){
        this.pin = pin;


        JLabel label1 = new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setBounds(600, 100, 400, 35);
        label1.setFont(new Font("System", Font.BOLD, 16));
        add(label1);

        textField = new JTextField();
        textField.setBackground(new Color(192, 200, 197));
        textField.setForeground(Color.WHITE);
        textField.setBounds(600,140,360,30);
        textField.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 22));
        add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(1010, 260, 150,35);
        b1.setBackground(new Color(0, 0, 0));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(1010, 305, 150,35);
        b2.setBackground(new Color(0, 0, 0));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);





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
        try {
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource()==b1){
                if(textField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit.");
                }else{
                    Connections c = new Connections();
                    c.statement.executeUpdate("Insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"' )");
                    JOptionPane.showMessageDialog(null, "Rs."+amount+"   Deposited successfully");
                    setVisible(false);
                    new main_Class(pin);
                    
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_Class(pin);


                
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");


    }
}
