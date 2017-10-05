package es.upm.miw.singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestHotelFactory {
    @Test
    public void testIsSingleton() {
        assertSame(HotelFactory.getHotel(), HotelFactory.getHotel());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(HotelFactory.getHotel());
    }

}
