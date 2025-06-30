package ar.edu.unahur.obj2.integrador.Filtros;

import java.util.Set;

import ar.edu.unahur.obj2.integrador.Pelicula;

public class Genero extends Filtro{
    private Set<String> generos;

    public Genero(Set<String> generos){
        this.generos = generos;
    }
    
    @Override
    public Boolean aplicar(Pelicula pelicula) {
        return generos.contains(pelicula.getGenero());
    }

}
