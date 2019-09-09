
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class PrintAnyTable {

    public String[][] PrintTable(Connection con, String tableName) throws SQLException {//////VERY IMPORTANT
        String tableData[][];
        int rowNum = 0, ColumNum = 0;
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("Select from " + tableName);
        if (rs != null) {
            rs.last();
            rowNum = rs.getRow();
            ColumNum = rs.getMetaData().getColumnCount();
        }
        tableData = new String[rowNum][ColumNum];
        rs.beforeFirst();
        for (int i = 0; i < rowNum; i++) {
            rs.next();
            for (int j = 0; j < ColumNum; j++) {
                tableData[i][j] = rs.getString(j + 1);
            }
        }
        return tableData;
    }
}

class AS {

    public String[][] printAnyTable(Connection con, String TableName) {
        int rownum=0,colnum=0;
        String [][]Table=null;
        try {
            Statement s = con.createStatement();
            s.executeQuery("select * from "+TableName);
            ResultSet rs = s.getResultSet();
            if(rs != null){
                rownum=rs.getRow();
                colnum = rs.getMetaData().getColumnCount();
            }
             Table= new String[rownum][colnum];
            rs.beforeFirst();
            for (int i = 0; i < rownum; i++) {
                rs.next();
                for (int j = 0; j < colnum; j++) {
                    Table[i][j] = rs.getString(j+1);
                }
            }
        } catch (Exception e) {

        }
        return Table;
    }
}
