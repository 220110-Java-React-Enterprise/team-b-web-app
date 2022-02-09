package objects;

import Annotations.Column;
import Annotations.ForeignKey;
import Annotations.PrimaryKey;
import Annotations.Table;

@Table(name = "flights")
public class Flights {
    @PrimaryKey(name = "flightId", type = "int")
    private Integer flightId;

    @Column(name = "from_location", type = "string")
    private String from_location;

    @Column(name = "to_location", type = "string")
    private String to_location;

    public Flights() {

    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public String getFrom_location() {
        return from_location;
    }

    public void setFrom_location(String from_location) {
        this.from_location = from_location;
    }

    public String getTo_location() {
        return to_location;
    }

    public void setTo_location(String to_location) {
        this.to_location = to_location;
    }
}
