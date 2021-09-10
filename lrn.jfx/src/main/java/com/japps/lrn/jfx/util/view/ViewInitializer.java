/*
 * $Id: ViewInitializer.java 08-Sep-2021 12:05:49 pm SubhajoyLaskar $
 * Copyright (©) 2021 Subhajoy Laskar
 * https://www.linkedin.com/in/subhajoylaskar
 */
package com.japps.lrn.jfx.util.view;

import com.japps.lrn.jfx.util.logging.Loggable;
import com.japps.lrn.jfx.view.View;

import javafx.stage.Stage;


/**
 * The view initializer.
 *
 * @author Subhajoy Laskar
 * @version 1.0
 */
public final class ViewInitializer implements Loggable {

    /**
     * Instantiates a new view initializer.
     */
    private ViewInitializer() {

    }

    /**
     * Initialize.
     *
     * @param stage the stage
     * @param view the view
     */
    public static void initialize(final Stage stage, final View view) {

        Loggable.log(Loggable.getLogger(ViewInitializer.class), LINFO, "Initialize view start.");

        view.show(stage);

        Loggable.log(Loggable.getLogger(ViewInitializer.class), LINFO, "Initialize view end.");
    }
}
