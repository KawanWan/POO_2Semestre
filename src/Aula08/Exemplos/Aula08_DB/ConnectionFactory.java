/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula08.Exemplos.Aula08_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static String url = "jdbc:mysql://localhost:3307/aula_poo?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC";
    private static String usuario = "root";
    private static String senha = "usbw";
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException ex) {
            System.out.println(ConnectionFactory.class.getName()+ " "+ ex.getMessage());
        }
        return null;
    }
}
