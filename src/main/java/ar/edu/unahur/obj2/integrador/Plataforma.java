package ar.edu.unahur.obj2.integrador;

import java.util.HashSet;
import java.util.Set;

public class Plataforma {
    private Set<Usuario> regUsuarios = new HashSet<>();
    private Set<Pelicula> regPeliculas = new HashSet<>();

 
    public void setUsuario(Usuario newUsuario) {
        this.regUsuarios.add(newUsuario);
    }
    
    public void setPelicula(Pelicula newPelicula) {
        this.regPeliculas.add(newPelicula);
    }
    
    public void removeUsuario(Usuario usuario) {
        regUsuarios.remove(usuario);
    }
    
    public void removePelicula(Pelicula pelicula) {
        regPeliculas.remove(pelicula);
    }
    
    public void sugerir(){}
}
