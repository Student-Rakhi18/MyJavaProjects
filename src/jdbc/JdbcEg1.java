package jdbc;

import java.sql.*;

public class JdbcEg1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/detail", "root", "rakhi@sql");
            st = conn.createStatement();
            rs = st.executeQuery("Select Roll, Name from Student");
            while (rs.next()) {
                int Roll = rs.getInt(1);
                String Name = rs.getString(2);
                System.out.println("Roll Number: " + Roll + "\nName: " + Name);
            }
            System.out.println("Successfully Connected To Database");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
