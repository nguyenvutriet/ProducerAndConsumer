package mypack;

public class BaiTap09 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread t1 = new Thread(
		()->{
			for(int i = 0; i < 1000; i++) {
				counter.increament();
			}
		}
		);
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increament();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Counter: " + counter.getCount());
	}
}
