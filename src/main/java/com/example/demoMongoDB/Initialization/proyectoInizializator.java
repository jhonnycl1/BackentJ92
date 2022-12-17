/*package com.example.demoMongoDB.Initialization;

import ch.qos.logback.classic.pattern.DateConverter;
import com.example.demoMongoDB.Bean.proyectomgBean;
import com.example.demoMongoDB.Repository.proyectomgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.DateFormat;
import java.util.Date;

@Component
public class proyectoInizializator {
    @Autowired
    private proyectomgRepository proyectomgrepository;
    @PostConstruct
    private void init(){
        proyectomgrepository.deleteById("ProyectoArequipa");
        proyectomgBean proyecto = new proyectomgBean();

        proyecto.setProyectoID("ProyectoArequipa");
        proyecto.setProyectoNombre("Tren Subterraneo");
        proyecto.setProyectoLugar("Arequipa");
        proyecto.setProyectoInicio("18/12/2022");
        proyecto.setProyectoFechalimite("10/10/2025");
        proyecto.setProyectoPresupuesto(500);
        proyectomgrepository.save(proyecto);

        proyecto.setProyectoID("ProyectoCuzco");
        proyecto.setProyectoNombre("Tren Subterraneo");
        proyecto.setProyectoLugar("Arequipa");
        proyecto.setProyectoInicio("18/12/2022");
        proyecto.setProyectoFechalimite("10/10/2025");
        proyecto.setProyectoPresupuesto(500);
        proyectomgrepository.save(proyecto);

        proyecto.setProyectoID("ProyectoLima");
        proyecto.setProyectoNombre("Tren Subterraneo");
        proyecto.setProyectoLugar("Arequipa");
        proyecto.setProyectoInicio("18/12/2022");
        proyecto.setProyectoFechalimite("10/10/2025");
        proyecto.setProyectoPresupuesto(500);
        proyectomgrepository.save(proyecto);

    }
}*/
