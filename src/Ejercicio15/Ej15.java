package Ejercicio15;

import Ejercicio14.domino.FichaDomino;

public class Ej15 {
    public static void main(String[] args) {
        FichaDomino fichaAnt = new FichaDomino((int)(Math.random()*7), (int)(Math.random()*7));
        System.out.print(fichaAnt);
        for(int i=1; i<=8; i++){
            boolean encaja = false;
            FichaDomino fichaSig = null;
            while(!encaja){
                fichaSig = new FichaDomino((int)(Math.random()*7), (int)(Math.random()*7));
                encaja = fichaAnt.encajaSinVoltear(fichaSig);
            }
            System.out.print(fichaSig);
            fichaAnt = fichaSig;
        }
    }
}
