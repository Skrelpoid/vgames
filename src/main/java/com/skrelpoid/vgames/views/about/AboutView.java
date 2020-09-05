package com.skrelpoid.vgames.views.about;

import com.skrelpoid.vgames.views.main.MainView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainView.class)
@PageTitle("About")
@CssImport("./styles/views/about/about-view.css")
public class AboutView extends Div {
	private static final long serialVersionUID = 1L;

	public AboutView() {
        setId("about-view");
        add(new Label("Content placeholder"));
    }

}
