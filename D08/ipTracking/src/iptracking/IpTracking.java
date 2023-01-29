/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iptracking;
import javax.swing.*;  
import java.awt.event.*;  
import java.net.*; 
/**
 *
 * @author hossa
 */ 
public class IpTracking extends JFrame implements ActionListener{  
    JLabel l;  
    JTextField tf;  
    JButton b;  
IpTracking(){  
    super("IP Finder Tool");  
    l=new JLabel("Enter URL:");  
    l.setBounds(50,70,150,20);;  
    tf=new JTextField();  
    tf.setBounds(50,100,200,20);  
      
    b=new JButton("Find IP");  
    b.setBounds(50,150,80,30);  
    b.addActionListener(this);  
    add(l);  
    add(tf);  
    add(b);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
}  
@Override
public void actionPerformed(ActionEvent e){  
     String url=tf.getText(); 
try { 
InetAddress ia=InetAddress.getByName(url); 
String ip=ia.getHostAddress(); 
JOptionPane.showMessageDialog(this,ip); 
} catch (UnknownHostException e1) { 
JOptionPane.showMessageDialog(this,e1.toString()); 
} 
}

public static void main(String args[]) {  
    new IpTracking();  
}  
} 