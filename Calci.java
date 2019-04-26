package my;
import java.awt.*;
import java.awt.event.*;


class nik  extends Frame
{
	
	Frame f;
	TextField t1,t2,t3;
	Panel p;
	Label l1,l2,l3;
	Button b1,b2,b3,b4,b5;
	class A implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1+n2;
				t3.setText(String.valueOf(n));
			}
				
		catch(Exception ex)	
			{
			t3.setText(ex.getMessage());
			}	
			}
		}	
		
		
			
		class B implements ActionListener{
			public void  actionPerformed(ActionEvent e)
			{
				try {
					String  s1=t1.getText();
					String  s2=t2.getText();
					int n1=Integer.parseInt(s1);
					int n2=Integer.parseInt(s2);
					int n=n1-n2;
					t3.setText(String.valueOf(n));

							
							
							
				}
				catch(Exception ex)
				{
					t3.setText(ex.getMessage());
					
				}
			}
			
		}
		class C implements ActionListener{
			public void  actionPerformed( ActionEvent e)
			{
				try {
					String  s1=t1.getText();
					String  s2=t2.getText();
					int n1=Integer.parseInt(s1);
					int n2=Integer.parseInt(s2);
					int n=n1*n2;
					t3.setText(String.valueOf(n));

							
							
							
				}
				catch(Exception ex)
				{
					t3.setText(ex.getMessage());
					
				}
			}
			
		}
		class D implements ActionListener{
			public void  actionPerformed(ActionEvent e)
			{
				try {
					String  s1=t1.getText();
					String  s2=t2.getText();
					int n1=Integer.parseInt(s1);
					int n2=Integer.parseInt(s2);
					int n=n1/n2;
					t3.setText(String.valueOf(n));

							
							
							
				}
				catch(Exception ex)
				{
					
					t3.setText(ex.getMessage());
					
				}
			}
			
		}
		class E implements ActionListener{
			public void  actionPerformed( ActionEvent e)
			{
				try {
					String  s1=t1.getText();
					String  s2=t2.getText();
					int n1=Integer.parseInt(s1);
					int n2=Integer.parseInt(s2);
					int n=n1%n2;
					t3.setText(String.valueOf(n));

							
							
							
				}
				catch(Exception ex)
				{
					t3.setText(ex.getMessage());
					
				}
			}
			
		}
	
	
	
	
	
	nik()
	{
		setTitle("calci");
		setLayout(null);
		setSize(400,400);
		setBackground(Color.blue);
		p=new Panel();
		p.setBackground(Color.yellow);
		p.setLayout(null);
		p.setBounds(40,60,300,250);
		l1=new Label("1 number ");
		l1.setBounds(30, 20,130 , 50);
		
		l2=new Label("2 number");
		l2.setBounds(30, 80,130 , 50);
		p.add(l1);
		p.add(l2);
		t1=new TextField();
		t1.setBounds(170,25,60,40);
		t1.setForeground(Color.RED);
		
		t2=new TextField();
		t2.setBounds(170,90,60,40);
		p.add(t1);
		p.add(t2);
		add(p);
		b1=new Button("+");
		
		b1.addActionListener(new A());
		b1.setBounds(30,160,40,40);
	p.add(b1);
	b2=new Button("-");
	b2.addActionListener(new B());

	b2.setBounds(80,160,40,40);

	p.add(b2);
b3=new Button("*");
b3.addActionListener(new C());

b3.setBounds(130,160,40,40);

p.add(b3);
b4=new Button("/");
b4.setBounds(180,160,40,40);
b4.addActionListener(new D());
p.add(b4);
b5=new Button("%");
b5.addActionListener(new E());
b5.setBounds(230,160,40,40);

p.add(b5);
l3=new Label("Answer");
l3.setBounds(40,320,50,40);
add(l3);
t3=new TextField("___________________________");
t3.setBounds(250,320,90,40);
add(t3);


		
		
	}
	
}

public class Calci {

	public static void main(String[] args)
	{
	nik a=new nik();
	a.setVisible(true);
	//new nik().setVisible(true);

	}

}
