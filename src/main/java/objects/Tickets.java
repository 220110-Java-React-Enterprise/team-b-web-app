package objects;

import Annotations.Column;
import Annotations.ForeignKey;
import Annotations.PrimaryKey;
import Annotations.Table;

@Table(name = "tickets")
public class Tickets {

    // defines columns for tickets table
    @PrimaryKey(name = "ticketId", type="int")
    private int tickerId;

    @PrimaryKey(name = "ticketId", type="int")
    private int ticketId;

    @ForeignKey(columnName = "customerId", type = "int", referenceTableName = "customers", referenceTableColumn = "customerId")
    private int customerId;
    @ForeignKey(columnName = "flightId", type = "int", referenceTableName = "flights", referenceTableColumn = "flightId")
    private int flightId;

    public Tickets() {
    }

    public int getTickerId() {
        return ticketId;
    }

    public void setTickerId(int tickerId) {
        this.ticketId = tickerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
}
