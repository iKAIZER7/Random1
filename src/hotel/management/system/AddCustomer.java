package hotel.management.system;
import javax.swing.*;
import java.awt.*; 
public class AddCustomer extends JFrame{
	JComboBox comboid;
	JTextField tfnumber;
	AddCustomer(){
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel text=new JLabel("New Customer Form");
		text.setBounds(100,20,300,30);
		text.setFont(new Font("Raleway",Font.PLAIN,20));
		add(text);
		
		JLabel lblid=new JLabel("ID");
		lblid.setBounds(35,80,100,20);
		lblid.setFont(new Font("Raleway",Font.PLAIN,20));
		add(lblid);
		
		String options[]= {"Aadhar card","Passport","Driving License","Ration Card"};
		comboid=new JComboBox(options);
		comboid.setBounds(200,80,150,25);
		comboid.setBackground(Color.WHITE);
		add(comboid);
		
		JLabel lblnumber=new JLabel("Number");
		lblnumber.setBounds(35,120,100,20);
		lblnumber.setFont(new Font("Raleway",Font.PLAIN,20));
		add(lblnumber);
		
		
		
		setBounds(350,200,800,550);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new AddCustomer();
	}

}
