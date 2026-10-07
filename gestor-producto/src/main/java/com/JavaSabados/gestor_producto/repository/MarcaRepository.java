package com.JavaSabados.gestor_producto.repository;

import com.JavaSabados.gestor_producto.model.Marca;
import com.JavaSabados.gestor_producto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca,Long> {
}
