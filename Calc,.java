import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Calc extends Frame implements ActionListener
{
	Button plus, min, mul, divi, ex;
	Label cal, fno, sno, result;
	TextField n1,n2;
	Frame f;
	
	public Calc()
	{
		plus = new Button("+");
		plus.addActionListener(this);
		min = new Button("-");
		min.addActionListener(this);
		mul = new Button("*");
		mul.addActionListener(this);
		divi = new Button("/");
		divi.addActionListener(this);
		ex = new Button("Exit");
		ex.addActionListener(this);
		cal = new Label("CALCULATOR");
		fno = new Label("First Number");
		sno = new Label("Second Number");
		result = new Label("Result");
		n1 = new TextField("No 1.");
		n2 = new TextField("No. 2");
		add(cal);
		add(fno);
		add(n1);
		add(sno);
		add(n2);
		add(result);
		add(plus);
		add(min);
		add(mul);
		add(divi);
		add(ex);
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Exit"))
			System.exit(0);
		if(ae.getActionCommand().equals("+"))
		{
			Integer a = Integer.parseInt(n1.getText());
			Integer b = Integer.parseInt(n2.getText());
			result.setText(""+(a+b));
		}
		if(ae.getActionCommand().equals("-"))
		{
			Integer a = Integer.parseInt(n1.getText());
			Integer b = Integer.parseInt(n2.getText());
			result.setText(""+(a-b));
		}
		if(ae.getActionCommand().equals("*"))
		{
			Integer a = Integer.parseInt(n1.getText());
			Integer b = Integer.parseInt(n2.getText());
			result.setText(""+(a*b));
		}
		if(ae.getActionCommand().equals("/"))
		{
			Integer a = Integer.parseInt(n1.getText());
			Integer b = Integer.parseInt(n2.getText());
			result.setText(""+(a/b));
		}
	}
}
/*public class main_class(){
	public static void main(String []args)
	{
		Calc a = new calc();
	}
}*/
//<applet code="Calc" width=400 height=200></applet>
