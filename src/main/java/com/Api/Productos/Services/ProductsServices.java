package com.Api.Productos.Services;

import com.Api.Productos.Models.Productos;

import java.util.List;

public interface ProductsServices {

    List<Productos> GetProductos();
    String DeleteProductos(Long id);
    String PostProductos(Productos producto);
    String PutProductos(Productos producto, Long id);


}
