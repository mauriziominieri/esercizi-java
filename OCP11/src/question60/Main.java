package question60;

import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which code fragment is preferred and why?
    Fragment 2 because it prevents SQL injection.
 */
/*
Utilizzare una PreparedStatement offre diversi vantaggi rispetto all'utilizzo di una Statement per eseguire un'operazione di inserimento dati:
Sicurezza: Utilizzando una PreparedStatement, i valori vengono inseriti come parametri invece di essere concatenati direttamente alla stringa SQL. Ciò protegge contro gli attacchi SQL injection, poiché i valori non vengono considerati come parte della query SQL.
Prestazioni: Le PreparedStatement sono compilate una volta e poi possono essere eseguite più volte con valori diversi, questo può aumentare le prestazioni rispetto all'utilizzo di una Statement che deve essere compilata ogni volta che viene eseguita la query.
Portabilità: le PreparedStatement possono essere utilizzate con diversi tipi di database, mentre l'utilizzo di una Statement potrebbe richiedere modifiche per lavorare con diversi sistemi di gestione del database.
In sintesi il secondo frammento di codice è preferibile poiché è più sicuro, più efficiente e più portabile.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("", "", "");
        String eName = "SMITH";
        String empId = "42";
        // Fragment 1:
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO EMP VALUES ('" + eName + "', '" + empId + "')";
        stmt.executeUpdate(sql);
        // Fragment 2:
        String sql1 = "INSERT INTO EMP VALUES (?, ?)";
        PreparedStatement pStmt = conn.prepareStatement(sql1);
        pStmt.setObject(1, eName, JDBCType.VARCHAR);
        pStmt.setObject(2, empId, JDBCType.VARCHAR);
        pStmt.executeUpdate();
    }
}