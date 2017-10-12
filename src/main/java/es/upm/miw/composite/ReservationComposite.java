package es.upm.miw.composite;

import java.util.ArrayList;
import java.util.List;

public class ReservationComposite extends ReservationComponent {

    List<ReservationComponent> reservationComponentList;

    public ReservationComposite(String icon) {
        super(icon);
        reservationComponentList = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(ReservationComponent reservationComponent) {
        assert reservationComponent != null;
        reservationComponentList.add(reservationComponent);
    }

    @Override
    public void remove(ReservationComponent reservationComponent) {
        assert reservationComponent != null;
        reservationComponentList.remove(reservationComponent);
    }

}

