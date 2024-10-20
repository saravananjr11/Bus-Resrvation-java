package busResrvation;
import java.util.*;
import java.text.*;

public class Booking {
	String passangerName;
	int busNo;
	Date date;
	public Booking() {
		super();
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter a Passanger Name :");
		passangerName=s1.next();
		System.out.print("Enter Bus No :");
		busNo=s1.nextInt();
		System.out.print("Enter date :");
		String dateOb=s1.next( );
		SimpleDateFormat dateFormate=new SimpleDateFormat("dd-MM-yyyy");
		 try {
			date =dateFormate.parse(dateOb);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(List<Booking> book, List<Bus> bus) {
		int capcity=0;
		int booked=0;
		for (Bus buss : bus) {
			if(buss.getBusNo()==busNo) {
				capcity = buss.getCapacity();
			}
			
			for ( Booking b  : book) {
				if(b.busNo == busNo && b.date.equals(date)) {
					booked++;
				}
			}	
		}
		return booked<capcity?true:false;
		
}
	
}
