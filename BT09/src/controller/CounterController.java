package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.CounterS;
import view.WinFormCount;

public class CounterController implements ActionListener{
	
	private CounterS model = new CounterS();
	private WinFormCount view;
	private int len;

	public CounterController( WinFormCount view) {
		this.view = view;
		view.JT_Count.setText(model.getCount() + "");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		len = view.So();
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		if(button.equals("Start")) {
			Thread t1 = new Thread(() -> {
				for (int i = 1; i <= len; i++) {
					try {
						workIncreament(1);
						Thread.sleep(500);
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			});
			Thread t2 = new Thread(() -> {
				for (int i = 1; i <= len; i++) {
					try {
						workIncreament(2);
						Thread.sleep(500);
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			});
			Thread t3 = new Thread(() -> {
				for (int i = 1; i <= len; i++) {
					try {
						workIncreament(3);
						Thread.sleep(500);
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			});
			
			t1.start();
			t2.start();
			t3.start();
		}
		if(button.equals("Clean")) {
			view.textField.setText("");
			view.tA_Line.setText("");
			model.setCount(0);
			view.JT_Count.setText(model.getCount()+"");
		}
	}
	public synchronized void workIncreament(int id) {
		model.increamentS();
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String time = current.format(formatter);
		view.tA_Line.append(time + " --> Thread " + id + " is running\n");
		view.tA_Line.append("Counter: " + model.getCount() + "\n");
		view.JT_Count.setText(model.getCount()+"");
	}

}
