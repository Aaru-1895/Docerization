package com.doc.demo.Docerization.service;


import java.util.List;
import com.doc.demo.Docerization.model.Entity;
import com.doc.demo.Docerization.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {

    @Autowired
    private EntityRepository entityRepository;


    public List<Entity>  getEntity(){
        List<Entity> entityList = entityRepository.findAll();
        return entityList;
    }


    public Entity saveEntity(Entity entity){
       return entityRepository.save(entity);
    }
}