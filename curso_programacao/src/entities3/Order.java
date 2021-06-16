package entities3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums2.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private static SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	
	private List <OrderItem> items = new ArrayList<>();
	
	public Order(){
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem (OrderItem item) {
		items.add(item);
	}
	
	public void removeItem (OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0;
		for(OrderItem c : items) {
			sum += c.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder ();
		sb.append("Order moment: " + sdf2.format(moment));
		sb.append("\n");
		sb.append("Order Status: " + status);
		return sb.toString();
	}
}
