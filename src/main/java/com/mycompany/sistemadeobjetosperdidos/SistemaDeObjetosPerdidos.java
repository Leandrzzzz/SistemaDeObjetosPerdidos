/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadeobjetosperdidos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SistemaDeObjetosPerdidos {

    public static void main(String[] args) {
    
        Scanner EntradaDeDatos = new Scanner(System.in);
        Objeto registros = new Objeto();

        
        int Opcion;

        do{
        
            System.out.println(" ==============================");
            System.out.println("  SISTEMA OBJETOS PERDIDOS ");
            System.out.println(" ==============================");
            System.out.println(" 1.- Registrar Objeto Perdido");
            System.out.println(" 2.- Buscar por Código");
            System.out.println(" 3.- Buscar por Categoria");
            System.out.println(" 4.- Listar Objetos");
            System.out.println(" 5.- Reclamar Objeto");
            System.out.println(" 0.- Salir\n");

            System.out.print(" - OPCION: ");
            Opcion = EntradaDeDatos.nextInt();
            System.out.print("\n");


            switch(Opcion){

                case 1:

                    RegistrarObjetoPerdido(registros);
                    break;

                case 2:

                    BuscarPorCodigo(registros);
                    break;

                case 3:

                    BuscarPorCategoria(registros);
                    break;

                case 4:

                    ListarObjeto(registros);
                    break;

                case 5:

                    ReclamarObjeto(registros);
                    break;

                default:

                    break;

            }
            
        }while(Opcion != 0);
        
        
        
    }
    
    public static void RegistrarObjetoPerdido(Objeto registros){
        
        Scanner EntradaDeDatos = new Scanner(System.in);
        
        System.out.println("-------------------------");
        System.out.print("\n");
                
        System.out.print(" -> NOMBRE DEL OBJETO: ");        
        String nombreDelObjeto = EntradaDeDatos.nextLine();
        nombreDelObjeto = nombreDelObjeto.substring(0, 1).toUpperCase() + nombreDelObjeto.substring(1).toLowerCase();
        
        System.out.print(" -> DESCRIPCION DEL OBJETO: ");        
        String descripcionDelObjeto = EntradaDeDatos.nextLine();
        descripcionDelObjeto = descripcionDelObjeto.substring(0, 1).toUpperCase() + descripcionDelObjeto.substring(1).toLowerCase();
        
        System.out.print(" -> ELIJE UNA CATEGORIA PARA EL OBJETO: ");        
        String categoriaDelObjeto = EntradaDeDatos.nextLine();
        categoriaDelObjeto = categoriaDelObjeto.substring(0, 1).toUpperCase() + categoriaDelObjeto.substring(1).toLowerCase();
        
        System.out.print(" -> LUGAR Y FECHA DONDE SE ENCONTRO: ");        
        String lugarYFecha = EntradaDeDatos.nextLine();
        lugarYFecha = lugarYFecha.substring(0, 1).toUpperCase() + lugarYFecha.substring(1).toLowerCase();
        
        System.out.print(" -> NOMBRES Y APELLIDOS COMPLETOS DEL REPORTANTE: ");        
        String reportante = EntradaDeDatos.nextLine();
        reportante = reportante.substring(0, 1).toUpperCase() + reportante.substring(1).toLowerCase();
        
        
        System.out.print("\n");
        System.out.println(" ------- INFORMACION DEL OBJETO --------------------- ");
        System.out.println(" - NOMBRE DEL OBJETO: "+ nombreDelObjeto);
        System.out.println(" - DESCRIPCION: "+ descripcionDelObjeto);
        System.out.println(" - CATEGORIA: "+ categoriaDelObjeto);
        System.out.println(" - LUGAR Y FEHCA: "+ lugarYFecha);
        System.out.println(" - REPORTANTE: "+ reportante);
        System.out.println(" - ESTADO DEL OBJETO: "+ "PERDIDO");
        System.out.print("\n");
 
        
        System.out.println(" 1.- ACEPTAR");
        System.out.println(" 2.- CANCELAR\n");
        
        System.out.print(" - OPCION: ");
        int Opcion = EntradaDeDatos.nextInt();
        System.out.print("\n");
        
        
        if(Opcion == 1){
            
            registros.getRegistros().add(new String[]{nombreDelObjeto,descripcionDelObjeto,categoriaDelObjeto,lugarYFecha,reportante,"PERDIDO",null,null,null,null});
            
        }
        
        
    }
    
    public static void BuscarPorCodigo(Objeto registros) {
        
        Scanner EntradaDeDatos = new Scanner(System.in);
        
        System.out.println("-------------------------");
        System.out.print("\n");

        System.out.print(" - INGRESE EL CODIGO ID DEL OBJETO: ");
        int ID = EntradaDeDatos.nextInt()+1;
        String[] objeto = registros.getRegistros().get(ID);

        System.out.print("\n");
        System.out.println(" ------- INFORMACION DEL OBJETO --------------------- ");
        System.out.print("\n");
        System.out.println(" - NOMBRE DEL OBJETO: "+ objeto[0]);
        System.out.println(" - DESCRIPCION: "+ objeto[1]);
        System.out.println(" - CATEGORIA: "+ objeto[2]);
        System.out.println(" - LUGAR Y FEHCA: "+ objeto[3]);
        System.out.println(" - REPORTANTE: "+ objeto[4]);
        System.out.println(" - ESTADO DEL OBJETO: "+ objeto[5]);
        System.out.print("\n");
        
        System.out.println("  ------- INFORMACION DEL RECLAMANTE --------------------- ");
        System.out.print("\n");
        System.out.println(" - NOMBRE DEL RECLAMANTE: "+ objeto[6]);
        System.out.println(" - CODIGO DEL RECLAMANTE: "+ objeto[7]);
        System.out.println(" - CORREO DEL RECLAMANTE: "+ objeto[8]);
        System.out.println(" - NUMERO DEL RECLAMANTE: "+ objeto[9]);  
        System.out.print("\n");
        
    }

    public static void BuscarPorCategoria(Objeto registros) {}
    
    public static void ListarObjeto(Objeto registros) {
    
        System.out.println("-------------------------");
        System.out.print("\n");
        
        for (int i = 0; i < registros.getRegistros().size(); i++) {
            
            String[] objeto = registros.getRegistros().get(i);
            objeto[1] = "NO DISPONIBLE";
            
            System.out.println(" "+(i+1)+".- "+ Arrays.toString(objeto));
            System.out.print("\n");
            
        }
        
    }

    public static void ReclamarObjeto(Objeto registros) {}
        
    }

