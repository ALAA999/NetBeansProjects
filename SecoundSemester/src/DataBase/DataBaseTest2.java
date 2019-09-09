
import java.sql.*;
import net.ucanaccess.jdbc.*;

class dbAccess {

    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");


            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Alaa\\Documents\\NetBeansProjects\\"
                    + "SecoundSemester\\Sample2.mdb", "", "");
            Statement s = conn.createStatement();
            //c:/xx/sample2.mdb
            // create a table

            String tableName = "myTable" + String.valueOf((int) (Math.random() * 1000.0));
            String createTable = "CREATE TABLE " + tableName
                    + " (id Integer, name Text(32))";
            s.execute(createTable);
            conn.commit();
            // enter value into table
            for (int i = 0; i < 25; i++) {
                String addRow = "INSERT INTO " + tableName + "(id,name) VALUES ( "
                        + String.valueOf((int) (Math.random() * 32767)) + ", 'Text Value "
                        + String.valueOf(Math.random()) + "')";
                s.execute(addRow);
            }

            // Fetch table
            String selTable = "SELECT * FROM " + tableName;
            s.execute(selTable);
            ResultSet rs = s.getResultSet();
            while ((rs != null) && (rs.next())) {
                System.out.println(rs.getString(1) + " : " + rs.getString(2));
            }
            String name;

            //drop the table
            String dropTable = "DROP TABLE " + tableName;
            s.execute(dropTable);

            // close and cleanup
            s.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
