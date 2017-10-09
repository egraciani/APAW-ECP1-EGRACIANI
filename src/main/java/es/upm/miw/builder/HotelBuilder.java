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
        this.hotel = new Hotel(id, name);
    }

    public HotelBuilder name(String name) {
        hotel.setName(name);
        return this;
    }
    
    public HotelBuilder id(long id) {
        hotel.setId(id);
        return this;
    }
    
    public HotelBuilder category(Category category) {
        hotel.setCategory(category);
        return this;
    }
    
    public HotelBuilder reservation(Reservation reservation) {
        assert reservation != null;
        hotel.addReservation(reservation);
        return this;
    }
    
    public Hotel build() {
        return hotel;
    }
    
}
