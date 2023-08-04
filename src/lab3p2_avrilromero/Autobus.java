/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_avrilromero;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author rodge
 */
public class Autobus extends Vehiculo {
    private int pasajeros;
    private int ejes;
    private int longitud;

    public Autobus() {
    }

    public Autobus(int pasajeros, int ejes, int longitud, String placa, String Marca, String Modelo, String Tipo, Color color, Date year) {
        super(placa, Marca, Modelo, Tipo, color, year);
        this.pasajeros = pasajeros;
        this.ejes = ejes;
        this.longitud = longitud;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Autobus{" + "pasajeros=" + pasajeros + ", ejes=" + ejes + ", longitud=" + longitud + '}';
    }
    
}
