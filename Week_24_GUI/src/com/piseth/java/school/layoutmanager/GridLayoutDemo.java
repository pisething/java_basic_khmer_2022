package com.piseth.java.school.layoutmanager;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		JButton btn4 = new JButton("Button 4");
		JButton btn5 = new JButton("Button 5");
		frame.setLayout(new FlowLayout());
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		
		frame.setVisible(true);

	}

}
