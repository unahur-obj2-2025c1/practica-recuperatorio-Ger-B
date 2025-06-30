package ar.edu.unahur.obj2.integrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ar.edu.unahur.obj2.integrador.Filtros.IFiltro;

public class Usuario {
    private String eMail;
    private IFiltro perfilCinefilo;
    private List<Pelicula> sugerenciasRecividas = new ArrayList<>();
    private List<Pelicula> peliculasVistas = new ArrayList<>();
    private String idioma;
    
    public Usuario(String eMail, IFiltro perfil, String idioma){
        this.eMail = eMail;
        this.perfilCinefilo = perfil;
        this.idioma = idioma;
    }
    
    public void setPerfilCinefilo(IFiltro newPerfil){
        perfilCinefilo = newPerfil;
    }
    
    public Pelicula getPeliAlAzar(){
        Random random = new Random();
        return sugerenciasRecividas.get(random.nextInt(sugerenciasRecividas.size()));
    }

    public String geteMail() {
        return eMail;
    }
    
    public IFiltro getPerfilCinefilo() {
        return perfilCinefilo;
    }

    public String getIdioma() {
        return idioma;
    }
}
