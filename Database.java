import java.sql.*;

public class Database {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/test";

    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection(DB_URL,"root","root")){
            PreparedStatement pstm = conn.prepareStatement("insert into emp (id, name) values (?,?)");
            pstm.setInt(1,12345);
            pstm.setString(2,"Michael");
            pstm.execute();
            pstm.setInt(1,54321);
            pstm.setString(2,"Marry");
            pstm.execute();
            pstm = conn.prepareStatement("select * from emp");
            pstm.execute();
            ResultSet rs = pstm.getResultSet();
            while(rs.next()){
                System.out.println(rs.getInt("id")+": "+rs.getString("name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}


