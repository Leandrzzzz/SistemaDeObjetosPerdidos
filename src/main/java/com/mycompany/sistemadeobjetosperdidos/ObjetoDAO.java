/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeobjetosperdidos;

/**
 *
 * @author ASUS
 */

import java.sql.*;
import java.util.*;

public class ObjetoDAO {

    private ArrayList<Objeto> listaObjetos;
    private HashMap<Integer, Objeto> mapaObjetos;
    private TreeMap<String, ArrayList<Objeto>> arbolCategorias;

    public ObjetoDAO() {

    }
    
    public static void cargarObjetos() {
        
        Objeto.getLista().clear();
        
        String sql = "SELECT * FROM Objeto";

        try (Connection con = ConexionSQL.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                

                
                String[] Registro = {null,null,null,null,null,null,null,null,null,null,null};

                    Registro[0] = rs.getString("ID");
                    Registro[1] = rs.getString("Objeto");
                    Registro[2] = rs.getString("Descripcion");
                    Registro[3] = rs.getString("Categoria");
                    Registro[4] = rs.getString("LugarYFecha");
                    Registro[5] = rs.getString("Reportante");
                    Registro[6] = rs.getString("Estado");
                    Registro[7] = rs.getString("Reclamante");
                    Registro[8] = rs.getString("CodigoDelReclamante");
                    Registro[9] = rs.getString("CorreoDelReclamante");
                    Registro[10] = rs.getString("TelefonoDelReclamante");
                    
                    Objeto.getLista().add(Registro);
                    
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }    
    
    public static void  registrarObjeto(String[] Registro) {

        String sql = "INSERT INTO Objeto(" + "ID," + "Objeto," + "Descripcion," + "Categoria," + "LugarYFecha," + "Reportante," + "Estado," + "Reclamante,"+"CodigoDelReclamante,"+"CorreoDelReclamante,"+"TelefonoDelReclamante)"+ " VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection con = ConexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
                ps.setString(1, Registro[0]);
                ps.setString(2, Registro[1]);
                ps.setString(3, Registro[2]);
                ps.setString(4, Registro[3]);
                ps.setString(5, Registro[4]);
                ps.setString(6, Registro[5]);
                ps.setString(7, Registro[6]);
                ps.setString(8, Registro[7]);
                ps.setString(9, Registro[8]);
                ps.setString(10, Registro[9]);
                ps.setString(11, Registro[10]);
                
                ps.executeUpdate();
                

        } catch (SQLException e) {
            
            System.out.println(e.getMessage());

        }

    }
    


    
    public static void reclamarObjeto(String[] RegistroReclamarObjeto) {

        String sql = "UPDATE Objeto SET " + "Estado=?," + "Reclamante=?," + "CodigoDelReclamante=?," + "CorreoDelReclamante=?," + "TelefonoDelReclamante=? " + "WHERE ID=?";

        try (Connection con = ConexionSQL.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, RegistroReclamarObjeto[0]);
            ps.setString(2, RegistroReclamarObjeto[1]);
            ps.setString(3, RegistroReclamarObjeto[2]);
            ps.setString(4, RegistroReclamarObjeto[3]);
            ps.setString(5, RegistroReclamarObjeto[4]);
            ps.setString(6, RegistroReclamarObjeto[5]);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                
                cargarObjetos();

                System.out.println("\nObjeto reclamado correctamente.");

            } else {

                System.out.println("\nNo existe un objeto con ese ID.");

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }
}
