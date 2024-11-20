package Bank.Management.System;

import javax.swing.*;  //JFrame into the swing package
import java.awt.*;      //for ActionListener
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;       //for ActionListener
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;           //declaring globally to use it in dynamic[ range
    JTextField textField2;                  // text field for entering the card no
    JPasswordField passwordField3;           //password field for entering the password

    JButton button1,button2,button3;

    login(){
        super("Bank Management System");

        //Bank icon display
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));      //storing the image in i1
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);    // Scalling the image
        ImageIcon i3 = new ImageIcon(i2);               // storing the scaled image in i3

        JLabel image = new JLabel(i3);                  //direct image cant be displayed, it needs label to display it
        image.setBounds(350,10,100,100);            //setting the position of the image
        add(image);

        //Card icon print
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image1 = new JLabel(ii3);
        image1.setBounds(630,350,100,100);
        add(image1);

        //welcome msg
        label1 = new JLabel("WELCOME TO ATM");              //actual work of JLabel is to show a text in the frame
        label1.setForeground(Color.WHITE);                       //Setting the colour for the text
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));        //setting the Font and the size
        label1.setBounds(230,125,450,40);      //the text is scaling according to the frame location not as screen location,  text will be shifted 230 towards x axis from the frame starting point
        add(label1);

        //Card
        label2 = new JLabel("Card No: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        //text Field for Card no
        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        //PIN no
        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        //password Field for PIN no  -----> password will be hidden in JPasswordField
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        //SIGN IN button
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(320,300,100,30);
        button1.addActionListener(this);   //before adding the button we must add the action to it
        add(button1);

        //CLEAR button
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(460,300,100,30);
        button2.addActionListener(this);
        add(button2);

        //SIGN UP button
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(320,350,240,30);
        button3.addActionListener(this);
        add(button3);

        //BACKGROUND  ----> should be added at last
        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image im2 = im1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel image2 = new JLabel(im3);
        image2.setBounds(0,0,850,480);   //background so the x and y will be 0 and the image will be same as the frame size
        add(image2);

        setLayout(null);                    //default layout is "Border Layout" to customize it we make it NULL
        setSize(850,480);       //frame size
        setLocation(450,200);       //frame pop up location
        setUndecorated(true);
        setVisible(true);                  // making frame visible   // should be at last to make visible everything

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == button1){
                Con c = new Con();
                String cardNo = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_no = '"+cardNo+"' and pin_no = '"+pin+"'";
                //getting the value from the database
                ResultSet resultSet = c.statement.executeQuery(q); //because we r fetching the values so we use executeQuery()
                if(resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }
                else {
                   JOptionPane.showMessageDialog(null,"Incorrect Card No. or Pin");
                }

            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {
                new Signup();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
