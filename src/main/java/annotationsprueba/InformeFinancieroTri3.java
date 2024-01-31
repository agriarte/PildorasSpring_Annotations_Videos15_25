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

@Component
public class InformeFinancieroTri3 implements CreacionInformeFinanciero {

    @Override
    public String getInformeFinanciero() {
        return "Tercer trimestre fue bueno";
    }
    
}
