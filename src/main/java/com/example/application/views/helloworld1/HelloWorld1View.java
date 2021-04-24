package com.example.application.views.helloworld1;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.main.MainView;
import com.vaadin.flow.component.dependency.CssImport;

@Route(value = "hello-world", layout = MainView.class)
@PageTitle("Hello World1")
@CssImport("./views/helloworld1/hello-world1-view.css")
public class HelloWorld1View extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public HelloWorld1View() {
        addClassName("hello-world1-view");
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
    }

}
