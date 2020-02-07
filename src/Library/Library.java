package Library;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Library extends JFrame implements ActionListener {
private JTextArea A1,A2;
ArrayList<Book> items = new ArrayList<Book>();
private JLabel L,L1,L2,L3,L4,L5,L6,L7,L8;
private JTextField T1,T2,T3,T4,T5,JT,T6;
private JButton J1,J2,JF,J3,J4,J5;
private JRadioButton R1, R2 , R3 , R4 ,R5;
public String S,M,B ;

public Library()
{
	super("System Library");
	setLayout(null);
	
	L = new JLabel("NEW BOOK");
	L.setFont(new Font("Serif" , Font.BOLD , 27));
	L.setForeground(Color.RED);
	L.setSize(160, 30);
	L.setLocation(1, 1);
	add(L);
	
	
L1 = new JLabel("ISBN");
L1.setSize(179, 30);
L1.setLocation(1, 30);
add(L1);

T1 = new JTextField();
T1.setSize(179, 30);
T1.setLocation(1, 60);
add(T1);


L2 = new JLabel("Title");
L2.setSize(179, 30);
L2.setLocation(181, 30);
add(L2);


T2 = new JTextField();
T2.setSize(179, 30);
T2.setLocation(181, 60);
add(T2);



L3 = new JLabel("Author");
L3.setSize(179, 30);
L3.setLocation(361, 30);
add(L3);

T3 = new JTextField();
T3.setSize(179, 30);
T3.setLocation(361, 60);
add(T3);


L4 = new JLabel("Edition");
L4.setSize(179, 30);
L4.setLocation(541,30);
add(L4);


T4 = new JTextField();
T4.setSize(179, 30);
T4.setLocation(541, 60);
add(T4);


L5 = new JLabel("Published Year");
L5.setSize(179, 30);
L5.setLocation(721, 30);
add(L5);

	
T5 = new JTextField();
T5.setSize(179, 30);
T5.setLocation(721, 60);
add(T5);


J1 = new JButton("Insert");
J1.setSize(150, 30);
J1.setLocation(340, 100);
add(J1);


J2 = new JButton("Clear");
J2.setSize(150, 30);
J2.setLocation(492, 100);
add(J2);




L6 = new JLabel("SEARCH BY");
L6.setFont(new Font("Serif" , Font.BOLD , 27));
L6.setForeground(Color.RED);
L6.setSize(160, 30);
L6.setLocation(1, 160);
add(L6);
	

R1 = new JRadioButton(" ISBN" , false);
R1.setSize(180, 30);
R1.setLocation(2, 190);
add(R1);


R2 = new JRadioButton(" Title" , false);
R2.setSize(180, 30);
R2.setLocation(184, 190);
add(R2);


R3 = new JRadioButton(" Author" , false);
R3.setSize(180, 30);
R3.setLocation(366, 190);
add(R3);


R4 = new JRadioButton(" Published Year" , false);
R4.setSize(180, 30);
R4.setLocation(548, 190);
add(R4);


JF = new JButton("Find");
JF.setLocation(2, 230);
JF.setSize(130, 30);
add(JF);


JT = new JTextField();
JT.setLocation(135, 230);
JT.setSize(500,30);
add(JT);


L7 = new JLabel("BARROW BOOK");
L7.setFont(new Font("Serif" , Font.BOLD , 27));
L7.setForeground(Color.RED);
L7.setSize(400, 30);
L7.setLocation(1, 550);
add(L7);


L8 = new JLabel("ISBN");
L8.setSize(50, 30);
L8.setLocation(4,590);
add(L8);


T6 = new JTextField();
T6.setSize(179, 30);
T6.setLocation(50, 590);
add(T6);



J3 = new JButton("Find");
J3.setSize(130, 30);
J3.setLocation(240, 590);
add(J3);


J4 = new JButton("Borrow");
J4.setSize(150, 30);
J4.setLocation(340, 660);
add(J4);



J5 = new JButton("Return");
J5.setSize(150, 30);
J5.setLocation(492, 660);
add(J5);


A1 = new JTextArea(" ISBN \t\t Title \t\t Edition \t\t Author \t\t Year \t\t Status");
A1.setSize(971,270 );
A1.setLocation(0, 280);
add(A1);

A2 = new JTextArea();
A2.setSize(971, 25);
A2.setLocation(0, 630);
add(A2);


A a = new A();
J1.addActionListener(a);
J2.addActionListener(a);
JF.addActionListener(a);
J3.addActionListener(a);
J4.addActionListener(a);
J5.addActionListener(a);



}
private class A implements ActionListener{
 public void actionPerformed(ActionEvent e)
 {
	 if(e.getSource() == J1)
		 
	 {

	
	  int E = Integer.parseInt(T4.getText());
	  int P = Integer.parseInt(T5.getText());
	 
	 Book B = new Book();
	 B.setISBN(T1.getText());
	 B.setTitle(T2.getText());
	 B.setAuthor(T3.getText());
	 B.setEdition(E);
	 B.setPublishedYear(P);
	 B.setBorrowed(false);
	
	 items.add(B);
	 
	 
	 if(B.getISBN() == ""||B.getTitle()== ""||B.getEdition() == 0 || B.getPublishedYear() == 0 || B.getAuthor() == "")
		 
		 JOptionPane.showMessageDialog(Library.this, "Error,Please Enter The Correct Information");
	 
	 if (items.size()>1)
	 {
		 for(int f =0;f<items.size();f++)
		 {
			 if (items.get(f).getISBN().equals(items.get(f+1).getISBN()))
				 JOptionPane.showMessageDialog(Library.this, "Error,Please Enter The Correct Information");
				 
		 }
	 }
	 
	 String W = T3.getText();
	 String z = T2.getText();
	 String b = T1.getText();
	 char d[] = b.toCharArray();
	 char s[] = W.toCharArray();
	 char t[] = z.toCharArray();
	 
	 for(int i =0;i<s.length;i++)
	 {
		 if(Character.isDigit(s[i]))
		 {
			 JOptionPane.showMessageDialog(Library.this, "Error,Please Enter The Correct Information");
		 break;
		 }
			 
	 }
	 
	 for(int i =0;i<t.length;i++)
	 {
		 if(Character.isDigit(t[i]))
		 {
			 JOptionPane.showMessageDialog(Library.this, "Error,Please Enter The Correct Information");
		 break;
		 }
			 
	 }
	 

	 for(int i =0;i<s.length;i++)
	 {
		 if(Character.isDigit(s[i]))
		 {
			 JOptionPane.showMessageDialog(Library.this, "Error,Please Enter The Correct Information");
		 break;
		 }
			 
	 }
	 
	 }
	 else if(e.getSource() == J2)
	 {
		 
		 
		 T1.setText("");
		 T2.setText("");
		 T3.setText(""); 
		 T4.setText("");
		 T5.setText("");
		 
	 }
	 
	 else if(e.getSource() == JF)
	 {
	
		 
		 for(int i =0;i<items.size();i++)
			 
			{
			 


			 B = JT.getText();
		if(items.get(i).getAuthor().contains(B))
		{
			if (items.get(i).getBorrowed())
				 M = "Not Available";
			else M = " Available";
			
			S=( items.get(i).getISBN()+"\t\t"+items.get(i).getTitle() +"\t "+items.get(i).getEdition()+"th"+"\t\t"+items.get(i).getAuthor()+"\t\t"+items.get(i).getPublishedYear()+"\t\t"+M);
		A1.append("\n"+S);
		
		}





		if(items.get(i).getTitle().contains(B))
		{
			if (items.get(i).getBorrowed())
				 M = "Not Available";
			else M = " Available";
			

			S=( items.get(i).getISBN()+"\t\t"+items.get(i).getTitle() +"\t "+items.get(i).getEdition()+"th"+"\t\t"+items.get(i).getAuthor()+"\t\t"+items.get(i).getPublishedYear()+"\t\t"+M);
		A1.append("\n"+S);
		
		}

		
	
		
		String W =items.get(i).getPublishedYear()+"";
		if(W.equals(JT.getText()))
		{
			if (items.get(i).getBorrowed())
				 M = "Not Available";
			else M = " Available";
			
			

			S=( items.get(i).getISBN()+"\t\t"+items.get(i).getTitle() +"\t "+items.get(i).getEdition()+"th"+"\t\t"+items.get(i).getAuthor()+"\t\t"+items.get(i).getPublishedYear()+"\t\t"+M);
	A1.append("\n"+S);

		}
		
		
		
				if(items.get(i).getISBN().equals(JT.getText()))
				{
					if (items.get(i).getBorrowed())
						 M = "Not Available";
					else M = " Available";
					
					

					S=( items.get(i).getISBN()+"\t\t"+items.get(i).getTitle() +"\t "+items.get(i).getEdition()+"th"+"\t\t"+items.get(i).getAuthor()+"\t\t"+items.get(i).getPublishedYear()+"\t\t"+M);
			A1.append("\n"+S);
		
				}
				
				
			}
			}
		  
		 
	
	  
	 if(e.getSource() == J3)
	 {
		 for(int i=0;i<items.size();i++)
		 {
			 if(items.get(i).getISBN().equals(T6.getText()))
			 {
				 
					if (items.get(i).getBorrowed())
						 M = "Not Available";
					else M = " Available";
				 
				 String R =items.get(i).getTitle()+ "\t\t"+ items.get(i).getEdition()+"th\t\t"+ items.get(i).getAuthor()+"\t\t"+items.get(i).getPublishedYear()+"\t\t"+M;
				 A2.append(R);
				 
				 if(items.get(i).getBorrowed())
				 {
					 J4.setEnabled(false);
				 }
				 else 
					 J5.setEnabled(false);
				 
				
				 
			 }
		 }
	 }
	 
	if(e.getSource() == J4)
	{
		A2.setText("");
		for(int i=0;i<items.size();i++)
		 {
			 if(items.get(i).getISBN().equals(T6.getText()))
			 {
				 
					
						 M = "Not Available";
				
				 
				 String R =items.get(i).getTitle()+ "\t\t"+ items.get(i).getEdition()+"th\t\t"+items.get(i).getAuthor()+"\t\t"+items.get(i).getPublishedYear()+"\t\t"+M;
				 A2.append(R);
			 }
		 }
	
	}
	 
	 
	if(e.getSource() == J5)
	{
		
		A2.setText("");
		for(int i=0;i<items.size();i++)
		 {
			 if(items.get(i).getISBN().equals(T6.getText()))
			 {
				 
					
						 M = "Available";
				
				 
				 String R =items.get(i).getTitle()+ "\t\t"+ items.get(i).getEdition()+"th\t\t"+items.get(i).getAuthor()+"\t\t"+items.get(i).getPublishedYear()+"\t\t"+M;
				 A2.append(R);
			 }
		 }
			
		
	}
	
	
}
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
