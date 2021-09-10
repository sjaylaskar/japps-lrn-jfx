/*
 * $Id: Loggable.java 08-Sep-2021 9:15:54 am SubhajoyLaskar $
 * Copyright (©) 2021 Subhajoy Laskar
 * https://www.linkedin.com/in/subhajoylaskar
 */
package com.japps.lrn.jfx.util.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.DEBUG;
import static org.apache.logging.log4j.Level.ERROR;
import static org.apache.logging.log4j.Level.FATAL;
import static org.apache.logging.log4j.Level.INFO;
import static org.apache.logging.log4j.Level.TRACE;
import static org.apache.logging.log4j.Level.WARN;


/**
 * The loggable.
 *
 * @author Subhajoy Laskar
 * @version 1.0
 */
public interface Loggable {

    /** The linfo. */
    Level LINFO = INFO;

    /** The lerror. */
    Level LERROR = ERROR;

    /** The ldebug. */
    Level LDEBUG = DEBUG;

    /** The lfatal. */
    Level LFATAL = FATAL;

    /** The ltrace. */
    Level LTRACE = TRACE;

    /** The lwarn. */
    Level LWARN = WARN;

    /**
     * Log.
     *
     * @param level the level
     * @param message the message
     */
    default void log(final Level level, final Object message) {

        log(getLogger(getClass()), level, message);
    }

    /**
     * Gets the logger.
     *
     * @param clazz the clazz
     * @return the logger
     */
    static Logger getLogger(final Class<?> clazz) {

        return LogManager.getLogger(clazz);
    }

    /**
     * Log.
     *
     * @param log the log
     * @param level the level
     * @param message the message
     */
    static void log(final Logger log, final Level level, final Object message) {

        LogUtil.log(log, level, message);
    }

    /**
     * The abstract loggable.
     *
     * @author Subhajoy Laskar
     * @version 1.0
     */
    abstract class AbstractLoggable implements Loggable {

        /** The log. */
        protected final Logger LOG = LogManager.getLogger(getClass());

        /**
         * Log.
         *
         * @param level the level
         * @param message the message
         */
        @Override
        public void log(final Level level, final Object message) {

            Loggable.log(LOG, level, message);
        }

    }
}
