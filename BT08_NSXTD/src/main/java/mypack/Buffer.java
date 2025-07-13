package mypack;

import java.util.ArrayList;

public class Buffer {
	// khả năng chứa tối đa
	private int capacity;
	// danh sách sản phẩm
	private ArrayList<Integer> products = new ArrayList<Integer>();
	
	
	public Buffer(int capacity) {
		super();
		this.capacity = capacity;
		products = new ArrayList<Integer>();
	}
	public void addProduct(int product, int producerId) {
		System.out.println(">>>>>>----------------------------------------");
		System.out.println("Nhà sản xuất " + producerId + " đã thêm sản phẩm " + product);
		products.add(product);
		System.out.println("Số lượng sản phẩm tồn kho: " + products.size());
		
	}
	public void removeProduct(int consumerId) {
		System.out.println("<<<<<<-----------------------------------------");
		System.out.println("Khách hàng " + consumerId + " đã mua sản phẩm" + products.get(0));
		products.remove(0);
		System.out.println("Số lượng tồn kho " + products.size());
	}
	public int getSize() {
		return products.size();
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public ArrayList<Integer> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Integer> products) {
		this.products = products;
	}
}
