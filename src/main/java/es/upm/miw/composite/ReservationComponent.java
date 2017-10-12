package es.upm.miw.composite;

public abstract class ReservationComponent {
    
    private String client;

    public ReservationComponent(String client) {
        this.client = client;
    }
    
    public abstract boolean isComposite();
    
    public abstract void add(ReservationComponent reservationComponent);
    
    public abstract void remove(ReservationComponent reservationComponent);
    
    public abstract int getNumberOfReservations();
    
    public abstract String view();

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

}
