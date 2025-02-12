package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import User.User;

public class DB {

    private static String url = "jdbc:mysql://localhost:3306/mydb";
    private static String user = "root";
    private static String password = "";

    public static List<Map<String, Object>> getDataFromDB() {

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM FieldsInformation";
            ResultSet rs = stmt.executeQuery(sql);

            List<Map<String, Object>> list = new ArrayList<>();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>(columnCount);
                for (int i = 1; i <= columnCount; ++i) {
                    row.put(metaData.getColumnName(i), rs.getObject(i));
                }
                list.add(row);
            }

            System.out.println(list.get(1).get("Humidity"));
            System.out.println("Successfully connected to the database");

            System.out.println(list);
            // Close the connection
            conn.close();

            return list;
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database ");
            e.printStackTrace();
        }
        return null;
    }

    // Get Fields Information Part 2

    public static List<Map<String, Object>> getDataFromDB_2() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM fieldsinformation_2";
            ResultSet rs = stmt.executeQuery(sql);

            List<Map<String, Object>> list = new ArrayList<>();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>(columnCount);
                for (int i = 1; i <= columnCount; ++i) {
                    row.put(metaData.getColumnName(i), rs.getObject(i));
                }
                list.add(row);
            }

            System.out.println("hamza Gaz " + list.get(1).get("Gaz"));
            System.out.println("all" + list.get(1));
            System.out.println("Successfully connected to the database");

            System.out.println(list);
            // Close the connection
            conn.close();

            return list;
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        }
        return null;
    }

    // Get current Soil Humidity

    public static int getCurrentSoilHumidity() {
        try {
            Connection conn = DriverManager.getConnection(url,user, password);
            Statement stmt = conn.createStatement();

            String sql = "SELECT Soil_Humidity FROM fieldsinformation WHERE id = (SELECT MAX(ID) FROM fieldsinformation)";
            ResultSet rs = stmt.executeQuery(sql);

            int soilHumidity = 0;

            if (rs.next()) {
                soilHumidity = rs.getInt("Soil_Humidity");
            }

            System.out.println(soilHumidity);
            System.out.println("Successfully connected to the database");

            // Close the connection
            conn.close();

            return soilHumidity;
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        }
        return 0;
    }

    public static int getCurrentTemperature() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            String sql = "SELECT Temperatur FROM fieldsinformation WHERE id = (SELECT MAX(ID) FROM fieldsinformation)";
            ResultSet rs = stmt.executeQuery(sql);

            int temperature = 0;

            if (rs.next()) {
                temperature = rs.getInt("Temperatur");
            }

            System.out.println(temperature);
            System.out.println("Successfully connected to the database");

            // Close the connection
            conn.close();

            return temperature;
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        }
        return 0;
    }

    public static int getCurrentHumidity() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            String sql = "SELECT Humidity FROM fieldsinformation WHERE id = (SELECT MAX(ID) FROM fieldsinformation)";
            ResultSet rs = stmt.executeQuery(sql);

            int Humidity = 0;

            if (rs.next()) {
                Humidity = rs.getInt("Humidity");
            }

            System.out.println(Humidity);
            System.out.println("Successfully connected to the database");

            // Close the connection
            conn.close();

            return Humidity;
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        }
        return 0;
    }

    public static User getCurrentUser(String userName) {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM user WHERE userName = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Affecter le paramètre userName à la première variable de la requête
            pstmt.setString(1, userName);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                User currentUser = new User(rs.getString("Name"), rs.getString("GSM"), rs.getString("CIN"),
                        rs.getString("userName"),
                        rs.getString("password"), rs.getString("Adress"), rs.getString("dateOfBirth"));

                System.out.println(currentUser.getPassword());
                System.out.println("Successfully connected to the database");

                // Close the connection
                conn.close();

                return currentUser;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        }
        return null;
    }

    public static boolean addNewUser(String gsm,
            String name,
            String userName,
            String userPassword,
            String cin,
            String adress,
            String dateOfBirth) {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO `user` (`ID`, `Name`, `GSM`, `CIN`, `Password`, `userName`,  `Adress`,`dateOfBirth` ) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Affecter le paramètre userName à la première variable de la requête
            pstmt.setString(1, name);
            pstmt.setString(2, gsm);
            pstmt.setString(3, cin);
            pstmt.setString(4, userPassword);
            pstmt.setString(5, userName);
            pstmt.setString(6, adress);
            pstmt.setString(7, dateOfBirth);

            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {

            System.out.println("Failed to connect to the database");
            e.printStackTrace();

        }
        return false;
    }

}
