import java.util.*;/**
 * CallTaxiBooking
 */
class CallTaxiBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Taxi[] taxis = new Taxi[4];
        int bookingId=0,taxiId=4;
        for(int i=0;i<4;i++) taxis[i] = new Taxi();
        Booking[] bookings = new Booking[10];
        int choice,free;
        while (true){
            System.out.println("____________Call_Taxi_Booking____________");
            System.out.println("1.Booking");
            System.out.println("2.Booking_Details");
            System.out.println("3.Taxi_Details");
            System.out.println("4.Exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    Booking book= new Booking();
                    free = book.addBooking(bookings, taxis, bookingId, taxiId);
                    if(free!=-1){
                        bookings[bookingId].droptime();
                        book.calcEarning(bookings, bookingId, taxis, free, bookings[bookingId].pickupPoint, bookings[bookingId].dropPoint);
                        bookingId++;
                        System.out.println("Booking Successful, your taxi No:"+ free);
                    }
                    else{
                        System.out.println("No taxi Available");
                    }
                    break;
                
                case 2:
                    System.out.println("BookingId   customerId   TaxiNo   PickupPoint   DropPoint   PickupTime   DropTime   earnings");
                    for(int bookingid=0;bookingid<bookingId;bookingid++){
                        System.out.printf("%-13d%-13d%-13d%-13s%-13s%-13d%-13d%-13d%n", bookingid, bookings[bookingid].c_id, 
                                            bookings[bookingid].taxiNo, bookings[bookingid].pickupPoint, bookings[bookingid].dropPoint, 
                                            bookings[bookingid].pickupTime, bookings[bookingid].droptime, bookings[bookingid].earning);
                    }
                    break;
                case 4:
                    return;

                default:
                    break;
            }
        }
    }
}