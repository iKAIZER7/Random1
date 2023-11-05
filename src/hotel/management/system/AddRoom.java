package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class AddRoom extends JFrame implements ActionListener {
	JButton add,cancel;JTextField tfroom,tfprice;JComboBox typecombo,availablecombo,cleancombo;
	AddRoom()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading=new JLabel("Add Rooms");
		heading.setFont(new Font("Tahoma",Font.BOLD,18));
		heading.setBounds(150,20,200,20);
		add(heading);
		
		JLabel roomno=new JLabel("Room No");
		roomno.setFont(new Font("Tahoma",Font.PLAIN,16));
		roomno.setBounds(60,80,120,20);
		add(roomno);
		
		tfroom=new JTextField();
		tfroom.setBounds(200,80,150,30);
		add(tfroom);
		
		JLabel available=new JLabel("Available");
		available.setFont(new Font("Tahoma",Font.PLAIN,16));
		available.setBounds(60,130,120,30);
		add(available);
		
		String availableOptions[]= {"Available","Occupied"};
		availablecombo=new JComboBox(availableOptions);
		availablecombo.setBounds(200,130,150,30);
		availablecombo.setBackground(Color.WHITE);
		add(availablecombo);
		
		JLabel clean=new JLabel("Cleaning Status");
		clean.setFont(new Font("Tahoma",Font.PLAIN,16));
		clean.setBounds(60,180,120,30);
		add(clean);
		
		String cleanOptions[]= {"Cleaned","Dirty"};
		cleancombo=new JComboBox(cleanOptions);
		cleancombo.setBounds(200,180,150,30);
		cleancombo.setBackground(Color.WHITE);
		add(cleancombo);
		
		JLabel price=new JLabel("Room Price");
		price.setFont(new Font("Tahoma",Font.PLAIN,16));
		price.setBounds(60,230,120,20);
		add(price);
		
		tfprice=new JTextField();
		tfprice.setBounds(200,230,150,30);
		add(tfprice);
		
		JLabel bedtype=new JLabel("Bed Type");
		bedtype.setFont(new Font("Tahoma",Font.PLAIN,16));
		bedtype.setBounds(60,280,120,30);
		add(bedtype);
		
		String typeOptions[]= {"Single Bed","Double Bed"};
		typecombo=new JComboBox(typeOptions);
		typecombo.setBounds(200,280,150,30);
		typecombo.setBackground(Color.WHITE);
		add(typecombo);
		
		add=new JButton("Add Room");
		add.setForeground(Color.WHITE);
		add.setBackground(Color.BLACK);
		add.setBounds(60,350,130,30);
		add.addActionListener(this);
		add(add);
		
		cancel=new JButton("Cancel");
		cancel.setForeground(Color.WHITE);
		cancel.setBackground(Color.BLACK);
		cancel.setBounds(220,350,130,30);
		add.addActionListener(this);
		add(cancel);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
		JLabel image=new JLabel(i1);
		image.setBounds(400,30,500,300);
		add(image);
		
		
		setBounds(330,200,940,470);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==add) {
			String roomnumber=tfroom.getText();
			String availability=(String) availablecombo.getSelectedItem();
		    String status=(String) cleancombo.getSelectedItem();
		    String price=tfprice.getText();
		    String type=(String) typecombo.getSelectedItem();
		    try {
		    	conn conn=new conn();
		    	String str="insert into room values('"+roomnumber+"', '"+availability+"', '"+status+"', '"+price+"', '"+type+"')";
		    	conn.s.executeUpdate(str);
		    	JOptionPane.showMessageDialog(null,"New Room added successfully");
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
		new AddRoom();
	}

}
