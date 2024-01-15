package Ejercicio1.Caballos;

public class Caballo {
    
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Caballo() throws Exception{
        throw new Exception("Debe añadir información del caballo");
    }

    public Caballo(String nombre, String raza, String color, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public int getEdad() {
        return edad;
    }
    public String getRaza() {
        return raza;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void caminar(int metros){
        System.out.printf("Estoy caminando durante %d metros%n", metros);
    }

    public void correr(int metros){
        System.out.printf("Estoy corriendo durante %d metros%n", metros);
    }

    public void parar(){
        System.out.printf("Estoy parado%n");
    }

    public void relinchar(int tiempo){
        System.out.printf("Estoy relinchando durante %d segundos%n", tiempo);
    }

    public void defecar(int kilos){
        System.out.printf("He cagao %d kilos de caca%n", kilos);
    }

    public void miccionar(int litros){
        System.out.printf("He meao %d litros%n", litros);
    }
}
