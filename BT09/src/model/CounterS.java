package model;

public class CounterS {
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public CounterS() {
		
	}
	public synchronized void increamentS() {
		count++;
	}
}
