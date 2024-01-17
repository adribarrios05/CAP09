package EjercicioA3.discos;

import EjercicioA3.crud.CRUD;

public class Coleccion implements CRUD{
    private Disco[] discos;

    public Coleccion(){
        discos = new Disco[100];
    }

    public Disco anadirDisco(Disco disco){
        for(int i = 0; i<discos.length; i++){
            if(discos[i]!=null){
                discos[i]=disco;
                return disco;
            }
        }
        return null;
    }

    public Disco actualizaDisco(String codigo, String nombre,  String autor, String genero, int duracion){
        for(int i = 0; i<=discos.length; i++){
            if(codigo==discos[i].getCodigo()){
                if(!nombre.equals(""))
                    discos[i].setNombre(nombre);
                if(!autor.equals(""))
                    discos[i].setAutor(autor);
                if(!genero.equals(""))
                    discos[i].setGenero(genero);
                if(duracion!=0)
                    discos[i].setDuracion(duracion);
            }
        }
        return null;
    }
    public Disco eliminaDisco(String codigo){
        return null;
    }
    
    public Disco[] listaDiscos(){
        return null;
    }


}
