package servlets;

import ORM.ORM;
import com.fasterxml.jackson.databind.ObjectMapper;
import objects.Customers;
import utils.DBcredentials;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CustomerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Customers payload = mapper.readValue(req.getInputStream(), Customers.class);
        ORM orm = new ORM();
        DBcredentials cred = new DBcredentials();
        cred.printValues();
        orm.connect(cred.getHostname(),
                cred.getPort(),
                cred.getDbname(),
                cred.getUsername(),
                cred.getPassword());

        payload = (Customers) orm.ormEntry(payload,"search");
        String JSON = mapper.writeValueAsString(payload);
        resp.getWriter().print(JSON);
        resp.setStatus(200);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Customers payload = mapper.readValue(req.getInputStream(), Customers.class);
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

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Customers payload = mapper.readValue(req.getInputStream(), Customers.class);
        ORM orm = new ORM();
        DBcredentials cred = new DBcredentials();
        orm.connect(cred.getHostname(),
                cred.getPort(),
                cred.getDbname(),
                cred.getUsername(),
                cred.getPassword());

        orm.ormEntry(payload,"update");
        resp.setStatus(200);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Customers payload = mapper.readValue(req.getInputStream(), Customers.class);
        ORM orm = new ORM();
        DBcredentials cred = new DBcredentials();
        orm.connect(cred.getHostname(),
                cred.getPort(),
                cred.getDbname(),
                cred.getUsername(),
                cred.getPassword());

        orm.ormEntry(payload,"delete");
        resp.setStatus(200);
    }
}
