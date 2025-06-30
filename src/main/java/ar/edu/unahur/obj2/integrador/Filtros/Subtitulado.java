package ar.edu.unahur.obj2.integrador.Filtros;

import ar.edu.unahur.obj2.integrador.Pelicula;

public class Subtitulado extends Filtro {

    @Override
    public Boolean aplicar(Pelicula pelicula) {
        return pelicula.esSubtitulada();
    }

}
