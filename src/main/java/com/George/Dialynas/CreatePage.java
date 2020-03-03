package com.George.Dialynas;

import javax.swing.*;

public class CreatePage extends JFrame{
	
	private JPanel panel1;
	private JButton submit;
	private JTextField name;
	private JTextField surname;
	private JTextField amount;
	private JTextField currency;
	
	
	public CreatePage() {
		
		panel1=new JPanel();
		name=new JTextField("Insert Name: ");
		surname=new JTextField("Insert Surname: ");
		amount=new JTextField("Donation Amount: ");
		currency=new JTextField("Currency depositing: ");
		submit=new JButton("Submit Donation");
		
		panel1.add(name);
		panel1.add(surname);
		panel1.add(amount);
		panel1.add(currency);
		panel1.add(submit);
		
		this.setContentPane(panel1);
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Create Donation Page");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	
	

}
