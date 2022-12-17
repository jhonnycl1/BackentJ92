package com.example.demoMongoDB.Repository;

import com.example.demoMongoDB.Bean.proyectomgBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.List;


@CrossOrigin(origins = "https://jhonnyfrontcertus.azurewebsites.net/")
//@RepositoryRestResource(collectionResourceRel = "proyectomgBean", path="proyectomgBean")
public interface proyectomgRepository extends MongoRepository<proyectomgBean, String>{
}

