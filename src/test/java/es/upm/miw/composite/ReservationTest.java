package es.upm.miw.composite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.upm.miw.composite.ReservationComponent;
import es.upm.miw.composite.ReservationComposite;
import es.upm.miw.composite.ReservationLeaf;
import es.upm.miw.ecp1.Reservation;

public class ReservationTest {

    private ReservationComponent root;

    private ReservationComponent sub1;

    private ReservationComponent sub11;

    private ReservationComponent sub12;

    private ReservationComponent leaf;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void ini() {
        this.root = new ReservationComposite("raiz");

        this.leaf = new ReservationLeaf("client1", new Reservation());
        this.root.add(leaf);
        this.sub1 = new ReservationComposite("sub1");
        this.root.add(sub1);
        this.root.add(new ReservationLeaf("client2", new Reservation()));

        this.sub11 = new ReservationComposite("sub11");
        this.sub1.add(sub11);
        this.sub1.add(new ReservationLeaf("client3", new Reservation()));
        this.sub12 = new ReservationComposite("sub12");
        this.sub1.add(sub12);

        this.sub11.add(new ReservationLeaf("client1", new Reservation()));
        this.sub11.add(new ReservationLeaf("client2", new Reservation()));

        this.sub12.add(new ReservationLeaf("client8", new Reservation()));
        this.sub12.add(new ReservationLeaf("client10", new Reservation()));
    }

    @Test
    public void testNumberOfReservationsIfLeaf() {
        assertEquals(1, this.leaf.getNumberOfReservations());
    }

    @Test
    public void testNumberOfReservationsIfComposite() {
        assertEquals(3, this.root.getNumberOfReservations());
        assertEquals(2, this.sub11.getNumberOfReservations());
    }

}
