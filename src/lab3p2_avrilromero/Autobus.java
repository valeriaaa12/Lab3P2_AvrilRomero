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
    private double longitud;

    public Autobus() {
    }

    public Autobus(int pasajeros, int ejes, double longitud, String placa, String Marca, String Modelo, String Tipo, Color color, Date year) {
        super(placa, Marca, Modelo, Tipo, color, year);
        this.pasajeros = pasajeros;
        this.ejes = ejes;
        this.longitud = longitud;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) throws Exception {
        if (pasajeros > 0) {
            this.pasajeros = pasajeros;
        } else {
            throw new Exception();//en lugar de imprimir, tirar una exception,todavia no usar hasta semana 4
        }

    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) throws Exception {
        if (ejes > 0) {
            this.ejes = ejes;
        } else {
            throw new Exception();//en lugar de imprimir, tirar una exception,todavia no usar hasta semana 4
        }

    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) throws Exception {
        if (longitud > 0) {
            this.longitud = longitud;
        } else {
            throw new Exception();//en lugar de imprimir, tirar una exception,todavia no usar hasta semana 4
        }

    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "pasajeros: " + pasajeros + "\n" + "ejes: " + ejes + "\n" + ", longitud: " + longitud + "\n";
    }

}
