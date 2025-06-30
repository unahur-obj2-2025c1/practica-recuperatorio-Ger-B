package ar.edu.unahur.obj2.integrador;

import java.util.Set;

public class Pelicula {
    private String nombre;
    private Integer anioDeEstreno;
    private String genero;
    private String idioma;
    private Set<String> subtitulosDisp;

    public Pelicula(String nombre, Integer anioDeEstreno, String genero, String idioma, Set<String> subtitulosDisp) {
        this.nombre = nombre;
        this.anioDeEstreno = anioDeEstreno;
        this.genero = genero;
        this.idioma = idioma;
        this.subtitulosDisp = subtitulosDisp;
    }

    public boolean esSubtitulada(){
        return subtitulosDisp.contains(idioma);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAnioDeEstreno() {
        return anioDeEstreno;
    }

    public String getGenero() {
        return genero;
    }
}
