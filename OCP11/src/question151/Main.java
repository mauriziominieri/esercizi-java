package question151;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Assuming the user credentials are correct, which expression will create a Connection?
    DriverManager.getConnection("jdbc:derby:com");
 */
/*
The first expression "DriverManager.getConnection("http://database.jdbc.com", "J_SMITH", "dt12%2f3");" will not create a valid Connection, because the URL provided is not a valid JDBC URL. JDBC URLs typically start with "jdbc:" and specify the protocol, subprotocol and the location of the database.
The second expression "DriverManager.getConnection("jdbc.derby.com");" will not create a valid Connection, because it is missing the protocol and subprotocol prefix "jdbc:" and it is missing the location of the database.
The last expression "DriverManager.getConnection("jdbc:derby:com");" is a valid JDBC URL, it uses the "jdbc:" prefix, the protocol is "derby" and the location of the database is specified as "com" (It specifies a in-memory database in the current working directory). If a JDBC driver for Derby is available in the classpath and the database is running, this expression will create a valid Connection.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        DriverManager.getConnection("http://database.jdbc.com", "J_SMITH", "dt12%2f3");
        DriverManager.getConnection("jdbc.derby.com");
//        DriverManager.getConnection();
//        DriverManager.getConnection("J_SMITH", "dt12%2f3");
        DriverManager.getConnection("jdbc:derby:com");
    }
}