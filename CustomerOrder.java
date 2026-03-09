package inheritanceAssi;

public class CustomerOrder {
	
	private int orderID;
	private String customerName;
	private String orderDate;
	
	public  CustomerOrder(int orderID, String customerName, String orderDate)
	{
		this.orderID = orderID;
		this.customerName = customerName;
		this.orderDate = orderDate;
	}
	
	public int getOrderId() { return orderID; }
    public String getCustomerName() { return customerName; }
    public String getOrderDate() { return orderDate; }
    
    public void display() {
        System.out.println("Order ID: " + orderID + " | Customer: " + customerName + " | Date: " + orderDate);
    }
    
}
