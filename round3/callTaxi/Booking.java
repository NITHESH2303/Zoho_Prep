import java.util.Scanner;

public class Booking {
    int c_id, taxiNo, pickupTime, droptime, earning, free;
    char pickupPoint, dropPoint;

    public Booking(int c_id, char pickupPoint, char dropPoint, int pickupTime){
        this.c_id = c_id;
        this.pickupPoint= pickupPoint;
        this.dropPoint= dropPoint;
        this.pickupTime= pickupTime;
    }

    public Booking() {
    }

    public int checkAvailability(Taxi[] taxis, int taxiCount){
        int taxiId, taxiid=0, minDist=6;
        for(taxiId=0; taxiId<taxiCount;taxiId++){
            if(taxis[taxiId].isTaxiFree(pickupTime)){
                if(Math.abs(taxis[taxiId].curPos-pickupPoint)<minDist) taxiid=taxiId;
                if(Math.abs(taxis[taxiId].curPos-pickupPoint)==minDist){
                    if(taxis[taxiId].earning<taxis[taxiid].earning) taxiid=taxiId;
                }
            }
            minDist=Math.abs(taxis[taxiid].curPos-pickupPoint);
        }
        if(minDist!=6){
            taxis[taxiid].departureTime(pickupPoint,dropPoint,pickupTime);
            taxis[taxiid].curPos=dropPoint;
            taxiNo=taxiid;
            return taxiNo;
        }return -1;
    }

    public int addBooking(Booking[] bookings, Taxi[] taxis, int bookingId, int taxiId){
        int availability;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter c_id:");
        c_id = sc.nextInt();
        System.out.println("Enter pickupPoint");
        pickupPoint = sc.next().charAt(0);
        System.out.println("Enter dropPoint");
        dropPoint = sc.next().charAt(0);
        System.out.println("Enter pickupTime");
        pickupTime = sc.nextInt();
        bookings[bookingId] = new Booking(c_id, pickupPoint, dropPoint, pickupTime);
        availability = bookings[bookingId].checkAvailability(taxis, taxiId);
        return availability;
    }

    public void droptime() {
        this.droptime=pickupTime+Math.abs(pickupPoint-dropPoint);
    }

    public void calcEarning(Booking[] bookings, int bookingId, Taxi[] taxis, int taxiId, char pickupPoint, char dropPoint){
        earning=100+(((Math.abs(pickupPoint-dropPoint)*15)-5)*10);
        bookings[bookingId].earning=earning;
        taxis[taxiId].earning+=earning;

    }


}
