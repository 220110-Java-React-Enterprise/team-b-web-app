package objects;

import Annotations.Column;
import Annotations.ForeignKey;
import Annotations.PrimaryKey;
import Annotations.Table;

@Table(name = "tickets")
public class Tickets {
    @PrimaryKey(name = "ticket_id", type = "int")
    @Column(name = "ticket_id", type = "int")
    private Integer ticket_id;

    @Column(name = "from_location", type = "varchar")
    private String from_location;

    @Column(name = "to", type = "varchar")
    private String to;

    @Column(name = "flight_id", type = "int")
    @ForeignKey(columnName = "flight_id", type = "int", referenceTableName = "flights", referenceTableColumn = "flight_id")
    private Integer flight_id;

    @Column(name = "customer_id", type = "int")
    @ForeignKey(columnName = "customer_id", type = "int", referenceTableName = "customers", referenceTableColumn = "customer_id")
    private Integer customer_id;

    public Tickets() {}

    public Tickets(String from, String to, Integer flight_id, Integer customer_id) {
        this.from_location = from;
        this.to = to;
        this.flight_id = flight_id;
        this.customer_id = customer_id;
    }

    public Tickets(Integer ticket_id, String from, String to, Integer flight_id, Integer customer_id) {
        this.ticket_id = ticket_id;
        this.from_location = from;
        this.to = to;
        this.flight_id = flight_id;
        this.customer_id = customer_id;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getFrom_location() {
        return from_location;
    }

    public void setFrom_location(String from_location) {
        this.from_location = from_location;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
}
