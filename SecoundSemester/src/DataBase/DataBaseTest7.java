
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class Main {

    public static void main(String[] args) throws Exception {
        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver).newInstance();

        String jdbcUrl = "jdbc:ucanaccess://c:/xx/sample2.mdb";
        Connection conn = DriverManager.getConnection(jdbcUrl, "", "");

        Statement stmt = conn.createStatement();
        /* ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");

         printColumnInfo(rs);

         printColumnNames(rs);
         processRs(rs);*/

        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        printColumnInfo(rs);
        printColumnNames(rs);
        processRs(rs);

        conn.close();
    }

    public static void processRs(ResultSet rs) throws SQLException {
        ResultSetMetaData rmd = rs.getMetaData();
        while (rs.next()) {
            for (int col = 1; col <= rmd.getColumnCount(); col++) {
                getData(rs, rmd.getColumnType(col), col);
            }
        }
    }

    public static void printColumnNames(ResultSet rs) throws SQLException {
        ResultSetMetaData rmd = rs.getMetaData();
        for (int col = 1; col <= rmd.getColumnCount(); col++) {
            System.out.println(rmd.getColumnName(col) + " ");
        }
    }

    public static void getData(ResultSet rs, int type, int colIdx) throws SQLException {
        switch (type) {
            case java.sql.Types.CHAR:
            case java.sql.Types.VARCHAR:
                System.out.println(rs.getString(colIdx));
                break;

            case java.sql.Types.SMALLINT:
                int i = rs.getInt(colIdx);
                System.out.println(i);
                break;

            case java.sql.Types.NUMERIC:
                BigDecimal bd = rs.getBigDecimal(colIdx);
                System.out.println(bd.toString());
                break;

            case java.sql.Types.TIMESTAMP:
            case java.sql.Types.DATE:
                java.sql.Date d = rs.getDate(colIdx);
                System.out.println(d.toString());
                break;

        }
    }

    public static void printColumnInfo(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int cols = rsmd.getColumnCount();
        for (int colIdx = 1; colIdx <= cols; colIdx++) {
            String name = rsmd.getColumnName(colIdx);
            int type = rsmd.getColumnType(colIdx);
            String typeName = rsmd.getColumnTypeName(colIdx);
            System.out.println(name + ", " + type + ", " + typeName);
        }
    }
}
