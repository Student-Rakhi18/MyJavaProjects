package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcEg4 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        Statement st = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/detail", "root", "rakhi@sql");

            if (conn != null)
                System.out.println("Connection Established");

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            String deleteSql = "DELETE FROM Books WHERE price < ?";
            ps = conn.prepareStatement(deleteSql);
            ps.setDouble(1, amount);

            int rowsDeleted = ps.executeUpdate();
            System.out.println(rowsDeleted + " book(s) deleted where price < " + amount);

            String selectSql = "SELECT * FROM Books";
            st = conn.createStatement();
            rs = st.executeQuery(selectSql);

            System.out.println("\nRemaining Books:");
            while (rs.next()) {
                String name = rs.getString("bookname");
                double price = rs.getDouble("price");
                System.out.println("Book: " + name + ", Price: " + price);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
                sc.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
