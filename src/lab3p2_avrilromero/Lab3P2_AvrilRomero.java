/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_avrilromero;

import java.util.Scanner;

/**
 *
 * @author rodge
 */
public class Lab3P2_AvrilRomero {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);//lee strings
    static Scanner sc = new Scanner(System.in);//lee enteros

    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("-MENU-");
            System.out.println("1.Agregar Automovil");
            System.out.println("2.Agregar Motocicleta");
            System.out.println("3.Agregar Autobus");
            System.out.println("4.Modifcar Vehiculo");
            System.out.println("5.Eliminar Vehiculo");
            System.out.println("6.Mostrar Vehiculo");
            System.out.println("7.Generar Boleta");
            System.out.println("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                
            }
        }
    }//fin main

    public static boolean validPlaca(String placa) {
        int contCharac = 0;
        int contDigit = 0;
        String placa2 = placa.toUpperCase();
        if (placa.startsWith("H") || placa.startsWith("B")) {
            for (int i = 0; i < placa.length(); i++) {
                if (placa2.charAt(i) <= 90 && placa2.charAt(i) >= 65) {
                    contCharac++;
                } else if (placa2.charAt(i) >= 48 && placa2.charAt(i) <= 57) {
                    contDigit++;
                }
            }
        }
        if (contCharac == 3 && contDigit == 4) {
            return true;
        } else {
            return false;
        }

    }
}
