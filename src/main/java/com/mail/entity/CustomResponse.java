package com.mail.entity;

public class CustomResponse {

    private String message;
    private HttpStatus httpStatus;
    private boolean success=false;

    public CustomResponse(String message, HttpStatus httpStatus, boolean success) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.success = success;
    }

    public CustomResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
