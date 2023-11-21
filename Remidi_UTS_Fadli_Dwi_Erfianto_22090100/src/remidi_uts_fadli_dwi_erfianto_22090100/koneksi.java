package remidi_uts_fadli_dwi_erfianto_22090100;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
    
    public static Connection Go(){
        try {
        MysqlDataSource a = new MysqlDataSource();
        a.setDatabaseName("mahasiswa");
        a.setUser("root");
        a.setPassword("");
        a.setServerName("localhost");
        a.setPortNumber(3306);
        a.setServerTimezone("Asia/Jakarta");
        
        Connection b = a.getConnection();
            System.out.println("Sukses Tersambung Ke Database");
        return b;
        } catch (SQLException e) {
            System.err.println("Error karena: "+ e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        Connection A = Go();
    }
}
