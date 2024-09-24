//package bank.management.system;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//public class signup3 extends JFrame implements ActionListener {
//    JRadioButton r1,r2,r3,r4;
//    JCheckBox s1,s2,s3,s4,s5,s6;
//
//    JButton s,c;
//    this.String formno;
//    signup3( String formno) {
//
//        this.formno =formno;
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(150, 5, 100, 100);
//        add(image);

//        JLabel l1 =new JLabel("page 3 :");
//        l1.setFont(new Font("Raleway",Font.BOLD,22));
//        l1.setBounds(280,40,400,40);
//        add(l1);
//
//        JLabel l2 =new JLabel("Account Details :");
//        l2.setFont(new Font("Raleway",Font.BOLD,22));
//        l2.setBounds(280,70,400,40);
//        add(l2);
//
//        JLabel l3 =new JLabel("Account Type :");
//        l3.setFont(new Font("Raleway",Font.BOLD,18));
//        l3.setBounds(100,130,200,30);
//        add(l3);
//
//        r1=new JRadioButton("Saving Account");
//        r1.setBackground(new Color(215,252,252));
//        r1.setFont(new Font("Raleway",Font.BOLD,16));
//        r1.setBounds(100,170,150,30);
//        add(r1);
//
//        r2=new JRadioButton("Fixed Dep Account");
//        r2.setBackground(new Color(215,252,252));
//        r2.setFont(new Font("Raleway",Font.BOLD,16));
//        r2.setBounds(300,170,200,30);
//        add(r2);
//
//        r3=new JRadioButton("current Account");
//        r3.setBackground(new Color(215,252,252));
//        r3.setFont(new Font("Raleway",Font.BOLD,16));
//        r3.setBounds(500,170,150,30);
//        add(r3);
//
//        r4=new JRadioButton("Recurring Deposit Account");
//        r4.setBackground(new Color(215,252,252));
//        r4.setFont(new Font("Raleway",Font.BOLD,16));
//        r4.setBounds(700,170,250,30);
//        add(r4);
//
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(r1);
//        buttonGroup.add(r2);
//        buttonGroup.add(r3);
//        buttonGroup.add(r4);
//
//
//        JLabel l4 =new JLabel("Card No :");
//        l4.setFont(new Font("Raleway",Font.BOLD,18));
//        l4.setBounds(100,220,200,30);
//        add(l4);
//
//        JLabel l5 =new JLabel("(Your 16-Digit Card No )");
//        l5.setFont(new Font("Raleway",Font.BOLD,12));
//        l5.setBounds(100,250,200,20);
//        add(l5);
//
//        JLabel l6 =new JLabel("XXXX-XXXX-XXXX-4841");
//        l6.setFont(new Font("Raleway",Font.BOLD,17));
//        l6.setBounds(330,220,250,20);
//        add(l6);
//
//        JLabel l7 =new JLabel("(IT WOULD APPEAR ON ATM CARD/CHEQUE BOOK AND STATEMENT )");
//        l7.setFont(new Font("Raleway",Font.BOLD,12));
//        l7.setBounds(330,250,500,20);
//        add(l7);
//
//        JLabel l8 =new JLabel("PIN NO :");
//        l8.setFont(new Font("Raleway",Font.BOLD,18));
//        l8.setBounds(100,290,150,30);
//        add(l8);
//
//        JLabel l9 =new JLabel("XXXX");
//        l9.setFont(new Font("Raleway",Font.BOLD,18));
//        l9.setBounds(330,290,150,30);
//        add(l9);
//
//        JLabel l10 =new JLabel("( 4-Digit password )");
//        l10.setFont(new Font("Raleway",Font.BOLD,12));
//        l10.setBounds(100,320,200,20);
//        add(l10);
//
//        JLabel l11 =new JLabel("SERVICES REQUIRED :");
//        l11.setFont(new Font("Raleway",Font.BOLD,18));
//        l11.setBounds(100,360,250,30);
//        add(l11);
//
//
//
//        s1=new JCheckBox("ATM CARD");
//        s1.setFont(new Font("Raleway",Font.BOLD,12));
//        s1.setBackground(new Color(215,252,252));
//        s1.setBounds(100,400,200,16);
//        add(s1);
//
//        s2=new JCheckBox("INTERNET BANKING");
//        s2.setFont(new Font("Raleway",Font.BOLD,12));
//        s2.setBackground(new Color(215,252,252));
//        s2.setBounds(330,400,200,16);
//        add(s2);
//
//        s3=new JCheckBox("MOBILE BANKING");
//        s3.setFont(new Font("Raleway",Font.BOLD,12));
//        s3.setBackground(new Color(215,252,252));
//        s3.setBounds(100,430,200,16);
//        add(s3);
//
//        s4=new JCheckBox("EMAIL ALERTS");
//        s4.setFont(new Font("Raleway",Font.BOLD,12));
//        s4.setBackground(new Color(215,252,252));
//        s4.setBounds(330,430,200,16);
//        add(s4);
//
//        s5=new JCheckBox("Cheque Book");
//        s5.setFont(new Font("Raleway",Font.BOLD,12));
//        s5.setBackground(new Color(215,252,252));
//        s5.setBounds(100,460,200,16);
//        add(s5);
//
//        s6=new JCheckBox("E-STATEMENT");
//        s6.setFont(new Font("Raleway",Font.BOLD,12));
//        s6.setBackground(new Color(215,252,252));
//        s6.setBounds(330,460,200,16);
//        add(s6);
//
//        JCheckBox c7 =new JCheckBox("I hearby declare that the above entered details are correct to best of my knowledge .",true);
//        c7.setFont(new Font("Raleway",Font.ITALIC,12));
//        c7.setBackground(new Color(215,252,252));
//        c7.setBounds(100,500,1200,16);
//        add(c7);
//
//        JLabel l12 =new JLabel("Form No :-");
//        l12.setFont(new Font("Raleway",Font.BOLD,12));
//        l12.setBackground(new Color(215,252,252));
//        l12.setBounds(700,10,100,30);
//        add(l12);
//
//        JLabel l13 =new JLabel(formno);
//        l13.setFont(new Font("Raleway",Font.BOLD,14));
//        l13.setBackground(new Color(215,252,252));
//        l13.setBounds(760,10,60,30);
//        add(l13);
//
//        s=new JButton("SUBMIT");
//        s.setFont(new Font("Raleway",Font.BOLD,14));
//        s.setBounds(300,550,100,30);
//        s.addActionListener(this);
//        s.setBackground(Color.black);
//        s.setForeground(Color.white);
//        add(s);
//
//        c=new JButton("CANCEL");
//        c.setFont(new Font("Raleway",Font.BOLD,14));
//        c.setBounds(600,550,100,30);
//        c.addActionListener(this);
//        c.setBackground(Color.black);
//        c.setForeground(Color.white);
//        add(c);
//
//
//        getContentPane().setBackground(new Color(215,252,252));
//        setSize(1000,800);
//        setLayout(null);
//        setLocation(100,20);
//        setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        String atype =null;
//        if(r1.isSelected()){
//            atype= "Saving Account";
//        }else if (r2.isSelected()){
//            atype="Fixed Dep Account";
//        } else if (r3.isSelected()) {
//            atype ="current Account";
//        }else if(r4.isSelected()){
//            atype="Recurring Deposit Account";
//        }
//        Random ran = new Random();
//        long first7 =(ran.nextLong()% 90000000L)+1409963000000000L;
//        String cardno =" "+ Math.abs(first7);
//
//        long first3 =(ran.nextLong()%9000L)+1000L;
//        String pin =""+Math.abs(first3);
//
//        String fac ="";
//        if(s1.isSelected())
//        {
//            fac= fac+"ATM CARD";
//        } else if (s2.isSelected()) {
//            fac=fac+"INTERNET BANKING";
//        } else if (s3.isSelected()) {
//            fac=fac+"MOBILE BANKING";
//        }  else if (s4.isSelected()) {
//            fac=fac+"EMAIL ALERTS";
//        } else if (s5.isSelected()) {
//            fac=fac+"Cheque Book";
//        } else if (s6.isSelected()) {
//            fac=fac+"E-STATEMENT";
//        }
//        try {
//            if(e.getSource()==s){
//                if(atype.equals("")){
//                    JOptionPane.showMessageDialog(null,"Fill all the fields");
//
//                }else {
//                    Connn c1 = new Connn();
//                    String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
//                    String q2 ="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
//                    c1.statement.executeUpdate(q1);
//                    c1.statement.executeUpdate(q2);
//                    JOptionPane.showMessageDialog(null, "Card Number :"+cardno+"\n pin : "+pin );
//                    new Deposit(pin);
//                    setVisible(false);
//                }
//            } else if (e.getSource()==c) {
//                System.exit(0);
//
//            }
//        }catch (Exception E)
//        {
//            E.printStackTrace();
//
//        }
//    }
//
//    public static void main(String[] args) {
//        new signup3("");
//
//    }
//}
