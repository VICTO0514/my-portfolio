package inheritanceAssi2;

public class Reservation {
	
	 private int reservationID;
	 private String customerName;
     private String date;
     private String status;
     
     public Reservation(int reservationID, String customerName, String date)
     {
    	 this.reservationID = reservationID;
    	 this.customerName  = customerName;
    	 this.date          = date;
    	 this.status        = "confirmed";
     }
     
     public String getStatus() { return status; }
     public String getDate() { return date; }
     
     public void checkStatus() {
         System.out.println("Reservation ID: " + reservationID + " | Status: " + status);
     }

     public void modifyDate(String newDate) {
         this.date = newDate;
         System.out.println("Date updated to: " + newDate);
     }

     public void cancelReservation() {
         this.status = "Cancelled";
         System.out.println("Reservation " + reservationID + " has been cancelled.");
     }
}
