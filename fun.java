package bdms;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.*;


public class fun {
	String[] items= {"SAVING","CURRENT","FIXED"};
	boolean b;
	JComboBox x=new JComboBox(items);
	public void acccreate(int a)
	{  
		try {
		JFrame f4=new JFrame("ACCOUNT CREATION");
		
			f4.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("88.jpg")))));
		
		f4.setVisible(true);
		//f4.setSize(600,400);
		//f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		JLabel l1=new JLabel("NAME:");
		JLabel l2=new JLabel("DATE_OF_BIRTH:");
		JLabel l3=new JLabel("ADDRESS:");
		JLabel l4=new JLabel("ACCOUNT TYPE:");
		JLabel l5=new JLabel("USER ID:");
		JLabel l6=new JLabel("PASSWORD:");
		JLabel l7=new JLabel("AMOUNT DEPOSITED:");
		JLabel l8=new JLabel("CONTACT NUM:");
		JTextField name=new JTextField();
		JTextField dob=new JTextField();
		JTextField add=new JTextField();
		//JTextField pass=new JTextField();
		JTextField uid=new JTextField();
		
		JTextField pass=new JTextField();
		JTextField amt=new JTextField();
		JTextField phn=new JTextField();
		JLabel result=new JLabel("");
		JButton b1=new JButton("CREATE");
		JButton b2=new JButton("BACK");
		l1.setBounds(50, 100, 250, 30);
		name.setBounds(200, 100, 250, 30);
		l2.setBounds(50, 150, 250, 30);
		dob.setBounds(200,150, 250, 30);
		l3.setBounds(50, 200, 250, 30);
		add.setBounds(200,200, 250, 30);
		l4.setBounds(50, 250, 250, 30);
		x.setBounds(200,250, 250, 30);								
		l5.setBounds(50, 300, 250, 30);
		uid.setBounds(200,300, 250, 30);
		l6.setBounds(50, 350, 250, 30);
		pass.setBounds(200,350, 250, 30);
		l7.setBounds(50, 400, 250, 30);
		amt.setBounds(200,400, 250, 30);
		l8.setBounds(50, 450, 250, 30);
		phn.setBounds(200,450, 250, 30);
		b1.setBounds(170, 600, 200, 30);
		b2.setBounds(170, 650, 200, 30);
		result.setBounds(100, 200, 300, 30);
		f4.add(b2);
		f4.add(b1);
		f4.add(phn);
		f4.add(amt);
		f4.add(pass);
		f4.add(uid);
		f4.add(x);
		f4.add(add);
		f4.add(dob);
		f4.add(name);
		f4.add(l1);
		f4.add(l2);
		f4.add(l3);
		f4.add(l4);
		f4.add(l5);
		f4.add(l6);
		f4.add(l7);
		f4.add(l8);
		f4.add(result);
		f4.pack();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int v=0;
				String nam=name.getText();
				
				String date=dob.getText();
				String ad=add.getText();
				String s=x.getSelectedItem().toString();
				String ui=uid.getText();
				b=Pattern.matches("[0-9]{4}",ui);
				if(b==false)
				{
					JOptionPane.showMessageDialog(f4, "USER_ID IS INCORRECT SEQUENCE","ERROR",JOptionPane.ERROR_MESSAGE);	
					v++;
				}
				String pa=pass.getText();
				b=Pattern.matches("[0-9]{4}",pa);
				if(b==false)
				{
					JOptionPane.showMessageDialog(f4, "PASSWORD INCORRECT SEQUENCE","ERROR",JOptionPane.ERROR_MESSAGE);	
					v++;
				}
				String am=amt.getText();
				String ph=phn.getText();
				b=Pattern.matches("[0-9]{10}",ph);
				if(b==false)
				{
					JOptionPane.showMessageDialog(f4, "PHONE INCORRECT SEQUENCE","ERROR",JOptionPane.ERROR_MESSAGE);	
					v++;
				}
				if(v==0)
				{
				File file=new File("USER_DETAILS.txt");
				FileWriter f;
			try {
				f = new FileWriter(file,true);
				while(true)
				{
					f.write(nam);
					f.write("#");
					f.write(date);
					f.write("#");
					f.write(ad);
					f.write("#");
					f.write(s);
					f.write("#");
					f.write(ui);
					f.write("#");
					f.write(pa);
					f.write("#");
					f.write(am);
					f.write("#");
					f.write(ph);
					f.write("#\n");
					f.close();
				}
			}
			catch (IOException e1) 
			{
			System.out.print(e1);
			}
			JOptionPane.showMessageDialog(f4, "ACCOUNT CREATED SUCCESSFULLY","LOGIN",JOptionPane.PLAIN_MESSAGE);
			
				}
				else
				{
					JOptionPane.showMessageDialog(f4, "ACCOUNT CREATION UNSUCCESSFULL","LOGIN",JOptionPane.ERROR_MESSAGE);
				}
				
				if(a==1)
			{admin m=new admin();
			m.admin1();
			f4.dispose();
			}
			else if(a==2)
			{
			staff m=new staff();
			m.staff1();
			f4.dispose();
			}
			}
			});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(a==1)
				{admin m=new admin();
				m.admin1();
				f4.dispose();
				}
				else if(a==2)
				{
				staff m=new staff();
				m.staff1();
				f4.dispose();
				}
			}
		});
		f4.pack();
        f4.setVisible(true);
      
	}
	catch (IOException e1) {
        e1.printStackTrace();
    }

}
	
		
			
	public  void update(int a) throws IOException
	{		
		

		
		try {
			JFrame f4=new JFrame("ACCOUNT UPDATION");
			f4.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("88.jpg")))));
		
	    JLabel l1=new JLabel("USER ID:");
		JTextField uid=new JTextField();
		JLabel result=new JLabel("");
		JButton b1=new JButton("ENTER");
		JButton b2=new JButton("BACK");
		l1.setBounds(90, 300, 250, 30);
		uid.setBounds(160, 300, 250, 30);
		b1.setBounds(170, 450, 250, 30);
		b2.setBounds(170, 500, 250, 30);
		result.setBounds(100, 200, 300, 20);
		f4.add(b2);
		f4.add(b1);
		f4.add(uid);
		f4.add(l1);
		f4.add(result);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				File file=new File("USER_DETAILS.txt");
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e7) {
					e7.printStackTrace();
				}
				String d = "";
				String id=uid.getText();
				try {
					while((d=br.readLine())!=null)
					{
						String ss[]=d.split("#");
						if(ss[4].equals(id))
						{
							JFrame f5=new JFrame("ACCOUNT UPDATION FORM");
							//JLabel l1=new JLabel("USER ID:");
							f5.setVisible(true);
							f5.setSize(600,400);
							f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
							JLabel result=new JLabel("");
							JButton b3=new JButton("PASSWORD");
							JButton b4=new JButton("PHONE");
							JButton b5=new JButton("ADDRESS");
							JButton b6=new JButton("BACK");
							b3.setBounds(170, 70, 200, 30);
							b4.setBounds(170, 120, 200, 30);
							b5.setBounds(170, 170, 200, 30);
							b6.setBounds(170, 230, 200, 30);
							result.setBounds(170, 30, 300, 30);
							f5.add(b6);
							f5.add(b5);
							f5.add(b4);
							f5.add(b3);
							f5.add(result);

							b3.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e)
								{
									JFrame f6=new JFrame("PASSWORD CHANGE");
									f6.setVisible(true);
									f6.setSize(600,400);
									f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
									JLabel l6=new JLabel("NEW PASSWORD:");
									JLabel result=new JLabel("");
									JTextField pass=new JTextField();
									JButton b7=new JButton("UPDATE");
									JButton b8=new JButton("BACK");
									l6.setBounds(50, 100, 150, 30);
									pass.setBounds(200, 100, 150, 30);
									b7.setBounds(170, 200, 250, 30);
									b8.setBounds(170, 250, 250, 30);
									result.setBounds(100, 200, 300, 20);
									f6.add(b8);
									f6.add(b7);
									f6.add(pass);
									f6.add(l6);
									f6.add(result);
								
									b7.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e)
										{	
											String p=pass.getText();
											File file=new File("USER_DETAILS.txt");
											BufferedReader br = null;
											try {
												br = new BufferedReader(new FileReader(file));
											} catch (FileNotFoundException e6) {
												// TODO Auto-generated catch block
												e6.printStackTrace();
											}
											String d = "";
											//String id=uid.getText();
											
											int count=0,i,j;
											String upd[]=new String[1000];
										try {
											while((d=br.readLine())!=null)
											{
												count+=8;
												String ss[]=d.split("#");
												for(i=count-8,j=0;i<count;i++,j++)
												{
													upd[i]=ss[j];
												}
												
											}
										} catch (IOException e5) {
											// TODO Auto-generated catch block
											e5.printStackTrace();
										}
										for(i=4;i<count;i+=8)
										{
											if(id.equals(upd[i]))
											{
												upd[i+1]=p;
												break;
											}
										}
										try {
											br.close();
										} catch (IOException e4) {
											// TODO Auto-generated catch block
											e4.printStackTrace();
										}
										
										FileWriter f = null;
										try {
											f = new FileWriter("USER_DETAILS.txt");
										} catch (IOException e3) {
											// TODO Auto-generated catch block
											e3.printStackTrace();
										}
										for(i=0;i<count;i++)
										{
											try {
												f.write(upd[i]);
											} catch (IOException e2) {
												// TODO Auto-generated catch block
												e2.printStackTrace();
											}
											if((i+1)%8==0)
											{
												try {
													f.write("#\n");
												} catch (IOException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
											else
											{
												try {
													f.write("#");
												} catch (IOException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										}
										try {
											f.close();
										} catch (IOException e1) {
											e1.printStackTrace();
										}


								}});
									b8.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e)
										{
											
											f5.setVisible(true);
										}
									});
								}
							});
							b4.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e)
								{
									JFrame f6=new JFrame("PHONE NUMBER CHANGE");
									f6.setVisible(true);
									f6.setSize(600,400);
									f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
									JLabel l6=new JLabel("NEW CONTACT NUM:");
									JLabel result=new JLabel("");
									JTextField pass=new JTextField();
									JButton b9=new JButton("UPDATE");
									JButton b10=new JButton("BACK");

									l6.setBounds(50, 100, 250, 30);
									pass.setBounds(200, 100, 250, 30);
									b9.setBounds(170, 200, 250, 30);
									b10.setBounds(170, 250, 250, 30);
									result.setBounds(100, 300, 300, 20);
									f6.add(b10);
									f6.add(b9);
									f6.add(pass);
									f6.add(l6);
									f6.add(result);
									
									b9.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e)
										{	
											String p=pass.getText();
											File file=new File("USER_DETAILS.txt");
											BufferedReader br = null;
											try {
												br = new BufferedReader(new FileReader(file));
											} catch (FileNotFoundException e6) {
												// TODO Auto-generated catch block
												e6.printStackTrace();
											}
											String d = "";
											int count=0,i,j;
											String upd[]=new String[1000];
															
										
										try {
											while((d=br.readLine())!=null)
											{
												count+=8;
												String ss[]=d.split("#");
												for(i=count-8,j=0;i<count;i++,j++)
												{
													upd[i]=ss[j];
												}
												
											}
										} catch (IOException e5) {
											// TODO Auto-generated catch block
											e5.printStackTrace();
										}
										for(i=4;i<count;i+=8)
										{
											if(id.equals(upd[i]))
											{
												upd[i+3]=p;
												break;
											}
										}
										try {
											br.close();
										} catch (IOException e4) {
											// TODO Auto-generated catch block
											e4.printStackTrace();
										}
										
										FileWriter f = null;
										try {
											f = new FileWriter("USER_DETAILS.txt");
										} catch (IOException e3) {
											// TODO Auto-generated catch block
											e3.printStackTrace();
										}
										for(i=0;i<count;i++)
										{
											try {
												f.write(upd[i]);
											} catch (IOException e2) {
												// TODO Auto-generated catch block
												e2.printStackTrace();
											}
											if((i+1)%8==0)
											{
												try {
													f.write("#\n");
												} catch (IOException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
											else
											{
												try {
													f.write("#");
												} catch (IOException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										}
										try {
											f.close();
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
								}});
									b10.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e)
										{
											f5.setVisible(true);
										}
									});
								}
							});
							b5.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e)
								{
									JFrame f6=new JFrame("ADDRESS CHANGE");
									f6.setVisible(true);
									f6.setSize(600,400);
									f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
									JLabel l7=new JLabel("NEW ADDRESS:");
									JTextField pass=new JTextField();
									JButton b11=new JButton("UPDATE");
									JButton b12=new JButton("BACK");
									l7.setBounds(50, 100, 250, 30);
									b11.setBounds(170, 200, 250, 30);
									b12.setBounds(170, 250, 250, 30);
									pass.setBounds(200, 100, 250, 30);
									f6.add(b12);
									f6.add(b11);
									f6.add(pass);
									f6.add(l7);
									b11.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e)
										{
											String p=pass.getText();
											File file=new File("USER_DETAILS.txt");
											BufferedReader br = null;
											try {
												br = new BufferedReader(new FileReader(file));
											} catch (FileNotFoundException e3) {
												// TODO Auto-generated catch block
												e3.printStackTrace();
											}
											String d = "";
		
											int count=0,i,j;
											String upd[]=new String[1000];
											
									
										
										try {
											while((d=br.readLine())!=null)
											{
												count+=8;
												String ss[]=d.split("#");
												for(i=count-8,j=0;i<count;i++,j++)
												{
													upd[i]=ss[j];
												}
												
											}
										} catch (IOException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
										for(i=4;i<count;i+=8)
										{
											if(id.equals(upd[i]))
											{
												upd[i-2]=p;
												break;
											}
										}
										try {
											br.close();
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										FileWriter f = null;
										try {
											f = new FileWriter("USER_DETAILS.txt");
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										for(i=0;i<count;i++)
										{
											try {
												f.write(upd[i]);
											} catch (IOException e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											if((i+1)%8==0)
											{
												try {
													f.write("#\n");
												} catch (IOException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
											else
											{
												try {
													f.write("#");
												} catch (IOException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										}
										try {
											f.close();
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
								}});
									b12.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e)
										{
											f5.setVisible(true);
										}
									});
								}
							});
							b6.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e)
								{

									if(a==1)
									{admin m=new admin();
									m.admin1();
									f4.dispose();
									}
									else if(a==2)
									{
									staff m=new staff();
									m.staff1();
									f4.dispose();
									}
								}
							});
							
							
							
						
						//	f4.dispose();
						}
					
					}
					
						
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					try {
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
			}});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(a==1)
				{admin m=new admin();
				m.admin1();
				f4.dispose();
				}
				else if(a==2)
				{
				staff m=new staff();
				m.staff1();
				f4.dispose();
				}
			}
			
		});
		f4.pack();
        f4.setVisible(true);
		
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	
		
}
	public void staffacc()
	{
		JFrame f4=new JFrame("STAFF ACCOUNT CREATION");
		
		try {
			f4.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("88.jpg")))));
		
		f4.setVisible(true);	
		JLabel l1=new JLabel("NAME:");
		JLabel l5=new JLabel("STAFF ID:");
		JLabel l6=new JLabel("PASSWORD:");
		JLabel l8=new JLabel("CONTACT NUM:");
		JTextField name=new JTextField();
		JTextField sid=new JTextField();
		JTextField sp=new JTextField();	
		JTextField sph=new JTextField();
		JLabel result=new JLabel("");
		JButton b1=new JButton("CREATE");
		JButton b2=new JButton("BACK");
		l1.setBounds(50, 150, 250, 30);
		name.setBounds(150, 150, 250, 30);
		l5.setBounds(50, 210, 250, 30);
		sid.setBounds(150,210, 250, 30);
		l6.setBounds(50, 270, 250, 30);
		sp.setBounds(150,270, 250, 30);
		l8.setBounds(50, 330, 250, 30);
		sph.setBounds(150,330, 250, 30);
		b1.setBounds(170, 500, 250, 30);
		b2.setBounds(170, 550, 250, 30);
		result.setBounds(100, 200, 300, 20);
		f4.add(b2);
		f4.add(b1);
		f4.add(sph);
		f4.pack();
		f4.setVisible(true);
		f4.add(sp);
		f4.add(sid);
		f4.add(name);
		f4.add(l1);
		f4.add(l5);
		f4.add(l6);
		f4.add(l8);
		f4.add(result);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String nam=name.getText();
				String sid1=sid.getText();				
				b=Pattern.matches("[0-9]{4}",sid1);
				if(b==false)
				{
					JOptionPane.showMessageDialog(f4, "STAFF_ID IS INCORRECT SEQUENCE","ERROR",JOptionPane.ERROR_MESSAGE);	
					
				}
				
				
				String sp1=sp.getText();
				b=Pattern.matches("[0-9]{4}",sp1);
				if(b==false)
				{
					JOptionPane.showMessageDialog(f4, "STAFF_PASSWORD  IS INCORRECT SEQUENCE","ERROR",JOptionPane.ERROR_MESSAGE);	
					
				}
				
				String sph1=sph.getText();
				b=Pattern.matches("[0-9]{4}",sph1);
				if(b==false)
				{
					JOptionPane.showMessageDialog(f4, "STAFF_PHONE NUMBER IS INCORRECT SEQUENCE","ERROR",JOptionPane.ERROR_MESSAGE);	
					
				}
				File file=new File("STAFF_DETAILS.txt");
				FileWriter f;
				try {
					f = new FileWriter(file,true);
					while(true)
					{
					
					f.write(nam);
					f.write("#");
					f.write(sid1);
					f.write("#");
					f.write(sp1);
					f.write("#");
					f.write(sph1);
					f.write("#\n");
					f.close();
					}
				} catch (IOException e1) {
					System.out.print(e1);
				}
			JOptionPane.showMessageDialog(f4, "ACCOUNT CREATED SUCCESSFULLY","LOGIN",JOptionPane.PLAIN_MESSAGE);
			admin m=new admin();
			m.admin1();
			f4.dispose();
			}
			});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				admin m=new admin();
				m.admin1();
				f4.dispose();
			}
		});
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
			
	}
	public void transact(int a) throws IOException
	{
		//try {
			JFrame f10=new JFrame();

			//f10.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("554.jpg")))));
			f10.setVisible(true);
		JPanel p=new JPanel(new GridBagLayout());
		f10.setVisible(true);
		f10.setSize(600,400);
		f10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		JButton b1=new JButton("CREDIT");
		JButton b2=new JButton("DEBIT");
		JButton b3=new JButton("CANCEL");
		GridBagConstraints c= new GridBagConstraints();
		c.insets=new Insets(10,10,10,10);
		c.gridx=0;
		c.gridy=1;
		p.add(b1,c);
		c.gridx=0;
		c.gridy=2;
		p.add(b2,c);
		c.gridx=0;
		c.gridy=3;
		p.add(b3,c);
		f10.add(p);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JFrame f11=new JFrame("credit");
				f11.setVisible(true);
				f11.setSize(600,400);
				f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				JLabel l6=new JLabel("USER ID:");
				JLabel l7=new JLabel("AMOUNT CREDIT :");
				JTextField user=new JTextField();
				JTextField amt=new JTextField();
				JButton b4=new JButton("UPDATE");
				JButton b5=new JButton("BACK");

				l6.setBounds(50, 50, 150, 30);
				user.setBounds(200, 50, 150, 20);
				l7.setBounds(50, 100, 150, 30);
				amt.setBounds(200, 100, 150, 20);
				b4.setBounds(170, 100, 100, 20);
				b5.setBounds(170, 130, 100, 20);
	      		f11.add(b5);
				f11.add(b4);
				f11.add(user);
				f11.add(amt);
				f11.add(l6);
				f11.add(l7);
				b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						String user1=user.getText();
						String uamt=amt.getText();
						BufferedReader b = null;
						try {
							b = new BufferedReader(new FileReader("USER_DETAILS.txt"));
						} catch (FileNotFoundException e6) {
							// TODO Auto-generated catch block
							e6.printStackTrace();
						}
						int count=0,i,j;
						String upd[]=new String[1000];
						String d="";
						int uamt1=Integer.parseInt(uamt);
						try {
							while((d=b.readLine())!=null)
							{
								count+=8;
								String ss[]=d.split("#");
								for(i=count-8,j=0;i<count;i++,j++)
								{
									upd[i]=ss[j];
								}
								System.out.println(" ");
							}
						} catch (IOException e5) {
							// TODO Auto-generated catch block
							e5.printStackTrace();
						}
						for(i=4;i<count;i+=8)
						{
							if(user1.equals(upd[i]))
							{
								int depamt=Integer.parseInt(upd[i+2]);
								int updated_amt=depamt+uamt1;
								upd[i+2]=Integer.toString(updated_amt);
								break;
							}
						}
						try {
							b.close();
						} catch (IOException e4) {
							// TODO Auto-generated catch block
							e4.printStackTrace();
						}
						FileWriter f = null;
						try {
							f = new FileWriter("USER_DETAILS.txt");
						} catch (IOException e3) {
							// TODO Auto-generated catch block
							e3.printStackTrace();
						}
						for(i=0;i<count;i++)
						{
							try {
								f.write(upd[i]);
							} catch (IOException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							if((i+1)%8==0)
							{
								try {
									f.write("#\n");
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							else
							{
								try {
									f.write("#");
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						}
						try {
							f.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
				b5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
					f11.dispose();
					f10.setVisible(true);
					}
					});
				}
				});
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						JFrame f11=new JFrame("DEBIT");
						f11.setVisible(true);
						f11.setSize(600,400);
						f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
						JLabel l6=new JLabel("USER ID:");
						JLabel l7=new JLabel("AMOUNT debit:");
						JTextField user=new JTextField();
						JTextField amt=new JTextField();
						JButton b4=new JButton("UPDATE");
						JButton b5=new JButton("BACK");

						l6.setBounds(50, 50, 150, 30);
						user.setBounds(200, 50, 150, 20);
						l7.setBounds(50, 100, 150, 30);
						amt.setBounds(200, 100, 150, 20);
						b4.setBounds(170, 100, 100, 20);
						b5.setBounds(170, 130, 100, 20);
			      		f11.add(b5);
						f11.add(b4);
						f11.add(user);
						f11.add(amt);
						f11.add(l6);
						f11.add(l7);
						b4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
								String user1=user.getText();
								String uamt=amt.getText();
								BufferedReader b = null;
								try {
									b = new BufferedReader(new FileReader("USER_DETAILS.txt"));
								} catch (FileNotFoundException e6) {
									// TODO Auto-generated catch block
									e6.printStackTrace();
								}
								int count=0,i,j;
								String upd[]=new String[1000];
								String d="";
								int uamt1=Integer.parseInt(uamt);
								try {
									while((d=b.readLine())!=null)
									{
										count+=8;
										String ss[]=d.split("#");
										for(i=count-8,j=0;i<count;i++,j++)
										{
											upd[i]=ss[j];
										}
										System.out.println(" ");
									}
								} catch (IOException e5) {
									// TODO Auto-generated catch block
									e5.printStackTrace();
								}
								for(i=4;i<count;i+=8)
								{
									if(user1.equals(upd[i]))
									{
										int depamt=Integer.parseInt(upd[i+2]);
										int updated_amt=depamt-uamt1;
										if(updated_amt<0)
										{
											JOptionPane.showMessageDialog(null,"NO SUFFICIENT AMOUT TO BE DEBITED..!PLEASE CHECK THE BALANCE");
											
										}
										else
										{
										upd[i+2]=Integer.toString(updated_amt);
										JOptionPane.showMessageDialog(null,"AMOUNT DEBITED SUCCESSFULLY");
										}
										break;
									}
								}
								try {
									b.close();
								} catch (IOException e4) {
									// TODO Auto-generated catch block
									e4.printStackTrace();
								}
								FileWriter f = null;
								try {
									f = new FileWriter("USER_DETAILS.txt");
								} catch (IOException e3) {
									// TODO Auto-generated catch block
									e3.printStackTrace();
								}
								for(i=0;i<count;i++)
								{
									try {
										f.write(upd[i]);
									} catch (IOException e2) {
										// TODO Auto-generated catch block
										e2.printStackTrace();
									}
									if((i+1)%8==0)
									{
										try {
											f.write("#\n");
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
									else
									{
										try {
											f.write("#");
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
								}
								try {
									f.close();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
							}
						});
						b5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
							f11.dispose();
							f10.setVisible(true);
							}
						});
					}
						});
					b3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
							
								
								//f10.dispose();
								if(a==1)
								{admin m=new admin();
								m.admin1();
								f10.dispose();
								}
								else if(a==2)
								{
								staff m=new staff();
								m.staff1();
								f10.dispose();
								}
								
							}
									});
					} //catch (IOException e2) {
			
				public void delacc(int a) throws IOException
				{
					
					
					try {
						JFrame f7=new JFrame("ACCOUNT DELETION");
						f7.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("88.jpg")))));
					
					f7.setVisible(true);
					//f7.setSize(600,400);
					//f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
					JLabel l1=new JLabel("USER ID TO BE DELETED:");
					JTextField uid=new JTextField();
					JLabel result=new JLabel("");
					JButton b1=new JButton("DELETE");
					JButton b2=new JButton("BACK");
					l1.setBounds(50, 150, 250, 30);
					uid.setBounds(250, 150, 250, 30);
					b1.setBounds(170, 300, 250, 30);
					b2.setBounds(170, 350, 250, 30);
					result.setBounds(100, 200, 300, 20);
					f7.add(b2);
					f7.add(b1);
					f7.pack();
					f7.add(uid);
					f7.add(l1);
					f7.add(result);
					b1.addActionListener(new ActionListener() {
						
			
						public void actionPerformed(ActionEvent e)
						{
							String ui=uid.getText();
							BufferedReader b = null;
							try {
								b = new BufferedReader(new FileReader("USER_DETAILS.txt"));
							} catch (FileNotFoundException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							int count=0,i,j;
							String upd[]=new String[1000];
							String d="";
							try {
								while((d=b.readLine())!=null)
									{
										count+=8;
										String ss[]=d.split("#");
										for(i=count-8,j=0;i<count;i++,j++)
										{
											upd[i]=ss[j];
										}
										if(upd[count-4].equals(ui))
										{
											count-=8;
										}
										System.out.println(" ");
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
							FileWriter f = null;
							try {
								f = new FileWriter("USER_DETAILS.txt");
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
								for(i=0;i<count;i++)
								{
									try {
										f.write(upd[i]);
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									if((i+1)%8==0)
									{
										try {
											f.write("#\n");
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
									else
									{
										try {
											f.write("#");
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
								}
								try {
									f.close();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								JOptionPane.showMessageDialog(null,"DELETED Successfully!...");
						
						}
					});
			
					b2.addActionListener(new ActionListener() {
						
			
						public void actionPerformed(ActionEvent e)
						{
							if (a==1)
							{
								admin m=new admin();
								m.admin1();
								f7.dispose();
							}
							else if(a==2)
							{
								staff m=new staff();
								m.staff1();
								f7.dispose();
							}
							
							
							f7.dispose();
							
						}
						
						});
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
						
						}
	public  void list(int a) throws IOException
	{

		
		try {
			JFrame f12 = new JFrame("LIST OF USERS");
			f12.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("5.jpg")))));
		f12.setVisible(true);
		JButton b = new JButton("BACK");
		JLabel l1 = new JLabel("NAME");
		JLabel l2 = new JLabel("D.O.B");
		JLabel l3 = new JLabel("ADDRESS");
		JLabel l4 = new JLabel("ACCOUNT TYPE");
		JLabel l5 = new JLabel("USER ID");
		JLabel l6 = new JLabel("BALANCE");
		JLabel l7 = new JLabel("PHONE NUMBER");
		l1.setBounds(10, 20, 150, 20);
		l2.setBounds(170, 20, 150, 20);
		l3.setBounds(290, 20, 150, 20);
		l4.setBounds(460, 20, 150, 20);
		l5.setBounds(630, 20, 150, 20);
		l6.setBounds(800, 20, 150, 20);
		l7.setBounds(970, 20, 150, 20);
		f12.setSize(1100, 500);
		b.setBounds(460, 400, 150, 20);
		//f12.pack();
		f12.add(l7);
		f12.add(l6);
		f12.add(l5);
		f12.add(l4);
		f12.add(l3);
		f12.add(l2);
		f12.add(l1);
		f12.add(b);
		try {
			File file=new File("USER_DETAILS.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s1 = "";
			int i=2;
			while((s1 = br.readLine())!=null)
			{
				String ss[] = s1.split("#");
				JLabel ll1 = new JLabel(ss[0]);
				JLabel ll2 = new JLabel(ss[1]);
				JLabel ll3 = new JLabel(ss[2]);
				JLabel ll4 = new JLabel(ss[3]);
				JLabel ll5 = new JLabel(ss[4]);
				JLabel ll6 = new JLabel(ss[6]);
				JLabel ll7 = new JLabel(ss[7]);
				ll1.setBounds(10, 20+(i*20), 150, 20);
				ll2.setBounds(170, 20+(i*20), 50, 20);
				ll3.setBounds(290, 20+(i*20), 150, 20);
				ll4.setBounds(460, 20+(i*20), 150, 20);
				ll5.setBounds(630, 20+(i*20), 150, 20);
				ll6.setBounds(800, 20+(i*20), 150, 20);
				ll7.setBounds(970, 20+(i*20), 150, 20);
				f12.add(ll7);
				f12.add(ll6);
				f12.add(ll5);
				f12.add(ll4);
				f12.add(ll3);
				f12.add(ll2);
				f12.add(ll1);
				i++;
				f12.setLayout(null);
			
			}
			br.close();
		} catch ( IOException e) {
			e.printStackTrace();
		}
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				if(a==1)
				{
				admin m=new admin();
				m.admin1();
				f12.dispose();
				}
				else if(a==2)
				{
				staff m=new staff();
				m.staff1();
				f12.dispose();
				}
				
			}
		});
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}
	public  void accountdet(int a) throws IOException
	{
		try {
			JFrame f13 = new JFrame();
            f13.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("88.jpg")))));
			f13.setVisible(true);
		
		
		
		JLabel l1 = new JLabel("USER ID");
		JButton b = new JButton("PROCEED");
		JButton b1 = new JButton("BACK");
		JTextField user=new JTextField();
		
		l1.setBounds(90, 250, 150, 30);
		user.setBounds(170, 250, 200, 30);
		b.setBounds(160, 400, 250, 30);
		b1.setBounds(160, 460, 250, 30);
		f13.add(b1);
		f13.add(b);
		f13.add(user);
		f13.add(l1);
		f13.setVisible(true);
		f13.setLayout(null);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f13.dispose();
				String uid=user.getText();		
		
		try {
			File file=new File("USER_DETAILS.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s1 = "";
				//int cnt=0;
				while((s1=br.readLine())!=null)
				{
					String ss[]=s1.split("#");
					if(ss[4].equals(uid))
					{	
					JFrame f12 = new JFrame("ACCOUNT DETAIL");
					f12.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("5.jpg")))));
					//f12.setVisible(true);
					f12.setVisible(true);
					JButton b2 = new JButton("BACK");
					JLabel l1 = new JLabel("NAME");
					JLabel l2 = new JLabel("D.O.B");
					JLabel l3 = new JLabel("ADDRESS");
					JLabel l4 = new JLabel("ACCOUNT TYPE");
					JLabel l5 = new JLabel("USER ID");
					JLabel l6 = new JLabel("BALANCE");
					JLabel l7 = new JLabel("PHONE NUMBER");
					l1.setBounds(10, 20, 150, 20);
					l2.setBounds(170, 20, 150, 20);
					l3.setBounds(290, 20, 150, 20);
					l4.setBounds(460, 20, 150, 20);
					l5.setBounds(630, 20, 150, 20);
					l6.setBounds(800, 20, 150, 20);
					l7.setBounds(970, 20, 150, 20);
					f12.setSize(1100, 500);
					b2.setBounds(460, 400, 150, 20);
					f12.add(l7);
					f12.add(l6);
					f12.pack();
					f12.add(l5);
					f12.add(l4);
					f12.add(l3);
					f12.add(l2);
					f12.add(l1);
					f12.add(b2);
						//String ss[] = s1.split("#");
						JLabel ll1 = new JLabel(ss[0]);
						JLabel ll2 = new JLabel(ss[1]);
						JLabel ll3 = new JLabel(ss[2]);
						JLabel ll4 = new JLabel(ss[3]);
						JLabel ll5 = new JLabel(ss[4]);
						JLabel ll6 = new JLabel(ss[6]);
						JLabel ll7 = new JLabel(ss[7]);
						ll1.setBounds(10, 20+(20), 150, 20);
						ll2.setBounds(170, 20+20, 150, 20);
						ll3.setBounds(290, 20+(20), 150, 20);
						ll4.setBounds(460, 20+(20), 150, 20);
						ll5.setBounds(630, 20+(20), 150, 20);
						ll6.setBounds(800, 20+(20), 150, 20);
						ll7.setBounds(970, 20+(20), 150, 20);
						f12.add(ll7);
						f12.add(ll6);
						f12.add(ll5);
						f12.add(ll4);
						f12.add(ll3);
						f12.add(ll2);
						f12.add(ll1);
						f12.setLayout(null);
						b2.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {

								if(a==1)
								{
								admin m=new admin();
								f12.dispose();
								m.admin1();
								
								}
								else if(a==2)
								{
								staff m=new staff();
								f12.dispose();
								m.staff1();
								//f12.dispose();
								}
								else if(a==3)
								{
									user1 u=new user1();
									f12.dispose();
									u.user();
									//f12.dispose();
								}
								
							}
						});
						//f12.dispose();
						

					}
					
					if(s1==null)
					{
			
							JOptionPane.showMessageDialog(f13, "USER_ID OR PASSWORD IS INCORRECT","ERROR",JOptionPane.ERROR_MESSAGE);
						
					}
					
				}
				
		
			}
			catch ( IOException e1) {
					e1.printStackTrace();
				}
						
			}
				
				});	

 b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if(a==1)
				{
				admin m=new admin();
				m.admin1();
				f13.dispose();
				}
				else if(a==2)
				{
				staff m=new staff();
				m.staff1();
				f13.dispose();
				
				}
				else if(a==3)
				{
					user1 u=new user1();
					u.user();
					f13.dispose();
				}
				
			}
		});
		 f13.pack();
		 f13.setVisible(true);
	
		} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
		}

	}
	public void atmtransact(int a) throws IOException
	{
		
		try {
			JFrame f10 = new JFrame();
            f10.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("554.jpg")))));
			f10.setVisible(true);
			JButton b1=new JButton("CREDIT");
			JButton b2=new JButton("DEBIT");
			JButton b3=new JButton("CANCEL");
			b1.setBounds(160,160,250,47);
	     	b2.setBounds(160,330,250,47);
	     	b3.setBounds(160,530,250,47);
			
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					f10.dispose();
					JFrame f11 = new JFrame();
		            f11.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("88.jpg")))));
				f11.setVisible(true);
				//JFrame f11=new JFrame("credit");
				f11.setVisible(true);
				//f11.setSize(600,400);
				f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				JLabel l6=new JLabel("USER ID:");
				JLabel l7=new JLabel("CREDIT AMOUNT:");
				JTextField user=new JTextField();
				JTextField amt=new JTextField();
				JButton b4=new JButton("UPDATE");
				JButton b5=new JButton("BACK");
				b4.setBounds(160,630,250,47);
		     	b5.setBounds(160,700,250,47);
				l6.setBounds(50, 200, 250, 30);
				user.setBounds(180, 200, 200, 40);
				l7.setBounds(50,300, 250, 30);
				//l7.setBounds(0, 0, 150, 30);
				amt.setBounds(180, 300, 200, 40);
				//b4.setBounds(170, 130, 100, 20);
				//b5.setBounds(170, 160, 100, 20);
	      		f11.add(b5);
				f11.add(b4);
				f11.add(user);
				f11.add(amt);
				f11.add(l6);
				f11.add(l7);
				b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(null,"Updated Successfully!...");						
						String user1=user.getText();
						String uamt=amt.getText();
						BufferedReader b = null;
						try {
							b = new BufferedReader(new FileReader("USER_DETAILS.txt"));
						} catch (FileNotFoundException e6) {
							// TODO Auto-generated catch block
							e6.printStackTrace();
						}
						int count=0,i,j;
						String upd[]=new String[1000];
						String d="";
						int uamt1=Integer.parseInt(uamt);
						try {
							while((d=b.readLine())!=null)
							{
								count+=8;
								String ss[]=d.split("#");
								for(i=count-8,j=0;i<count;i++,j++)
								{
									upd[i]=ss[j];
								}
								System.out.println(" ");
							}
						} catch (IOException e5) {
							// TODO Auto-generated catch block
							e5.printStackTrace();
						}
						for(i=4;i<count;i+=8)
						{
							if(user1.equals(upd[i]))
							{
								int depamt=Integer.parseInt(upd[i+2]);
								int updated_amt=depamt+uamt1;
								upd[i+2]=Integer.toString(updated_amt);
								break;
							}
						}
						try {
							b.close();
						} catch (IOException e4) {
							// TODO Auto-generated catch block
							e4.printStackTrace();
						}
						FileWriter f = null;
						try {
							f = new FileWriter("USER_DETAILS.txt");
						} catch (IOException e3) {
							// TODO Auto-generated catch block
							e3.printStackTrace();
						}
						for(i=0;i<count;i++)
						{
							try {
								f.write(upd[i]);
							} catch (IOException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							if((i+1)%8==0)
							{
								try {
									f.write("#\n");
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							else
							{
								try {
									f.write("#");
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						}
						try {
							f.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
				b5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
					f11.dispose();
					f10.setVisible(true);
					}
				});
		
				f11.pack();
				f11.setVisible(true);
				
					} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					}
			}
				
			});
	b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						try {
							f10.dispose();
							JFrame f11 = new JFrame();
				            f11.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("88.jpg")))));
						f11.setVisible(true);
						//JFrame f11=new JFrame("credit");
						f11.setVisible(true);
						//f11.setSize(600,400);
						f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
						JLabel l6=new JLabel("USER ID:");
						JLabel l7=new JLabel("CREDIT AMOUNT:");
						JTextField user=new JTextField();
						JTextField amt=new JTextField();
						JButton b4=new JButton("UPDATE");
						JButton b5=new JButton("BACK");
						b4.setBounds(160,630,250,47);
				     	b5.setBounds(160,700,250,47);
						l6.setBounds(50, 200, 150, 30);
						user.setBounds(180, 200, 200, 40);
						l7.setBounds(50,300, 150, 30);
						//l7.setBounds(0, 0, 150, 30);
						amt.setBounds(180, 300, 200, 40);
						//b4.setBounds(170, 130, 100, 20);
						//b5.setBounds(170, 160, 100, 20);
			      		f11.add(b5);
						f11.add(b4);
						f11.add(user);
						f11.add(amt);
						f11.add(l6);
						f11.add(l7);

						b4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
								String user1=user.getText();
								String uamt=amt.getText();
								BufferedReader b = null;
								try {
									b = new BufferedReader(new FileReader("USER_DETAILS.txt"));
								} catch (FileNotFoundException e6) {
									// TODO Auto-generated catch block
									e6.printStackTrace();
								}
								int count=0,i,j;
								String upd[]=new String[1000];
								String d="";
								int uamt1=Integer.parseInt(uamt);
								try {
									while((d=b.readLine())!=null)
									{
										count+=8;
										String ss[]=d.split("#");
										for(i=count-8,j=0;i<count;i++,j++)
										{
											upd[i]=ss[j];
										}
										System.out.println(" ");
									}
								} catch (IOException e5) {
									// TODO Auto-generated catch block
									e5.printStackTrace();
								}
								for(i=4;i<count;i+=8)
								{
									if(user1.equals(upd[i]))
									{
										int depamt=Integer.parseInt(upd[i+2]);
										int updated_amt=depamt-uamt1;
										if(updated_amt<0)
										{
											JOptionPane.showMessageDialog(null,"NO SUFFICIENT AMOUT TO BE DEBITED..!PLEASE CHECK THE BALANCE");
											
										}
										else
										{
										upd[i+2]=Integer.toString(updated_amt);
										JOptionPane.showMessageDialog(null,"AMOUNT DEBITED SUCCESSFULLY");
										}
										break;
									}
								}
								try {
									b.close();
								} catch (IOException e4) {
									// TODO Auto-generated catch block
									e4.printStackTrace();
								}
								FileWriter f = null;
								try {
									f = new FileWriter("USER_DETAILS.txt");
								} catch (IOException e3) {
									// TODO Auto-generated catch block
									e3.printStackTrace();
								}
								for(i=0;i<count;i++)
								{
									try {
										f.write(upd[i]);
									} catch (IOException e2) {
										// TODO Auto-generated catch block
										e2.printStackTrace();
									}
									if((i+1)%8==0)
									{
										try {
											f.write("#\n");
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
									else
									{
										try {
											f.write("#");
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
								}
								try {
									f.close();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
							}
						});
						b5.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
							f11.dispose();
							f10.setVisible(true);
							}
						});
					
						f11.pack();
						f11.setVisible(true);
						
							} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
							}
					}
						});
					b3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
							
								if(a==1)
								{
								admin m=new admin();
								m.admin1();
								f10.dispose();
								}
								else if(a==2)
								{
								staff m=new staff();
								m.staff1();
								f10.dispose();
								
								}
								else if(a==3)
								{
									user1 u=new user1();
									u.user();
									f10.dispose();
								}
							}
						});
							f10.pack();
							f10.setVisible(true);
							f10.add(b1);
							f10.add(b2);
							f10.add(b3);

		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
					}
	}
	



