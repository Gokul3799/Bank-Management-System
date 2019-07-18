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

public class staff {
	@SuppressWarnings("deprecation")
	public void stafflogin()
	{
	
		JFrame f3 = new JFrame();
        try {
			f3.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("33.jpg")))));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        JTextField user = new JTextField();  
        user.setBounds(140,337, 250,47);  
        JPasswordField pass= new JPasswordField();   
        pass.setBounds(140,442,250,47);
        JButton b1=new JButton(new ImageIcon("4.jpg"));
     	b1.setBounds(140,585,250,47);
     	JButton b2=new JButton("BACK");
     	b2.setBounds(140, 640, 250,47);
     	b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int cnt=0;
				String uid=user.getText();
				String up=pass.getText();
				BufferedReader b = null;
				try {
					b = new BufferedReader(new FileReader("STAFF_DETAILS.txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String d="";
				try {
					while((d=b.readLine())!=null)
					{
						String ss[]=d.split("#");
						if(ss[1].equals(uid)&&ss[2].equals(up))
						{
							JOptionPane.showMessageDialog(f3, "LOGGED IN AS STAFF","LOGIN",JOptionPane.PLAIN_MESSAGE);
							staff a=new staff();
							f3.dispose();
							a.staff1();
							cnt=1;
							
						}
						if(cnt==0)
						{
							JOptionPane.showMessageDialog(f3, "STAFF_ID OR PASSWORD IS INCORRECT","ERROR",JOptionPane.ERROR_MESSAGE);
						}
					
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}try {
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
				
				
				f3.dispose();
			}
		});

		 f3.add(user);
        f3.add(b1);
        f3.add(b2);
     	f3.add(pass);
        f3.pack();
        f3.setVisible(true);
    		}
	public  void staff1() 
	{
		try
		{
		JFrame f3=new JFrame();
		f3.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("553.jpg")))));
		f3.setVisible(true);
		//JPanel p=new JPanel(new GridBagLayout());
		JButton b1=new JButton("CREATE USER");
		JButton b2=new JButton("UPDATE ACCOUNT");
		JButton b3=new JButton("TRANSACTION");
		JButton b4=new JButton("DELETE USER");
		JButton b5=new JButton("BANK USERS");
		JButton b6=new JButton("USER  DETAIL");
		JButton b7=new JButton("LOGOUT");
		f3.pack();
		//f3.add(p);
     	b1.setBounds(160,130,250,47);
     	b2.setBounds(160,230,250,47);
     	//b23.setBounds(160,280,250,47);
     	b3.setBounds(160,330,250,47);
     	b4.setBounds(160,440,250,47);
     	b5.setBounds(160,550,250,47);
     	b6.setBounds(160,650,250,47);
     	b7.setBounds(160,750,250,47);
     	f3.add(b1);
     	f3.add(b2);
     	//f6.add(b23);
     	f3.add(b3);
     	f3.add(b4);
     	f3.add(b5);
     	f3.add(b6);
     	f3.add(b7);
		//f3.add(p);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{	int o=2;
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
					int k=2;
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
				try {
					int m=2;
					fn.atmtransact(m);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				f3.dispose();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int a=2;
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
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				fun fn=new fun();
				try {
					int a=2;
					fn.list(a);
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
					int a=2;
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
				staff st=new staff();
				st.stafflogin();
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
