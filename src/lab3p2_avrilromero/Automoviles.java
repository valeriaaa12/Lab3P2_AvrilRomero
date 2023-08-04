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

    public void setNumPuertas(int numPuertas) throws Exception {
        if (numPuertas > 0) {
            this.numPuertas = numPuertas;
        }else {
            throw new Exception();//en lugar de imprimir, tirar una exception,todavia no usar hasta semana 4
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

    public void setNumAsientos(int numAsientos) throws Exception {
        if (numAsientos > 0) {
            this.numAsientos = numAsientos;
        } else {
            throw new Exception();//en lugar de imprimir, tirar una exception,todavia no usar hasta semana 4
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return  "tipo de combusticle: " + tipoCombusticle +"\n"+ "numero de puertas: " + numPuertas+"\n" + "transmision: " + transmision +"\n"+ "numero de asientos: " + numAsientos ;
    }

}
