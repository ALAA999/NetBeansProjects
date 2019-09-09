
import java.sql.*;

class DataBaseTestt {

    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            // set this to a MS Access DB you have on your machine

            //  now we can get the connection from the DriverManager
            String database = "jdbc:ucanaccess://c:/xx/sample2.mdb";

            Connection con = DriverManager.getConnection(database, "", "");
            PreparedStatement ps = con.prepareStatement("insert into student (id,name,mark) values(?,?,?)");

            ps.setInt(1, 100);
            ps.setString(2, "Hasn");
            ps.setInt(3, 70);
            //ps.executeUpdate();
            ps.addBatch();

            ps.clearParameters();

            ps.setInt(1, 200);
            ps.setString(2, "bdr");
            ps.setInt(3, 85);
           // ps.executeUpdate();

            ps.addBatch();

            ps.setInt(1, 12000);
            ps.setString(2, "Hala");

            ps.addBatch();//Here it will add the old mark which is 85

   // ps.addBatch("insert into student (id,name,mark) values(3000,'wesam',89)");
            con.setAutoCommit(false);

            Savepoint point1 = con.setSavepoint();

            int[] updateCounts = ps.executeBatch();

            Savepoint point2 = con.setSavepoint();
            Statement s1 = con.createStatement();
            s1.addBatch("delete from student"); // It will delete all data from student table!
 //con.commit(); 

            con.rollback(point2);

            con.commit();

            Statement s = con.createStatement();
            s.execute("select * from student");
            ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query

            if (rs != null) // if rs == null, then there is no ResultSet to view
            {
                while (rs.next()) // this will step through our data row-by-row
                {
                    /* the next line will get the first column in our current row's ResultSet 
                     as a String ( getString( columnNumber) ) and output it to the screen */

                    System.out.printf(rs.getString("ID") + "\t" + rs.getString("name") + "\t" + rs.getString("mark"));
                    System.out.println();

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println("Error: " + e);
        }
    }

}