package com.rays.ioc;

public class Order1 {

	private Payment payment;
	private Inventory inventory;
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void bookATicket(int item) {
		
		int price = 10;
		
		double totalAmount = item * price;
		
		double updateBalance = payment.MakePayment(totalAmount);
		
		int updateStock =  inventory.sold(item);
		
		System.out.println("Ticket Are Book");
		System.out.println("Total Ammount Paid: " + totalAmount);
		System.out.println("Remaining Balance: " + updateBalance);
		System.out.println("Update Stock: " + updateStock);
		
	}
}
