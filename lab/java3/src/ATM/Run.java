/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;
import javax.swing.JFrame;
/**
 *
 * @author HOANG
 */
public class Run {
    public static void main(String[] args) {
        Giaodien giaodien = new Giaodien();
        giaodien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        giaodien.setSize(400,400);
        giaodien.setVisible(true);
        giaodien.setResizable(false);
        giaodien.setLocationRelativeTo(null);
    }
    
    
}
