package es.upm.miw.ecp1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.ecp1.Hotel;

public class TestHotel {
    
    @Test
    public void testHotelBuilder() {
        Hotel hotel = new Hotel(12, "Example Hotel");
        assertEquals(12, hotel.getId());
        assertEquals("Example Hotel", hotel.getName());
        
    }
    
}
