package es.upm.miw.singleton;

import java.util.List;

public class Hotel {
    private long id;
    
    private String name;
    
    private List<Category> category;
    
    private Reservation reservation;
    
    private static Hotel hotel  = new Hotel();
    
    private Hotel() {
        this.name = "";
        this.reservation = new Reservation();
        
    }
    
    public static Hotel getHotel() {
        return hotel;
    }
    
}
