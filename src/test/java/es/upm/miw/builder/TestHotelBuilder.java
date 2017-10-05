package es.upm.miw.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.ecp1.Category;
import es.upm.miw.ecp1.Hotel;
import es.upm.miw.ecp1.Reservation;

public class TestHotelBuilder {
    
    @Test
    public void testHotelBuilder() {
        Reservation reservation = new Reservation();
        Hotel hotel = new HotelBuilder().id(1).name("Hotel A").category(Category.BASIC).reservation(reservation).build();
        assertEquals(1, hotel.getId());
        assertEquals("Hotel A", hotel.getName());
        assertEquals(Category.BASIC, hotel.getCategory());
        
    }
    
}
