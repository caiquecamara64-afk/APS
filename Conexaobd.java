package com.mycompany.aps2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexaobd {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/aps";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão: " + e.getMessage());
        }
    }
}