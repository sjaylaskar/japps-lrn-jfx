/*
 * $Id: View.java 08-Sep-2021 8:56:39 am SubhajoyLaskar $
 * Copyright (©) 2021 Subhajoy Laskar
 * https://www.linkedin.com/in/subhajoylaskar
 */
package com.japps.lrn.jfx.view;

import com.japps.lrn.jfx.util.logging.Loggable;

import javafx.stage.Stage;


/**
 * The view.
 *
 * @author Subhajoy Laskar
 * @version 1.0
 */
public interface View extends Loggable {

    /**
     * Show.
     *
     * @param stage the stage
     */
    default void show(final Stage stage) {

        stage.show();
    }
}
