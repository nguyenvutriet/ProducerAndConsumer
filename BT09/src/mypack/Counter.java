package mypack;

public class Counter {
	private int count = 0;
	
	// synchronized: đồng bộ, tại một thời điểm chỉ có một thread gọi
	public synchronized void increament() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
