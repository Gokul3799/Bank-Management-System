package bdms;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class user1 {
	public void userlogin()
	{
		

		JFrame f2 = new JFrame();
        try {
			f2.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("33.jpg")))));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        JTextField user1= new JTextField();  
        user1.setBounds(140,337, 250,47);  
        JPasswordField pass = new JPasswordField();   
        pass.setBounds(140,442,250,47);
        JButton b1=new JButton(new ImageIcon("4.jpg"));
     	b1.setBounds(140,585,250,47);
     	JButton b2=new JButton("BACK");
     	b2.setBounds(140, 640, 250,47);
     	
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String uid=user1.getText();
				@SuppressWarnings("deprecation")
				String up=pass.getText();
				BufferedReader b = null;
				try {
					b = new BufferedReader(new FileReader("USER_DETAILS.txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String d="";
				try {
					//int cnt=0;
					while((d=b.readLine())!=null)
					{
						String ss[]=d.split("#");
						if(ss[4].equals(uid)&&ss[5].equals(up))
						{
							JOptionPane.showMessageDialog(f2, "LOGGED IN AS USER","LOGIN",JOptionPane.PLAIN_MESSAGE);
							user1 a=new user1();
							a.user();
							f2.dispose();
							break;
						}
					
					}
					if(d==null)
					{
			
							JOptionPane.showMessageDialog(f2, "USER_ID OR PASSWORD IS INCORRECT","ERROR",JOptionPane.ERROR_MESSAGE);
						
					}
					
						
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					try {
						b.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Main m=new Main();
				
				f2.dispose();
			}
		});
		 f2.add(user1);
         f2.add(b1);
         f2.add(b2);
      	f2.add(pass);
         f2.pack();
         f2.setVisible(true);
       
	}
	public  void user()  
	{	
		try
		{
		JFrame f3=new JFrame();
		f3.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("552.jpg")))));
		f3.setVisible(true);
		
		JButton b1=new JButton("BALANCE ENQUIRY");
		JButton b7=new JButton("DEBIT/CREDIT");
		JButton b8=new JButton("LOGOUT");
		b1.setBounds(160,160,250,47);
     	b7.setBounds(160,330,250,47);
     	b8.setBounds(160,530,250,47);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				fun fn=new fun();
				try {
					int a=3;
					fn.accountdet(a);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				f3.dispose();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				fun fn=new fun();
				try {int a=3;
					fn.atmtransact(a);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				f3.dispose();
			}
		});

		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				user1 u=new user1();
				u.userlogin();
				f3.dispose();
			}
		});
		f3.add(b1);
     	f3.add(b7);
     	f3.add(b8);
		f3.pack();
	     f3.setVisible(true);
	   
		}
		catch (IOException e1) {
	     e1.printStackTrace();
	 }
	}

}


			

	

