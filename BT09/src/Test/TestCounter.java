package Test;

import java.awt.EventQueue;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import view.WinFormCount;

public class TestCounter {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						WinFormCount window = new WinFormCount();
						window.frame.setVisible(true);
						SwingUtilities.invokeLater(() -> window.textField.requestFocusInWindow());
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
