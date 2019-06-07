

import java.awt.*;
import java.awt.event.*;

class Demo extends Frame {

	Button b1, b2, b3, b4;
	Panel p;
	TextField t1, t2, t3;
	Label l1, l2, l3;
	Font f;
	class E extends WindowAdapter
	{
	public void windowClosing( WindowEvent e)
	{
		dispose();
	}
	}
	 class A implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n=n1+n2;
				//t3.setText(String.valueOf(n));
				String s3=(String.valueOf(n));
				t3.setText(s3);
			}
			catch(Exception ex)
			{
t3.setText(ex.getMessage());
			}
	
		}
	}
	 class B implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				String s1=t1.getText();
				String s2=t2.getText();
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
	 class C implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				String s1=t1.getText();
				String s2=t2.getText();
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
	 class D implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				String s1=t1.getText();
				String s2=t2.getText();
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


	Demo() {
		setSize(500, 500);
		setTitle("Calci");
		setBackground(Color.orange);
		setLayout(null);
		addWindowListener(new E());
		f=new Font("Arial",0,20);
		p = new Panel();
		p.setLayout(null);
		p.setBounds(40, 60, 410, 330);
		p.setBackground(Color.blue);
		add(p);
		l1 = new Label("1st no");
		l1.setBounds(30, 30, 80, 40);
		l1.setForeground(Color.white);
		l1.setFont(f);
		p.add(l1);
		l2 = new Label("2nd no");
		l2.setBounds(30, 150, 80, 40);
		l2.setForeground(Color.white);
		l2.setFont(f);
		p.add(l2);
		b1 = new Button("+");
		b1.setBounds(30, 250, 40, 40);
		b1.addActionListener(new A());
		b1.setFont(f);
		p.add(b1);
		b2 = new Button("-");
		b2.setBounds(120, 250, 40, 40);
		b2.setFont(f);
		b2.addActionListener(new B());
		p.add(b2);
		b3 = new Button("*");
		b3.setBounds(220, 250, 40, 40);
		b3.setFont(f);
		b3.addActionListener(new C());
		p.add(b3);
		b4 = new Button("/");
		b4.setBounds(310, 250, 40, 40);
		b4.setFont(f);
		b4.addActionListener(new D());
		p.add(b4);
		t1 = new TextField();
		t1.setBounds(280, 30, 80, 40);
		t1.setForeground(Color.red);
		t1.setFont(f);
		p.add(t1);
		t2 = new TextField();
		t2.setBounds(280, 150, 80, 40);
		t2.setForeground(Color.red);
		t2.setFont(f);
		p.add(t2);
		l3 = new Label("Answer");
		l3.setBounds(60, 410, 50, 60);
		l3.setFont(f);
		add(l3);
		t3 = new TextField();
		t3.setBounds(340, 420, 90, 40);
		t3.setFont(f);
		add(t3);
		

	}

}

public class Calci2 {

	public static void main(String[] args) {
		new Demo().setVisible(true);

	}

}
