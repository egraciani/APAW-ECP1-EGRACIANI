package es.upm.miw.singleton;

import java.util.HashMap;
import java.util.Map;

import es.upm.miw.ecp1.Hotel;

public class HotelFactory {
    private static final HotelFactory factory = new HotelFactory();

    private Map<Long, Hotel> hoteles;

    private HotelFactory() {
        this.hoteles = new HashMap<>();
    }

    public static HotelFactory getFactory() {
        return factory;
    }

    public Hotel getHotel(long id) {
        Hotel result = this.hoteles.get(id);
        
        return result;
    }

    public void removeReference(long id) {
        this.hoteles.remove(id);
    }

}
