package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    Deposit(String pin){
        this.pin=pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2 (1).png"));
        Image i2 =i1.getImage().getScaledInstance(1550,880,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l3 =new JLabel(i3);
        l3.setBounds(0,0,1250,750);
        add(l3);

        JLabel label1 =new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(300,120,400,35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(65,125,120));
        textField.setForeground(Color.white);
        textField.setBounds(300,150,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        b1=new JButton("DEPOSIT");
        b1.setBounds(550,320 ,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);


        b2=new JButton("BACK");
        b2.setBounds(550,360 ,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);

        b2.addActionListener(this);
        l3.add(b2);








        setLayout(null);
        setSize(1550,1050);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date =new Date();
            if (e.getSource()==b1){
                 if(textField.getText().equals("")){
                     JOptionPane.showMessageDialog(null,"PLEASE ENTER THE AMOUNT YOU WANT TO DEPOSIT");
                 }
                 else {
                     Connn c = new Connn();
                     c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                     JOptionPane.showMessageDialog(null,"Rs "+amount+"Deposited Sucessfully ");
                     setVisible(false);
                     new main_Class(pin);
                 }
            }else if(e.getSource()==b2){
                 setVisible(false);
                 new main_Class(pin);
            }
        }catch(Exception E){

            E.printStackTrace();

        }
    }

    public static void main(String[] args) {

        new Deposit("");
    }
}
