package objects;

import Annotations.Column;
import Annotations.ForeignKey;
import Annotations.PrimaryKey;
import Annotations.Table;

@Table(name = "flights")
public class Flights {
    @PrimaryKey(name = "ticket_id", type = "int")
    @Column(name = "ticket_id", type = "int")
    private Integer ticket_id;

    @ForeignKey(columnName = "customer_id", type = "int", referenceTableName = "customers", referenceTableColumn = "customer_id")
    @Column(name = "customer_id", type = "int")
    private Integer customer_id;

    @Column(name = "flight_id", type = "int")
    private Integer flight_id;

    public Flights() {}

    public Flights(Integer ticket_id, Integer customer_id, Integer flight_id) {
        this.ticket_id = ticket_id;
        this.customer_id = customer_id;
        this.flight_id = flight_id;
    }

    public Flights(Integer customer_id, Integer flight_id) {
        this.customer_id = customer_id;
        this.flight_id = flight_id;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }
}
