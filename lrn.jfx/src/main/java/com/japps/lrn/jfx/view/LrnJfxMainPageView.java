/*
 * $Id: LrnJfxMainPageView.java 08-Sep-2021 8:54:57 am SubhajoyLaskar $
 * Copyright (©) 2021 Subhajoy Laskar
 * https://www.linkedin.com/in/subhajoylaskar
 */
package com.japps.lrn.jfx.view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;


/**
 * The lrn jfx main page view.
 *
 * @author Subhajoy Laskar
 * @version 1.0
 */
public final class LrnJfxMainPageView extends AbstractView {

    /**
     * {@inheritDoc}
     */
    @Override
    public void show(final Stage stage) {

        log(LINFO, "Start LrnJfxMainPageView.");

        final String javaVersion = System.getProperty("java.version");
        final String javafxVersion = System.getProperty("javafx.version");
        final Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        label.setTextFill(Color.CADETBLUE);
        label.setFont(Font.font("Courier New", 18));
        label.setWrapText(true);
        label.setPadding(new Insets(10, 10, 10, 10));

        final StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(40));

        final Label buttonClickedLabel = new Label();

        final Button button = new Button("Click Me");
        button.setMinSize(60, 40);
        button.setTextFill(Color.MEDIUMAQUAMARINE);
        button.setWrapText(true);
        button.setBackground(new Background(new BackgroundFill(Color.DARKORANGE, new CornerRadii(8), new Insets(5))));
        button.setOnAction(event -> onButtonClickEvent(button, buttonClickedLabel, label));

        stackPane.getChildren().addAll(button, buttonClickedLabel);

        stackPane.setBackground(null);

        final Scene scene = new Scene(stackPane, 640, 480, Color.LIGHTCORAL);
        stage.setScene(scene);
        stage.setTitle("OpenJFX App Main Page.");

        stage.setOnCloseRequest(event -> onCloseEvent());

        super.show(stage);

        log(LINFO, "End LrnJfxMainPageView.");
    }

    /**
     * Log app close.
     */
    private void onCloseEvent() {

        log(LINFO, "App closed.");
    }

    /**
     * On button click event.
     *
     * @param button the button
     * @param buttonClickedLabel the button clicked label
     * @param label the label
     */
    private void onButtonClickEvent(final Button button, final Label buttonClickedLabel, final Label label) {

        buttonClickedLabel.setText("Clicked Me: " + label.getText());
        buttonClickedLabel.setTextFill(Color.DARKCYAN);
        buttonClickedLabel.setFont(Font.font("Monotype Corsiva", FontPosture.ITALIC, 18));
        buttonClickedLabel.setOnMouseClicked(event -> onLabelClickedEvent(button, buttonClickedLabel));
        buttonClickedLabel.setVisible(true);
        button.setVisible(false);
    }

    /**
     * On label clicked event.
     *
     * @param button the button
     * @param buttonClickedLabel the button clicked label
     */
    private void onLabelClickedEvent(final Button button, final Label buttonClickedLabel) {

        buttonClickedLabel.setVisible(false);
        button.setVisible(true);
    }
}
