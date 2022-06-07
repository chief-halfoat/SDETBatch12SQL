import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";
        //jdbc = java api that contains all of the interfaces and classes
        //mysql = name of the database we're working with (can use oracle or whatever other program)
        //3.237.189.167 = ip of the server (could be url)
        //3306 = port on which the database is active
        //syntaxhrm_mysql = database name
        String userName = "syntax_hrm";
        String password = "syntaxhrm123";
        //username and password will be used to give permissions and track user actions
        Connection connection = DriverManager.getConnection(dbURL,userName,password);
        Statement statement = connection.createStatement();
        String query = "select * from employee";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            String empID = resultSet.getString("empid");
            String salary = resultSet.getString("salary");
            String grade = resultSet.getString("grade");
            String department = resultSet.getString("department");
            System.out.println(empID+" "+salary+" "+grade+" "+department);
        }


    }
}
