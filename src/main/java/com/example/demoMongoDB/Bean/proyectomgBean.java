package com.example.demoMongoDB.Bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "ProyectosPeru")
public class proyectomgBean implements Serializable {
    @Id
    private String proyectoID;
    private String proyectoNombre;
    private String proyectoLugar;


    private String proyectoInicio;

    private String proyectoFechalimite;
    private Integer proyectoPresupuesto;

    public String getProyectoID() {
        return proyectoID;
    }

    public void setProyectoID(String proyectoID) {
        this.proyectoID = proyectoID;
    }

    public String getProyectoNombre() {
        return proyectoNombre;
    }

    public void setProyectoNombre(String proyectoNombre) {
        this.proyectoNombre = proyectoNombre;
    }

    public String getProyectoLugar() {
        return proyectoLugar;
    }

    public void setProyectoLugar(String proyectoLugar) {
        this.proyectoLugar = proyectoLugar;
    }

    public String getProyectoInicio() {
        return proyectoInicio;
    }

    public void setProyectoInicio(String proyectoInicio) {
        this.proyectoInicio = proyectoInicio;
    }

    public String getProyectoFechalimite() {
        return proyectoFechalimite;
    }

    public void setProyectoFechalimite(String proyectoFechalimite) {
        this.proyectoFechalimite = proyectoFechalimite;
    }

    public Integer getProyectoPresupuesto() {
        return proyectoPresupuesto;
    }

    public void setProyectoPresupuesto(Integer proyectoPresupuesto) {
        this.proyectoPresupuesto = proyectoPresupuesto;
    }
}
