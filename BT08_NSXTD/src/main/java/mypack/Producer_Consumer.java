package mypack;

public class Producer_Consumer {
	public static void main(String[] args) {
		Buffer buffer = new Buffer(10);
		Producer p1 = new Producer(333, buffer);
		Producer p2 = new Producer(999, buffer);
		Consumer c1 = new Consumer(1, buffer);
		Consumer c2 = new Consumer(2, buffer);
		Consumer c3 = new Consumer(3, buffer);
		//bắt đầu mua hàng
		c1.start();
		c2.start();
		c3.start();
		//bắt đầu sản xuất
		p1.start();
		p2.start();
	}
}
