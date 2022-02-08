package objects;

import Annotations.Column;
import Annotations.ForeignKey;
import Annotations.PrimaryKey;
import Annotations.Table;


    @Table(name = "Customers")
    public class Customers {
        @Column(name = "customer_id", type = "int")
        @PrimaryKey(name = "customer_id", type = "int")
        private Integer customer_id;

        @Column(name = "first_name", type = "varchar")
        private String first_name;

        @Column(name = "last_name", type = "varchar")
        private String last_name;

        public Customers() {}
        public Customers(Integer customer_id, String first_name, String last_name) {
            this.customer_id = customer_id;
            this.first_name = first_name;
            this.last_name = last_name;
        }
        public Customers(String first_name, String last_name) {
            this.first_name = first_name;
            this.last_name = last_name;
        }

        public Integer getCustomer_id() {
            return customer_id;
        }

        public void setCustomer_id(Integer customer_id) {
            this.customer_id = customer_id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
}
