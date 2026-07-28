/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeobjetosperdidos;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Objeto {
    
    int IDDelObjeto;
    
    String NombreDelObjeto, DescripcionDelObjeto, CategoriaDelObjeto, LugarYFecha, Reportante, EstadoDelObjeto, Reclamante, CodDeReclamante, CorreDelReclamante, TelefonoDelReclamante;
    ArrayList<String[]> Registros = new ArrayList<>();
    
    public Objeto() {

    }

    public Objeto(int IDDelObjeto, String NombreDelObjeto, String DescripcionDelObjeto, String CategoriaDelObjeto, String LugarYFecha, String Reportante, String EstadoDelObjeto, String Reclamante, String CodDeReclamante, String CorreDelReclamante, String TelefonoDelReclamante) {
        this.IDDelObjeto = IDDelObjeto;
        this.NombreDelObjeto = NombreDelObjeto;
        this.DescripcionDelObjeto = DescripcionDelObjeto;
        this.CategoriaDelObjeto = CategoriaDelObjeto;
        this.LugarYFecha = LugarYFecha;
        this.Reportante = Reportante;
        this.EstadoDelObjeto = EstadoDelObjeto;
        this.Reclamante = Reclamante;
        this.CodDeReclamante = CodDeReclamante;
        this.CorreDelReclamante = CorreDelReclamante;
        this.TelefonoDelReclamante = TelefonoDelReclamante;
    }

    public int getIDDelObjeto() {
        return IDDelObjeto;
    }

    public void setIDDelObjeto(int IDDelObjeto) {
        this.IDDelObjeto = IDDelObjeto;
    }

    public String getNombreDelObjeto() {
        return NombreDelObjeto;
    }

    public void setNombreDelObjeto(String NombreDelObjeto) {
        this.NombreDelObjeto = NombreDelObjeto;
    }

    public String getDescripcionDelObjeto() {
        return DescripcionDelObjeto;
    }

    public void setDescripcionDelObjeto(String DescripcionDelObjeto) {
        this.DescripcionDelObjeto = DescripcionDelObjeto;
    }

    public String getCategoriaDelObjeto() {
        return CategoriaDelObjeto;
    }

    public void setCategoriaDelObjeto(String CategoriaDelObjeto) {
        this.CategoriaDelObjeto = CategoriaDelObjeto;
    }

    public String getLugarYFecha() {
        return LugarYFecha;
    }

    public void setLugarYFecha(String LugarYFecha) {
        this.LugarYFecha = LugarYFecha;
    }

    public String getReportante() {
        return Reportante;
    }

    public void setReportante(String Reportante) {
        this.Reportante = Reportante;
    }

    public String getEstadoDelObjeto() {
        return EstadoDelObjeto;
    }

    public void setEstadoDelObjeto(String EstadoDelObjeto) {
        this.EstadoDelObjeto = EstadoDelObjeto;
    }

    public String getReclamante() {
        return Reclamante;
    }

    public void setReclamante(String Reclamante) {
        this.Reclamante = Reclamante;
    }

    public String getCodDeReclamante() {
        return CodDeReclamante;
    }

    public void setCodDeReclamante(String CodDeReclamante) {
        this.CodDeReclamante = CodDeReclamante;
    }

    public String getCorreDelReclamante() {
        return CorreDelReclamante;
    }

    public void setCorreDelReclamante(String CorreDelReclamante) {
        this.CorreDelReclamante = CorreDelReclamante;
    }

    public String getTelefonoDelReclamante() {
        return TelefonoDelReclamante;
    }

    public void setTelefonoDelReclamante(String TelefonoDelReclamante) {
        this.TelefonoDelReclamante = TelefonoDelReclamante;
    }

    public ArrayList<String[]> getRegistros() {
        return Registros;
    }

    public void setRegistros(ArrayList<String[]> Registros) {
        this.Registros = Registros;
    }

    
  
    public void MostrarInformacion(){
        
        System.out.println(" ------- INFORMACION DEL OBJETO --------------------- ");
        System.out.println(" - NOMBRE DEL OBJETO: "+ NombreDelObjeto);
        System.out.println(" - DESCRIPCION: "+ DescripcionDelObjeto);
        System.out.println(" - CATEGORIA: "+ CategoriaDelObjeto);
        System.out.println(" - LUGAR Y FEHCA: "+ LugarYFecha);
        System.out.println(" - REPORTANTE: "+ Reportante);
        System.out.println(" - ESTAOD DEL OBJETO: "+ EstadoDelObjeto);
    
    }
    
}

