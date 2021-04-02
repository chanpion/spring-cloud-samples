package com.chanpion.cloud.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author April Chen
 * @date 2021/4/2 10:09
 */
public class LogUtils {
    private static Logger log = LoggerFactory.getLogger(LogUtils.class);
    private static final Marker MONITOR_MARKER = MarkerFactory.getMarker("monitor");

    static {
        System.setProperty("log4j2.isThreadContextMapInheritable", "true");
    }

    public static void info(String msg) {

    }

    public static void monitor(String format, Object... msg) {
        log.info(MONITOR_MARKER, format, msg);
    }

    public static LogContent monitor() {
        return new LogContent();
    }

    public static class LogContent {
        private Map<String, Object> log;

        public LogContent() {
            this.log = new HashMap<>();
        }

        public LogContent add(String key, Object value) {
            log.put(key, value);
            return this;
        }

        public void submit() {
            LogUtils.info(log.toString());
        }
    }
}
