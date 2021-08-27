package com.muizz.spring.mediator.payload;

import java.io.Serializable;

/**
 * Represents an API response 
 */
public class ApiResponse implements Serializable {

    private Object payload;     // Json data of the response
    private boolean success;    // Success status
    private int status;         // Http Status Code
    private Object error;       // Json of error messages or warnings


    private ApiResponse() { }


    public static class Builder {

        private Object payload;
        private boolean success;
        private int status;
        private Object error;

        public Builder successful() {
            this.success = true;
            return this;
        }

        public Builder failed() {
            this.success = false;
            return this;
        }

        public Builder withPayload(Object payload) {
            this.payload = payload;
            return this;
        }

        public Builder withError(Object error) {
            this.error = error;
            return this;
        }

        public Builder ofStatus(int status) {
            this.status = status;
            return this;
        }

        public ApiResponse build() {
            var apiResponse = new ApiResponse();
            apiResponse.success = this.success;
            apiResponse.payload = this.payload;
            apiResponse.error = this.error;
            apiResponse.status = this.status;
            return apiResponse;
        }

    }

}
