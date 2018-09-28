package travelagency;

/**
 *
 * @author Jhon
 */
public class Travel {
    private Date start;
    private int duration;
    private Hotel hotel;
    private BookedFlight outbond;
    private BookedFlight returnd;

    public Travel(Date start, int duration, Hotel hotel) {
        this.start = start;
        this.duration = duration;
        this.hotel = hotel;
    }
    
    public void insertar_outbond(int flightnumber, Date departure, Date arrival, Airport from, Airport to){
        this.outbond = new BookedFlight(flightnumber, departure, arrival, from, to);
    }
    
    public void insertar_return(int flightnumber, Date departure, Date arrival, Airport from, Airport to){
        this.returnd = new BookedFlight(flightnumber, departure, arrival, from, to);
    }

    public Date getStart() {
        return start;
    }

    public int getDuration() {
        return duration;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public BookedFlight getOutbond() {
        return outbond;
    }

    public BookedFlight getReturnd() {
        return returnd;
    }
}
