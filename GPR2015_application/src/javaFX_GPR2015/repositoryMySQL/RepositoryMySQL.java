package javaFX_GPR2015.repositoryMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RepositoryMySQL {
    static Secret secret = new Secret();


    final static String draiverMySQl = "com.mysql.cj.jdbc.Driver";
    final static String url = "jdbc:mysql://localhost:3306/gpr2015?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    final static String uid = secret.dbLogin;
    final static String pwd = secret.dbPassword;
    private Connection con = null;
    public RepositoryMySQL() {
        try {
            Class.forName(draiverMySQl).newInstance();
            con = DriverManager.getConnection(url,uid,pwd);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Nie znaleziono sterownika bazy danych");
            System.out.println(e);
            System.exit(1);
        } catch (SQLException e) {
            System.out.println("Nie połaczyłem się z bazą " + url);
            System.out.println(e);
            System.exit(1);
        }
    }

    public Connection getCon() {
        return con;
    }
}
