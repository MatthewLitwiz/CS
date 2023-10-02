package More.Guests;
public class Event {

    public final static double guestprice = 35;
    public final static int large_event = 50;

    private String guest;
    private int guestlist;
    private double price;

    Event(String guest, int guestlist){
        this.guest = guest;
        this.guestlist = guestlist;
        totalprice();
    }
    public Event(){
        this("AOOO", 0);
    }
    private void totalprice(){
        price = guestlist * guestprice;
    }
    public String getguest(){
        return guest;
    }
    public int getguestlist(){
        return guestlist;
    }
    public double getprice(){
        return price;
    }


    
}
