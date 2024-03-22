package com.Api.Productos.Services.Impl;

import com.Api.Productos.Models.Productos;
import com.Api.Productos.Repository.ProductosRepository;
import com.Api.Productos.Services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductsServicesImpl implements ProductsServices {
    @Autowired // le dice a spring boot que es una instancia
    private ProductosRepository productosRepository;

    @Override
    public List<Productos> GetProductos() {
        return productosRepository.findAll();
    }

    @Override
    public String DeleteProductos(Long id) {
        productosRepository.deleteById(id);
        return "Producto eliminado con exito";
    }

    @Override
    public String PostProductos(Productos producto) {
        productosRepository.save(producto);
        return "Producto guardado con exito";
    }

    @Override
    public String PutProductos(Productos producto, Long id) {
        Productos producto1 = productosRepository.findById(id).get();
        if(producto1 != null){
            producto1.setNombre(producto.getNombre());
            producto1.setPrecio(producto.getPrecio());
            productosRepository.save(producto1);
            return "Producto actualizado";
        }   else {
            return "Hubo un error";
        }

    }
}
