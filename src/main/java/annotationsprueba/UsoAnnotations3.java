/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationsprueba;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * En este ejemplo se suprime el archivo XML y se hace todo desde Java creando
 * una clase de configuración
 */
public class UsoAnnotations3 {

    public static void main(String[] args) {
        // leer el XML de configuracion
        // ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Cargar archivo de configuración con la definición de los beans en java, ahora sin XML
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

        // pedir  bean al contenedor de Spring
        Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);

        // crear otro bean 100% sin XML
        DirectorFinanciero pedro = contexto.getBean("directorFinanciero", DirectorFinanciero.class);

        // usar el bean
        System.out.println("Vendedor Antonio:");
        System.out.println(antonio.getTareas());

        System.out.println("Director Financiero Pedro:");
        System.out.println(pedro.getTareas());
        System.out.println(pedro.getInformes());

        System.out.println(pedro.getEmail());
        System.out.println(pedro.getNombreEmpresa());

        // cerrar el bean
        contexto.close();
    }

}
