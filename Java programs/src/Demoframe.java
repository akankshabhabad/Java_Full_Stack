import java.awt.*;
import javax.swing.*;
public class Demoframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(500,270);
		frame.setTitle("Login page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.cyan);
		frame.setLayout(null);
		
		
		JLabel lblusername=new JLabel("Username:");
		frame.add(lblusername);
		lblusername.setBounds(50,50,100,30);   //setBounds(from x,from y,width,height)
		lblusername.setFont(new Font("Arial",Font.BOLD,18));   //BOLD,ITALIC,PLAIN are the variables of class Font which are static variables
		lblusername.setForeground(Color.red);
		
		JTextField txtusername=new JTextField();
		txtusername.setBounds(150,50,100,30);
		frame.add(txtusername);
		
		
		JLabel lblpassword=new JLabel();
		lblpassword.setText("Password:");
		frame.add(lblpassword);
		lblpassword.setBounds(50,110,100,30);   //setBounds(from x,from y,width,height)
		lblpassword.setFont(new Font("Arial",Font.BOLD,18));   //BOLD,ITALIC,PLAIN are the variables of class Font which are static variables
		lblpassword.setForeground(Color.red);
	
		
		JTextField txtpassword=new JTextField();
		txtpassword.setBounds(150,110,100,30);
		frame.add(txtpassword);
		JTextArea area=new JTextArea();
		
		
		JButton btnlogin=new JButton();
		btnlogin.setText("Login");
		btnlogin.setBounds(70,160,100,30);
		frame.add(btnlogin);
	
		
		
		JButton btncancel=new JButton();
		btncancel.setText("Cancel");
		btncancel.setBounds(200,160,100,30);
		frame.add(btncancel);
        
		
	}

}

