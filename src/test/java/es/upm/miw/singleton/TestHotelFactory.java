package es.upm.miw.singleton;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestHotelFactory {
    @Test
    public void testIsSingleton() {
        assertSame(HotelFactory.getFactory().getHotel(1), HotelFactory.getFactory().getHotel(1));
    }

}
