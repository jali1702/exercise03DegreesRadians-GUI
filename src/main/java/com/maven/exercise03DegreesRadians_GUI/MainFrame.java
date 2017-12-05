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

	private JFrame frame;
	private final JLabel lblEnterTheValue = new JLabel("Enter the value in degrees:");
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 321, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblEnterTheValue.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		lblEnterTheValue.setBounds(23, 25, 204, 33);
		frame.getContentPane().add(lblEnterTheValue);
		
		textField = new JTextField();
		textField.setBounds(51, 57, 120, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheValue_1 = new JLabel("Enter the value in raidians:");
		lblEnterTheValue_1.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		lblEnterTheValue_1.setBounds(23, 123, 204, 19);
		frame.getContentPane().add(lblEnterTheValue_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(51, 148, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblResult = new JLabel("Result: ");
		lblResult.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		lblResult.setBounds(23, 202, 70, 15);
		frame.getContentPane().add(lblResult);
		
		JButton btnToDegrees = new JButton("To degrees");
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnToDegrees.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		btnToDegrees.setBounds(23, 245, 117, 25);
		frame.getContentPane().add(btnToDegrees);
		
		JButton btnToRadians = new JButton("To radians");
		btnToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnToRadians.setFont(new Font("NanumMyeongjo", Font.PLAIN, 14));
		btnToRadians.setBounds(177, 245, 117, 25);
		frame.getContentPane().add(btnToRadians);
	}
}
