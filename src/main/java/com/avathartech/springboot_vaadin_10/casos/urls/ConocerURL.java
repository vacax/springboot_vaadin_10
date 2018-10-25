package com.avathartech.springboot_vaadin_10.casos.urls;

import com.avathartech.springboot_vaadin_10.casos.parametros.LeerMasParametros;
import com.avathartech.springboot_vaadin_10.casos.parametros.LeerParametros;
import com.avathartech.springboot_vaadin_10.casos.parametros.LeerParametrosOpcionales;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("indice-parametros")
public class ConocerURL extends VerticalLayout {

    public ConocerURL() {
        add(new H1("Ejemplos de Uso de parametros de la URL"));
        add(new Anchor(UI.getCurrent().getRouter().getUrl(LeerParametros.class, "parametro1"), "Parametros Obligatorio"));
        add(new Anchor(UI.getCurrent().getRouter().getUrl(LeerParametrosOpcionales.class), "Parametros Opcionales"));
        add(new Anchor(UI.getCurrent().getRouter().getUrl(LeerMasParametros.class, "/asda/asdas/asd"), "Mas de un Parametro"));
    }


}
