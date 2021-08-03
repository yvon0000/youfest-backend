
package com.gx.yvon.services;

import com.gx.yvon.entity.Ece_product;
import java.awt.print.Pageable;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gx.yvon.repositoty.Ece_product_Dao;

@Service
public class Ece_product_ServiceImpl  implements Ece_product_Service {
    @Autowired
    private Ece_product_Dao userDao;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Ece_product> findAll() {
return userDao.findAll();
    }

    

    @Override
        @Transactional(readOnly = true)
    public Optional<Ece_product> findById(Long id) {
return userDao.findById(id);
    }

    @Override
    @Transactional
    public Ece_product save(Ece_product user) {
        return  userDao.save(user);
       
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
userDao.deleteById(id);
    }

    @Override
     @Transactional(readOnly = true)
    public Page<Ece_product> findAll(org.springframework.data.domain.Pageable pageable) {
            return userDao.findAll(pageable);
  
    }
    
}
