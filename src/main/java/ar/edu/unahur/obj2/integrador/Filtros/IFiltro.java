package ar.edu.unahur.obj2.integrador.Filtros;

import ar.edu.unahur.obj2.integrador.Pelicula;

public interface IFiltro {
    Boolean aplicar(Pelicula pelicula);
    IFiltro and(IFiltro filtro);
    IFiltro or(IFiltro filtro);
}
