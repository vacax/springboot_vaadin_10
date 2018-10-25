package com.avathartech.springboot_vaadin_10.casos.componentes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("comp/holamundo")
public class HolaMundoComponente extends Div {

    public HolaMundoComponente() {
        setText("Hola Mundo Componente....");
    }
}
