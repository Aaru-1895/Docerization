package com.doc.demo.Docerization.conntroller;

import java.util.List;
import com.doc.demo.Docerization.model.Entity;
import com.doc.demo.Docerization.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @Autowired
    private EntityService entityService;


    @GetMapping("docker/test")
    public String letsTest(){
        return "It is working fine!";
    }

    @GetMapping("/getALL")
    public ResponseEntity<List<Entity>> getAllEntity(){
        List<Entity> list = entityService.getEntity();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/saveEntity")
    public ResponseEntity<Entity> saveEntity(@RequestBody Entity entity){
         Entity savedentity = entityService.saveEntity(entity);
        return new ResponseEntity<>(savedentity, HttpStatus.OK);
    }

}
