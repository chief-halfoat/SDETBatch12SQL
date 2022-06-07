import javax.xml.transform.Result;
import java.sql.*;
import java.util.ResourceBundle;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";
        String userName = "syntax_hrm";
        String password = "syntaxhrm123";

        Connection connection = DriverManager.getConnection(dbURL,userName,password);
        Statement statement = connection.createStatement();
        String query = "select * from person";
        ResultSet rs = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        for(int i=1; i<=resultSetMetaData.getColumnCount(); i++){
            System.out.print(resultSetMetaData.getColumnLabel(i)+" ");
        }
        System.out.println();
        while(rs.next()){
            for(int i=1; i<=resultSetMetaData.getColumnCount(); i++){
            String nameOfColumn = resultSetMetaData.getColumnLabel(i);
            String columnValue = rs.getString(nameOfColumn);
                System.out.print(columnValue+" ");
            }
            System.out.println();
        }
    }
}
