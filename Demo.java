package busreservation;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        // Sample data
        buses.add(new Bus(101, true, 50));
        buses.add(new Bus(102, false, 40));

        Booking booking1 = new Booking();
        if (booking1.isAvailable(bookings, buses)) {
            booking1.addBooking(bookings);
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed. Bus is full.");
        }
    }
}
