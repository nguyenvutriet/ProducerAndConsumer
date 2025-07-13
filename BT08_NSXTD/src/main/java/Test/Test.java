package Test;

import java.awt.EventQueue;

import javax.swing.UIManager;

import view.ManageProducerAndConsumer;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
