package es.upm.miw.singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestHotelFactory {
    @Test
    public void testIsSingleton() {
        assertSame(HotelFactory.getFactory(), HotelFactory.getFactory());
    }
    
    @Test
    public void testSingletonNotNull() {
        assertNotNull(HotelFactory.getFactory());
    }
    
}
