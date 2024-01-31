/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationsprueba;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author Pedro
 */
public class DirectorFinanciero implements Empleados {
    
    private CreacionInformeFinanciero informeFinanciero;
    
    //campos a inyectar de archivo config. Los nombres no tienen porqué coincidir
    @Value("${email}")
    private String email;
    @Value("${nombreEmpresa}")   
    private String nombreEmpresa;

    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    public String getEmail() {
        return email;
    }


    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    @Override
    public String getTareas() {
        return "Director financiero se encarga de la gestión de operaciones financieras";
    }

    @Override
    public String getInformes() {
        return "El informe financiero es este";
    }
    
}
