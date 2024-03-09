import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.util.Calendar;


public class Restuarant extends JFrame implements ActionListener
{   JLabel l1,l2,l3,l4; JTextField t1; JPasswordField p1; JButton b1;
	Restuarant()
	{
		setSize(750,550);
		setLocation(500,100);
		setVisible(true);
		setLayout(null);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img1=new ImageIcon("res3.png");
		
		Image img2=img1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2);
		JLabel imglbl=new JLabel(img3);
		
		
		imglbl.setBounds(30,150,230,200);
		add(imglbl);
		Font f1=new Font("Verdana",Font.BOLD,25);
		Font f2=new Font("Serif",Font.BOLD,18);
		l1=new JLabel("             Shreekrushna Restuarant ");
		
		l1.setForeground(new Color(40,23,193));
		l1.setBounds(150,10,500,40);
		l1.setFont(f1); 
		add(l1);
		
		l2=new JLabel("LOGIN ");
		l2.setFont(new Font("Verdana",Font.BOLD,16));
		l2.setForeground(Color.RED);
		l2.setBounds(350,80,100,30);
		add(l2);
		
		l3=new JLabel("UserName ");
		l3.setBounds(350,150,100,30);
		l3.setFont(f2);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(350,190,200,30);
		add(t1);
		
		l4=new JLabel("Password ");
		l4.setBounds(350,230,100,30);
		l4.setFont(f2);
		add(l4);
		
		p1=new JPasswordField();
		p1.setBounds(350,270,200,30);
		add(p1);
		
		
		
		
		b1=new JButton("LOGIN");
		b1.setBackground(new Color(0,0,200));
		b1.setForeground(Color.WHITE);
		b1.setBounds(300,400,150,40);
		b1.addActionListener(this);
		add(b1);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(t1.getText().equals("krushna") && p1.getText().equals("1412"))
		{
		     HomePage hp=new HomePage();
		}
		else
		{
			
			JOptionPane.showMessageDialog(this,"Enter a valid Username and Password !", "ERROR", JOptionPane.ERROR_MESSAGE);
			t1.setText("");
			p1.setText("");
		}
		
	}	
public static void main(String args[])
{
   
  Restuarant r=new Restuarant();

}	
}

 class HomePage extends JFrame implements ActionListener
{     JLabel l1; JTabbedPane tp;  JPanel p1,p2; int flag=0; Font f,f2,f3,f4;
      //for p1
	  JLabel l2,l3,l4; JTextField t1,t2; JPanel breakfast,meals,drinks; JButton b1,b2;
	      //for breakfast
		  JLabel b; JTextField q1,q2,q3,q4,q5; JLabel bf1,bf2,bf3,bf4,bf5;
		  //for meals
		  JLabel m; JLabel m1,m2,m3,m4,m5; JTextField q6,q7,q8,q9,q10;
		  //for drinks
		  JLabel d; JTextField q11,q12,q13,q14,q15;
		  
	  //for p2
	  JButton bill; JPanel b_panel;
	      //for b_panel
		  JLabel thank;
	HomePage()
	{
		setSize(1600,900);
		setLocation(140,80);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	   f=new Font("Verdana",Font.BOLD,32);
	   f2=new Font("Serif",Font.BOLD,24);
	   f3=new Font("SansSerif",Font.ITALIC,16);
	   f4=new Font("SansSerif",Font.BOLD,18);
	   
	  l1=new JLabel("  Welcome To The Shreekrushna Restuarant ");
	  l1.setForeground(new Color(40,23,193));
	  l1.setBounds(400,10,800,40);
	  l1.setFont(f);
	  add(l1);
		
	   //tabbed pane
	  p1=new JPanel();
	  p1.setBackground(new Color(208,239,255));
	  p1.setLayout(null);
	  p2=new JPanel();
	  p2.setBackground(new Color(208,239,255));
	  p2.setLayout(null);
	  
	  tp=new JTabbedPane();
	  
	  tp.setFont(new Font("Serif",Font.BOLD,20));
	  tp.setBounds(50,80,1500,750);
	  tp.add("MENU",p1);
	  tp.add("BILL",p2);
	  add(tp);
	  
	  //code for p1
	   l2=new JLabel("User Information ");
	   l2.setBounds(650,20,200,30);
	   l2.setFont(f2);
	   p1.add(l2);
	   
	   l3=new JLabel("Customer Name ");
	   l3.setBounds(580,60,150,30);
	   l3.setFont(f3);
	   p1.add(l3);
	   
	   t1=new JTextField();
	   t1.setBounds(710,60,200,30);
	   p1.add(t1);
	   //table no.
	   l4=new JLabel("Table No ");
	   l4.setBounds(580,100,100,30);
	   l4.setFont(f3);
	   p1.add(l4);
	   
	   t2=new JTextField();
	   t2.setBounds(710,100,200,30);
	   p1.add(t2);
	   //breakdast panel
	    breakfast=new JPanel();
	   breakfast.setLayout(null);
	   breakfast.setBounds(250,160,400,450);
	   p1.add(breakfast);
	      // border 
		   breakfast.setBorder(new LineBorder(Color.BLACK,2));
	   b=new JLabel("BreakFast");
	   b.setBounds(150,20,150,30);
	   b.setFont(f2);
	   breakfast.add(b);
	        //breaksfast items...
			
			bf1=new JLabel("Upma  ");
			 bf1.setBounds(50,100,200,30);
			 bf1.setFont(f3);
	         breakfast.add(bf1);
	         q1=new JTextField();
			 q1.setText("0");
			 q1.setBounds(250,100,50,30);
	         breakfast.add(q1); 

            bf2=new JLabel("Dosa  ");
			 bf2.setBounds(50,150,200,30);
			 bf2.setFont(f3);
	         breakfast.add(bf2);
	         q2=new JTextField();
			 q2.setText("0");
			 q2.setBounds(250,150,50,30);
	         breakfast.add(q2); 

			 bf3=new JLabel("Misal  ");
			 bf3.setBounds(50,200,200,30);
			 bf3.setFont(f3);
	         breakfast.add(bf3);
	         q3=new JTextField();
			 q3.setText("0");
			 q3.setBounds(250,200,50,30);
	         breakfast.add(q3); 
			 
			  bf4=new JLabel("Vadapav  ");
			 bf4.setBounds(50,250,200,30);
			 bf4.setFont(f3);
	         breakfast.add(bf4);
	         q4=new JTextField();
			  q4.setText("0");
			 q4.setBounds(250,250,50,30);
	         breakfast.add(q4); 
			 
			  bf5=new JLabel("Poha  ");
			 bf5.setBounds(50,300,200,30);
			 bf5.setFont(f3);
	         breakfast.add(bf5);
	         q5=new JTextField();
			  q5.setText("0");
			 q5.setBounds(250,300,50,30);
	         breakfast.add(q5); 
		  	
			
	   //meals panel
	   meals=new JPanel();
	   meals.setLayout(null);
	   meals.setBounds(850,160,400,450);
	   p1.add(meals);
	      // border 
		    meals.setBorder(new LineBorder(Color.BLACK,2));
	   m=new JLabel("Meals");
	   m.setBounds(150,20,150,30);
	   m.setFont(f2);
	   meals.add(m);
        //items of meals

	        m1=new JLabel("Veg Thali      ");
			  m1.setBounds(50,100,200,30);
			  m1.setFont(f3);
	        meals.add( m1);
	         q6=new JTextField();
			 q6.setText("0");
			 q6.setBounds(250,100,50,30);
	         meals.add(q6); 

             m2=new JLabel("Nonveg Thali   ");
			  m2.setBounds(50,150,200,30);
			  m2.setFont(f3);
	         meals.add(m2);
	         q7=new JTextField();
			 q7.setText("0");
			 q7.setBounds(250,150,50,30);
	         meals.add(q7); 

			  m3=new JLabel("Biryani        ");
			  m3.setBounds(50,200,200,30);
			  m3.setFont(f3);
	         meals.add(m3);
	         q8=new JTextField();
			 q8.setText("0");
			 q8.setBounds(250,200,50,30);
	         meals.add(q8); 
			 
			   m4=new JLabel("Kolhapuri Thali");
			 m4.setBounds(50,250,200,30);
			 m4.setFont(f3);
	        meals.add(m4);
	         q9=new JTextField();
			  q9.setText("0");
			 q9.setBounds(250,250,50,30);
	        meals.add(q9); 
			 
			 m5=new JLabel("Krushna special ");
			 m5.setBounds(50,300,200,30);
			 m5.setFont(f3);
	        meals.add(m5);
	         q10=new JTextField();
			  q10.setText("0");
			 q10.setBounds(250,300,50,30);
	         meals.add(q10); 
	 
	   
	   //cancel and order button
	   b1=new JButton("Cancel ");
	   b1.setBounds(550,650,150,40);
	   b1.setForeground(Color.WHITE);
	   b1.setBackground(new Color(0,0,200));
	   b1.addActionListener(this);
	   b1.setFont(new Font("Serif",Font.BOLD,20));
	   p1.add(b1);
	   
	   b2=new JButton("Order ");
	   b2.setForeground(Color.WHITE);
	   b2.setBackground(new Color(0,0,200));
	   b2.setBounds(800,650,150,40);
	   b2.setFont(new Font("Serif",Font.BOLD,20));
	   b2.addActionListener(this);
	   p1.add(b2);
	   
	   
	 //============================================
	 
	  //code for p2
	   bill=new JButton("View Bill");
	   bill.setForeground(Color.WHITE);
	   bill.setBackground(new Color(0,0,200));
	   bill.setBounds(650,10,200,40);
	   bill.setFont(new Font("Serif",Font.BOLD,20));
	   p2.add(bill);
	   bill.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{   Object o=e.getSource();
	    if(o==bill )
		{ 
	     if(flag==1)
		 {
	        b_panel=new JPanel();
			b_panel.setLayout(null);
			b_panel.setBounds(300,70,850,600);
			p2.add(b_panel);
				// border 
				b_panel.setBorder(new LineBorder(Color.BLACK,2));
		
			thank=new JLabel("Thank You...");
			thank.setBounds(380,550,200,30);
			thank.setFont(new Font("Serif",Font.BOLD,20));
			b_panel.add(thank);
			
			//bill generation function....
			JLabel res,bt,cus,table,date,time;
			JLabel cus1,table1,date1,time1;
			
			res=new JLabel("     Shreekrushna Restuarant"); 
			res.setForeground(new Color(40,23,193));
			res.setBounds(270,10,400,30);
			res.setFont(f2);
			b_panel.add(res);
			
			bt=new JLabel("Your Bill Details");
			bt.setBounds(350,50,300,30);
			bt.setFont(f4);
			b_panel.add(bt);
			
			cus=new JLabel("Customer  :     "+t1.getText());
			 cus.setBounds(150,80,300,30);
			 cus.setFont(f3);
	        b_panel.add(cus);
			
			
			table=new JLabel("Table No  :     "+t2.getText());
			 table.setBounds(500,80,200,30);
			 table.setFont(f3);
	        b_panel.add(table);
			
			//for date and time
			Calendar cal=Calendar.getInstance();
			
			date=new JLabel("Date  :   "+cal.get(Calendar.DATE)+" / "+(cal.get(Calendar.MONTH)+1)+" / "+cal.get(Calendar.YEAR));
			 date.setBounds(150,110,200,30);
			 date.setFont(f3);
	        b_panel.add(date);
			
			
			
			time=new JLabel("Time  :   "+cal.get(Calendar.HOUR)+" : "+cal.get(Calendar.MINUTE)+" : "+cal.get(Calendar.SECOND));
				time.setBounds(500,110,200,30);
				time.setFont(f3);
	        b_panel.add(time);
		   
			
			JLabel head1=new JLabel("====================================================================================");
			JLabel head2=new JLabel("         Item                   Quantity                 Rate             amount	");
			JLabel head3=new JLabel("====================================================================================");
			head1.setBounds(120,140,600,20);
			head2.setBounds(120,150,600,30);
			head3.setBounds(120,160,600,30);
			head2.setFont(f4);
	        b_panel.add(head1);
	        b_panel.add(head2);
	        b_panel.add(head3);
			
			//breakfast
			JLabel bkf1,bkf2,bkf3,bkf4,bkf5;
			int q11=Integer.parseInt(q1.getText());
			int bt1=35*q11;
			bkf1=new JLabel(bf1.getText()+"                                     "+q11+"                                35"+"                         "+bt1);
			bkf1.setBounds(130,180,600,20);
			bkf1.setFont(f3);
			b_panel.add(bkf1);
			
			int q22=Integer.parseInt(q2.getText());
			int bt2=60*q22;
			bkf2=new JLabel(bf2.getText()+"                                      "+q22+"                                60"+"                         "+bt2);
			bkf2.setBounds(130,200,600,20);
			bkf2.setFont(f3);
			b_panel.add(bkf2);
			
			int q33=Integer.parseInt(q3.getText());
			int bt3=50*q33;
			bkf3=new JLabel(bf3.getText()+"                                      "+q33+"                                50"+"                         "+bt3);
			bkf3.setBounds(130,220,600,20);
			bkf3.setFont(f3);
			b_panel.add(bkf3);
			
			int q44=Integer.parseInt(q4.getText());
			int bt4=15*q44;
			bkf4=new JLabel(bf4.getText()+"                               "+q44+"                                15"+"                         "+bt4);
			bkf4.setBounds(130,240,600,20);
			bkf4.setFont(f3);
			b_panel.add(bkf4);
			
			int q55=Integer.parseInt(q5.getText());
			int bt5=30*q55;
			bkf5=new JLabel(bf5.getText()+"                                     "+q55+"                                30"+"                         "+bt5);
			bkf5.setBounds(130,260,600,20);
			bkf5.setFont(f3);
			b_panel.add(bkf5);
				JLabel line1,line2,line3;
		      line1=new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------");
			  line1.setBounds(120,280,600,20);
			  b_panel.add(line1);
			
			//meals 
			JLabel mel1,mel2,mel3,mel4,mel5;
			
			int q66=Integer.parseInt(q6.getText());
			int mt1=150*q66;
			mel1=new JLabel(m1.getText()+"                        "+q66+"                               150"+"                         "+mt1);
			mel1.setBounds(130,300,600,20);
			mel1.setFont(f3);
			b_panel.add(mel1);
			
			int q77=Integer.parseInt(q7.getText());
			int mt2=200*q77;
			mel2=new JLabel(m2.getText()+"                    "+q77+"                               200"+"                         "+mt2);
			mel2.setBounds(130,320,600,20);
			mel2.setFont(f3);
			b_panel.add(mel2);
			
			int q88=Integer.parseInt(q8.getText());
			int mt3=200*q88;
			mel3=new JLabel(m3.getText()+"                          "+q88+"                                200"+"                         "+mt3);
			mel3.setBounds(130,340,600,20);
			mel3.setFont(f3);
			b_panel.add(mel3);
			
			int q99=Integer.parseInt(q9.getText());
			int mt4=250*q99;
			mel4=new JLabel(m4.getText()+"                   "+q99+"                                250"+"                         "+mt4);
			mel4.setBounds(130,360,600,20);
			mel4.setFont(f3);
			b_panel.add(mel4);
			
			int q1010=Integer.parseInt(q10.getText());
			int mt5=250*q1010;
			mel5=new JLabel(m5.getText()+"                 "+q1010+"                               250"+"                         "+mt5);
			mel5.setBounds(130,380,600,20);
			mel5.setFont(f3);
			b_panel.add(mel5);
				
		      line2=new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------");
			  line2.setBounds(120,400,600,20);
			  b_panel.add(line2);
			 
			 //calculation..........
			 int sum=bt1+bt2+bt3+bt5+mt1+mt2+mt3+mt4+mt5;
			JLabel total=new JLabel("Total  :     "+sum+" Rs");
			total.setBounds(400,450,300,30);
			total.setFont(f2);
			b_panel.add(total);
			 
		 }
		 else
	     { 
			 JOptionPane.showMessageDialog(this,"There Is No Any Order! First Place Order..");
		 }
		}
		else if(o==b2)
		{   
	        if(t1.getText().equals("") && t2.getText().equals(""))
		    {
			       JOptionPane.showMessageDialog(this,"Please Enter Customer Name and Table NO !", "ERROR", JOptionPane.ERROR_MESSAGE);
		    }
		   else
		    {
			
			      JOptionPane.showMessageDialog(this,"Order Has Been Confiremed. You Can Check Bill.");
			      flag=1;
		    }
			
		}
		else
		{   flag=0;

			JOptionPane.showMessageDialog(this,"Canceled Successfulyy...!");
			
		}
				
	}
}