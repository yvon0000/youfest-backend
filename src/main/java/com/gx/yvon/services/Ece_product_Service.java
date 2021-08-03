
package com.gx.yvon.services;

import com.gx.yvon.entity.Ece_product;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface Ece_product_Service {
    
    public Iterable<Ece_product> findAll();
    
    public Page <Ece_product> findAll( Pageable pageable);
    
    public Optional<Ece_product> findById(Long pdt_id);
    public Ece_product save(Ece_product user);
    
    public void deleteById(Long pdt_id);
    
}
