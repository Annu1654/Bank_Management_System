package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Wtihdrawal extends JFrame implements ActionListener {
    String pinNo;
    TextField textfield;
    JButton b1,b2;


    Wtihdrawal(String pinNo) {
        this.pinNo = pinNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel l2 = new JLabel("MAXIMUM WITHDRAWL IS RS.10,000");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(460,180,400,35);
        l1.add(l2);      //will add the lable on l2/ImageIcon

        JLabel l3 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("System",Font.BOLD,14));
        l3.setBounds(460,220,400,35);
        l1.add(l3);      //will add the lable on l2/ImageIcon


        textfield = new TextField();
        textfield.setBounds(460,260,320,25);
        textfield.setFont(new Font("Raleway",Font.BOLD,22));
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.WHITE);
        l1.add(textfield);

        b1 = new JButton("WITHDRAW");
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

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            try {
                String amount = textfield.getText();
                Date date = new Date();
                if (textfield.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Con con = new Con();
                    ResultSet resultSet = con.statement.executeQuery("select * from bank where pinNo = '" + pinNo + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    con.statement.executeUpdate("insert into bank values('" + pinNo + "','" + date + "','Withdrawl', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_class(pinNo);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new main_class(pinNo);
        }
    }

    public static void main(String[] args) {
        new Wtihdrawal("");
    }
}
