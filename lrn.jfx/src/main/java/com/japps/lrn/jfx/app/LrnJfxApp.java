/*
 * $Id: LrnJfxApp.java 08-Sep-2021 8:33:38 am SubhajoyLaskar $
 * Copyright (©) 2021 Subhajoy Laskar
 * https://www.linkedin.com/in/subhajoylaskar
 */
package com.japps.lrn.jfx.app;

import org.apache.commons.lang3.exception.ExceptionUtils;

import com.japps.lrn.jfx.util.logging.Loggable;
import com.japps.lrn.jfx.util.view.ViewInitializer;
import com.japps.lrn.jfx.view.LrnJfxMainPageView;
import com.japps.lrn.jfx.view.View;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * The lrn jfx app app.
 *
 * @author Subhajoy Laskar
 * @version 1.0
 */
public final class LrnJfxApp extends Application implements Loggable {

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(final Stage stage) throws Exception {

        log(LINFO, "LrnJfxApp start.");

        try {
            ViewInitializer.initialize(stage, determineView());
        } catch (final Exception exception) {
            log(LERROR, exception);
        } catch (final Throwable throwable) {
            log(LFATAL, throwable);
        } finally {
            log(LINFO, "LrnJfxApp end.");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void stop() throws Exception {

        log(LINFO, "LrnJfxApp end.");
    }

    /**
     * Determines the view.
     *
     * @return the view
     */
    private View determineView() {

        return new LrnJfxMainPageView();
    }

    /**
     * Execute.
     */
    public static void execute() {

        Loggable.log(Loggable.getLogger(LrnJfxApp.class), LINFO, "App launch start.");
        try {
            launch();
        } catch (final Exception exception) {
            Loggable.log(Loggable.getLogger(LrnJfxApp.class), LFATAL, ExceptionUtils.getStackTrace(exception));
        } finally {
            Loggable.log(Loggable.getLogger(LrnJfxApp.class), LINFO, "App end.");
        }
    }

}
