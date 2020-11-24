package com.lhst.springboot_project.Exception;

public class ControllerExeption extends Exception {
    public ControllerExeption() {
        super();
    }

    public ControllerExeption(String message) {
        super(message);
    }

    public ControllerExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ControllerExeption(Throwable cause) {
        super(cause);
    }

    protected ControllerExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
