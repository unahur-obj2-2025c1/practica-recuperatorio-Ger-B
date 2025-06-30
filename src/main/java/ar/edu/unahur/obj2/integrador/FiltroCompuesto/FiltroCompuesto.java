package ar.edu.unahur.obj2.integrador.FiltroCompuesto;

import java.util.List;

import ar.edu.unahur.obj2.integrador.Filtros.IFiltro;

public abstract class FiltroCompuesto implements IFiltro {
    private List<IFiltro> perfiles;

    public FiltroCompuesto(List<IFiltro> listaDePerfiles){
        this.perfiles = listaDePerfiles;
    }

    void addPerfil(IFiltro perfil){
        perfiles.add(perfil);
    }

    public IFiltro and(IFiltro perfil){
        return null;
    }

    public IFiltro or(IFiltro perfil){
        return null;
    }
}
