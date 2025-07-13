package model;


public class ConsumerB extends Thread{
	private int id;
	private Store st;
	private boolean stop_ = true;
	public ConsumerB(int id, Store st) {
		this.id = id;
		this.st = st;
	}
	
	@Override
	public void run() {
		while(stop_) {
			if(st.getListProduct().size() > 0) {
				try {
					st.removeProduct(id);
					sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

	public boolean isStop_() {
		return stop_;
	}

	public void setStop_(boolean stop_) {
		this.stop_ = stop_;
	}
	
}
