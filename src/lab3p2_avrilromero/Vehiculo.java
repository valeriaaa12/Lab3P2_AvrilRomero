/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_avrilromero;

import java.awt.Color;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author rodge
 */
public class Vehiculo {
    
    protected String placa;
    protected String Marca;
    protected String Modelo;
    protected String Tipo;
    protected Color color;
    protected Date year;
    
    public Vehiculo() {
    }
    
    public Vehiculo(String placa, String Marca, String Modelo, String Tipo, Color color, Date year) {
        this.placa = placa;        
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.color = color;
        this.year = year;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
        
    }
    
    public String getMarca() {
        return Marca;
    }
    
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public String getModelo() {
        return Modelo;
    }
    
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    public String getTipo() {
        return Tipo;
    }
    
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public Date getYear() {
        return year;
    }
    
    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Tipo=" + Tipo + ", color=" + color + ", year=" + year + '}';
    }
    
}
