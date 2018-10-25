package com.avathartech.springboot_vaadin_10.casos.parametros;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;

@Route("leer-parametros")
public class LeerParametros extends Div implements HasUrlParameter<String> {

    public LeerParametros() {
        
    }

    /**
     * Para llamarlo debe ser:
     * http://localhost:8080/leer-parametros/Carlos%20Camacho
     * @param event
     * @param parameter
     */
    @Override
    public void setParameter(BeforeEvent event, String parameter) {
        setText(String.format("Obteniendo el parametro %s", parameter));
    }
}
