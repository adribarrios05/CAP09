package Ejercicio17.figuras;

public class Piramide {
    private int altura;
    private static int piramidesCreadas;

    public Piramide(int altura){
        this.altura = altura;
        piramidesCreadas++;
    }

    @Override
    public String toString() {
        String salida = "";
        for(int i = 0; i<altura; i++){
            //espacios
            for(int j= 0; j<altura-i; j++)
                salida+=" ";
            //asteriscos
            for(int j = 1; j<2*i+1; j++)
                salida+="*";
            salida+="\n";
        }
        return salida;
    }
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }
}
