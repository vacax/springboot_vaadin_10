package com.avathartech.springboot_vaadin_10;

import com.avathartech.springboot_vaadin_10.casos.basico.HolaMundoVaadin;
import com.avathartech.springboot_vaadin_10.casos.binder.EjemploBinder;
import com.avathartech.springboot_vaadin_10.casos.crud.EjemploCrud;
import com.avathartech.springboot_vaadin_10.casos.grid.EjemploGrid;
import com.avathartech.springboot_vaadin_10.casos.layouts.Vista1Layout;
import com.avathartech.springboot_vaadin_10.casos.urls.CambiadoTituloPaginaDinamico;
import com.avathartech.springboot_vaadin_10.casos.parametros.ConocerURL;
import com.avathartech.springboot_vaadin_10.casos.urls.ListarRutas;
import com.avathartech.springboot_vaadin_10.entidades.Estudiante;
import com.avathartech.springboot_vaadin_10.servicios.EstudianteService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootVaadin10Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootVaadin10Application.class, args);
    }

    /**
     * Ruta por defecto, vista principal
     */
    @Route("")
    public static class MiView extends VerticalLayout {



        public MiView(){
            add(new Button("Presionar", new ComponentEventListener<ClickEvent<Button>>() {
                @Override
                public void onComponentEvent(ClickEvent<Button> event) {
                    Notification.show("Presioando el botón....");
                }
            }));

            //creando rutas.
            crearRutas();
        }

        /**
         * Creando la creación de las rutas.
         */
        private void crearRutas(){
            VerticalLayout caja = new VerticalLayout();
            caja.add(new H2("Enlaces a funcionalidades:"));
            //con RouterLink el renderizado no recarga la pagina.
            caja.add(new RouterLink("Hola Mundo", HolaMundoVaadin.class));
            caja.add(new RouterLink("Indice de URL parametros",ConocerURL.class));
            caja.add(new RouterLink("Ejemplo de Grid", EjemploGrid.class));
            caja.add(new RouterLink("Ejemplo de Binder", EjemploBinder.class));
            caja.add(new RouterLink("Cambiar Titulo de Forma Dinámica", CambiadoTituloPaginaDinamico.class));
            caja.add(new RouterLink("Listar todas las rutas", ListarRutas.class));
            caja.add(new RouterLink("CRUD", EjemploCrud.class));
            caja.add(new RouterLink("Ejemplo de Layout", Vista1Layout.class));
            add(caja);
        }
    }

    @Component
    static class BootStrap{
        @Autowired
        EstudianteService estudianteService;

        @PostConstruct
        public void init(){
            System.out.println("Creando los estudiantes de prueba");
            //datos de pruebas
            for(int i = 0; i<=10000;i++){
                estudianteService.crearEstudiante(new Estudiante(i, "Estudiante "+i));
            }
        }
    }
}
