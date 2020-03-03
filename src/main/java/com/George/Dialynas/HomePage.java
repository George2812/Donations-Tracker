package com.George.Dialynas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage extends JFrame {
	
	private JPanel panel;
	private JButton create;
	private JButton data;
	private JLabel welcome;
	
	
	public HomePage() {
		
		
		panel=new JPanel();
		create=new JButton("Create Donation");
		data=new JButton("Donations Data");
		welcome=new JLabel("Welcome in our donations application");
		
	
				
		
		panel.add(create);
		panel.add(data);
		panel.add(welcome);
		
		
		this.setContentPane(panel);
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Home Page");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(null);
		create.setBounds(30, 200, 150, 60);
		data.setBounds(205,200, 150, 60);
		welcome.setBounds(90,100, 250, 50);
		
		
	}
	
	
	class CreateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
				
			
		}
		
		
	}
	
	
	

}
