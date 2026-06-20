package com.example.peliculas_api.controller;

import com.example.peliculas_api.entity.Pelicula;
import com.example.peliculas_api.service.PeliculaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/peliculas")
@Tag(name = "Películas", description = "API para la gestión de películas")
public class PeliculaController {

    private final PeliculaService service;

    public PeliculaController(PeliculaService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Obtener todas las películas")
    public List<Pelicula> obtenerTodas() {
        return service.obtenerTodas();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener una película por ID")
    public Optional<Pelicula> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    @Operation(summary = "Registrar una nueva película")
    public Pelicula guardar(@RequestBody Pelicula pelicula) {
        return service.guardar(pelicula);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar una película existente")
    public Pelicula actualizar(
            @PathVariable Long id,
            @RequestBody Pelicula pelicula) {

        return service.actualizar(id, pelicula);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una película")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}