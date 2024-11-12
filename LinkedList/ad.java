package com.user.dao;

import java.sql.Connection; // Added import for java.sql.Connection
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    private String jdbcURL = "jdbc:mysql://localhost:30006/userappdb"; // Fixed URL format from jdbc;mysql;//localhost;30006 to jdbc:mysql://localhost:30006
    private String jdbcUserName = "root";
    private String jdbcPassWord = "root";

    private static final String INSERT_USER_SQL = "INSERT INTO users (uname, email, country, passwd) VALUES (?, ?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "SELECT * FROM USERS WHERE ID = ?;";
    private static final String SELECT_ALL_USERS = "SELECT * FROM USERS;";
    private static final String DELETE_USERS_SQL = "DELETE FROM USERS WHERE ID = ?;";
    private static final String UPDATE_USERS_SQL = "UPDATE USERS SET uname = ?, email = ?, country = ?, passwd = ? WHERE ID = ?;"; // Corrected spelling from UPSATE to UPDATE and fixed column name PASSWORD to passwd to match table

    public UserDAO() {
        super();
    }

    public Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassWord); // Corrected to use jdbcUserName instead of DELETE_USERS_SQL
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public void insertUser(User user) {
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setString(4, user.getPassword()); // Changed index from 3 to 4 for the password parameter

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User selectUser(int id) {
        User user = new User();

        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery(); // Corrected typo from executrQuery() to executeQuery()

            while (resultSet.next()) {
                user.setId(id);
                user.setName(resultSet.getString("uname"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                user.setPassword(resultSet.getString("passwd"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}
