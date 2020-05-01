/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author HOANG
 */
public class Giaodien extends JFrame implements ActionListener{

    private JButton btn100;
    private String txt;
    private JButton btn200;
    private JButton btn500;
    private JButton btn1000;
    private JButton btn1500;
    private JButton btn2000;
    private JButton btn3000;
    private JButton btn5000;
    private JLabel label;
    private JTextField txtnumber;
    private JButton btnsubmid;
    private JButton btnCheckB;
    private JButton btnExit;
    
    int num=0;
    int tk=3000;

    public Giaodien(){
        super("ATM");
        gui();
    }
    private void gui(){
        Box b = Box.createVerticalBox();
        //panel buttton
        Box b1 = Box.createHorizontalBox();
        b.add(b1);
        b.add(Box.createVerticalStrut(5));
        this.add(b1,BorderLayout.NORTH);
        JPanel panel = new JPanel();
        b1.add(panel);
        panel.setLayout(new GridLayout(2,4,20,20));
        panel.setPreferredSize(new Dimension(390,200));
        panel.add(btn100 = new JButton("100"));
        btn100.setActionCommand("100");
        btn100.addActionListener(this);
        
        panel.add(btn200 = new JButton("200"));
        btn200.setActionCommand("200");
        btn200.addActionListener(this);
        
        panel.add(btn500 = new JButton("500"));
        btn500.setActionCommand("500");
        btn500.addActionListener(this);
        
        panel.add(btn1000 = new JButton("1000"));
        btn1000.setActionCommand("1000");
        btn1000.addActionListener(this);
        
        panel.add(btn1500 = new JButton("1500"));
        btn1500.setActionCommand("1500");
        btn1500.addActionListener(this);
        
        panel.add(btn2000 = new JButton("2000"));
        btn2000.setActionCommand("2000");
        btn2000.addActionListener(this);
        
        panel.add(btn3000 = new JButton("3000"));
        btn3000.setActionCommand("3000");
        btn3000.addActionListener(this);
        
        panel.add(btn5000 = new JButton("5000"));
        btn5000.setActionCommand("5000");
        btn5000.addActionListener(this);
        
            
        //enter number
        Box b2 = Box.createHorizontalBox();            
        b.add(b2);
        b.add(Box.createVerticalStrut(5));
         
        this.add(b2,BorderLayout.CENTER);
        JPanel panel2 = new JPanel();
        b2.add(panel2);
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT,12,0));
        panel2.setPreferredSize(new Dimension(390,100));
        panel2.add(label = new JLabel("Enter number"));
        panel2.add(Box.createRigidArea(new Dimension(5,0)));
        panel2.add(txtnumber = new JTextField(15));
        txtnumber.addActionListener(this);
        panel2.add(Box.createRigidArea(new Dimension(5,0)));
        panel2.add(btnsubmid = new JButton("Submid"));
        btnsubmid.setActionCommand("submid");
        btnsubmid.addActionListener(this);
        
        
        //
        Box b3 = Box.createHorizontalBox();
        b.add(b3);
        b.add(Box.createVerticalStrut(5));
        this.add(b3,BorderLayout.SOUTH);
        JPanel panel3 = new JPanel();
        
        b3.add(panel3);
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT,5,0));
        panel3.setPreferredSize(new Dimension(390,100));
        panel3.add(btnCheckB = new JButton("Check balance"));
        btnCheckB.addActionListener(this);
        panel3.add(Box.createRigidArea(new Dimension(0,0)));
        panel3.add(btnExit = new JButton("Exit"));
        btnExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("100".equals(e.getActionCommand())){
            num = num +100;
            txtnumber.setText(String.valueOf(num));
        }
        if("200".equals(e.getActionCommand())){
            num = num +200;
            txtnumber.setText(String.valueOf(num));
        }
        if("500".equals(e.getActionCommand())){
            num = num +500;
            txtnumber.setText(String.valueOf(num));
        }
        if("1000".equals(e.getActionCommand())){
            num = num +1000;
            txtnumber.setText(String.valueOf(num));
        }
        if("1500".equals(e.getActionCommand())){
            num = num +1500;
            txtnumber.setText(String.valueOf(num));
        }
        if("2000".equals(e.getActionCommand())){
            num = num +2000;
            txtnumber.setText(String.valueOf(num));
        }
        if("3000".equals(e.getActionCommand())){
            num = num +3000;
            txtnumber.setText(String.valueOf(num));
        }
        if("5000".equals(e.getActionCommand())){
            num = num +5000;
            txtnumber.setText(String.valueOf(num));
        }
        //button submid
        if(e.getSource().equals(btnsubmid)){
            int a = Integer.parseInt(txtnumber.getText());
            if(a>tk){
                JOptionPane.showMessageDialog(this, "Tài khoản không đủ");
            }
            else{
                JOptionPane.showMessageDialog(this, "Rút thành công,tài khoản của bạn còn: " +(tk-a));
                tk= tk-a;
                
            }
        }
        
        //button check balance
        if(e.getSource().equals(btnCheckB)){
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn là: " +tk);
        }
        
        //button exit
        if(e.getSource().equals(btnExit)){
           int kq= JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát không?","Exit",JOptionPane.YES_NO_OPTION);
           if(kq==0){
               System.exit(0);
           }
           else{
               JOptionPane.showMessageDialog(this, "Nhập lựa chọn");
           }
        }
        
    }
}
