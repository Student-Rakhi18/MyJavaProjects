package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcEg2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/detail", "root", "rakhi@sql");
            if (conn != null)
                System.out.println("Connection Established");
            String sql = "insert into Employee values (?, ?, ?)";
            assert conn != null;
            ps = conn.prepareStatement(sql);
            int choice;
            do {

                System.out.println("Enter Employee Id: ");
                int eid = sc.nextInt();
                System.out.println("Enter Employee Name: ");
                String name = sc.next();
                System.out.println("Enter Employee Salary: ");
                double sal = sc.nextDouble();

                ps.setInt(1, eid);
                ps.setString(2, name);
                ps.setDouble(3, sal);

                int rows = ps.executeUpdate();
                if (rows > 0) {
                    System.out.println("Record inserted successfully!");
                }
                System.out.print("\nDo you want to insert another record? (1. Yes / 2. No): ");
                choice = sc.nextInt();

            } while (choice == 1);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select count(*) from Employee");
            if (rs.next()) {
                int total = rs.getInt(1);
                System.out.println("Total number of entries in Employee table: " + total);
            }
            rs.close();
            st.close();
            System.out.println("\nEmployee Table Records:");
            Statement st2 = conn.createStatement();
            ResultSet rs2 = st2.executeQuery("SELECT * FROM Employee");

            while (rs2.next()) {
                int eid = rs2.getInt("eid");
                String name = rs2.getString("name");
                double sal = rs2.getDouble("sal");

                System.out.println("ID: " + eid + ", Name: " + name + ", Salary: " + sal);
            }

            rs2.close();
            st2.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
                sc.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
