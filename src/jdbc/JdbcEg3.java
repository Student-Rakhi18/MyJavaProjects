package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcEg3 {
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

            System.out.print("Enter Book Name: ");
            String bookname = sc.nextLine();

            System.out.print("Enter Book Price: ");
            double price = sc.nextDouble();

            String insertSql = "INSERT INTO Books (bookname, price) VALUES (?, ?)";
            ps = conn.prepareStatement(insertSql);
            ps.setString(1, bookname);
            ps.setDouble(2, price);
            ps.executeUpdate();
            System.out.println("Book inserted successfully!");

            System.out.print("Enter amount to increment book prices: ");
            double increment = sc.nextDouble();

            String updateSql = "UPDATE Books SET price = price + ?";
            ps = conn.prepareStatement(updateSql);
            ps.setDouble(1, increment);
            int rowsUpdated = ps.executeUpdate();
            System.out.println(rowsUpdated + " book(s) updated.");

            String selectSql = "SELECT * FROM Books";
            st = conn.createStatement();
            rs = st.executeQuery(selectSql);

            System.out.println("\nUpdated Book List:");
            while (rs.next()) {
                String name = rs.getString("bookname");
                double updatedPrice = rs.getDouble("price");
                System.out.println("Book: " + name + ", Price: " + updatedPrice);
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
