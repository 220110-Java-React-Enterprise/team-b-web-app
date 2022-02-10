package utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyLoaderListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servlet container contextInitialized method invoked");
        //DBcredentials db = new DBcredentials();
        //db.printValues();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servlet container contextDestroyed method invoked");
    }
}
