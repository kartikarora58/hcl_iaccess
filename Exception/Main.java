import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Event> eventList=new ArrayList<>();
		ArrayList<Hall> hallList=new ArrayList<>();
		
		Hall haob=null;
		Event evob=null;
		
		ArrayList<HallBooking> bookingList=new ArrayList<>();
		
		eventList.add(new Event("Book Fair","All books available","John","Exhibition"));
		eventList.add(new Event("Furniture Fair","Discount of 20%","Joe","Exhibition"));
		eventList.add(new Event("Magic show","Magic without Logic","Jack","Stage event"));
		
		hallList.add(new Hall("Sdf hall","123456",new Double(10000.0),"Jill"));
		hallList.add(new Hall("JKL hall","135790",new Double(25000.0),"James"));
		hallList.add(new Hall("TUV hall","246800",new Double(15000.0),"Jane"));
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		while(true) {
			System.out.println("Enter the booking details:");
			String details[]=(br.readLine()).split(",");
			Date eventDate=null;
			try {
				 eventDate=formatter.parse(details[2]);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			String hallName=details[0];
			String eventName=details[1];
			double costPerDay=Double.valueOf(details[3]);
			
				
//			check if the event exist
			boolean eflag=false;
			for(Event eob:eventList) {
				if ((eob.getName()).equals(eventName)){
					eflag=true;
					evob=eob;
					
					break;
					
				}
			}
			boolean hflag=false;
			for(Hall hob:hallList) {
				if ((hob.getName()).equals(hallName)){
					hflag=true;
					haob=hob;
					break;
					
				}
			}
			try {
				if(eflag == false || hflag==false) {
					throw new HallNotAvailableException("Hall or Event does not exist");
				}
				HallBooking hb=new HallBooking(haob, evob, eventDate, costPerDay);
				if (bookingList.isEmpty())
				{
					bookingList.add(hb);
				}
				else {
					try {
						if(HallBookingBO.validateHallBooking(bookingList, hb)) {
							bookingList.add(hb);
						}
						else {
							throw new HallNotAvailableException("Hall Already Booked");
						}
					} catch (HallNotAvailableException e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
					
					
					
				}
				
				
				
			}
			catch(HallNotAvailableException e){
				System.out.println(e);
			}
			System.out.println("Do you want to continue?(y/n)");
			String choice=br.readLine();
			if ((choice).equals("n"))
			{
				
				
				break;
			}
			else if((choice).equals("y"))
			{
				continue;
			}
		}
			
			System.out.println("The bookings entered are:");
			System.out.printf("%-15s%-15s%-15s%-15s\n","Hall name","Event name","Event date","Price");
			for(HallBooking item:bookingList) {
				System.out.println(item);
			}
		
		//write your code here
	}
}
