package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {

    JButton next;
    JRadioButton c1,c2,a1,a2;
    JTextField textPAN,textAadhar;
    JComboBox comboBox, comBox2,comBox3,comBox4,comBox5;  //to display the list of options
    String formNo;
    signup2(String formNo){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formNo = formNo;

        JLabel l1 = new JLabel("Page 2:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        //display the religion list with drop down box using comboBox
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        //Category
        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","SC","ST","OBC","Others"};
        comBox2 = new JComboBox(category);
        comBox2.setBackground(new Color(252,208,76));
        comBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comBox2.setBounds(350,170,320,30);
        add(comBox2);

        //Income
        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comBox3 = new JComboBox(income);
        comBox3.setBackground(new Color(252,208,76));
        comBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comBox3.setBounds(350,220,320,30);
        add(comBox3);

        //Education
        JLabel l6 = new JLabel("Qualification : ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String education[] = {"Non-Graduate","Graduate","Post-Graduation","Doctorate","Other"};
        comBox4 = new JComboBox(education);
        comBox4.setBackground(new Color(252,208,76));
        comBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comBox4.setBounds(350,270,320,30);
        add(comBox4);

        //Occupation
        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comBox5 = new JComboBox(occupation);
        comBox5.setBackground(new Color(252,208,76));
        comBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comBox5.setBounds(350,340,320,30);
        add(comBox5);

        //PAN no
        JLabel l8 = new JLabel("PAN No. : ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPAN = new JTextField();
        textPAN.setFont(new Font("Raleway",Font.BOLD,18));
        textPAN.setBounds(350,390,320,30);
        add(textPAN);

        //Aadhar no with textField
        JLabel l9 = new JLabel("Aadhar No. : ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);

        //Senior Citizen no with radio buttons
        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        //radio buttons
        c1 = new JRadioButton("Yes");
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBackground(new Color(252,208,76));
        c1.setBounds(350,490,100,30);
        add(c1);

        c2 = new JRadioButton("No");
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBackground(new Color(252,208,76));
        c2.setBounds(460,490,100,30);
        add(c2);

        //Existing account with radio buttons
        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        //radio buttons
        a1 = new JRadioButton("Yes");
        a1.setFont(new Font("Raleway",Font.BOLD,14));
        a1.setBackground(new Color(252,208,76));
        a1.setBounds(350,540,100,30);
        add(a1);

        a2 = new JRadioButton("No");
        a2.setFont(new Font("Raleway",Font.BOLD,14));
        a2.setBackground(new Color(252,208,76));
        a2.setBounds(460,540,100,30);
        add(a2);

        //Form No
        JLabel l12 = new JLabel("Form No.: ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        //Storing Form No
        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(770,11,60,30);
        add(l13);

        //Next Button
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        //Frame set up
        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comBox2.getSelectedItem();
        String inc = (String) comBox3.getSelectedItem();
        String edu = (String) comBox4.getSelectedItem();
        String occ = (String) comBox5.getSelectedItem();

        String pan = textPAN.getText();
        String adhar = textAadhar.getText();

        String Scitizen = null;
        if(c1.isSelected()){
            Scitizen = "Yes";
        }
        else if(c2.isSelected()) {
            Scitizen = "No";
        }

        String Eaccount = null;
        if(a1.isSelected()){
            Eaccount = "Yes";
        }
        else if(a2.isSelected()) {
            Eaccount = "No";
        }
        try{
            if(textPAN.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                Con c1 = new Con();
                String q = "insert into signup2 values('"+formNo+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+Scitizen+"','"+Eaccount+"')";
                c1.statement.executeUpdate(q);  //for insertion we are using executeUpdate;
                new Signup3(formNo);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new signup2("");
    }
}
