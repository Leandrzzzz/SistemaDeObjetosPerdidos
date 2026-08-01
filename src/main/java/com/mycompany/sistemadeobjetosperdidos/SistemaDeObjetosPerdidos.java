/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadeobjetosperdidos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SistemaDeObjetosPerdidos {

    public static void main(String[] args) {
        
        ObjetoDAO.cargarObjetos();
        
        MenuJFrame menu = new MenuJFrame();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
    }    
}

