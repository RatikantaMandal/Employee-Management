
package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    
    JButton click;
    
    Splash()
    {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.RED);
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100, 700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        click =new JButton("CLICK HERE TO CONTINUE");
        click.setBounds(400,400,300,70);
        click.setBackground(Color.BLACK);
        click.setForeground(Color.WHITE);
        click.addActionListener(this);
        image.add(click);
        
        
         setBounds(190,75,1170,650);
//        setSize(1170,650);
//        setLocation(190,75);
        setVisible(true);
        
        
        while(true)
        {
            heading.setVisible(false);
            try
            {
                Thread.sleep(500);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            
            heading.setVisible(true);
            try
            {
                Thread.sleep(500);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
       setVisible(false);
       new Login();
    }
    
    public static void main(String args[])
    {
     new Splash();   
    }
}
