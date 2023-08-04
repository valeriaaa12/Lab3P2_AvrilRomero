/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_avrilromero;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

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
    static ArrayList<Vehiculo> vehiculos = new ArrayList();

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
            System.out.println("8.Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    vehiculos = agregarAuto(vehiculos);
                }

                break;
                case 2: {
                    vehiculos = agregarMoto(vehiculos);
                }
                break;
                case 3: {
                    vehiculos = agregarBus(vehiculos);
                }
                break;
                case 4: {

                }
                break;
                case 5: {

                }
                break;
                case 6: {
                    Imprimir(vehiculos);
                }
                break;
                case 7: {

                }
                break;
                case 8: {
                    seguir = false;
                }
                break;
                default: {
                    System.out.println("Opcion Incorrecta");
                }
                break;
            }
        }
    }//fin main

    public static boolean validPlaca(String placa) {
        int contCharac = 0;
        int contDigit = 0;
        String placa2 = placa.toUpperCase();

        for (int i = 0; i < placa.length(); i++) {
            if (placa2.charAt(i) <= 90 && placa2.charAt(i) >= 65) {
                contCharac++;
            } else if (placa2.charAt(i) >= 48 && placa2.charAt(i) <= 57) {
                contDigit++;
            }
        }

        if (contCharac == 3 && contDigit
                == 4) {
            return true;
        } else {
            return false;
        }

    }

    public static ArrayList<Vehiculo> agregarAuto(ArrayList<Vehiculo> vehiculos) {
        Date fecha2 = new Date();
        System.out.println("Ingrese la placa: ");
        String placa = leer.nextLine();
        boolean valid = true;
        int convalid = 0;
        while (valid) {
            for (int i = 0; i < vehiculos.size(); i++) {
                if (placa.equals(vehiculos.get(i).getPlaca())) {
                    convalid++;
                }
            }
            if (placa.startsWith("H") && validPlaca(placa) && convalid <= 0) {
                valid = false;
            } else {
                System.out.println("Placa no valida");
                System.out.println("Ingrese la placa: ");
                placa = leer.nextLine();
            }
        }//fin while
        System.out.println("Ingrese la Marca: ");
        String marca = leer.nextLine();
        System.out.println("Ingrese un modelo: ");
        String modelo = leer.nextLine();
        System.out.println("Ingrese el tipo:");
        String tipo = leer.nextLine();
        Color color;
        color = JColorChooser.showDialog(null, "Seleccione un color", Color.red);
        System.out.println("Ingrese el año: ");
        String fecha = leer.nextLine();
        DateFormat df = new SimpleDateFormat("yyyy");
        if (fecha.length() > 4) {
            System.out.println("Formato incorrecto");
        } else {
            try {
                fecha2 = df.parse(fecha);
            } catch (ParseException ex) {
                System.out.println("Formato incorrecto. No se puede seguir con esta accion");
            }
        }
        System.out.println("""
                                       Ingrese el tipo de combustible:
                                       1.Diesel
                                       2.Super
                                       3.Regular""");
        int op2 = sc.nextInt();
        String combustible = "";
        switch (op2) {
            case 1: {
                combustible += "Diesel";
            }
            break;
            case 2: {
                combustible += "Super";
            }
            break;
            case 3: {
                combustible += "Regular";
            }
            break;
            default: {
                System.out.println("Combustible no valido");
            }
            break;
        }//fin switch
        System.out.println("Ingrese el numero de puertas: ");
        int puertas = sc.nextInt();
        System.out.println("""
                                       Ingrese el tipo de transmision:
                                       1.Automatico
                                       2.Mecanico""");
        int op3 = sc.nextInt();
        String transmision = "";
        switch (op3) {
            case 1: {
                transmision += "Automatico";
            }
            break;
            case 2: {
                transmision += "Mecanico";
            }
            break;
            default: {
                System.out.println("Transmision no valida");
            }
            break;
        }
        System.out.println("Ingrese el numero de asientos");
        int asientos = sc.nextInt();
        //    public Automoviles(String tipoCombusticle, int numPuertas, String transmision, int numAsientos, String placa, String Marca, String Modelo, String Tipo, Color color, Date year) {
        Automoviles auto = new Automoviles(combustible, puertas, transmision, asientos, placa, marca, modelo, tipo, color, fecha2);
        vehiculos.add(auto);
        return vehiculos;
    }

    public static ArrayList<Vehiculo> agregarMoto(ArrayList<Vehiculo> vehiculos) {
        Date fecha2 = new Date();
        System.out.println("Ingrese la placa: ");
        String placa = leer.nextLine();
        boolean valid = true;
        int convalid = 0;
        while (valid) {
            for (int i = 0; i < vehiculos.size(); i++) {
                if (placa.equals(vehiculos.get(i).getPlaca())) {
                    convalid++;
                }
            }
            if (placa.startsWith("B") && validPlaca(placa) && convalid <= 0) {
                valid = false;
            } else {
                System.out.println("Placa no valida");
                System.out.println("Ingrese la placa: ");
                placa = leer.nextLine();
            }
        }//fin while
        System.out.println("Ingrese la Marca: ");
        String marca = leer.nextLine();
        System.out.println("Ingrese un modelo: ");
        String modelo = leer.nextLine();
        System.out.println("Ingrese el tipo:");
        String tipo = leer.nextLine();
        Color color;
        color = JColorChooser.showDialog(null, "Seleccione un color", Color.red);
        System.out.println("Ingrese el año: ");
        String fecha = leer.nextLine();
        DateFormat df = new SimpleDateFormat("yyyy");
        if (fecha.length() > 4) {
            System.out.println("Formato incorrecto");
        } else {
            try {
                fecha2 = df.parse(fecha);
            } catch (ParseException ex) {
                System.out.println("Formato incorrecto. No se puede seguir con esta accion");
            }
        }
        System.out.println("Ingrese la velocidad maxima: ");
        double velocidad = sc.nextDouble();
        System.out.println("Ingrese un peso: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese un consumo de combustible:  ");
        double combustible = sc.nextDouble();
        // public Motocicleta(double velocidad, double peso, double consumoCombustible, String placa, String Marca, String Modelo, String Tipo, Color color, Date year) {
        Motocicleta moto = new Motocicleta(velocidad, peso, combustible, placa, marca, modelo, tipo, color, fecha2);
        vehiculos.add(moto);
        return vehiculos;
    }

    public static ArrayList<Vehiculo> agregarBus(ArrayList<Vehiculo> vehiculos) {
        Date fecha2 = new Date();
        System.out.println("Ingrese la placa: ");
        String placa = leer.nextLine();
        boolean valid = true;
        int convalid = 0;
        while (valid) {
            for (int i = 0; i < vehiculos.size(); i++) {
                if (placa.equals(vehiculos.get(i).getPlaca())) {
                    convalid++;
                }
            }
            if (placa.startsWith("H") && validPlaca(placa) && convalid <= 0) {
                valid = false;
            } else {
                System.out.println("Placa no valida");
                System.out.println("Ingrese la placa: ");
                placa = leer.nextLine();
            }
        }//fin while
        System.out.println("Ingrese la Marca: ");
        String marca = leer.nextLine();
        System.out.println("Ingrese un modelo: ");
        String modelo = leer.nextLine();
        System.out.println("Ingrese el tipo:");
        String tipo = leer.nextLine();
        Color color;
        color = JColorChooser.showDialog(null, "Seleccione un color", Color.red);
        System.out.println("Ingrese el año: ");
        String fecha = leer.nextLine();
        DateFormat df = new SimpleDateFormat("yyyy");
        if (fecha.length() > 4) {
            System.out.println("Formato incorrecto");
        } else {
            try {
                fecha2 = df.parse(fecha);
            } catch (ParseException ex) {
                System.out.println("Formato incorrecto. No se puede seguir con esta accion");
            }
        }
        System.out.println("Ingrese una cantidad de pasajeros: ");
        int pasajeros = sc.nextInt();
        System.out.println("Ingrese numero de ejes: ");
        int ejes = sc.nextInt();
        System.out.println("Ingrese longitud: ");
        double longitud = sc.nextDouble();
        // public Autobus(int pasajeros, int ejes, double longitud, String placa, String Marca, String Modelo, String Tipo, Color color, Date year) {
        Autobus bus = new Autobus(pasajeros, ejes, longitud, placa, marca, modelo, tipo, color, fecha2);
        vehiculos.add(bus);
        return vehiculos;
    }

    public static void Imprimir(ArrayList<Vehiculo> vehiculo) {
        System.out.println("Automoviles");
        for (Vehiculo vehiculo1 : vehiculo) {
            if (vehiculo1 instanceof Automoviles) {
                System.out.println(vehiculo.indexOf(vehiculo1) + "-");
                System.out.println(vehiculo1.toString());
            }
        }
        System.out.println("Motocicleta");
        for (Vehiculo vehiculo1 : vehiculo) {
            if (vehiculo1 instanceof Motocicleta) {
                System.out.println(vehiculo.indexOf(vehiculo1) + "-");
                System.out.println(vehiculo1.toString());
            }
        }
        System.out.println("Autobuses");
        for (Vehiculo vehiculo1 : vehiculo) {
            if (vehiculo1 instanceof Autobus) {
                System.out.println(vehiculo.indexOf(vehiculo1) + "-");
                System.out.println(vehiculo1.toString());
            }
        }

    }

    public static ArrayList<Vehiculo> modificarAuto(ArrayList<Vehiculo> vehiculos) {
        System.out.println("""
                           1.Automovil
                           2.Motocicleta
                           3.Autobus
                           Ingrese el numero del que quiera modificar: """);
        int op1 = sc.nextInt();
        switch (op1) {
            case 1: {
                System.out.println("Ingrese el indice del auto a modificar: ");
                int index = sc.nextInt();
                if (vehiculos.get(index) instanceof Automoviles) {
                    System.out.println("""
                           1.Placa
                           2.Marca
                           3.Modelo
                           4.Tipo
                           5.Color
                           6.Año
                           7.Tipo de Combustible
                           8.Numero de puertas
                           9.Tipo de transmision
                           10.Numero de asientos
                           11.Salir 
                           Ingrese una opcion:""");
                    int op = sc.nextInt();
                    switch (op) {
                        case 1: {
                            System.out.println("Ingrese la placa: ");
                            String placa = leer.nextLine();
                            boolean valid = true;
                            int convalid = 0;
                            while (valid) {
                                for (int i = 0; i < vehiculos.size(); i++) {
                                    if (placa.equals(vehiculos.get(i).getPlaca())) {
                                        convalid++;
                                    }
                                }
                                if (placa.startsWith("H") && validPlaca(placa) && convalid == 0) {
                                    vehiculos.get(index).setPlaca(placa);
                                    valid = false;
                                } else {
                                    System.out.println("Placa no valida");
                                    System.out.println("Ingrese la placa: ");
                                    placa = leer.nextLine();
                                    vehiculos.get(index).setPlaca(placa);
                                }
                            }//fin while
                        }
                        break;
                        case 2: {

                        }
                        break;
                        case 3: {

                        }
                        break;
                        case 4: {

                        }
                        break;
                        case 5: {

                        }
                        break;
                        case 6: {

                        }
                        break;
                        case 7: {

                        }
                        break;
                        case 8: {

                        }
                        break;
                        case 9: {

                        }
                        break;
                        case 10: {

                        }
                        break;
                        case 11: {

                        }
                        break;
                        default: {
                            System.out.println("Opcion incorrecta: ");
                        }
                        break;
                    }
                } else {
                    System.out.println("Eso no es un vehiculo");
                }
            }
            break;
            case 2: {

            }
            break;
            case 3: {

            }
            break;
            default: {
                System.out.println("Opcion incorrecta");
            }
            break;
        }

        return vehiculos;
    }

}//fin clase 

