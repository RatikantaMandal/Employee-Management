
package employee.management.system;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.sql.*;


public class UpdateEmployee extends JFrame implements ActionListener{
    
    
    JButton add,back;
    JTextField tfeducation,tffname,tfsalary,tfaddress,tfphone,tfemail,tfdesignation,tfaadhar;
   
    JLabel lblempId;
    String empId;
            
    UpdateEmployee(String empId)
    {
        this.empId=empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading=new JLabel("UPDATE EMPLOYEE DETAILS");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(50,150,150,30);
        lblname.setFont(new Font("serif",Font.PLAIN,20));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(200,150,150,30);
        add(labelname);
       
        
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
        
        JLabel labeldob =new JLabel();
        labeldob.setBounds(200,200,150,30);
        add(labeldob);
        
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
        
        
        tfeducation= new JTextField();
        tfeducation.setBounds(620,300,150,30);
        add(tfeducation);
        
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
        
        JLabel labelaadhar=new JLabel();
        labelaadhar.setBounds(620,350,150,30);
        add(labelaadhar);
        
        JLabel lblempid=new JLabel("Employee Id");
        lblempid.setBounds(50,400,150,30);
        lblempid.setFont(new Font("serif",Font.PLAIN,20));
        add(lblempid);
        
        
        lblempId=new JLabel();
        lblempId.setBounds(200,400,150,30);
        lblempId.setFont(new Font("serif",Font.PLAIN,20));
        add(lblempId);
        
        try{
            Conn c=new Conn();
            String query="select * from employee where empId='"+empId+"'";
            ResultSet rs=c.stmt.executeQuery(query);
            
            while(rs.next())
                    {
                        labelname.setText(rs.getString("name"));
                        tffname.setText(rs.getString("fname"));
                        lbldob.setText(rs.getString("dob"));
                        tfaddress.setText(rs.getString("address"));
                        tfsalary.setText(rs.getString("salary"));
                        tfphone.setText(rs.getString("phone"));
                        tfemail.setText(rs.getString("email"));
                        tfeducation.setText(rs.getString("education"));
                        labelaadhar.setText(rs.getString("aadhar"));
                        lblempId.setText(rs.getString("empId"));
                        tfdesignation.setText(rs.getString("designation"));
                        
                    }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        add=new JButton("Update Details");
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
            
            String fname=tffname.getText();
            
            String salary=tfsalary.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String education=tfeducation.getText();
            String designation=tfdesignation.getText();
            
            try{
                
                Conn c=new Conn();
                String query= " update employee set fname='"+fname+"',salary='"+salary+"',address='"+address+"',phone='"+phone+"',email='"+email+"',education='"+education+"',designation='"+designation+"' where empId='"+empId+"'";
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Updated successfully");
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
        new UpdateEmployee(" ");
    }
}
