/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;

public class Consecionario {
    
    String nombreConsecionario;
    String dueño;

    public Consecionario() {
    }

    public Consecionario(String nombreConsecionario, String dueño) {
        this.nombreConsecionario = nombreConsecionario;
        this.dueño = dueño;
    }

    public String getNombreConsecionario() {
        return nombreConsecionario;
    }

    public void setNombreConsecionario(String nombreConsecionario) {
        this.nombreConsecionario = nombreConsecionario;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    //------------------------------------------------------------------------
    public static ArrayList <Carros> listaCarros = new ArrayList <>();

    public ArrayList<Carros> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Carros> listaCarros) {
        Consecionario.listaCarros = listaCarros;
    }
   
    public void addCarro(Carros carro) {
        listaCarros.add(carro);
    }
    
    
    
    
}
