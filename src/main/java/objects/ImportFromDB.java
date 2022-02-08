package objects;

import Objects.Customers;
import Objects.Tickets;

import java.util.LinkedList;

public class ImportFromDB {

    public static LinkedList<Tickets> getAllTickets(Customers c) {
        LinkedList<Tickets> tList = new LinkedList<>();
        while (table.hasNext()) {
            Tickets t = getFromTable();
            tList.add(t);
        }
        return tList;
    }

    public static LinkedList<Customers> getAllCustomers() {
        LinkedList<Customers> cList = new LinkedList<>();
        while (table.hasNext()) {
            Customers c = getFromTable();
            cList.add(c);
        }
        return cList;
    }
}
