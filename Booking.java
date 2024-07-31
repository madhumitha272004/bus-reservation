package busreservation;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    private String passengerName;
    private int busNo;
    private Date date;

    Booking() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter name of the passenger:");
			setPassengerName(scanner.nextLine());
			System.out.println("Enter the bus no:");
			busNo = scanner.nextInt();
			System.out.println("Enter date (dd-MM-yyyy):");
			scanner.nextLine(); // Consume the newline left-over
			String dateInput = scanner.nextLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			try {
			    date = dateFormat.parse(dateInput);
			} catch (ParseException e) {
			    e.printStackTrace();
			}
		}
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusno() == busNo) {
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity;
    }

    public void addBooking(ArrayList<Booking> bookings) {
        bookings.add(this);
    }

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
}
