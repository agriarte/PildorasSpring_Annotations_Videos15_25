/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationsprueba;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 */
// crear la anotacion con el ID que queramos y con esto hemos creado el bean en el contenedor de Sprinng
@Component("comercialExperimentado")
@Scope("singleton") // valores posibles "singleton" y "prototype". Si no se pone la anotación es singleton 
public class Comercial implements Empleados {

    /* 
        3 Formas de inyección de dependencias: por campos de clase, por constructor y por método setter o cualquier método
    
        ***INYECCION DE DEPENDENCIAS POR CAMPO ***
    */
    
    // Realizar la inyección de dependencias automáticamente en un bean
    @Autowired
    // Si hay múltiples implementaciones de una interfaz o clase, se debe usar @Qualifier 
    // junto con @Autowired para especificar cuál implementación se debe inyectar. De lo contrario 
    // dará error porque Spring no sabrá que clase inyectar
    @Qualifier("informeFinancieroTri2") // bean ID que debe utilizar
    private CreacionInformeFinanciero nuevoInforme;
    
    
    /* ***INYECCION DE DEPENDENCIAS CON EL CONSTRUCTOR***
    // Autowired se pone justo encima del constructor.
    // Busca en el paquete indicado en XML una clase que implemente la interfaz CreacionInterfazFinanciero,
    // si la encuentra de esa clase obtiene la inyección de dependencia
    @Autowired
    public Comercial(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }
    */
    
    /* ***INYECCION DE DEPENDENCIAS POR METEDO SETTER ***
    // el nombre es indiferente, lo importante es que tenga anotación @Autowired
    @Autowired
     public void setNuevoInforme_no_importa_nombre_metodo(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }
    */

    @Override
    public String getTareas() {
        return "vender, vender, vender...";
    }

    @Override
    public String getInformes() {
        return "Informe del comercial: " + nuevoInforme.getInformeFinanciero();
    }
    
    // Métodos que se ejecutan antes de iniciar el bean y al cerrarlo. @PostConstruct @PreDestroy
    // IMPORTANTE: Spring solo maneja estos métodos para beans singleton. No funciona con prototype
    // Los metodos pueden tener cualquier nombre, cualquier modificador private, public o protected.
    // No acepta argumentos
    // Aunque pueden devolver datos, suelen ser de tipo void por la dificultad de capturar datos 
    // del bean antes de ser creado y cuando se ha destruido
    @PostConstruct
   public void metodoInit(){
        System.out.println("ESTO VA ANTES DE INICIAR!");
    }
    
    @PreDestroy
    public void metodoDestroy(){
        System.out.println("ESTO VA CUANDO SE CIERRA EL BEAN!");
    }
    

}
