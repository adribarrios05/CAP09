package Ejercicio2;

import Ejercicio2.Vehiculos.*;

public class Ej2 {
    public static void menu(){
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la biciicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
    }

    public static int leerOpcion(){
        return Integer.parseInt(System.console().readLine());
    }

    public static void andar(Vehiculo vehiculo, int kilometros){
        vehiculo.andar(kilometros);
    }

    public static void caballito(Bicicleta bicicleta){
        bicicleta.hazCaballito();
    }

    public static void quemaRueda(Coche coche){
        coche.quemaRueda();
    }

    public static void verKilometraje(Vehiculo vehiculo){
        vehiculo.getKilometrosRecorridos();
    }

    public static void verKilometrajeTotal(){
        Vehiculo.getKilometrosTotales();
    }


    public static void main(String[] args) {

    }
}
