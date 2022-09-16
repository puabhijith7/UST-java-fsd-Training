package eventhandling;

import java.awt.*;  
import java.awt.event.*;  
class eve1 extends Frame implements ActionListener{  
TextField tf,tf1,tf2;  
eve1()
{   

tf=new TextField();  
tf.setBounds(100,60,170,20);
tf1=new TextField();  
tf1.setBounds(100,100,170,20);
tf2=new TextField();  
tf2.setBounds(100,140,170,20);
Button b=new Button("Submit");  
b.setBounds(140,180,80,30);    
b.addActionListener(this);  
add(b);
add(tf);  
add(tf1); 
add(tf2); 
setSize(600,600);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e)
{  
tf.setText("Textbox1");  
tf1.setText("Textbox2");
tf2.setText("Textbox3");
}  
public static void main(String args[])
{  
    new eve1();  
}  
}  
