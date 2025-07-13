package mypack;

public class Producer extends Thread{
	private int id;
	public Buffer buffer;
	public Producer(int id, Buffer buffer) {
		super();
		this.id = id;
		this.buffer = buffer;
	}
	@Override
	public void run() {
		int i = 0;
		while(true) {
			if(buffer.getCapacity() > buffer.getSize()) {
				try {
					buffer.addProduct(i++, id);
					//sleep((long) (Math.random() * 100));
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	
}
