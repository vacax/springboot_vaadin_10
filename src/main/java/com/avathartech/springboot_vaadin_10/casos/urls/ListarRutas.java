package com.avathartech.springboot_vaadin_10.casos.urls;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteData;
import com.vaadin.flow.router.RouterLink;

import java.util.List;

@Route("listar-rutas-definidas")
public class ListarRutas extends VerticalLayout {

    public ListarRutas() {
        List<RouteData> routes = UI.getCurrent().getRouter().getRoutes();
        for(RouteData d : routes){
            if(d.getParameters().size() == 0) {
                add(new RouterLink("Link #"+d.getUrl(), d.getNavigationTarget()));
            }
        }

    }
}
