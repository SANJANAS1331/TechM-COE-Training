package sample1;

import java.sql.*;
import java.util.Scanner;

public class JdbcCrudOperationsSample {
    static final String url = "jdbc:mysql://localhost:3306/db1";
    static final String user = "root";
    static final String password = "#MySQL@2025";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Java program for performing JDBC CRUD Operations");
            System.out.println("Creating a new table dynamically...");

            createTable(connection);

            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Create Table");
                System.out.println("2. Insert (Statement)");
                System.out.println("3. Insert (PreparedStatement)");
                System.out.println("4. Update (Statement)");
                System.out.println("5. Delete (PreparedStatement)");
                System.out.println("6. Display Records");
                System.out.println("7. Exit");
                System.out.print("Enter choice: ");
                
                int choice = scanner.nextInt();
                switch (choice) {
                	case 1:
                		createTable(connection);
                		break;
                    case 2:
                        insertUsingStatement(connection);
                        break;
                    case 3:
                        insertUsingPreparedStatement(connection, scanner);
                        break;
                    case 4:
                        updateUsingStatement(connection, scanner);
                        break;
                    case 5:
                        deleteUsingPreparedStatement(connection, scanner);
                        break;
                    case 6:
                        displayRecords(connection);
                        break;
                    case 7:
                        System.out.println("Exited");
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS studentdb (" +
                "roll_no INT PRIMARY KEY AUTO_INCREMENT, " +
                "stud_name VARCHAR(50), " +
                "marks DOUBLE)";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table 'studentdb' created successfully.");
        }
    }

    private static void insertUsingStatement(Connection connection) throws SQLException {
        String query = "INSERT INTO studentdb (stud_name, marks) VALUES ('fgh', 86.05)";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Record inserted using Statement.");
        }
    }

    private static void insertUsingPreparedStatement(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter student name: ");
        String stud_name = scanner.next();
        System.out.print("Enter marks obtained: ");
        double marks = scanner.nextDouble();

        String query = "INSERT INTO studentdb (stud_name, marks) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, stud_name);
            pstmt.setDouble(2, marks);
            pstmt.executeUpdate();
            System.out.println("Record inserted using PreparedStatement.");
        }
    }

    private static void updateUsingStatement(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter roll no. to update: ");
        int roll_no = scanner.nextInt();
        System.out.print("Enter updated marks: ");
        double updtmarks = scanner.nextDouble();

        String query = "UPDATE studentdb SET marks = " + updtmarks + " WHERE roll_no = " + roll_no;
        try (Statement stmt = connection.createStatement()) {
            int rows = stmt.executeUpdate(query);
            if (rows > 0)
                System.out.println("Record updated using Statement.");
            else
                System.out.println("No record found with the given roll no.");
        }
    }

    private static void deleteUsingPreparedStatement(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter student roll no. to delete: ");
        int roll_no = scanner.nextInt();

        String query = "DELETE FROM studentdb WHERE roll_no = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, roll_no);
            int rows = pstmt.executeUpdate();
            if (rows > 0)
                System.out.println("Record deleted using PreparedStatement.");
            else
                System.out.println("No record found with the given roll no.");
        }
    }

    private static void displayRecords(Connection connection) throws SQLException {
        String query = "SELECT * FROM studentdb";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("\nStudent Records:");
            while (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("roll_no") +
                        ", Name: " + rs.getString("stud_name") +
                        ", Marks: " + rs.getDouble("marks"));
            }
        }
    }
}
