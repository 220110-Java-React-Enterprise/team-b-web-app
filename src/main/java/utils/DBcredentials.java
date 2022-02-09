package utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DBcredentials {
    private String hostname;
    private String port;
    private String dbname;
    private String username;
    private String password;

    public DBcredentials() {
        try {
            File file = new File("G:\\Java Projects\\props.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                hostname = reader.nextLine();
                port = reader.nextLine();
                dbname = reader.nextLine();
                username = reader.nextLine();
                password = reader.nextLine();
                //connection = connect(hostname, port, DBName, userName, password);
            }
            reader.close();
        } catch (FileNotFoundException e) {
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