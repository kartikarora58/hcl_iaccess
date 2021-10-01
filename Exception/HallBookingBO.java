import java.util.ArrayList;
public class HallBookingBO {
	public static Boolean validateHallBooking(ArrayList<HallBooking> bookingList,HallBooking booking) throws HallNotAvailableException{
		
		for(HallBooking item:bookingList) {
			
			if ((item.getHall().getName()).equals(booking.getHall().getName()))
			{
				if((item.getEventDate()).equals(booking.getEventDate()))
				{
					return false;
				}
			}
		}
		return true;
	}
}
