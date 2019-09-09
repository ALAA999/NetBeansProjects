import java.sql.*;
import net.ucanaccess.jdbc.*;
class DataBaseTest8{
	
	 public static void main(String[] args)


        {
            try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
                      
          //  now we can get the connection from the DriverManager
   
          
         Connection con = DriverManager.getConnection("jdbc:ucanaccess://sample2.mdb","",""); 
          con.setAutoCommit(false);
        
        Statement s = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
  
       s.execute("select id,name,mark from student");
        
        ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query
        if (rs != null) // if rs == null, then there is no ResultSet to view
     
     while ( rs.next() ) // this will step through our data row-by-row

            {
            /* the next line will update the mark column in our current row's ResultSet 
             ( updateInt( columnName,newValue) )  */ 
              rs.updateInt("mark",5+rs.getInt("mark"));
              rs.updateRow();
              
              if(rs.getInt("mark")<60)
              	rs.deleteRow();
              System.out.printf(rs.getString("ID") +"\t"+rs.getString("name")+"\t"+ rs.getString("mark"));
            System.out.println();
            
          
        }
       
  
   
   rs.moveToInsertRow();
   rs.updateInt("id",1500);
   rs.updateString("name","xxx");
   rs.updateInt("mark",88);
   rs.insertRow();
 
 
 rs.moveToCurrentRow();
  con.commit();
   con.setAutoCommit(false);
  
  
   /*
   rs.first();
  
   rs.updateInt("id",1600);
   rs.updateString("name","zzz");
   rs.updateInt("mark",88);
   rs.updateRow();
    */
       con.commit();
       
       System.out.println("==============================");
      
       System.out.println("======Result after update=============");
           
       con.setAutoCommit(false);
         s.execute("select * from student");
       
       rs = s.getResultSet();
     
     
  while ( rs.next() ) // this will step through our data row-by-row

            {
            /* the next line will get the first column in our current row's ResultSet 
            as a String ( getString( columnNumber) ) and output it to the screen */ 
            
            System.out.printf(rs.getString("ID") +"\t"+rs.getString("name")+"\t"+ rs.getString("mark"));
            System.out.println();
          
        } 
   
   con.commit();
 
   
   
   
        }

            catch (Exception e) {
            	e.printStackTrace();
           // System.out.println("Error: " + e);
        }
    }

}