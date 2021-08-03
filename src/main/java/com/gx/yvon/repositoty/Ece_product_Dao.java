
package com.gx.yvon.repositoty;

import com.gx.yvon.entity.Ece_product;
import java.awt.print.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ece_product_Dao  extends JpaRepository<Ece_product,Long>{

    
}
