package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import view.ManageProducerAndConsumer;

public class Store {
	private int capacity;
	private List<Integer> ListProduct;
	private ManageProducerAndConsumer view;
	public Store(int capacity) {
		super();
		this.capacity = capacity;
		ListProduct = new ArrayList<Integer>();
	}
	
	
	public Store(int capacity, ManageProducerAndConsumer view) {
		this.capacity = capacity;
		this.view = view;
		ListProduct = new ArrayList<Integer>();
	}


	public void addProduct(int idProduct, int idProducer) {
		ListProduct.add(idProduct);
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String time = current.format(formatter);
//		StringBuilder context = new StringBuilder("<html>");
//		context.append(time + ">>> Nhà sản xuất " + idProducer + " đã thêm sản phẩm ");
		view.lbl_Infor.append(time + " >>> Nhà sản xuất " + idProducer + " đã thêm sản phẩm\n");
//		context.append("Số lượng tồn kho: " + ListProduct.size());
		view.lbl_Infor.append("Số lượng tồn kho: " + ListProduct.size() + "\n");
	}
	public void removeProduct(int idConsumer) {
		ListProduct.remove(0);
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String time = current.format(formatter);
//		StringBuilder context = new StringBuilder("<html>");
//		context.append(time + "<<< Người tiêu dùng " + idConsumer + " đã lấy sản phẩm ");
		view.lbl_Infor.append(time + " <<< Người tiêu dùng " + idConsumer + " đã lấy sản phẩm\n");
//		context.append("Số lượng tồn kho: " + ListProduct.size());
		view.lbl_Infor.append("Số lượng tồn kho: " + ListProduct.size()+"\n");
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Integer> getListProduct() {
		return ListProduct;
	}

	public void setListProduct(List<Integer> listProduct) {
		ListProduct = listProduct;
	}
	
	
	
}
