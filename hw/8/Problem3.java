import java.util.*;
import java.util.GregorianCalendar;
public class Problem3 {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230", new GregorianCalendar(2014, 4, 5, 5, 5, 0), new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235", new GregorianCalendar(2014, 4, 5, 6, 55, 0), new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237", new GregorianCalendar(2014, 4, 5, 9, 35, 0), new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTravelTime());
    }
}
class Flight{
    private String flightNumber;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    public Flight(String flightNumber, GregorianCalendar departureTime, GregorianCalendar arrivalTime){
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
    public long getFlightTime(){
        return (arrivalTime.getTimeInMillis()-departureTime.getTimeInMillis());
    }
    public String getFlightNumber(){
        return flightNumber;
    }
    public GregorianCalendar getDepartureTime(){
        return departureTime;
    }
    public void setDepartureTime(GregorianCalendar departureTime){
        this.departureTime = departureTime;
    }
    public GregorianCalendar getArrivalTime(){
        return arrivalTime;
    }
    public void setArrivalTime(GregorianCalendar arrivalTime){
        this.arrivalTime = arrivalTime;
    }
}
class Itinerary{
    private List<Flight> flights;

    public Itinerary(List<Flight> flights){
        this.flights = flights;
    }
    public long getTotalTravelTime(){
        long total = 0;
        for(int i=0;i<flights.size();i++){
            total = total + flights.get(i).getFlightTime();
        }
        return total;
    }
}

