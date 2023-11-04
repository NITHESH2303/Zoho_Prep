public class Taxi{
    int taxiNo, earning, departureTime;
    char curPos;
    public Taxi(){
        curPos='a';
    }
    public boolean isTaxiFree(int pickupTime){
        if(departureTime<pickupTime) return false;
        return true;
    }
    public void departureTime(char pickupPoint, char dropPoint, int pickupTime){
        departureTime=pickupTime+Math.abs(pickupPoint-dropPoint);
    }
}