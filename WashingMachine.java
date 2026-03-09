package oopAssignment;

import java.util.Scanner;

public class WashingMachine extends ElectronicProduct{
	
	private int warrantyPeriod;
	
	public WashingMachine(int productID, String name, double price, int warrantyPeriod)
	{
		super(productID, name, price);
		this.warrantyPeriod = warrantyPeriod;
	}
	
	 public void extendWarranty(int extraYears) 
	 {
		 this.warrantyPeriod += extraYears;
	 }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Product Id: ");
		int Id = sc.nextInt();
		
		System.out.println("Washing Machine Model: ");
		String machineName = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Total Amount: ");
		double amount = sc.nextInt();
		
		System.out.println("Warranty Period: ");
		int warranty = sc.nextInt();
		
		WashingMachine w = new WashingMachine(Id, machineName, amount, warranty);
		
		w.applyDiscount(15);
		w.display();
		System.out.println("Warranty:        " + w.warrantyPeriod + " years");
		
		w.extendWarranty(1);
		System.out.println("Extend Warranty: " + w.warrantyPeriod + " years");
		
		sc.close();
	}

}
