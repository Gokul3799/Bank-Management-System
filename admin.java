package bdms;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class admin {
	public void adminlogin()
	{ 
		//password and id verification
		
		JFrame f4 = new JFrame();
        try {
			f4.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("33.jpg")))));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        JTextField user = new JTextField(); 
        user.setBounds(140,337, 250,47);  
        JPasswordField pass = new JPasswordField();   
        pass.setBounds(140,442,250,47);
        JButton b1=new JButton(new ImageIcon("4.jpg"));
     	b1.setBounds(140,590,250,47);
     	JButton b2=new JButton("BACK");
     	b2.setBounds(140, 645, 250,47);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String id=user.getText();
				@SuppressWarnings("deprecation")
				String pwd=pass.getText();
				if(id.equals("ADMIN")&&pwd.equals("12345"))
				{
					JOptionPane.showMessageDialog(f4, "LOGGED IN AS ADMIN","LOGIN",JOptionPane.PLAIN_MESSAGE);
					admin a=new admin();
					a.admin1();
					f4.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(f4, "ADMIN_ID OR PASSWORD IS INCORRECT","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Main m=new Main();
				//m.frame();
				f4.dispose();
			}
		});

        f4.add(user);
        f4.add(pass);
     	f4.add(b1);
     	f4.add(b2);
        f4.pack();
        f4.setVisible(true);
	}
	public void admin1() 
	{
			try
			{
			 //admin features
						
				JFrame f3=new JFrame();
				f3.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("551.jpg")))));
				f3.setVisible(true);
				JButton b1=new JButton("CREATE USER");
				JButton b2=new JButton("UPDATE ACCOUNT");
				JButton b3=new JButton("CREATE STAFF");
				JButton b4=new JButton("TRANSACTION");
				JButton b5=new JButton("DELETE USER");
				JButton b6=new JButton("BANK USERS");
				JButton b7=new JButton("USER  DETAIL");
				JButton b8=new JButton("LOGOUT");
				b1.setBounds(160,100,250,47);
			 	b2.setBounds(160,180,250,47);
			 	b3.setBounds(160,280,250,47);
			 	b4.setBounds(160,380,250,47);
			 	b5.setBounds(160,480,250,47);
			 	b6.setBounds(160,580,250,47);
			 	b7.setBounds(160,670,250,47);
			 	b8.setBounds(160,760,250,47);
			 	f3.add(b1);
			 	f3.add(b2);
			 	f3.add(b3);
			 	f3.add(b4);
			 	f3.add(b5);
			 	f3.add(b6);
			 	f3.add(b7);
			 	f3.add(b8);
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						int o=1;
						fun fn=new fun();
						fn.acccreate(o);
						f3.dispose();
					}
				});
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						fun fn=new fun();
						try {
							int k=1;
							fn.update(k);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						f3.dispose();
					}
				});
				b3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						fun fn=new fun();
						fn.staffacc();
						f3.dispose();
					}
				});
				b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						fun fn=new fun();
						try {
							int m=1;
							fn.atmtransact(m);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						f3.dispose();
					}
				});
				b5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						int a=1;
						fun fn=new fun();
						try {
							fn.delacc(a);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						f3.dispose();
					}
				});
				b6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						fun fn=new fun();
						try {
							int a=1;
							fn.list(a);
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
						try {
							int a=1;
							fn.accountdet(a);
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
						admin adm=new admin();
						adm.adminlogin();
						f3.dispose();
					}
				});
				 f3.pack();
			     f3.setVisible(true);
			   
				}
				catch (IOException e1) {
			     e1.printStackTrace();
			 }
				}
			}
