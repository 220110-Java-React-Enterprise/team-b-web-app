package servlets;

import ORM.ORM;
import com.fasterxml.jackson.databind.ObjectMapper;
import objects.Tickets;
import utils.DBcredentials;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TicketsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Tickets payload = mapper.readValue(req.getInputStream(), Tickets.class);
            ORM orm = new ORM();
            DBcredentials cred = new DBcredentials();
            orm.connect(cred.getHostname(),
                    cred.getPort(),
                    cred.getDbname(),
                    cred.getUsername(),
                    cred.getPassword());


            orm.ormEntry(payload, "search");
            payload = (Tickets) orm.ormEntry(payload, "search");
            String json = mapper.writeValueAsString(payload);
            resp.getWriter().print(json);

            resp.setStatus(200);
        } catch (Exception e) {
            FileLogger.getFileLogger().log(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Tickets payload = mapper.readValue(req.getInputStream(), Tickets.class);
            ORM orm = new ORM();
            DBcredentials cred = new DBcredentials();

            cred.printValues();

            orm.connect(cred.getHostname(),
                    cred.getPort(),
                    cred.getDbname(),
                    cred.getUsername(),
                    cred.getPassword());

            orm.ormEntry(payload, "insert");

            resp.setStatus(200);
        } catch (Exception e) {
            FileLogger.getFileLogger().log(e);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Tickets payload = mapper.readValue(req.getInputStream(), Tickets.class);
            ORM orm = new ORM();
            DBcredentials cred = new DBcredentials();
            orm.connect(cred.getHostname(),
                    cred.getPort(),
                    cred.getDbname(),
                    cred.getUsername(),
                    cred.getPassword());

            orm.ormEntry(payload, "update");

            resp.setStatus(200);
        } catch (Exception e) {
            FileLogger.getFileLogger().log(e);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Tickets payload = mapper.readValue(req.getInputStream(), Tickets.class);
            ORM orm = new ORM();
            DBcredentials cred = new DBcredentials();

            cred.printValues();

            orm.connect(cred.getHostname(),
                    cred.getPort(),
                    cred.getDbname(),
                    cred.getUsername(),
                    cred.getPassword());

            orm.ormEntry(payload, "delete");

            resp.setStatus(200);
        } catch (Exception e) {
            FileLogger.getFileLogger().log(e);
        }
    }
}
