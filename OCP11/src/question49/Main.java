package question49;

import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Given the data of the EMP table:
    ID NAME  DEPT
    101SMITH HR
    102JONES ENG
    103WEAVERHR
Assuming that jdbcURL, username, and password are delcared and initalised.
Which two happen upon execution?
    1. Two PreparedStatement objects are created.
    2. Three SQL statements are executed.
 */
// vengono eseguiti 3 SQL statements, cioè la SELECT in ResultSet rs = query.executeQuery(); e poi 2 volte (rs contiene 2 rows) update.execute(); cioè la INSERT
// vengono creati due oggetti PreparedStatement
public class Main {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("", "", "");
             PreparedStatement query = conn.prepareStatement("SELECT ID, NAME FROM EMP WHERE DEPT = ?");
             PreparedStatement update = conn.prepareStatement("INSERT INTO RECRUITING (ID,NAME) VALUES(?,?)")) {
            query.setString(1, "HR");
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                update.setObject(1, rs.getObject(1, Integer.class), JDBCType.INTEGER);
                update.setObject(2, rs.getObject(2, String.class), JDBCType.VARCHAR);
                update.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}