package objects;

import Annotations.Column;
import Annotations.PrimaryKey;
import Annotations.Table;


@Table(name = "Customers")
public class Customers {
        @PrimaryKey(name = "customerId", type = "int")
        private Integer customerId;

        @Column(name = "firstName", type = "string")
        private String firstName;

        @Column(name = "lastName", type = "string")
        private String lastName;

        public Customers() {

        }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
