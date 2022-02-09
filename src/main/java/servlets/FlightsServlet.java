package servlets;

import ORM.ORM;
import com.fasterxml.jackson.databind.ObjectMapper;
import objects.Customers;
import objects.Flights;
import utils.DBcredentials;
import utils.FileLogger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FlightsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        Flights payload = mapper.readValue(req.getInputStream(), Flights.class);
        ORM orm = new ORM();
        DBcredentials cred = new DBcredentials();
        orm.connect(cred.getHostname(),
                cred.getPort(),
                cred.getDbname(),
                cred.getUsername(),
                cred.getPassword());

        payload = (Flights) orm.ormEntry(payload,"search");
        String JSON = mapper.writeValueAsString(payload);
        resp.getWriter().print(JSON);
        resp.setStatus(200);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Flights payload = mapper.readValue(req.getInputStream(), Flights.class);
        ORM orm = new ORM();
        DBcredentials cred = new DBcredentials();
        orm.connect(cred.getHostname(),
                cred.getPort(),
                cred.getDbname(),
                cred.getUsername(),
                cred.getPassword());

        orm.ormEntry(payload,"insert");
        resp.setStatus(200);
    }

}
