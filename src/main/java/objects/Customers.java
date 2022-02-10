package objects;

import Annotations.Column;
import Annotations.PrimaryKey;
import Annotations.Table;


@Table(name = "Customers")
public class Customers {

        @PrimaryKey(name = "customer_id", type = "int")
        private Integer customer_id;

        @Column(name = "first_name", type = "string")
        private String first_Name;

        @Column(name = "last_name", type = "string")
        private String lastName;

        public Customers() {

        }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
