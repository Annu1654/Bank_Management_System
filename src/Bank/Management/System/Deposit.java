package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pinNo;
    TextField textfield;
    JButton b1,b2;

    Deposit(String pinNo){
        this.pinNo = pinNo;         //forwarded from the previous signup page

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel l2 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(460,180,400,35);
        l1.add(l2);      //will add the lable on l2/ImageIcon

        textfield = new TextField();
        textfield.setBounds(460,230,320,25);
        textfield.setFont(new Font("Raleway",Font.BOLD,22));
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.WHITE);
        l1.add(textfield);

        b1 = new JButton("DEPOSIT");
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
        try{
            String amount = textfield.getText();
            Date date = new Date();
            if(e.getSource() == b1){
                if(textfield.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to deposit");
                }
                else {
                    Con c1 = new Con();
                    //wihtout creating any string or query we can also insert value into the table
                    c1.statement.executeUpdate("insert into bank values('"+pinNo+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposit Successfully");
                    setVisible(false);
                    new main_class(pinNo);
                }
            } else if (e.getSource() == b2) {
                setVisible(false);
                new main_class(pinNo);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
