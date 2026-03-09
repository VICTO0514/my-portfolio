package oopAssignment;

public class ElectronicProduct {
	
	private int productID;
	private String name;
	private double price;
	
	public ElectronicProduct(int productID, String name, double price)
	{
		this.productID = productID;
		this.name      = name;
		this.price     = price;
	}
	
	public int getProductID() { return productID; }
	public String getName() { return name; }
    public double getPrice() { return price; }
    
    public void setPrice(double price) { this.price = price; }
    
    public void applyDiscount(double discountPercent)
    {
    	this.price -= price * (discountPercent / 100);
    	System.out.println("Discount: " + discountPercent + " %");
    }
    
    public double calculateFinalPrice()
    {
    	return this.price;
    }
    
    public void display()
    {
    	System.out.println("ID: " + productID);
    	System.out.println("NAME: " + name);
    	System.out.println("FINAL PRICE:" + calculateFinalPrice());
    }
  
}
