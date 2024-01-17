package Ejercicio18.incidencias;

public class Incidencia {
    
    private int codigo;
    private int puesto;
    private String estado;
    private String problema;
    private String resolucion;
    private static int pendientes;
    private static int contador;

    public Incidencia(int puesto, String problema){
        this.puesto = puesto;
        this.codigo = ++contador;
        this.problema = problema;
        this.estado = "Pendiente";
        pendientes++;
    }

    public void resuelve(String resolucion){
        this.estado = "Resuelta";
        this.resolucion = resolucion;
        pendientes--;
    }

    public static int getPendientes(){
        return pendientes;
    }

    @Override
    public String toString() {
        return String.format(
            "Incidencia %d - Puesto: %d - %s - %s %s",
            this.codigo, 
            this.puesto, 
            this.problema, 
            this.estado,
            (this.estado.equals("Resuelta"))?"- "+this.resolucion:"");
    }

}
