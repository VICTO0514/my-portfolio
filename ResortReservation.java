package inheritanceAssi2;

public class ResortReservation extends Reservation {
	
	private int roomNumber;
	
	public ResortReservation (int reservationID, String customerName, String date, String status, int roomNumber)
	{
		super(reservationID, customerName, date);
		this.roomNumber = roomNumber;
	}
	
	public void modifyRoom (int newRoom)
	{
		this.roomNumber = newRoom;
		System.out.println("Room update to: " + newRoom);
	}
	
	public void checkReservationStatus()
	{
		super.checkStatus();
		System.out.println("Room Number: " + roomNumber + " | Date: " + getDate());
	}

}
