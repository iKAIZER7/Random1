package hotel.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
	
	JTextField username;
	JPasswordField password;
	JButton login,cancele;
	
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel user=new JLabel("Username");
		user.setBounds(40,20,100,30);
		add(user);
		
		username=new JTextField();
		username.setBounds(150,20,150,30);
		add(username);
		
		JLabel pass=new JLabel("Password");
		pass.setBounds(40,70,100,30);
		add(pass);
		
	    password=new JPasswordField();
		password.setBounds(150,70,150,30);
		add(password);
		
		login=new JButton("Login");
		login.setBounds(40,150,120,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		cancele=new JButton("Cancel");
		cancele.setBounds(180,150,120,30);
		cancele.setBackground(Color.BLACK);
		cancele.setForeground(Color.WHITE);
		cancele.addActionListener(this);
		add(cancele);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
		Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(350,10,200,200);
		add(image);
		
		setBounds(500,200,600,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==login)
		{
			String user=username.getText();
			String pass=password.getText();
			
			try {
				conn c=new conn();
				String query="select*from login where username='"+user+"' and password='"+pass+"'";
				ResultSet rs=c.s.executeQuery(query);
				if(rs.next())
				{
					setVisible(false);
					new Dashboard();
				}else {
					JOptionPane.showMessageDialog(null,"Invailid username and password");
					setVisible(false);
				}
					
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}else if(ae.getSource()==cancele) {
			setVisible(false);
		}
	}
	public static void main(String args[])
	{
		new Login();
	}

}
