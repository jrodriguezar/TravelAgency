package travelagency;

/**
 *
 * @author Jhon
 */
public class BookedFlight {
    private int flightnumber;
    private Date departure;
    private Date arrival;
    private Airport from;
    private Airport to;

    public BookedFlight(int flightnumber, Date departure, Date arrival, Airport from, Airport to) {
        this.flightnumber = flightnumber;
        this.departure = departure;
        this.arrival = arrival;
        this.from = from;
        this.to = to;
    }

    public BookedFlight() {
    }

    public int getFlightnumber() {
        return flightnumber;
    }

    public Date getDeparture() {
        return departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }
    
}
