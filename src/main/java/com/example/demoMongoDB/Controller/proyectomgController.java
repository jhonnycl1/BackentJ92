package com.example.demoMongoDB.Controller;

import com.example.demoMongoDB.Bean.proyectomgBean;
import com.example.demoMongoDB.Repository.proyectomgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//update linea 12

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/proyectomgBean")
public class proyectomgController {

    @Autowired
    private proyectomgRepository proyectomgrepository;
    @GetMapping("/obtener")
    public List<proyectomgBean> getAllProducts(){

        return proyectomgrepository.findAll();
    }

    @DeleteMapping("/eliminar/{proyectoID}")
    public void eliminarProyecto(@PathVariable ("proyectoID") String proyectoID){
        proyectomgrepository.deleteById(proyectoID);

    }
    @PostMapping("/insertar")
    public void insertarArticulo(@RequestBody proyectomgBean proBean){
        proyectomgrepository.save(proBean);
    }

    @PutMapping("/modificar{proyectoID}")
    public void modificarArticuloID (@PathVariable("proyectoID") String proyectoID , @RequestBody proyectomgBean proBean){
        proBean.setProyectoID(proyectoID);
        proyectomgrepository.save(proBean);
    }
    @GetMapping("/obtener/{proyectoID}")
    public ResponseEntity<proyectomgBean> obtenerProyectoUnico(@PathVariable("proyectoID") String proyectoID){

        proyectomgBean listProyectoEncontrado = proyectomgrepository.findById(proyectoID).orElseThrow();

        return ResponseEntity.ok(listProyectoEncontrado);

    }
}
