package objects;

import Annotations.Column;
import Annotations.ForeignKey;
import Annotations.PrimaryKey;
import Annotations.Table;

@Table(name = "tickets")
public class Tickets {
    // defines columns for tickets table
    @PrimaryKey(name = "tickerId", type="int")
    private int tickerId;
    @ForeignKey(columnName = "customerId", type = "int", referenceTableName = "customers", referenceTableColumn = "customerId")
    private int customerId;
    @ForeignKey(columnName = "flightId", type = "int", referenceTableName = "flights", referenceTableColumn = "flightId")
    private int flightId;

    public Tickets() {
    }

    public int getTickerId() {
        return tickerId;
    }

    public void setTickerId(int tickerId) {
        this.tickerId = tickerId;
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
