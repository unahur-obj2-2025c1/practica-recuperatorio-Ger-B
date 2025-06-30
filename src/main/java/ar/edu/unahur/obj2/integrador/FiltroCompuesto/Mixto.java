package ar.edu.unahur.obj2.integrador.FiltroCompuesto;

import java.util.List;

import ar.edu.unahur.obj2.integrador.Pelicula;
import ar.edu.unahur.obj2.integrador.Filtros.IFiltro;

public class Mixto extends FiltroCompuesto{
    
    public Mixto(List<IFiltro> listaDePerfiles) {
        super(listaDePerfiles);
    }

    @Override
    public Boolean aplicar(Pelicula pelicula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicar'");
    }

}
