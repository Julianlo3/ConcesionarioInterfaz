/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Elkin
 */
public class Carros {

    double precio;
    String marca;
    String modelo;
    String color;
    String codigo;

    public Carros(double precio, String marca, String modelo, String color, String codigo) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.codigo = codigo;
    }

    public Carros() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDatos() {
        return "Precio: " +codigo
                + "Marca: " +marca
                + "Modelo: " +modelo
                + "Color: " +color
                + "Precio: " +precio;
    }
}
