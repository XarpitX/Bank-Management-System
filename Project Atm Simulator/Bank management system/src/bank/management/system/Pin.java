package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame  implements ActionListener {
    JButton b1, b2;
    JPasswordField p1, p2;
    String pin;



    Pin(String pin){

        this.pin = pin;


        JLabel label1 = new JLabel("Change Your PIN ");
        label1.setForeground(Color.WHITE);
        label1.setBounds(700, 110, 400, 35);
        label1.setFont(new Font("System", Font.BOLD, 22));
        add(label1);

        JLabel label2 = new JLabel("New PIN: ");
        label2.setForeground(Color.WHITE);
        label2.setBounds(500, 170, 200, 35);
        label2.setFont(new Font("System", Font.BOLD, 20));
        add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(192, 200, 197));
        p1.setForeground(Color.WHITE);
        p1.setBounds(700,170,200,30);
        p1.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 22));
        add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setBounds(500, 210, 200, 35);
        label3.setFont(new Font("System", Font.BOLD, 20));
        add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(192, 210, 197));
        p2.setForeground(Color.WHITE);
        p2.setBounds(700,210,200,30);
        p2.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 22));
        add(p2);






        b1 = new JButton("CHANGE");
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
            String pin1 = p1.getText();
            String pin2 = p2.getText();
            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if (e.getSource()==b1){
                if (p1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter new PIN");
                    return;
                }
                if(p2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                    return;
                }
                Connections c = new Connections();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"' ";
                String q3 = "update signup3 set pin = '"+pin1+"' where pin = '"+pin+"' ";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);

                new main_Class(pin);


            } else if (e.getSource()==b2) {
                new main_Class(pin);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Pin("");


    }

}
