/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationsprueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * Clase que define el paquete donde spring buscará las clases. De esta forma se evita archivo XML de configuración
 */
@Configuration
@ComponentScan("annotationsprueba")
@PropertySource("classpath:datosEmpresa.propiedades")
class EmpleadosConfig {
    // definir el bean para Informe Financiero Ccompras
    @Bean
    public CreacionInformeFinanciero informeFinancieroDptoCompras(){
        return new InformeFinancieroDptoCompras();
    }
    
    // definir el bean para el DirectorFinancieroCcompras e inyectar dependencias
    @Bean
    public Empleados directorFinanciero(){ // nombre método será el ID del bean inyectado
        return new DirectorFinanciero(informeFinancieroDptoCompras());
    }
}
