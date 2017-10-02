package es.upm.miw.singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestHotel {
    @Test
    public void testIsSingleton() {
        assertSame(Hotel.getHotel(), Hotel.getHotel());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(Hotel.getHotel());
    }

}
