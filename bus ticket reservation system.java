package busreservation;
import java.util.Scanner;
import java.util.ArrayList;
public class demo {
	public static void main (String args[]) {
		ArrayList<bus>buses = new ArrayList<bus>();
		buses.add(new bus(1,true,45));
		buses.add(new bus(2,false,50));
		buses.add(new bus(3,true,30));
		int useropt = 1;
		Scanner scanner = new Scanner(System.in);
		for(bus b:buses) {
			b.displaybusinfo();
		}
				while(useropt == 1) {
					System.out.println("Enter 1 to book and 2 to exit");
					useropt = scanner.nextInt();
					if (useropt==1) {
						System.out.println("Booking........");
					}
					
				}
	}

}
