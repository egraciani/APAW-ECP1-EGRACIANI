package es.upm.miw.composite;

import es.upm.miw.ecp1.Reservation;

public class ReservationLeaf extends ReservationComponent {

    private Reservation reservation;

    public ReservationLeaf(String client, Reservation reservation) {
        super(client);
        this.reservation = reservation;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(ReservationComponent reservationComponent) {
     // Do nothing because is leaf
    }

    @Override
    public void remove(ReservationComponent reservationComponent) {
        // Do nothing because is leaf
    }

    public Reservation getReservation() {
        return reservation;
    }

}
