package model;

public class ProducerA extends Thread{
	private int id;
	private Store st;
	private boolean stop_ = true;
	public ProducerA(int id, Store st) {
		this.id = id;
		this.st = st;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(stop_) {
			if(st.getCapacity() > st.getListProduct().size()) {
				try {
					st.addProduct(i++, id);
					sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
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
