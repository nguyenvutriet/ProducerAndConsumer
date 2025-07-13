package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import model.ConsumerB;
import model.ProducerA;
import model.Store;
import mypack.Producer;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ManageProducerAndConsumer {

	public JFrame frame;
	public JButton btn_Start;
	public JButton btn_Stop;
	public JScrollPane scrollPane;
	public JPanel panel;
	private Store st;
	private ProducerA p1;
	private ProducerA p2;
	private ProducerA p3;
	private ConsumerB c1;
	private ConsumerB c2;
	public JTextArea lbl_Infor;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageProducerAndConsumer window = new ManageProducerAndConsumer();
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
	public ManageProducerAndConsumer() {
		initialize();
		st = new Store(10, this);
			}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 708, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 568, 357);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 548, 337);
		panel.add(scrollPane);
		
		lbl_Infor = new JTextArea();
		lbl_Infor.setLineWrap(true);
		lbl_Infor.setWrapStyleWord(true);
		lbl_Infor.setEditable(false);
		scrollPane.setViewportView(lbl_Infor);
		
		
		btn_Start = new JButton("Start");
		btn_Start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p1 = new ProducerA(1, st);
				p2 = new ProducerA(2, st);
				p3 = new ProducerA(3, st);
				c1 = new ConsumerB(1, st);
				c2 = new ConsumerB(2, st);

				p1.start();
				p2.start();
				p3.start();
				c1.start();
				c2.start();
				
			}
		});
		btn_Start.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Start.setBounds(588, 10, 96, 34);
		frame.getContentPane().add(btn_Start);
		
		btn_Stop = new JButton("Stop");
		btn_Stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setStop_(false);
				p2.setStop_(false);
				p3.setStop_(false);
				c1.setStop_(false);
				c2.setStop_(false);
			}
		});
		btn_Stop.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Stop.setBounds(588, 68, 96, 34);
		frame.getContentPane().add(btn_Stop);
	}
}
