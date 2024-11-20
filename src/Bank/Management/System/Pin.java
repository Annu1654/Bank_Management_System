package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    String pin;

    JButton b1,b2;
    JPasswordField p1,p2;
    Pin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel l2 = new JLabel("CHANGE YOUR PIN");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(430,180,400,35);
        l1.add(l2);      //will add the lable on l2/ImageIcon

        JLabel l3 = new JLabel("New PIN: ");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setBounds(430,220,150,35);
        l1.add(l3);

        p1 = new JPasswordField();
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        l1.add(p1);

        JLabel l4 = new JLabel("Re-Enter New PIN: ");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("System",Font.BOLD,16));
        l4.setBounds(430,260,400,35);
        l1.add(l4);

        p2 = new JPasswordField();
        p2.setBounds(600,260,180,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        l1.add(p2);


        b1 = new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l1.add(b2);

        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();
            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Pin Does not match");
                return;
            }
            if(e.getSource() == b1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-enter New PIN");
                    return;
                }

                Con c = new Con();
                String q1 = "update bank set pinNo = '"+pin1+"' where pinNo = '"+pin+"'";
                String q2 = "update login set pin_no = '"+pin1+"' where pin_no = '"+pin+"'";
                String q3 = "update signup3 set pin_no = '"+pin1+"' where pin_no = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new main_class(pin);
            } else if (e.getSource()==b2) {
                new main_class(pin);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
