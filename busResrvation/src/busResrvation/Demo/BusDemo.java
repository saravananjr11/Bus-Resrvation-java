package busResrvation.Demo;
import busResrvation.*;

import java.util.*;
public class BusDemo {

	public static void main(String[] args) {
		int userOp=1;
		Scanner scanner=new Scanner(System.in);
		List<Bus> bus=new ArrayList<>();
		List<Booking>book=new ArrayList<Booking>();
//		for (int i = 0; i <=1 ; i++) {
//			for (int j = 41; j <=41 ; j++) {
//				Bus bus=new Bus(i+userOp, true, j);
//	          	list.add(bus);
//			}
//		}
//		for (int i = 3; i <=4 ; i++) {
//			for (int j = 42; j <=42 ; j++) {
//				Bus bus=new Bus(i, false, j);
//	          	list.add(bus);
//			}
//		}
		bus.add(new Bus(1,true,1));
		bus.add(new Bus(2,false,3));
		bus.add(new Bus(3,true,3));



	
		
		for (Bus b : bus) {
			b.displayBusInfo();
		}
		
		
		while(userOp==1) {
			System.out.println("Enter 1 To Book and 2 to Exit");
			String opration=scanner.next();
			
			if(opration.equals("1")) {
				System.out.println("Booking.....");
				Booking booking=new Booking();
				if(booking.isAvailable(book,bus)) {
					book.add(booking);
					System.out.println("Your Booking Is Confirmed");
				}else {
					System.out.println("Oops Bus is full try Another Bus Or Date");
				}
					
				
				
			}else {
				System.out.println("thanks for using our service");
			}
			

		}

	
	}
}
