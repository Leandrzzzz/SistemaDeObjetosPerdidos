/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeobjetosperdidos;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

    private static final String URL = "jdbc:sqlserver://localhost;instanceName=SQLEXPRESS;databaseName=SistemaDeObjetosPerdidosDB;encrypt=false";
    private static final String USER="sa";
    private static final String PASSWORD="root123456";

    public static Connection conectar(){

        Connection con = null;
            
            try{
                
                con = DriverManager.getConnection(URL,USER,PASSWORD);
            
            }catch(SQLException e){
            
                System.out.println("xd");
                System.out.println(e.getMessage());
            
            }
            
            return con;

    }

}