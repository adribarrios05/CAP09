package EjercicioA3;

import EjercicioA3.discos.Coleccion;
import EjercicioA3.discos.Disco;

public class EjA3 {
    public static void main(String[] args) {

        Disco disco = new Disco("Buleria", "David Bisbal", "Flamenco", 35);
        System.out.println(disco);
        Coleccion coleccion = new Coleccion();
        System.out.println(coleccion);
    }
}
