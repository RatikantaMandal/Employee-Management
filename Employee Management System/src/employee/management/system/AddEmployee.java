
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;


public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran=new Random();
    int number=ran.nextInt(999999);
    
    
    JButton add,back;
    JTextField tfname,tffname,tfsalary,tfaddress,tfphone,tfemail,tfdesignation,tfaadhar;
    JDateChooser dcdob;
    JComboBox cbedu;
    JLabel lblempId;
            
    AddEmployee()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading=new JLabel("ADD EMPLOYEE DETAILS");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(50,150,150,30);
        lblname.setFont(new Font("serif",Font.PLAIN,20));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        JLabel lblfname=new JLabel("Father Name");
        lblfname.setBounds(450,150,150,30);
        lblfname.setFont(new Font("serif",Font.PLAIN,20));
        add(lblfname);
        
        tffname=new JTextField();
        tffname.setBounds(620,150,150,30);
        add(tffname);
        
        JLabel lbldob=new JLabel("Date Of Birth");
        lbldob.setBounds(50,200,150,30);
        lbldob.setFont(new Font("serif",Font.PLAIN,20));
        add(lbldob);
        
        dcdob=new JDateChooser();
        dcdob.setBounds(200,200,150,30);
        add(dcdob);
        
         JLabel lblsalary=new JLabel("Salary");
        lblsalary.setBounds(450,200,150,30);
        lblsalary.setFont(new Font("serif",Font.PLAIN,20));
        add(lblsalary);
        
        tfsalary=new JTextField();
        tfsalary.setBounds(620,200,150,30);
        add(tfsalary);
        
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(50,250,150,30);
        lbladdress.setFont(new Font("serif",Font.PLAIN,20));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(450,250,150,30);
        lblphone.setFont(new Font("serif",Font.PLAIN,20));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(620,250,150,30);
        add(tfphone);
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(50,300,150,30);
        lblemail.setFont(new Font("serif",Font.PLAIN,20));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel lbledu=new JLabel("Highest Education");
        lbledu.setBounds(450,300,150,30);
        lbledu.setFont(new Font("serif",Font.PLAIN,20));
        add(lbledu);
        
        String course[]={"BBA","BCA","BA","B.COM","B.TECH","MBA","MCA","MA","M.Tech","MSC","BSC","PHD"};
        cbedu= new JComboBox(course);
        cbedu.setBounds(620,300,150,30);
        cbedu.setBackground(Color.WHITE);
        add(cbedu);
        
        JLabel lbldesignation=new JLabel("Designation");
        lbldesignation.setBounds(50,350,150,30);
        lbldesignation.setFont(new Font("serif",Font.PLAIN,20));
        add(lbldesignation);
        
        tfdesignation=new JTextField();
        tfdesignation.setBounds(200,350,150,30);
        add(tfdesignation);
        
        
        JLabel lblaadhar=new JLabel("Aadhar");
        lblaadhar.setBounds(450,350,150,30);
        lblaadhar.setFont(new Font("serif",Font.PLAIN,20));
        add(lblaadhar);
        
        tfaadhar=new JTextField();
        tfaadhar.setBounds(620,350,150,30);
        add(tfaadhar);
        
        JLabel lblempid=new JLabel("Employee Id");
        lblempid.setBounds(50,400,150,30);
        lblempid.setFont(new Font("serif",Font.PLAIN,20));
        add(lblempid);
        
        
        lblempId=new JLabel(" " +number);
        lblempId.setBounds(200,400,150,30);
        lblempId.setFont(new Font("serif",Font.PLAIN,20));
        add(lblempId);
        
        add=new JButton("Add Details");
        add.setBounds(250,550,150,40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back=new JButton("Back");
        back.setBounds(450,550,150,40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        setBounds(300,50,900,700);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==add)
        {
            String name=tfname.getText();
            String fname=tffname.getText();
            String dob=((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary=tfsalary.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String education=(String) cbedu.getSelectedItem();
            String designation=tfdesignation.getText();
            String aadhar=tfaadhar.getText();
            String empId=lblempId.getText();
            
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name should not be empty");
                return;
            }
            if(fname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "FName should not be empty");
                return;
            }
            if(salary.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Salaryshould not be empty");
                return;
            }
            if(address.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Address should not be empty");
                return;
            }if(email.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Email should not be empty");
                return;
            }if(designation.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Designation should not be empty");
                return;
            }if(aadhar.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Aadhar Number should not be empty");
                return;
            }if(empId.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Employee Id should not be empty");
                return;
            }if(dob.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Date Of Birth should not be empty");
                return;
            } 
            
            
            
            try{
                
                Conn c=new Conn();
                String query= " insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empId+"')";
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details added successfully");
                setVisible(false);
                new Home();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }else
        {
            setVisible(false);
            new Home();
        }
        
    }
    
    public static void main(String args[])
    {
        new AddEmployee();
    }
}
