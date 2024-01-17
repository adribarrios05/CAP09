package EjercicioA3.crud;

import EjercicioA3.discos.Disco;

public interface CRUD {
    public Disco anadirDisco(Disco disco);
    public Disco actualizaDisco(String codigo, 
                               String nombre,  
                               String autor, 
                               String genero, 
                               int duracion);
    public Disco eliminaDisco(String codigo);
    public Disco[] listaDiscos();
}
