
import java.sql.*;
import net.ucanaccess.jdbc.*;

 class insertingdatas {
    public static void insert(String name,int id,int avg,int level)throws Exception {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
 
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Alaa\\Documents\\NetBeansProjects\\"
                    + "SecoundSemester\\Sample2.mdb", "", "");
            con.setAutoCommit(false);
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            s.execute("select * from Table1");

            ResultSet rs = s.getResultSet();
            rs.insertRow();
        } 
    }
 