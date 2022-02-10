package utils;
import java.io.*;
import java.util.Properties;

public class DBcredentials {
    private String hostname;
    private String port;
    private String dbname;
    private String username;
    private String password;

    /*
    Flight tracker web app log in credentials for the database pulled from the .property file in resources directory
    commented out:
        obtaining .prop file through a filepath instead of ClassLoader and InputStream
     */
    public DBcredentials() {
        try {
            Properties props = new Properties();
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream input = loader.getResourceAsStream("jdbc.properties");
            props.load(input);

            Class.forName("org.mariadb.jdbc.Driver");

            hostname = props.getProperty("hostname");
            port = props.getProperty("port");
            dbname = props.getProperty("dbname");
            username = props.getProperty("username");
            password = props.getProperty("password");

            //next we concatenate the credentials needed to complete the connection.

//            String connectionString = "jdbc:mariadb://" +
//                    props.getProperty("hostname") + ":" +
//                    props.getProperty("port") + "/" +
//                    props.getProperty("dbname") + "?user=" +
//                    props.getProperty("username") + "&password=" +
//                    props.getProperty("password");
//            System.out.println(connectionString);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
     public void printValues(){
     System.out.println(hostname);
     System.out.println(port);
     System.out.println(dbname);
     System.out.println(username);
     System.out.println(password);
 }


    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}