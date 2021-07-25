package com.techstack.exception;

public class FileStorageException extends RuntimeException {

    public FileStorageException(String msg) {
        super(msg);
    }

    public FileStorageException(String msg, Throwable ex) {
        super(msg, ex);
    }
}
