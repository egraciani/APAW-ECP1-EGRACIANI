package es.upm.miw.builder;

import es.upm.miw.ecp1.Category;
import es.upm.miw.ecp1.Hotel;
import es.upm.miw.ecp1.Reservation;

public class HotelBuilder {
    
    private Hotel hotel;
    private long id;
    private String name;
    
    public HotelBuilder(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public HotelBuilder category(Category hotelCategory) {
        hotel.setCategory(hotelCategory);
        return this;
    }
    
    public HotelBuilder reservation(Reservation hotelReservation) {
        hotel.setReservation(hotelReservation);
        return this;
    }
    
    public Hotel build() {
        return hotel;
    }
    
}
