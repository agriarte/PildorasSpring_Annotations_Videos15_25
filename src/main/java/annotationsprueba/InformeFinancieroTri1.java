/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotationsprueba;

import org.springframework.stereotype.Component;

/**
 *
 * @author Pedro
 */

// Esta anotación le indica al contenedor de Spring que debe escanear y registrar esta clase 
// como un bean administrado por Spring. Spring crea automáticamente una instancia de la clase 
// InformeFinancieroTri1 como un bean de Spring.
// Al no especificar nombre tomará el nombre de la clase con la primera letra minúscula
@Component
public class InformeFinancieroTri1 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Informe financiero primer trimestre";
    }
    
    
}
