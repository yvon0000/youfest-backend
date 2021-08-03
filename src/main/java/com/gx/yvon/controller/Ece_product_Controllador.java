
package com.gx.yvon.controller;

import com.gx.yvon.entity.Ece_product;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gx.yvon.services.Ece_product_Service;

@RestController
@RequestMapping("/api/productos")
public class Ece_product_Controllador {
    
    @Autowired
    private Ece_product_Service userService;
    //agregar producto
    @PostMapping
    public ResponseEntity<?> create (@RequestBody Ece_product user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
      
    }
      //listar producto
    
    @GetMapping("/{pdt_id}")
    public ResponseEntity<?> read (@PathVariable(value="pdt_id") Long userId){
        Optional<Ece_product> oUser=userService.findById(userId);
        if(!oUser.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oUser);
    }
    //update un  producto
    @PutMapping("/{pdt_id}")
    public ResponseEntity<?> update( @RequestBody Ece_product userDetails,@PathVariable (value="pdt_id") long id_product){
       Optional<Ece_product> product=userService.findById(id_product);
       if(!product.isPresent()){
           return ResponseEntity.notFound().build();
       }
       product.get().setPdt_name(userDetails.getPdt_name());
       product.get().setPdt_quantity(userDetails.getPdt_quantity());
       product.get().setPdt_description(userDetails.getPdt_description());
       product.get().setPdt_image(userDetails.getPdt_image());
       product.get().setPdt_date_created(userDetails.getPdt_date_created());
       product.get().setPdt_date_update(userDetails.getPdt_date_update());
       product.get().setPdt_user_created(userDetails.getPdt_user_created());
       product.get().setPdt_user_update(userDetails.getPdt_user_update());
    
    return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(product.get()));
        
    }
    // borrar producto
    
    @DeleteMapping("/{pdt_id}")
    public ResponseEntity<?> delete( @PathVariable (value ="pdt_id") Long id_product){
        if(!userService.findById(id_product).isPresent()){
            return ResponseEntity.notFound().build();
        }
        userService.deleteById(id_product);
        
        return ResponseEntity.ok().build();
    }
    //listar Todos
    @GetMapping
    public List<Ece_product> readAll(){
        List<Ece_product>productos=StreamSupport
                .stream(userService.findAll().spliterator(), false)
                .collect(Collectors.toList())
                ;
        return productos;
    }
    
}
