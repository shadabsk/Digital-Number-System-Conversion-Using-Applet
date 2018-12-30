/**
 * Title		:	Number Conversion System using Java Applet
 * Author		:	Shadab Shaikh
 * Date			:	14-10-2017
 * Version		:	1.0
 * Availability	:	https://github.com/shadabsk
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code=Main.class width=840 height=440></applet>
public class Main extends Applet implements ActionListener
{
	
	Color c1=new Color(173,255,47);
	Button b5=new Button("Decimal");
	Button b6=new Button("Binary");
	Button b7=new Button("Octal");
	Button b8=new Button("Hexa");
	
	Button i1=new Button("0");		
	Button i2=new Button("1");
	Button i3=new Button("2");
	Button i4=new Button("3");
	Button i5=new Button("4");		
	Button i6=new Button("5");
	Button i7=new Button("6");
	Button i8=new Button("7");
	Button i9=new Button("8");		
	Button i10=new Button("9");
	Button i11=new Button("A");
	Button i12=new Button("B");
	Button i13=new Button("C");		
	Button i14=new Button("D");
	Button i15=new Button("E");
	Button i16=new Button("F");
	Button i17=new Button("Reset");
	Button i18=new Button("<-- BackSpace");
		
	Label l3=new Label();
	Label l4=new Label();		
	Label l5=new Label();
	Label l6=new Label();
			
	TextField t1=new TextField(10);
	public void init()
	{
		//Colors
		setBackground(c1);
		setLayout(null);
		
		//Fonts
		Font ft1 = new Font("TimesRoman", Font.BOLD, 11);
		Font ft2 = new Font("Arial Black", Font.BOLD, 11);
		Font ft3 = new Font("Impact", Font.BOLD+Font.ITALIC, 17);
		
		
		//Labels
		Label h1=new Label("****************");
		h1.setBounds(50,10,120,30);
		Label h2=new Label("****************");
		h2.setBounds(190,10,125,30);
		Label h3=new Label("   Digital");
		h3.setBounds(310,10,100,30);
		h3.setFont(ft3);
		Label h4=new Label("Converter");
		h4.setBounds(410,10,120,30);
		h4.setFont(ft3);
		Label h5=new Label("    ***************");
		h5.setBounds(540,10,130,30);
		Label h6=new Label("****************");
		h6.setBounds(670,10,120,30);
		
		b5.setFont(ft2);
		b5.setBackground(Color.WHITE);

		b6.setFont(ft2);
		b6.setBackground(Color.WHITE);
		
		b7.setFont(ft2);
		b7.setBackground(Color.WHITE);
		
		b8.setFont(ft2);
		b8.setBackground(Color.WHITE);
		
		//Labels
		Label l1=new Label("Enter Digit");
		l1.setFont(ft1);
		l1.setBounds(100,60,115,30);
		t1.setBounds(240,60,550,30);
		t1.setFont(ft1);
		
		//Labels 2
		Label l2=new Label("Converted to Decimal");
		l2.setFont(ft1);
		l3.setBackground(Color.WHITE);
		l4.setBackground(Color.WHITE);
		l5.setBackground(Color.WHITE);
		l6.setBackground(Color.WHITE);
		
		
		//Labels 2
		Label sup1=new Label("----------------------------");
		sup1.setBounds(50,30,120,30);
		
		Label sup2=new Label("----------------------------");
		sup2.setBounds(180,30,120,30);
		
		Label sup3=new Label("----------------------------");
		sup3.setBounds(300,30,120,30);
		
		Label sup4=new Label("----------------------------");
		sup4.setBounds(430,30,120,30);
		
		Label sdn1=new Label("----------------------------");
		sdn1.setBounds(560,30,120,30);
		
		Label sdn2=new Label("----------------------------");
		sdn2.setBounds(680,30,80,30);
		
		Label sdn3=new Label("----------------------------");
		
		Label sdn4=new Label("----------------------------");
		
		////////////
		Label m2=new Label("Convert From");
		m2.setFont(ft1);
		m2.setBounds(100,100,100,30);
		add(m2);



		////////////
		Label sl1=new Label("");
		Label sl2=new Label("");
		Label sl3=new Label("");
		Label sl4=new Label("");
		
		Label sr1=new Label("");
		Label sr2=new Label("");
		Label sr3=new Label("");
		Label sr4=new Label("");
		
		Label f1=new Label("----------------------------");
		Label f2=new Label("----------------------------");
		Label f3=new Label("");
		Label f4=new Label("");
		Label f5=new Label("");
		Label f6=new Label("");
		Label f7=new Label("");
		Label f8=new Label("");
		Label f9=new Label("");
		Label f10=new Label("");
		Label f11=new Label("");
		Label f12=new Label("");
		Label f13=new Label("");
		Label f14=new Label("");
		Label f15=new Label("");
		Label f16=new Label("");
		Label f17=new Label("");
		Label f18=new Label("");
		Label f19=new Label("----------------------------");
		Label f20=new Label("----------------------------");
		
		add(h1);
		add(h2);
		add(h3);
		add(h4);
		add(h5);
		add(h6);
		
		add(f1);
		add(sup1);
		add(sup2);
		add(sup3);
		add(sup4);
		add(f2);

		add(f5);
		add(l1);
		add(t1);
		Label l12=new Label();
		l12.setBackground(Color.WHITE);
		add(l12);
		Label l13=new Label();
		l13.setBackground(Color.WHITE);
		add(l13);
		add(f6);
		
		add(f7);
		add(b5);
		b5.addActionListener(this);
		add(b6);
		b6.addActionListener(this);
		add(b7);
		b7.addActionListener(this);
		add(b8);
		b8.addActionListener(this);
		add(f8);
		add(sl2);
		add(l2);
		
		
		add(l3);
		
		Label a5=new Label("Converted to Decimal");
		a5.setBounds(100,130,140,20);
		a5.setFont(ft1);
		
		
		add(a5);
		add(l4);
		
		Label d5=new Label("Converted to Binary");
		d5.setFont(ft1);
		d5.setBounds(100,170,130,20);
		add(d5);
		add(l5);

		Label d15=new Label("Converted to Octal");
		d15.setFont(ft1);
		d15.setBounds(100,210,130,20);
		
		add(d15);
		add(l6);
		
		Label d18=new Label("Converted to Hexa");
		d18.setFont(ft1);
		d18.setBounds(100,250,130,20);
		add(d18);
		add(sr2);
		add(f10);
		
		
		add(f11);
		add(i1);
		i1.setBackground(Color.WHITE);
		i1.addActionListener(this);
		add(i2);
		i2.setBackground(Color.WHITE);
		i2.addActionListener(this);
		
		add(i3);
		i3.setBackground(Color.WHITE);		
		i3.addActionListener(this);
		add(i4);
		i4.setBackground(Color.WHITE);
		i4.addActionListener(this);
		add(f12);
		
		add(f13);
		add(i5);
		i5.setBackground(Color.WHITE);
		i5.addActionListener(this);
		
		add(i6);
		i6.setBackground(Color.WHITE);
		i6.addActionListener(this);
		add(i7);
		i7.setBackground(Color.WHITE);
		i7.addActionListener(this);
		add(i8);
		i8.setBackground(Color.WHITE);		
		i8.addActionListener(this);
		add(f14);
		
		add(f15);
		
		add(i9);
		i9.setBackground(Color.WHITE);		
		i9.addActionListener(this);
		add(i10);
		i10.setBackground(Color.WHITE);		
		i10.addActionListener(this);
		add(i11);
		i11.setBackground(Color.WHITE);
		i11.addActionListener(this);
		add(i12);
		i12.setBackground(Color.WHITE);
		i12.addActionListener(this);
		add(f16);
		
		add(f17);
		add(i13);
		i13.setBackground(Color.WHITE);
		i13.addActionListener(this);
		add(i14);
		i14.setBackground(Color.WHITE);
		i14.addActionListener(this);
		add(i15);
		i15.setBackground(Color.WHITE);
		i15.addActionListener(this);
		add(i16);
		i16.setBackground(Color.WHITE);
		i16.addActionListener(this);
		add(i17);
		i17.setBackground(Color.WHITE);
		i17.addActionListener(this);
		add(i18);
		i18.setBackground(Color.WHITE);
		i18.addActionListener(this);
		add(f18);
		
		add(f19);
		add(sdn1);
		add(sdn2);
		add(sdn3);
		add(sdn4);
		add(f20);
	
		//Set Bounds of All Buttons	
		b5.setBounds(240,100,90,20);
		b6.setBounds(380,100,90,20);
		b7.setBounds(540,100,90,20);
		b8.setBounds(700,100,90,20);

	
		i1.setBounds(240,280,90,20);
		i2.setBounds(350,280,90,20);
		i3.setBounds(460,280,90,20);
		i4.setBounds(570,280,90,20);
		i5.setBounds(240,310,90,20);
		i6.setBounds(350,310,90,20);
		i7.setBounds(460,310,90,20);
		i8.setBounds(570,310,90,20);
		i9.setBounds(240,340,90,20);
		i10.setBounds(350,340,90,20);
		i11.setBounds(460,340,90,20);
		i12.setBounds(570,340,90,20);
		i13.setBounds(240,370,90,20);
		i14.setBounds(350,370,90,20);
		i15.setBounds(460,370,90,20);
		i16.setBounds(570,370,90,20);
		i17.setBounds(700,280,90,20);
		i18.setBounds(700,370,90,20);

		//Set Bounds of Label  
		l3.setBounds(240,130,550,20);
		l4.setBounds(240,170,550,20);
		l5.setBounds(240,210,550,20);
		l6.setBounds(240,250,550,20);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==i18)
			try{
		{
				t1.setText(t1.getText().substring(0, t1.getText().length()-1));
		}
			}
			catch(StringIndexOutOfBoundsException e)
			{
				l3.setText("Nothing is there to clear");
				l4.setText("Nothing is there to clear");
				l5.setText("Nothing is there to clear");
				l6.setText("Nothing is there to clear");
			}
		if(ae.getSource()==i17)
		{
				t1.setText("");
				l3.setText("");
				l4.setText("");
				l5.setText("");
				l6.setText("");
		}
		if(ae.getSource()==i1)
		{
				t1.setText(t1.getText()+"0");
		}
		if(ae.getSource()==i2)
		{
				t1.setText(t1.getText()+"1");
		}
		if(ae.getSource()==i3)
		{
				t1.setText(t1.getText()+"2");
		}
		if(ae.getSource()==i4)
		{
				t1.setText(t1.getText()+"3");
		}
		if(ae.getSource()==i5)
		{
				t1.setText(t1.getText()+"4");
		}
		if(ae.getSource()==i6)
		{
				t1.setText(t1.getText()+"5");
		}
		if(ae.getSource()==i7)
		{
				t1.setText(t1.getText()+"6");
		}
		if(ae.getSource()==i8)
		{
				t1.setText(t1.getText()+"7");
		}
		if(ae.getSource()==i9)
		{
				t1.setText(t1.getText()+"8");
		}
		if(ae.getSource()==i10)
		{
				t1.setText(t1.getText()+"9");
		}
		if(ae.getSource()==i11)
		{
				t1.setText(t1.getText()+"a");
		}
		if(ae.getSource()==i12)
		{
				t1.setText(t1.getText()+"b");
		}
		if(ae.getSource()==i13)
		{
				t1.setText(t1.getText()+"c");
		}
		if(ae.getSource()==i14)
		{
				t1.setText(t1.getText()+"d");
		}
		if(ae.getSource()==i15)
		{
				t1.setText(t1.getText()+"e");
		}
		if(ae.getSource()==i16)
		{
				t1.setText(t1.getText()+"f");
		}
		if(ae.getSource()==b5)
		{
			try{
		int i=Integer.parseInt(t1.getText());
		String s=t1.getText();
		if(i>=0)
		{
		String d=String.valueOf(i);
			l3.setText(d+"d");
		String b=Integer.toBinaryString(i);
			l4.setText(b+"b");
		String o=Integer.toOctalString(i);
			l5.setText(o+"o");
		String h=Integer.toHexString(i);
			l6.setText(h+"h");
		}
		else
		{
			l3.setText("Negative input detected ! Please Enter only positive integers");
			l4.setText("Negative input detected ! Please Enter only positive integers");
			l5.setText("Negative input detected ! Please Enter only positive integers");
			l6.setText("Negative input detected ! Please Enter only positive integers");
		}
			}
			catch(NumberFormatException e){
				l3.setText("Entered number is not a valid Decimal Number. It Contains only Integer with max range 2147483647");
				l4.setText("Entered number is not a valid Decimal Number. It Contains only Integer with max range 2147483647");
				l5.setText("Entered number is not a valid Decimal Number. It Contains only Integer with max range 2147483647");
				l6.setText("Entered number is not a valid Decimal Number. It Contains only Integer with max range 2147483647");
			}
			
		}
		else if(ae.getSource()==b6)
		{
			try{
		int i=Integer.parseInt(t1.getText(),2);
		if(i>=0)
		{
		String d=String.valueOf(i);
			l3.setText(d+"d");
		String b=String.valueOf(t1.getText());
			l4.setText(b+"b");
		String o=Integer.toOctalString(i);
			l5.setText(o+"o");
		String h=Integer.toHexString(i);
			l6.setText(h+"h");
		}
		else
		{
			l3.setText("Negative input detected ! Please Enter only positive integers");
			l4.setText("Negative input detected ! Please Enter only positive integers");
			l5.setText("Negative input detected ! Please Enter only positive integers");
			l6.setText("Negative input detected ! Please Enter only positive integers");
		}
			}
			catch(NumberFormatException e){
				l3.setText("Entered number is not a valid Binary Number. It Contains only 0 or 1 with max range (31 *) Time's 1");
				l4.setText("Entered number is not a valid Binary Number. It Contains only 0 or 1 with max range (31 *) Time's 1");
				l5.setText("Entered number is not a valid Binary Number. It Contains only 0 or 1 with max range (31 *) Time's 1");
				l6.setText("Entered number is not a valid Binary Number. It Contains only 0 or 1 with max range (31 *) Time's 1");
			}
			
		}
		else if(ae.getSource()==b7)
		{
			try{
		int i=Integer.parseInt(t1.getText(),8);
		if(i>=0)
		{
		String d=String.valueOf(i);
			l3.setText(d+"d");
		String b=Integer.toBinaryString(i);
			l4.setText(b+"b");
		String o=String.valueOf(t1.getText());
			l5.setText(o+"o");
		String h=Integer.toHexString(i);
			l6.setText(h+"h");
		}
		else
		{
			l3.setText("Negative input detected ! Please Enter only positive integers");
			l4.setText("Negative input detected ! Please Enter only positive integers");
			l5.setText("Negative input detected ! Please Enter only positive integers");
			l6.setText("Negative input detected ! Please Enter only positive integers");
		}
			}
			catch(NumberFormatException e){
				l3.setText("Entered number is not a valid Octal Number. It ranges from 0 to 7 with max range 17777777777");
				l4.setText("Entered number is not a valid Octal Number. It ranges from 0 to 7 with max range 17777777777");
				l5.setText("Entered number is not a valid Octal Number. It ranges from 0 to 7 with max range 17777777777");
				l6.setText("Entered number is not a valid Octal Number. It ranges from 0 to 7 with max range 17777777777");
			}
			
		}
		else if(ae.getSource()==b8)
		{
			try{
		int i=Integer.parseInt(t1.getText(),16);
		if(i>=0)
		{
		String d=String.valueOf(i);
			l3.setText(d+"d");
		String b=Integer.toBinaryString(i);
			l4.setText(b+"b");
		String o=Integer.toOctalString(i);
			l5.setText(o+"o");
		String h=String.valueOf(t1.getText());
			l6.setText(h+"h");
		}
		else
		{
			l3.setText("Negative input detected ! Please Enter only positive integers");
			l4.setText("Negative input detected ! Please Enter only positive integers");
			l5.setText("Negative input detected ! Please Enter only positive integers");
			l6.setText("Negative input detected ! Please Enter only positive integers");
		}
			}
			catch(NumberFormatException e){
				l3.setText("Entered number is not a valid Hexa-Decimal Number. It is from 0 upto f with max range 7FFFFFFF");
				l4.setText("Entered number is not a valid Hexa-Decimal Number. It is from 0 upto f with max range 7FFFFFFF");
				l5.setText("Entered number is not a valid Hexa-Decimal Number. It is from 0 upto f with max range 7FFFFFFF");
				l6.setText("Entered number is not a valid Hexa-Decimal Number. It is from 0 upto f with max range 7FFFFFFF");
			}
			
		}
		
			
	}
}
