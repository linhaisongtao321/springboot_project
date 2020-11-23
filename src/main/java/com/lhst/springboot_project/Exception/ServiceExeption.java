package com.lhst.springboot_project.Exception;

public class ServiceExeption  extends Exception {
    public ServiceExeption() {
        super();
    }

    public ServiceExeption(String message) {
        super(message);
    }

    public ServiceExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceExeption(Throwable cause) {
        super(cause);
    }
}
