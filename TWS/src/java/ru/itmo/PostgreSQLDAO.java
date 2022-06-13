package ru.itmo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgreSQLDAO {
    public List<Loyalty> getAll() {
        List<Loyalty> loyalties = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from spbso_loyalty");
            while (rs.next()) {

                String spbsoId = rs.getString("spbso");
                String fullName = rs.getString("name");
                String brigade = rs.getString("brigade");
                String event = rs.getString("event");
                String cash = rs.getString("cash");

                Loyalty loyalty = new Loyalty(spbsoId,fullName,event,cash,brigade);
                loyalties.add(loyalty);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return loyalties;
    }
}
