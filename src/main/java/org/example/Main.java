package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SQL_Connection db = new SQL_Connection();

        List<Client> clients = new ArrayList<>();

        //Statement statement = db.getConnection().createStatement()
        try (PreparedStatement preparedStatement = db.getConnection().prepareStatement
                ("INSERT INTO clients (client_id, client_name, client_surname, client_age, " +
                        "day_of_registration, month_of_registration, year_of_registration) VALUES (?, ?, ?, ?, ?, ?, ?)")) {

                preparedStatement.setInt(1, 14);
                preparedStatement.setString(2, "Юрий");
                preparedStatement.setString(3, "Михайлович");
                preparedStatement.setInt(4, 56);
                preparedStatement.setInt(5, 10);
                preparedStatement.setInt(6, 5);
                preparedStatement.setInt(7, 2010);

                preparedStatement.executeUpdate();

                db.closeConnection();


//            ResultSet resultSet = statement.executeQuery("SELECT* FROM clients;");
//
//            while (resultSet.next()) {
//                clients.add(new Client(
//                        resultSet.getInt(1),
//                        resultSet.getString(2),
//                        resultSet.getString(3),
//                        resultSet.getInt(4),
//                        resultSet.getInt(5),
//                        resultSet.getInt(6),
//                        resultSet.getInt(7)));
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
