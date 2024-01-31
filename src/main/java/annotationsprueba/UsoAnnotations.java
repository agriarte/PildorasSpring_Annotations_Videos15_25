/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationsprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Pedro
 */
public class UsoAnnotations {
    public static void main(String[] args) {
        // leer el XML de configuracion
         ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        // pedir el bean al contenedor de Spring
        Empleados antonio=contexto.getBean("comercialExperimentado", Empleados.class);
        // usar el bean
        System.out.println(antonio.getInformes());
        System.out.println(antonio.getTareas());
        // cerrar el bean
        contexto.close();
    }
    
}
