package com.avathartech.springboot_vaadin_10.casos.layouts;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.RouteData;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;

import java.util.List;

@Push
public class MainLayout extends HorizontalLayout implements RouterLayout {


    Div contenido;

    /**
     * Estaremos construyendo el esquema de menu - contenido
     *
     */
    public MainLayout(){

        //creando los componentes.
        VerticalLayout menu = crearMenu();
        menu.setWidth("30%");
        menu.setHeight("100%");

        //
        contenido = new Div();
        contenido.setWidth("80%");
        contenido.setHeight("100%");
        contenido.add(new Label("El contenido."));


        //añadiendo al contenido.
        setSizeFull();
        add(menu, contenido);

    }

    /**
     *
     * @return
     */
    private VerticalLayout crearMenu(){
        VerticalLayout v = new VerticalLayout();
        //
        v.add(new Label("Menú"));
        v.add(new RouterLink("Vista 1 Layout", Vista1Layout.class));
        v.add(new RouterLink("Vista 2 Layout", Vista2Layout.class));
        //

        return v;
    }

    /**
     * Cuando la clase vista llama el layout se dispara el metodo y aplicamos
     * el componente recibido a la parte referida al contenido.
     * @param content
     */
    @Override
    public void showRouterLayoutContent(HasElement content) {
        System.out.println("Recibiendo el componente");
        contenido.removeAll();
        contenido.add(content.getElement().getComponent().get());
    }
}
