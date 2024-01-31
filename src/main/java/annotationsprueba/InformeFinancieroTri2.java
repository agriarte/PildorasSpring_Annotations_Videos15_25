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
public class InformeFinancieroTri2 implements CreacionInformeFinanciero {

    @Override
    public String getInformeFinanciero() {
        return "informe financiero del segundo trimestre";
    }
    
}
