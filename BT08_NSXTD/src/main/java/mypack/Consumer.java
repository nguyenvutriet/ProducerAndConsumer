package mypack;

public class Consumer extends Thread{
	private int id;
	private Buffer buffer;
	public Consumer(int id, Buffer buffer) {
		this.id = id;
		this.buffer = buffer;
	}
	@Override
	public void run() {
		//int i = 0;
		while(true) {
			if(buffer.getSize() > 0) {
				try {
					buffer.removeProduct(id);
					//sleep((long) (Math.random() * 100));
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}
