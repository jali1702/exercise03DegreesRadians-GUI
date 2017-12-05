package com.maven.exercise03DegreesRadians_GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frmConversor;
	private final JLabel lblEnterTheValue = new JLabel("Enter the value in degrees:");
	private JTextField textFieldDegrees;
	private JTextField textFieldRadians;
	private JButton btnToRadians = new JButton("To radians");
	private JButton btnToDegrees = new JButton("To Degrees");
	
	private JLabel lblEnterTheValue_1 = new JLabel("Enter the value in raidians:");
	
	private JLabel lblResult = new JLabel("Result: ");
	
	ConversorDegresRadians cdr = new ConversorDegresRadians();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.setTitle("Conversor");
		frmConversor.getContentPane().setBackground(Color.PINK);
		frmConversor.setBounds(100, 100, 321, 327);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversor.getContentPane().setLayout(null);
		lblEnterTheValue.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		lblEnterTheValue.setBounds(23, 25, 204, 33);
		frmConversor.getContentPane().add(lblEnterTheValue);
		
		textFieldDegrees = new JTextField();
		textFieldDegrees.setBounds(51, 57, 120, 19);
		frmConversor.getContentPane().add(textFieldDegrees);
		textFieldDegrees.setColumns(10);
		
		lblEnterTheValue_1.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		lblEnterTheValue_1.setBounds(23, 123, 204, 19);
		frmConversor.getContentPane().add(lblEnterTheValue_1);
		
		textFieldRadians = new JTextField();
		textFieldRadians.setBounds(51, 148, 120, 19);
		frmConversor.getContentPane().add(textFieldRadians);
		textFieldRadians.setColumns(10);
		
		lblResult.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		lblResult.setBounds(23, 202, 204, 15);
		frmConversor.getContentPane().add(lblResult);
		
		
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(textFieldRadians.getText().toString());
				double valueInDegrees = Double.parseDouble(textFieldRadians.getText().toString());
				double result = cdr.convertRadiansToDegrees(valueInDegrees);
				lblResult.setText("Result: " + result);
				textFieldDegrees.setText("");
				textFieldRadians.setText("");
			}
		});
		btnToDegrees.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		btnToDegrees.setBounds(23, 245, 117, 25);
		frmConversor.getContentPane().add(btnToDegrees);
		
		
		btnToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(textFieldDegrees.getText().toString());
				double valueInRadians = Double.parseDouble(textFieldDegrees.getText().toString());
				double result = cdr.convertDegreestToRadians(valueInRadians);
				lblResult.setText("Result: " + result);
				textFieldDegrees.setText("");
				textFieldRadians.setText("");
			}
		});
		btnToRadians.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		btnToRadians.setBounds(177, 245, 117, 25);
		frmConversor.getContentPane().add(btnToRadians);
	}
}
