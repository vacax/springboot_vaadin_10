package com.avathartech.springboot_vaadin_10.casos.parametros;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("indice-parametros")
public class ConocerURL extends VerticalLayout {

    public ConocerURL() {
        add(new H1("Ejemplos de Uso de parametros de la URL"));
        add(new Anchor(UI.getCurrent().getRouter().getUrl(LeerParametrosVariableUrl.class, "parametro1"), "Parametros Variable Obligatorio"));
        add(new Anchor(UI.getCurrent().getRouter().getUrl(LeerParametrosOpcionalesVariableUrl.class), "Parametros Variable Opcionales"));
        add(new Anchor(UI.getCurrent().getRouter().getUrl(LeerMasParametrosVariableUrl.class, "/asda/asdas/asd"), "Mas de un Parametro Variable"));
        add(new Anchor(UI.getCurrent().getRouter().getUrl(LeerQueryParam.class, "variable?matricula=12313&nombre=123132"), "Query Param URL"));
    }


}
