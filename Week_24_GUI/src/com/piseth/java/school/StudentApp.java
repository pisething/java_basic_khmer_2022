package com.piseth.java.school;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Student Form");
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 10, 50, 20);
		frame.add(lblName);
		
		JTextField txtName = new JTextField();
		txtName.setBounds(70, 10, 100, 20);
		frame.add(txtName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 40, 50, 20);
		frame.add(lblGender);
		
		JTextField txtGender = new JTextField();
		txtGender.setBounds(70, 40, 100, 20);
		frame.add(txtGender);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 70, 50, 20);
		frame.add(lblAge);
		
		JTextField txtAge = new JTextField();
		txtAge.setBounds(70, 70, 100, 20);
		frame.add(txtAge);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setBounds(10, 100, 50, 20);
		frame.add(lblGrade);
		
		Integer[] grades = new Integer[] {1,2,3,4,5,6};
		JComboBox<Integer> cbxGrade = new JComboBox<>(grades);
		cbxGrade.setBounds(70, 100, 100, 20);
		frame.add(cbxGrade);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(10, 130, 80, 20);
		frame.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("My button works!");
				String text = txtName.getText() + " " + txtGender.getText() + " " 
				+ txtAge.getText() + " " +cbxGrade.getSelectedItem().toString();
				System.out.println(text);
			}
		});
		
		
		
		
		frame.setVisible(true);
	}

}
