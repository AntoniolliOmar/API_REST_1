package com.Api.Productos.Controller;
import java.util.List;
import com.Api.Productos.Models.Productos;
import com.Api.Productos.Services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Productos")
public class ProductosControllers {

    @Autowired // le dice a spring boot que es una instancia
    private ProductsServices productsServices;

    @PostMapping
    public ResponseEntity<?> PostProductos(@RequestBody Productos producto){
         return ResponseEntity.ok(productsServices.PostProductos(producto));
    }

    @GetMapping
    public ResponseEntity<List<Productos>> GetProductos(){
        return ResponseEntity.ok(productsServices.GetProductos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteProductos(@PathVariable Long id){
        return ResponseEntity.ok(productsServices.DeleteProductos(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> PutProductos(@RequestBody Productos producto , @PathVariable Long id){
        return ResponseEntity.ok(productsServices.PutProductos(producto , id));
    }

}
