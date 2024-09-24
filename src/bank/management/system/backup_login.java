//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//
//public class Login extends JFrame implements ActionListener {
//    JLabel label1,label2,label3; // global declaration
//    JTextField textField2;
//    JPasswordField passwordField3;
//
//    JButton button1,button2,button3;
//    Login(){
//        super("BANK MANAGEMENT SYSTEM");// this will give title to frame// this should always be at top
//        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));// fetching image from system memory and storing in i1
//        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);// scaling the image i.e increasing its size
//        ImageIcon i3 = new ImageIcon(i2);// scaled image is again converted into image icon
//        JLabel image = new JLabel(i3);// as image icon cannot directly added to frame so we need JLable for adding image on frame
//        image.setBounds(350,10,100,100); // location where in frame to add the image
//        add(image);// adding the image
//
//        ImageIcon ii1 =new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
//        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon ii3 = new ImageIcon(ii2);
//        JLabel iimage = new JLabel(ii3);
//        iimage.setBounds(630,350,100,100);
//        add(iimage);
//
//        label1 = new JLabel("WELCOME TO ATM"); // showing text on frame
//        label1.setForeground(Color.white);
//        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
//        label1.setBounds(230,125,450,40);
//        add(label1);
//
//        label2=new JLabel("Card N0 :");
//        label2.setFont(new Font("Ralway",Font.BOLD,28));
//        label2.setForeground(Color.white);
//        label2.setBounds(150,190,375,30);
//        add(label2);
//
//        textField2 =new JTextField(15);
//        textField2.setBounds(325,190,230,30);
//        textField2.setFont(new Font("Arial",Font.BOLD,14));
//        add(textField2);
//
//        label3=new JLabel("PIN  :");
//        label3.setFont(new Font("Ralway",Font.BOLD,28));
//        label3.setForeground(Color.white);
//        label3.setBounds(150,250,375,30);
//        add(label3);
//
//        passwordField3 =new JPasswordField(15);
//        passwordField3.setBounds(325,250,230,30);
//        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
//        add(passwordField3);
//
//        button1=new JButton("SIGN IN");
//        button1.setFont(new Font("Arial",Font.BOLD,14));
//        button1.setForeground(Color.black);
//        button1.setBounds(300,300,100,30);
//        button1.setBackground(Color.yellow);
//        button1.addActionListener(this);
//        add(button1);
//
//        button2=new JButton("CLEAR");
//        button2.setFont(new Font("Arial",Font.BOLD,14));
//        button2.setForeground(Color.black);
//        button2.setBackground(Color.YELLOW);
//        button2.setBounds(430,300,100,30);
//        button2.addActionListener(this);
//
//        add(button2);
//
//        button3 =new JButton("SIGNUP");
//        button3.setFont(new Font("Arial",Font.BOLD,14));
//        button3.setBackground(Color.BLACK);
//        button3.setForeground(Color.WHITE);
//        button3.setBounds(300,350,230,30);
//        button3.addActionListener(this);
//
//        add(button3);
//
//        ImageIcon iii1 =new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
//        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
//        ImageIcon iii3 = new ImageIcon(iii2);
//        JLabel iiimage = new JLabel(iii3);
//        iiimage.setBounds(0,0,850,480);
//        add(iiimage);
//
//
//
//
//
//        setLayout(null);
//        setSize(850,480); // setting size of frame
//        setLocation(300,150); // making frame open from centre
//        setVisible(true); // setting visiblity of frame // always at bottom
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        try {
//            if(e.getSource()==button1){
//                Connn c= new Connn();
//                String cardno= textField2.getText();
//                String pin =passwordField3.getText();
//                String q ="select * from login where card_no='"+cardno+"'and pin = '"+pin+"'";
//                ResultSet resultSet = c.statement.executeQuery(q);
//
//                if(resultSet.next()){
//                    setVisible(false);
//                    new main_Class(pin);
//                }
//
//            }else  if (e.getSource()==button2){
//                textField2.setText("");
//                passwordField3.setText("");
//            } else if (e.getSource()==button3) {
//                new Signup();
//                setVisible(false);
//            }
//        } catch (Exception E) {
//            E.printStackTrace();
//
//
//        }
//    }
//
//    public static void main(String[] args) {
//
//        new Login();
//
//    }
//
//}
