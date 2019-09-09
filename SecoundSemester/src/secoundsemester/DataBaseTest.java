
import java.sql.*;
import net.ucanaccess.jdbc.*;
class DataBaseTest {

    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            String filename = "//sample2.mdb";
            String database = "jdbc:ucanaccess:";
            database += filename; // add on to the end 
            //  now we can get the connection from the DriverManager

            Connection con = DriverManager.getConnection(database, "", "");
            con.setAutoCommit(false);
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            s.execute("select * from student");
            ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query
            if (rs != null) // if rs == null, then there is no ResultSet to view
            {
                while (rs.next()) // this will step through our data row-by-row
                {
                    /* the next line will get the first column in our current row's ResultSet 
                     as a String ( getString( columnNumber) ) and output it to the screen */
                    System.out.println("Data from ID: " + rs.getString("ID"));
                    System.out.println("Data from name: " + rs.getString("name"));
                    System.out.println("Data from mark: " + rs.getString("mark"));

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println("Error: " + e);
        }
    }

}
