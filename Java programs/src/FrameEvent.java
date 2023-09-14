import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameEvent extends JFrame implements ActionListener{

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			FrameEvent frame=new FrameEvent();
			frame.setVisible(true);
			frame.setSize(700,400);
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
			btnlogin.addActionListener(frame);
		
			
			
			JButton btncancel=new JButton();
			btncancel.setText("Cancel");
			btncancel.setBounds(200,160,100,30);
			frame.add(btncancel);
	        
			
		}

		@Override
		public void actionPerformed(ActionEvent ae) {
			// System.out.println("Login successfully...");
			JFrame f=new JFrame();
			JOptionPane.showMessageDialog(f,"Login successfully...");
		}

	}



