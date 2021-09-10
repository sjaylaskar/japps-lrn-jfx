/*
 * $Id: LogUtil.java 08-Sep-2021 9:27:47 am SubhajoyLaskar $
 * Copyright (©) 2021 Subhajoy Laskar
 * https://www.linkedin.com/in/subhajoylaskar
 */
package com.japps.lrn.jfx.util.logging;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;


/**
 * The log util.
 *
 * @author Subhajoy Laskar
 * @version 1.0
 */
public final class LogUtil {

    /**
     * Instantiates a new log util.
     */
    private LogUtil() {

    }

    /**
     * Log.
     *
     * @param log the log
     * @param level the level
     * @param message the message
     */
    public static void log(final Logger log, final Level level, final Object message) {

        final Object loggedMessage = convertThrowableToStackTrace(message);
        if (Level.INFO.equals(level)) {
            info(log, loggedMessage);
        } else if (Level.ERROR.equals(level)) {
            error(log, loggedMessage);
        } else if (Level.DEBUG.equals(level)) {
            debug(log, loggedMessage);
        } else if (Level.FATAL.equals(level)) {
            fatal(log, loggedMessage);
        } else if (Level.TRACE.equals(level)) {
            trace(log, loggedMessage);
        } else if (Level.WARN.equals(level)) {
            warn(log, loggedMessage);
        }
    }

    /**
     * Convert throwable to stack trace.
     *
     * @param message the message
     * @return the message object
     */
    private static Object convertThrowableToStackTrace(final Object message) {

        return ((message != null) && (message instanceof Throwable))
            ? ExceptionUtils.getStackTrace((Throwable) message)
            : message;
    }

    /**
     * Info.
     *
     * @param log the log
     * @param message the message
     */
    private static void info(final Logger log, final Object message) {

        log.info(message);
    }

    /**
     * Error.
     *
     * @param log the log
     * @param message the message
     */
    private static void error(final Logger log, final Object message) {

        log.error(message);
    }

    /**
     * Debug.
     *
     * @param log the log
     * @param message the message
     */
    private static void debug(final Logger log, final Object message) {

        log.debug(message);
    }

    /**
     * Fatal.
     *
     * @param log the log
     * @param message the message
     */
    private static void fatal(final Logger log, final Object message) {

        log.trace(message);
    }

    /**
     * Trace.
     *
     * @param log the log
     * @param message the message
     */
    private static void trace(final Logger log, final Object message) {

        log.trace(message);
    }

    /**
     * Warn.
     *
     * @param log the log
     * @param message the message
     */
    private static void warn(final Logger log, final Object message) {

        log.warn(message);
    }

}
