package com.piseth.java.school.layoutmanager;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CombineSomeLayoutDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(new BorderLayout());
		JPanel panel1 = form1();
		frame.add(panel1, BorderLayout.WEST);
		
		JPanel panel2 = form2();
		frame.add(panel2, BorderLayout.EAST);
		
		JPanel panel3 = form3();
		frame.add(panel3, BorderLayout.NORTH);
		frame.setVisible(true);

	}
	
	private static JPanel form1() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		JLabel lbl1 = new JLabel("Name");
		JTextField txt1 = new JTextField();
		
		JLabel lbl2 = new JLabel("Gender");
		JTextField txt2 = new JTextField();
		
		panel.add(lbl1);
		panel.add(txt1);
		panel.add(lbl2);
		panel.add(txt2);
		return panel;
	}
	
	private static JPanel form2() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		JButton btn4 = new JButton("Button 4");
		JButton btn5 = new JButton("Button 5");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		return panel;
	}
	
	private static JPanel form3() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Button X");
		JButton btn2 = new JButton("Button Y");
		
		panel.add(btn1);
		panel.add(btn2);
		return panel;
	}

}
