package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JButton cancel,submit;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String formNo;
    Signup3(String formNo){
        this.formNo = formNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3 :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type: ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        //radio button for male or female
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,150,30);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,200,30);
        add(r2);
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,150,30);
        add(r3);
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,230,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number: ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,307,250,20);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM card/cheque Book and Statement)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,20);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,20);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 = new JLabel("Service Required: ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,20);
        add(l11);

        //to select multiple check box
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        c4 = new JCheckBox("EMAIL Alert");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox C7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);    //check box will be checked always
        C7.setBackground(new Color(215,252,252));
        C7.setFont(new Font("Raleway",Font.BOLD,12));
        C7.setBounds(100,680,600,20);
        add(C7);

        JLabel l12 = new JLabel("Form No.: ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        //Storing Form No
        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Raleway",Font.BOLD,12));
        l13.setBounds(770,10,60,30);
        add(l13);

        //Submit button
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(420,720,100,30);
        submit.addActionListener(this);
        add(submit);

        //Cancel button
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(250,720,100,30);
        cancel.addActionListener(this);
        add(cancel);



        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        }
        else if(r2.isSelected()){
            atype = "Fixed Deposit Account";
        }else if(r3.isSelected()){
            atype = "Current Account";
        }else if(r4.isSelected()){
            atype = "Recurring Deposit Account";
        }
        //for random card no
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 14099630000000000L;
        String cardNo = "" + Math.abs(first7);

        //for random PIN code
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pinNo = "" + Math.abs(first3);

//        String fac = "";
//        if(c1.isSelected()){
//            fac += "ATM Card";
//        }else if(c2.isSelected()){
//            fac += "Internet Banking";
//        }
//        else if(c3.isSelected()){
//            fac += "Mobile Banking";
//        }else if(c4.isSelected()){
//            fac += "EMAIL Alert";
//        }else if(c5.isSelected()){
//            fac += "Cheque Book";
//        }else if(c6.isSelected()){
//            fac += "E-Statement";
//        }

        String fac = "";
        if(c1.isSelected()){
            fac += "ATM Card";
        }
        if(c2.isSelected()){
            fac += "Internet Banking";
        }
        if(c3.isSelected()){
            fac += "Mobile Banking";
        }
        if(c4.isSelected()){
            fac += "EMAIL Alert";
        }
        if(c5.isSelected()){
            fac += "Cheque Book";
        }
        if(c6.isSelected()){
            fac += "E-Statement";
        }

        try{
            if(e.getSource() == submit){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Con C1 = new Con();
                    String q1 = "insert into signup3 values('"+formNo+"','"+atype+"','"+cardNo+"','"+pinNo+"','"+fac+"')";
                    String q2 = "insert into login values('"+formNo+"','"+cardNo+"','"+pinNo+"')";
                    C1.statement.executeUpdate(q1);
                    C1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card No: "+cardNo+"\n Pin no: "+pinNo);
                    new Deposit(pinNo);
                    setVisible(false);

                }
            }
            else if(e.getSource() == cancel){
                System.exit(0);         //Exiting from the whole system
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
