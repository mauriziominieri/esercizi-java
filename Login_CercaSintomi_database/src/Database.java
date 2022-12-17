import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	
	private final String url = "jdbc:postgresql://localhost:5432/my_db";	
    private final String user = "mauriziominieri";
    private final String password = "";
    private final String table1 = "login";
    private final String table2 = "paziente";
    private final String table3 = "cartella_clinica";
    
    
    
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    
    //PRINT
    public void printPazienti() {
    	
    	System.out.println("\nPAZIENTI:");
    	
    	 String SQL = "SELECT * FROM "+table2;
    	
    	 try (Connection conn = connect();) {

    		 Statement statement = (Statement) conn.createStatement();
    		 int x=1;

    		 try (ResultSet rs = statement.executeQuery(SQL)) {

    			 ResultSetMetaData rsmd = rs.getMetaData();
    			 int columnsNumber = rsmd.getColumnCount();
        	
    			 while (rs.next()) {
            	
    				 System.out.print(x+") ");

    				 for (int i = 1; i <=columnsNumber ; i++) {
    					 String columnValue = rs.getString(i);
                     
	                     if(i==columnsNumber)
	                    	 System.out.print(rsmd.getColumnName(i) + ": "+columnValue+" ");
	                     else
	                    	 System.out.print(rsmd.getColumnName(i) + ": "+columnValue+", ");
    				 }
            	 
    				 System.out.print("\n");
    				 x++;
    			 }
    		 }
    		 
    		 conn.close();
    		 
    	 } catch (SQLException e) {
    		 System.err.println("Something went wrong!");
    		 e.printStackTrace();
    		 return;
    	 	}
    }
    
    
       public void printLoginData() {
    	
    	 System.out.println("\nSTAMPO i dati login:");
    	   
    	 String SQL = "SELECT * FROM "+table1;
    	
    	 try (Connection conn = connect();) {

    		 Statement statement = (Statement) conn.createStatement();
    		 int x=1;

    		 try (ResultSet rs = statement.executeQuery(SQL)) {

    			 ResultSetMetaData rsmd = rs.getMetaData();
    			 int columnsNumber = rsmd.getColumnCount();
        	
    			 while (rs.next()) {
            	
    				 System.out.print(x+") ");

    				 for (int i = 1; i <=columnsNumber ; i++) {
    					 String columnValue = rs.getString(i);
                     
	                     if(i==columnsNumber)
	                    	 System.out.print(rsmd.getColumnName(i) + ": "+columnValue+" ");
	                     else
	                    	 System.out.print(rsmd.getColumnName(i) + ": "+columnValue+", ");
    				 }
            	 
    				 System.out.print("\n");
    				 x++;
    			 }
    		 }
    		 
    		 conn.close();
    		 
    	 } catch (SQLException e) {
    		 System.err.println("Something went wrong!");
    		 e.printStackTrace();
    		 return;
    	 	}
    }
    
   
    
    public void printSintomo(String cf) {
		
		String SQL = "select sintomo from "+table3+" where cf='"+cf+"'";
		
		try (Connection conn = connect();
			 Statement statement = (Statement) conn.createStatement();) {
				
			   ResultSet rs = statement.executeQuery(SQL);
			   
			   if (rs.next()) {
				   System.out.println("SINTOMO: "+rs.getString(1));
			   }
				
		 }
		 catch (SQLException e) {
			 System.err.println("Something went wrong!");
			 e.printStackTrace();
			
		 	}
		
	}
    
    
    //INSERT
    public void insertPaziente(Paziente paz) {
		
        String SQL = "INSERT INTO "+table2+" VALUES(?,?,?)";
               

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setString(1, paz.getNome());
            pstmt.setString(2, paz.getCognome());
            pstmt.setString(3, paz.getCF());
            pstmt.executeUpdate();
            System.out.println("Paziente inserito con successo");
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
       
        
    }
    
    public void insertSintomo(String cf, String sin) {
		
        String SQL = "INSERT INTO "+table2+" VALUES(?,?)";
               
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setString(1, cf);
            pstmt.setString(2, sin);
            pstmt.executeUpdate();
            System.out.println("Sintomo inserito con successo");
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
       
        
      }
    
	
	//Insert data in login view
    public void createAccount(Medico user) {
		
        String SQL = "INSERT INTO "+table1+"(\"username\",\"password\") VALUES(?,?)";
               

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.executeUpdate();
            System.out.println("Medico inserito con successo");
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }
    
    
    //FIND
    //check username and password in loginview
	public boolean check(String a, String b) {
		
		 String SQL = "select * from "+table1+" where username='"+a+"' AND password='"+b+"'";
	
		 try (Connection conn = connect();
			  Statement statement = (Statement) conn.createStatement();) {
		
		
			  ResultSet rs = statement.executeQuery(SQL);
				 
			 if(rs.next()) 
				 return true;
			 
		 } catch (SQLException e) {
			 System.err.println("Something went wrong!");
			 e.printStackTrace();
			
		 	}
		
		 return false;  
	}
	
	public String findPaziente(String a, String b) {
		                                                      //capitalize the first letter
		 String SQL = "select * from "+table2+" where nome='"+a.substring(0, 1).toUpperCase()+a.substring(1)+"' AND cognome='"+b.substring(0, 1).toUpperCase()+b.substring(1)+"'";
	
		 try (Connection conn = connect();
			  Statement statement = (Statement) conn.createStatement();) {
		
		
			 try (ResultSet rs = statement.executeQuery(SQL)) {
				 
				 //All'inizio il cursore resultset è posizionato prima della prima riga, quindi facendo next() 
				 //si posiziona sul primo elemento e restituisce true, quando non trova più elementi restituisce false
   			 if (rs.next()) {
   				 //System.out.println(rs.getString(3));
   				 System.out.println("\npaziente trovato");
   				 return rs.getString(3);
   			 }
   		 }
			 
		 } catch (SQLException e) {
			 System.err.println("Something went wrong!");
			 e.printStackTrace();
			
		 	}
		 
		 return null;  
	}
	
	
	
	//DELETE
	public void delete(String SQL) {
		
		 try (Connection conn = connect(); 
			   Statement stmt = conn.createStatement();) {
				      
				  
		     int rows=stmt.executeUpdate(SQL);
		     
		     if(rows == 0)
		    	 System.out.println("\nNessuna corrispondenza");
		     else
		    	 System.out.println("\n"+rows+" corrispondenze cancellate");
			      
			     
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
	}
	
	
	public void deletePazienteBySurname(String cognome) {
		
		 String SQL = "delete from "+table2+" where cognome='"+cognome+"'";
		 delete(SQL);
	}
	
	public void deleteFromLoginByPassword(String pass) {
	
		 String SQL = "delete from "+table1+" where password='"+pass+"'";
		 delete(SQL);
	}
	
	
	
	//DELETE ALL
	public void deleteAll(String table) {

        try  (Connection conn = connect();
           	  Statement statement = conn.createStatement();){
        	 
        	 statement.executeUpdate("TRUNCATE "+table);
        	 
        	 System.out.println("\nALL DELETED");
        	 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
	
	public void deleteAllLoginData() {
		deleteAll(table1); 
    }
	
	public void deleteAllPazienti() {
		deleteAll(table2); 
    }
	
	
	
}
