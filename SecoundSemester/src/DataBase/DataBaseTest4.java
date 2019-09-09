
import java.sql.*;
import net.ucanaccess.jdbc.*;
//import javax.sql.rowset.JdbcRowSet;
//import com.sun.rowset.JdbcRowSetImpl;

class DataBaseTestq {

    public static void main(String[] args) {
        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            String database = "jdbc:ucanaccess://c:\\Users\\Alaa\\Documents\\NetBeansProjects\\"
                    + "SecoundSemester\\sample2.mdb";

            //  now we can get the connection from the DriverManager
            Connection con = DriverManager.getConnection(database, "", "");

            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            con.setAutoCommit(false);

            s.execute("select * from student"); // select the data from the table

            ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query

            if (rs != null) { // if rs == null, then there is no ResultSet to view
                rs.last();

                int numRow = rs.getRow();
                System.out.println("The number of row retrived is " + numRow);
                ResultSetMetaData meta = rs.getMetaData();
                int numColumns = meta.getColumnCount();

                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-20s", meta.getColumnName(i));
                }
                System.out.println();

                rs.beforeFirst();
                while (rs.next()) { // this will step through our data row-by-row
                    for (int i = 1; i <= numColumns; ++i) /* the next line will get the first column in our current row's ResultSet 
                     as a String ( getString( columnNumber) ) and output it to the screen */ {
                        System.out.printf("%-20s", rs.getString(i));
                    }

                    System.out.println();
                }

                rs.last();
                rs.updateInt("mark", 800);
                rs.updateString("name", "hheeeeeeeeeee");
                rs.updateInt("Id", 20160);
                rs.updateRow();

         /*       rs.first();
                rs.deleteRow();
                /* rs.first();
                 rs.deleteRow();

                 rs.moveToInsertRow();
                 rs.updateString("name", "adel");
                 rs.updateInt("mark", 80);
                 rs.updateInt("ID", 5000);
                 rs.insertRow();

                 rs.moveToCurrentRow();

                 rs.moveToInsertRow();
                 rs.updateString("name", "khaled");
                 rs.updateInt("mark", 90);
                 rs.updateInt("ID", 13);
                 rs.insertRow();*/
                con.commit();
                rs.close();
                s.close();

                s = con.createStatement();
                s.execute("select * from student");
                rs = s.getResultSet();

                //rs.first();
                //rs.beforeFirst();
                System.out.println("\n Data after changing");
                while (rs.next()) { // this will step through our data row-by-row
                    for (int i = 1; i <= numColumns; ++i) /* the next line will get the first column in our current row's ResultSet 
                     as a String ( getString( columnNumber) ) and output it to the screen */ {
                        System.out.printf("%-20s", rs.getString(i));
                    }

                    System.out.println();
                }
                con.commit();
                rs.close();
                // s.close();
                con.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
            //     System.out.println("Error: " + e);
        }
    }

}

/* ResultSet rs = s.getResultSet();
        rs.last();
        
        System.out.println(rs.getRow());
        con.commit();
        rs.close();*/
/*rs.updateInt(1, id);
        rs.updateString(2, name);
        rs.updateInt(3, level);
        rs.updateInt(4, avg);*/



/*
        ResultSet rs = s.getResultSet();
        rs.insertRow();
        con.commit();
        System.out.println(rs.getRow());
        rs.close();*/