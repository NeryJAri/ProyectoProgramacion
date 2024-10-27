package com.ejemplo.miProyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejemplo.miProyecto.model.Producto;
import com.ejemplo.miProyecto.repository.ProductoRepository;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    public Producto crear(Producto producto) {
        return productoRepository.save(producto);
    }
}
