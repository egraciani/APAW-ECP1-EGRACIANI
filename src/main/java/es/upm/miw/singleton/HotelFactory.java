package es.upm.miw.singleton;

public class HotelFactory {
    
    private String name;
    
    private Category category;
    
    private Reservation reservation;
    
    private static Hotel hotel  = new Hotel();
    
    private HotelFactory() {
        this.name = "";
        this.reservation = new Reservation();
        
    }
    
    public static Hotel getHotel() {
        return hotel;
    }
    
}
