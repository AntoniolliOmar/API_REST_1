package com.Api.Productos.Repository;

import com.Api.Productos.Models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository <Productos , Long> {
}
