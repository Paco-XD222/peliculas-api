package com.example.peliculas_api.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")
@Schema(description = "Entidad que representa una película dentro del sistema")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Identificador único de la película", example = "1")
    private Long id;

    @Schema(description = "Título de la película", example = "Interestelar")
    private String titulo;

    @Schema(description = "Director de la película", example = "Christopher Nolan")
    private String director;

    @Schema(description = "Año de lanzamiento de la película", example = "2014")
    private Integer anioLanzamiento;

    @Schema(description = "Género de la película", example = "Ciencia Ficción")
    private String genero;

    @Column(columnDefinition = "TEXT")
    @Schema(
            description = "Breve resumen o sinopsis de la película",
            example = "Un grupo de astronautas viaja a través de un agujero de gusano para encontrar un nuevo hogar para la humanidad."
    )
    private String sinopsis;

    public Pelicula() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(Integer anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}