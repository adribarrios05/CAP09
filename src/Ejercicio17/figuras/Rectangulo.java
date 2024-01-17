package Ejercicio17.figuras;

public class Rectangulo {
    private int base;
    private int altura;
    private static int rectangulosCreados;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    @Override
    public String toString() {
        String salida = "";
        for(int i = 0; i<altura; i++){
            for(int j= 0; j<base; j++){
                salida+="*";
            }
            salida+="\n";
        }
        return salida;
    }
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }
}
