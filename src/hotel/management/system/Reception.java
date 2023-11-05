package hotel.management.system;
import javax.swing.*;
import java.awt.*;
public class Reception extends JFrame{
	Reception(){
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JButton newcustomer=new JButton("New Customer Form");
		newcustomer.setBounds(10,30,200,30);
		newcustomer.setBackground(Color.BLACK);
		newcustomer.setForeground(Color.WHITE);
		add(newcustomer);
		
		JButton rooms=new JButton("Rooms");
		rooms.setBounds(10,70,200,30);
		rooms.setBackground(Color.BLACK);
		rooms.setForeground(Color.WHITE);
		add(rooms);
		
		JButton department=new JButton("Department");
		department.setBounds(10,110,200,30);
		department.setBackground(Color.BLACK);
		department.setForeground(Color.WHITE);
		add(department);
		
		JButton allemploye=new JButton("All Employee");
		allemploye.setBounds(10,150,200,30);
		allemploye.setBackground(Color.BLACK);
		allemploye.setForeground(Color.WHITE);
		add(allemploye);
		
		JButton customer=new JButton("Customer info");
		customer.setBounds(10,190,200,30);
		customer.setBackground(Color.BLACK);
		customer.setForeground(Color.WHITE);
		add(customer);
		
		JButton manager=new JButton("Manager info");
		manager.setBounds(10,230,200,30);
		manager.setBackground(Color.BLACK);
		manager.setForeground(Color.WHITE);
		add(manager);
		
		JButton checkout=new JButton("Checkout");
		checkout.setBounds(10,270,200,30);
		checkout.setBackground(Color.BLACK);
		checkout.setForeground(Color.WHITE);
		add(checkout);
		
		JButton update=new JButton("Update Status");
		update.setBounds(10,310,200,30);
		update.setBackground(Color.BLACK);
		update.setForeground(Color.WHITE);
		add(update);
		
		JButton roomstatus=new JButton("Update Room Status");
		roomstatus.setBounds(10,350,200,30);
		roomstatus.setBackground(Color.BLACK);
		roomstatus.setForeground(Color.WHITE);
		add(roomstatus);
		
		JButton pickup=new JButton("Pickup Service");
		pickup.setBounds(10,390,200,30);
		pickup.setBackground(Color.BLACK);
		pickup.setForeground(Color.WHITE);
		add(pickup);
		
		JButton searchroom=new JButton("Search room");
		searchroom.setBounds(10,430,200,30);
		searchroom.setBackground(Color.BLACK);
		searchroom.setForeground(Color.WHITE);
		add(searchroom);
		
		JButton logout=new JButton("Logout");
		logout.setBounds(10,470,200,30);
		logout.setBackground(Color.BLACK);
		logout.setForeground(Color.WHITE);
		add(logout);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
		JLabel image=new JLabel(i1);
		image.setBounds(250,30,500,470);
		add(image);
		
		
		setBounds(350,200,800,570);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Reception();
	}

}
