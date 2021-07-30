package com.muizz.spring.mediator.payload;


/**
 * Represents an API response 
 */
public class ApiResponse {

    private Object payload;     // Json data of the response
    private boolean success;    // Success status
    private int status;         // Http Status Code
    private Object error;       // Json of error messages or warnings


    public ApiResponse() { }

    public ApiResponse(
        Object payload,
        boolean success,
        int status,
        Object error
    ) {
        this.payload = payload;
        this.success = success;
        this.status = status;
        this.error = error;
    }


    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public Object getPayload() {
        return payload;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Object getError() {
        return error;
    }

}
