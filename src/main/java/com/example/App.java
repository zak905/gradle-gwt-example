package com.example;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {
	
	public void onModuleLoad() {
	  
		 RootPanel.get().add(new Label("Gwt Gradle Example"));

	}
}
