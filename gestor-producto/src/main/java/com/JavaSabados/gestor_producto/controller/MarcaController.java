package com.JavaSabados.gestor_producto.controller;

import com.JavaSabados.gestor_producto.model.Marca;
import com.JavaSabados.gestor_producto.service.MarcaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")

public class MarcaController {
    private final MarcaService marcaService;
    public MarcaController(MarcaService marcaService){
        this.marcaService = marcaService;
    }

    @GetMapping
    public List<Marca> obtenerMarca(){
        return marcaService.listarMarcas();
    }

    @PostMapping
    public Marca crearMarca(@RequestBody Marca marca){

        return marcaService.agregarMarca(marca);
    }
}
