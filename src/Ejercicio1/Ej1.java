package Ejercicio1;

import Ejercicio1.Caballos.Caballo;

public class Ej1 {
    public static void main(String[] args) {
        try {
            Caballo caballo = new Caballo("Rocinante", "Árabe", "Negro", 5);
            caballo.caminar(100);
            caballo.correr(200);
            caballo.parar();
            caballo.relinchar(5);
            caballo.defecar(50);
            caballo.miccionar(20);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
