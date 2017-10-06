package es.upm.miw.ecp1;

public class Hotel {
    private long id;
    
    private String name;
    
    private Category category;
    
    private Reservation reservation;
    
    public Hotel() {
        this.id = 0;
        this.name = "";
    }
    
    public Hotel(long id) {
        this.id = id;
    }
    
    public Hotel(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

}
