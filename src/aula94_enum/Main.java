package aula94_enum;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Order order = new Order(1800, new Date(), OrderStatus.PROCESSING);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		System.out.println(os1);
		
		OrderStatus os2 = OrderStatus.valueOf("SHIPPED");
		System.out.println(os2);
	}
	
}
