import java.util.Date;


public class Film {
    private int id;
    private Date year;
    private int producerId;

    public Film(int id, Date year, int producerId) {
        this.id = id;
        this.year = year;
        this.producerId = producerId;
    }

    public int getId() {
        return id;
    }

    public Date getYear() {
        return year;
    }

    public int getProducerId() {
        return producerId;
    }
}
