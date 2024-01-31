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
public class UsoAnnotations2 {

    public static void main(String[] args) {
        // leer el XML de configuracion
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        // pedir 2 bean al contenedor de Spring
        Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
        Empleados lucia = contexto.getBean("comercialExperimentado", Empleados.class);

        // usar el bean
        System.out.println("Vendedor Antonio:");
        System.out.println(antonio.getTareas());
        System.out.println(antonio.getInformes());
        System.out.println(antonio.getTareas());
        System.out.println("Vendedor Lucía:");
        System.out.println(lucia.getInformes());
        System.out.println(lucia.getTareas());

        System.out.println("Direcciones de memoria a la que apuntan:");
        if (antonio == lucia) {
            System.out.println("Apuntan a la misma dirección de memoria");
            System.out.println("Vendedor Antonio:" + antonio);
            System.out.println("Vendedor Lucía:" + lucia);
        } else {
            System.out.println("Apuntan a diferente dirección de memoria");
            System.out.println("Vendedor Antonio:" + antonio);
            System.out.println("Vendedor Lucía:" + lucia);
        }
        // cerrar el bean
        contexto.close();
    }

}
