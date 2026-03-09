package inheritanceAssi;

public class OnlineOrder extends CustomerOrder {
	
	private String deliveryAddress;
	private String trackingNumber;
	private String trackingStatus;
	
	public OnlineOrder(int orderID, String customerName, String orderDate, String deliveryAddress, String trackingNumber)
	{
		super(orderID, customerName, orderDate);
		this.deliveryAddress = deliveryAddress;
		this.trackingNumber  = trackingNumber;
		this.trackingStatus  = "Order Placed";
	}
	
	public int calculateDeliveryTime()
	{
		if(deliveryAddress.toLowerCase().contains("local"))
		{
			return 2;
		}
		return 5;
	}
	
	public void updateTrackingStatus(String status)
	{
		this.trackingStatus = status;
		System.out.println("Tracking [" + trackingNumber + "] updated to: " + trackingStatus);
	}
	
    @Override
    public void display() {
        super.display();
        System.out.println("Address: " + deliveryAddress + " | Tracking: " + trackingNumber + " | Status: " + trackingStatus
                         + " | Estimated Delivery: " + calculateDeliveryTime() + " days");
    }
    
	public static void main(String[] args) {
		OnlineOrder order = new OnlineOrder(1, "Victoria", "2026-03-05", "23/5 Chennai", "TUT9834");
		order.display();
		
		System.out.println();
	    order.updateTrackingStatus("Shipped");
	    order.updateTrackingStatus("Out for Delivery");
	}

}
