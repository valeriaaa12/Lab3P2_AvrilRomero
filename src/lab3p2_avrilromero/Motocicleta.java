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
public class Motocicleta extends Vehiculo {

    private double velocidad;
    private double peso;
    private double consumoCombustible;

    public Motocicleta() {
    }

    public Motocicleta(double velocidad, double peso, double consumoCombustible, String placa, String Marca, String Modelo, String Tipo, Color color, Date year) {
        super(placa, Marca, Modelo, Tipo, color, year);
        this.velocidad = velocidad;
        if (peso > 0) {
            this.peso = peso;
        }
        if (consumoCombustible > 0) {
            this.consumoCombustible = consumoCombustible;
        }
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws Exception {
        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new Exception();//en lugar de imprimir, tirar una exception,todavia no usar hasta semana 4
        }
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) throws Exception {
        if (consumoCombustible > 0) {
            this.consumoCombustible = consumoCombustible;
        } else {
            throw new Exception();//en lugar de imprimir, tirar una exception,todavia no usar hasta semana 4
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return  "velocidad: " + velocidad +"\n"+ "peso: " + peso+"\n" + "consumo de Combustible: " + consumoCombustible ;
    }

}
