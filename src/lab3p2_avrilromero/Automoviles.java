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
public class Automoviles extends Vehiculo {

    private String tipoCombusticle;
    private int numPuertas;
    private String transmision;
    private int numAsientos;

    public Automoviles() {
    }

    public Automoviles(String tipoCombusticle, int numPuertas, String transmision, int numAsientos, String placa, String Marca, String Modelo, String Tipo, Color color, Date year) {
        super(placa, Marca, Modelo, Tipo, color, year);
        this.tipoCombusticle = tipoCombusticle;
        if (numPuertas > 0) {
            this.numPuertas = numPuertas;
        }
        this.transmision = transmision;
        if (numAsientos > 0) {
            this.numAsientos = numAsientos;
        }

    }

    public String getTipoCombusticle() {
        return tipoCombusticle;
    }

    public void setTipoCombusticle(String tipoCombusticle) {
        this.tipoCombusticle = tipoCombusticle;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        if (numPuertas > 0) {
            this.numPuertas = numPuertas;
        }
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        if (numAsientos > 0) {
            this.numAsientos = numAsientos;
        }
    }

    @Override
    public String toString() {
        return "Automoviles{" + "tipoCombusticle=" + tipoCombusticle + ", numPuertas=" + numPuertas + ", transmision=" + transmision + ", numAsientos=" + numAsientos + '}';
    }

}
