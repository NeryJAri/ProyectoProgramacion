package com.ejemplo.miProyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ejemplo.miProyecto.model.Producto;
import com.ejemplo.miProyecto.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> obtenerTodos() {
        return productoService.obtenerTodos();
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return productoService.crear(producto);
    }
}
