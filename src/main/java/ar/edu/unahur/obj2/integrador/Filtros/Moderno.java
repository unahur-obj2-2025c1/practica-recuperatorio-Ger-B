package ar.edu.unahur.obj2.integrador.Filtros;

import ar.edu.unahur.obj2.integrador.Pelicula;

public class Moderno extends Filtro{
    private Integer anio;

    public Moderno(Integer anio){
        this.anio = anio;
    }

    @Override
    public Boolean aplicar(Pelicula pelicula) {
        return pelicula.getAnioDeEstreno() >= anio;
    }

}
