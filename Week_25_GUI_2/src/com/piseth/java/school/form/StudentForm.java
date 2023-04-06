package com.piseth.java.school.form;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentForm extends JFrame{
	private JTable table;
	private JTextField txtName;
	private JRadioButton rdoMale;
	private JRadioButton rdoFemale;
	private JComboBox<Integer> cboGrade;
	private JTextField txtAge;
	private int selectedRow = -1;
	private JButton btnSave;
	private JButton btnDelete;
	
	public StudentForm() {
		this.setTitle("Student Form");
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Add components
		JPanel form = createForm();
		this.getContentPane().add(form, BorderLayout.NORTH);
		table = createTable();
		JScrollPane js = new JScrollPane();
		js.getViewport().add(table);
		addMouseClickEventToTable();
		//
		this.getContentPane().add(js);
		this.setVisible(true);
	}
	
	private JPanel createForm() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2));
		
		JLabel lblName = new JLabel("Name");
		txtName = new JTextField();
		
		JLabel lblGender = new JLabel("Gender");
		//JComboBox<String> cboGender = new JComboBox<>(new String[] {"Male","Female"});
		rdoMale = new JRadioButton("Male");
		rdoFemale = new JRadioButton("Female");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdoMale);
		buttonGroup.add(rdoFemale);
		JPanel pGender = new JPanel(new FlowLayout());
		pGender.add(rdoMale);
		pGender.add(rdoFemale);
		
		JLabel lblGrade = new JLabel("Name");
		Integer grades[] = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12};
		cboGrade = new JComboBox<>(grades);
		
		JLabel lblAge = new JLabel("Age");
		txtAge = new JTextField();
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new MyClickListener());
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new MyClickListener());
		
		panel.add(lblName);
		panel.add(txtName);
		panel.add(lblGender);
		panel.add(pGender);
		panel.add(lblGrade);
		panel.add(cboGrade);
		panel.add(lblAge);
		panel.add(txtAge);
		panel.add(btnSave);
		panel.add(btnDelete);
		return panel;
	}
	
	private class MyClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnSave) {
				saveOrUpdate();
			}else if(e.getSource() == btnDelete) {
				removeRowData();
			}
			
		}
		
		
	}
	
	private void removeRowData() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		if(selectedRow != -1) {
			model.removeRow(selectedRow);
			selectedRow = -1;
		}
	}
	
	private void saveOrUpdate() {
		String gender = "Male";
		if(rdoFemale.isSelected()) {
			gender = "Female";
		}
		if(selectedRow != -1) { // Update row data
			//table.setValueAt(data, selectedRow, ABORT);
			table.setValueAt(txtName.getText(), selectedRow, 0);
			table.setValueAt(gender, selectedRow, 1);
			table.setValueAt(cboGrade.getSelectedItem().toString(), selectedRow, 2);
			table.setValueAt(txtAge.getText(), selectedRow, 3);
			selectedRow = -1;
		}else {
			// Add row data
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			
			Object[] data = new Object[] {
					txtName.getText(), gender, 
					cboGrade.getSelectedItem().toString(),
					txtAge.getText()
			};
			model.addRow(data);
			
		}
		clearForm();
	}
	
	private void clearForm() {
		txtName.setText("");
		rdoMale.setSelected(true);
		cboGrade.setSelectedIndex(0);
		txtAge.setText("");
	}
	
	private void addMouseClickEventToTable() {
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("Mouse click");
				setFormValue();
			}
		});
	}
	
	private void setFormValue() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		selectedRow = table.getSelectedRow();
		System.out.println(selectedRow);
		Object name = model.getValueAt(selectedRow, 0);
		Object gender = model.getValueAt(selectedRow, 1);
		Object grade = model.getValueAt(selectedRow, 2);
		Object age = model.getValueAt(selectedRow, 3);
		
		txtName.setText(name.toString());
		if(gender.toString().equals("Male")) {
			rdoMale.setSelected(true);
		}else {
			rdoFemale.setSelected(true);
		}
		cboGrade.setSelectedItem(Integer.parseInt(grade.toString()));
		txtAge.setText(age.toString());
	}
	
	private JTable createTable() {
		String[] columnNames = {"Name","Gender","Grade","Age"};
		Object[][] rowData = {
				{"Dara","Male",10,16},
				{"Thida","Female",9,15}
		};
		DefaultTableModel model = new DefaultTableModel(rowData, columnNames);
		//JTable t = new JTable(null);
		//TableModel
		//JTable table = new JTable(rowData, columnNames);
		JTable table = new JTable(model);
		
		return table;
	}

}
