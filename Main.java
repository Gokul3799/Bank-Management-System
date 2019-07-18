package bdms;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Main  {
	public Main()
	{
		frame();
	}
		public void frame()
		{
	       JFrame f =new JFrame("LOGIN");
			try {
				f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("111.jpg")))));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		    JButton b=new JButton(new ImageIcon("ii.jpg"));    
			b.setBounds(700,450,100, 40);
			f.add(b);
			b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e)
		{ 
				f.dispose();
				JFrame f1 = new JFrame();
	            try {
					f1.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("22.jpg")))));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            JButton b1=new JButton("ADMIN");  
	            JButton b2=new JButton("STAFF");
	            JButton b3=new JButton("USER");
	         	b1.setBounds(900,220,75,25);
	         	b2.setBounds(900,430,75,25);
	         	b3.setBounds(900,630,75,25);
	         	f1.add(b1);
	         	f1.add(b2);
	         	f1.add(b3);
	            f1.pack();
	            f1.setVisible(true);
	            
			b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				admin a=new admin();
				a.adminlogin();
				f1.dispose();
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				staff z=new staff();
				z.stafflogin();
				f1.dispose();
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				user1 u=new user1();
				u.userlogin();
				f1.dispose();
			}
		});
			
		}
			
			});
    	f.pack();
	    f.setVisible(true);
		}

	public static void main(String ss[]) 
	{	
	new Main();
	}
	}
	
