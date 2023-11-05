package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener{
	JButton add,cancel;JTextField tflocation,tfmodel,tfname,tfage,tfcompany;JComboBox typecombo,availablecombo,gendercombo;
	AddDriver()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading=new JLabel("Add Drivers");
		heading.setFont(new Font("Tahoma",Font.BOLD,18));
		heading.setBounds(150,10,200,20);
		add(heading);
		
		JLabel roomno=new JLabel("Name");
		roomno.setFont(new Font("Tahoma",Font.PLAIN,16));
		roomno.setBounds(60,70,120,20);
		add(roomno);
		
		tfname=new JTextField();
		tfname.setBounds(200,80,150,30);
		add(tfname);
		
		JLabel available=new JLabel("Age");
		available.setFont(new Font("Tahoma",Font.PLAIN,16));
		available.setBounds(60,130,120,30);
		add(available);
		
		tfage=new JTextField();
		tfage.setBounds(200,130,150,30);
		add(tfage);
		
		JLabel clean=new JLabel("Driver");
		clean.setFont(new Font("Tahoma",Font.PLAIN,16));
		clean.setBounds(60,110,120,30);
		add(clean);
		
		String cleanOptions[]= {"Male","Female"};
		gendercombo=new JComboBox(cleanOptions);
		gendercombo.setBounds(200,150,150,30);
		gendercombo.setBackground(Color.WHITE);
		add(gendercombo);
		
		JLabel price=new JLabel("Car Company");
		price.setFont(new Font("Tahoma",Font.PLAIN,16));
		price.setBounds(60,190,120,20);
		add(price);
		
		tfcompany=new JTextField();
		tfcompany.setBounds(200,190,150,30);
		add(tfcompany);
		
		JLabel bedtype=new JLabel("Car Model");
		bedtype.setFont(new Font("Tahoma",Font.PLAIN,16));
		bedtype.setBounds(60,230,120,30);
		add(bedtype);
		
		tfmodel=new JTextField();
		tfmodel.setBounds(200,230,150,30);
		add(tfmodel);
		
		JLabel bedavailable=new JLabel("Available");
		bedavailable.setFont(new Font("Tahoma",Font.PLAIN,16));
		bedavailable.setBounds(60,270,120,30);
		add(bedavailable);
		
		String driverOptions[]= {"Available","Busy"};
		availablecombo=new JComboBox(driverOptions);
		availablecombo.setBounds(200,270,150,30);
		availablecombo.setBackground(Color.WHITE);
		add(availablecombo);
		
		JLabel lbllocation=new JLabel("Location");
		lbllocation.setFont(new Font("Tahoma",Font.PLAIN,16));
		lbllocation.setBounds(60,310,120,30);
		add(lbllocation);
		
		tflocation=new JTextField();
		tflocation.setBounds(200,310,150,30);
		add(tflocation);
		
		add=new JButton("Add Driver");
		add.setForeground(Color.WHITE);
		add.setBackground(Color.BLACK);
		add.setBounds(60,350,130,30);
		add.addActionListener((ActionListener) this);
		add(add);
		
		cancel=new JButton("Cancel");
		cancel.setForeground(Color.WHITE);
		cancel.setBackground(Color.BLACK);
		cancel.setBounds(220,350,130,30);
		add.addActionListener((ActionListener) this);
		add(cancel);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
		Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(400,30,500,300);
		add(image);
		
		
		setBounds(300,200,980,470);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==add) {
			String name=tfname.getText();
			String gender=tfage.getText();
		    String age=(String) gendercombo.getSelectedItem();
		    String company=tfcompany.getText();
		    String brand=tfmodel.getText();
		    String available=(String) availablecombo.getSelectedItem();
		    String location=tflocation.getText();
		    try {
		    	conn conn=new conn();
		    	String str="insert into driver values('"+name+"', '"+gender+"', '"+age+"', '"+company+"', '"+brand+"', '"+available+"', '"+location+"')";
		    	conn.s.executeUpdate(str);
		    	JOptionPane.showMessageDialog(null,"Driver added successfully");
		    	setVisible(false);
		    	
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
		}else if(ae.getSource()==cancel) {
			setVisible(false);
		}
		
	}
	public static void main(String args[])
	{
		new AddDriver();
	}

}
