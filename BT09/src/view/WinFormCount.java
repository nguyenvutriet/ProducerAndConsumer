package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.CounterController;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class WinFormCount {

	public JFrame frame;
	public JTextField JT_Count;
	public JTextField textField;
	public JButton btn_Start;
	public JButton btn_Clean;
	public JTextArea tA_Line;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinFormCount window = new WinFormCount();
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
	public WinFormCount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 372, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JT_Count = new JTextField();
		JT_Count.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		JT_Count.setBounds(10, 10, 338, 49);
		frame.getContentPane().add(JT_Count);
		JT_Count.setColumns(10);
		JT_Count.setEditable(false);
		
		JLabel lbl_Enter = new JLabel("Nhập số:");
		lbl_Enter.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbl_Enter.setBounds(10, 75, 98, 30);
		frame.getContentPane().add(lbl_Enter);
		
		textField = new JTextField();
		textField.requestFocusInWindow();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(94, 69, 138, 30);
		frame.getContentPane().add(textField);
		
		
		ActionListener ac = new CounterController(this);
		
		btn_Start = new JButton("Start");
		btn_Start.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Start.setBounds(10, 121, 84, 28);
		frame.getContentPane().add(btn_Start);
		btn_Start.addActionListener(ac);
		
		btn_Clean = new JButton("Clean");
		btn_Clean.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Clean.setBounds(264, 121, 84, 28);
		frame.getContentPane().add(btn_Clean);
		btn_Clean.addActionListener(ac);
		
		JLabel lbl_State = new JLabel("Trạng thái:");
		lbl_State.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbl_State.setBounds(10, 158, 98, 30);
		frame.getContentPane().add(lbl_State);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 195, 338, 205);
		frame.getContentPane().add(scrollPane);
		
		tA_Line = new JTextArea();
		tA_Line.setWrapStyleWord(true);
		tA_Line.setLineWrap(true);
		tA_Line.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		tA_Line.setEditable(false);
		scrollPane.setViewportView(tA_Line);
	}
	public int So() {
		return Integer.parseInt(textField.getText());
	}
}
